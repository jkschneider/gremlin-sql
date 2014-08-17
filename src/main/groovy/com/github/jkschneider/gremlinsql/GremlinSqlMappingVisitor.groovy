package com.github.jkschneider.gremlinsql

import com.github.jkschneider.gremlinsql.grammar.GremlinSqlBaseVisitor
import com.github.jkschneider.gremlinsql.grammar.GremlinSqlParser
import com.github.jkschneider.gremlinsql.grammar.GremlinSqlParser.Literal_valueContext
import com.google.common.collect.LinkedListMultimap
import com.google.common.collect.Multimap
import com.tinkerpop.blueprints.Graph
import com.tinkerpop.gremlin.java.GremlinPipeline
import org.antlr.v4.runtime.misc.NotNull

import static com.tinkerpop.gremlin.Tokens.T

/**
 * Builds a Gremlin query from a SQL input stream
 */
class GremlinSqlMappingVisitor extends GremlinSqlBaseVisitor<GremlinPipeline> {
    Graph g;

    GremlinSqlMappingVisitor(Graph g) {
        this.g = g
    }

    Multimap<String, GremlinPipeline> pipesByLabel = LinkedListMultimap.create();

    @SuppressWarnings("GroovyAssignabilityCheck")
    @Override
    GremlinPipeline visitSelect(@NotNull GremlinSqlParser.SelectContext ctx) {
        pipesByLabel.clear() // FIXME make this a ThreadLocal

        String tableName = ctx.table_name().text
        pipesByLabel.put(tableName, _().has('_label', tableName))

        super.visitSelect(ctx)
        return pipesByLabel.values().inject(g.V) { pipe, nextPipe -> pipe.step(nextPipe) }
    }

//    @Override
//    GremlinPipeline visitWhereOr(@NotNull GremlinSqlParser.WhereOrContext ctx) {
//        // FIXME this won't work if the two clauses refer to different `tables`
//        return _().or(
//            super.visitChildren(ctx.where_clause()[0]),
//            super.visitChildren(ctx.where_clause()[1])
//        )
//    }

    @Override
    GremlinPipeline visitWhereCompare(@NotNull GremlinSqlParser.WhereCompareContext ctx) {
        def pipe

        T predicate = null
        if(ctx.K_EQ()) predicate = T.eq
        else if(ctx.K_NEQ()) predicate = T.neq
        else if(ctx.K_GT()) predicate = T.gt
        else if(ctx.K_GTE()) predicate = T.gte
        else if(ctx.K_LT()) predicate = T.lt
        else if(ctx.K_LTE()) predicate = T.lte

        def lit = literalToObj(ctx.literal_value())
        def col = ctx.column_name().text
        def table = ctx.table_name().text

        if(lit instanceof Double) {
            def doub = lit as Double

            // we can't determine which numeric type the property will have, so we test all of the possibilities
            pipe = _().or(
                _().filter{ it[col] instanceof Integer }.has(col, predicate, doub.intValue()),
                _().filter{ it[col] instanceof Double }.has(col, predicate, doub),
                _().filter{ it[col] instanceof Float }.has(col, predicate, doub.floatValue()),
                _().filter{ it[col] instanceof Long }.has(col, predicate, doub.longValue()),
                _().filter{ it[col] instanceof Short }.has(col, predicate, doub.shortValue())
            )
        }
        else
            pipe = _().has(col, predicate, lit)

        pipesByLabel.put(table, pipe)
        return pipe
    }

    @Override
    GremlinPipeline visitWhereIn(@NotNull GremlinSqlParser.WhereInContext ctx) {
        def inList = ctx.literal_value()
                .collect { literalToObj(it) }
                .collect { lit ->
                    if(!(lit instanceof Double)) return lit
                    return [lit, lit.intValue(), lit.floatValue(), lit.longValue(), lit.shortValue()]
                }
                .flatten()

        def pipe = _().has(ctx.column_name().text, T.in, inList)
        pipesByLabel.put(ctx.table_name().text, pipe)
        return pipe
    }

    static Object literalToObj(Literal_valueContext literal) {
        def litText = literal.text
        if(literal.STRING_LITERAL())
            return litText.substring(1, litText.length()-1)
        if(literal.NUMERIC_LITERAL())
            return Double.parseDouble(litText)
        if(literal.K_NULL())
            return null
        return null // not possible
    }
}
