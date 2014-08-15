package com.github.jkschneider.gremlinsql

import com.github.jkschneider.gremlinsql.grammar.GremlinSqlBaseListener
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
class GremlinSqlMappingListener extends GremlinSqlBaseListener {
    Graph g;
    GremlinPipeline pipeline;

    GremlinSqlMappingListener(Graph g) {
        this.g = g
    }

    Multimap<String, GremlinPipeline> pipesByLabel = LinkedListMultimap.create();

    @Override
    void enterSelect(@NotNull GremlinSqlParser.SelectContext ctx) {
        String tableName = ctx.table_name().text
        pipesByLabel.put(tableName, _().has('_label', tableName))
        super.enterSelect(ctx)
    }

    @Override
    void enterWhereCompare(@NotNull GremlinSqlParser.WhereCompareContext ctx) {
        def lit = literalToObj(ctx.literal_value())
        def col = ctx.column_name().text
        def table = ctx.table_name().text

        T predicate = null
        if(ctx.K_EQ()) predicate = T.eq
        else if(ctx.K_NEQ()) predicate = T.neq
        else if(ctx.K_GT()) predicate = T.gt
        else if(ctx.K_GTE()) predicate = T.gte
        else if(ctx.K_LT()) predicate = T.lt
        else if(ctx.K_LTE()) predicate = T.lte

        if(lit instanceof Double) {
            def doub = lit as Double

            // we can't determine which numeric type the property will have, so we test all of the possibilities
            pipesByLabel.put(table, _().or(
                _().filter{ it[col] instanceof Integer }.has(col, predicate, doub.intValue()),
                _().filter{ it[col] instanceof Double }.has(col, predicate, doub),
                _().filter{ it[col] instanceof Float }.has(col, predicate, doub.floatValue()),
                _().filter{ it[col] instanceof Long }.has(col, predicate, doub.longValue()),
                _().filter{ it[col] instanceof Short }.has(col, predicate, doub.shortValue())
            ))
        }
        else
            pipesByLabel.put(table, _().has(col, predicate, lit))

        super.enterWhereCompare(ctx)
    }

    @Override
    void exitSelect(@NotNull GremlinSqlParser.SelectContext ctx) {
        pipeline = pipesByLabel.values().inject(g.V) { pipe, nextPipe ->
            pipe.step(nextPipe)
        }
        super.exitSelect(ctx)
    }

    Object literalToObj(Literal_valueContext literal) {
        def litText = literal.text
        if(literal.STRING_LITERAL())
            return litText.substring(1, litText.length()-1)
        if(literal.NUMERIC_LITERAL())
            return Double.parseDouble(litText)
        if(literal.K_NULL())
            return null
    }
}
