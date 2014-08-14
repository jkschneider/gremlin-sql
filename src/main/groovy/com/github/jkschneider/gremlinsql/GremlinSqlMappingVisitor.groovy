package com.github.jkschneider.gremlinsql

import com.github.jkschneider.gremlinsql.grammar.GremlinSqlBaseListener
import com.github.jkschneider.gremlinsql.grammar.GremlinSqlParser
import com.tinkerpop.blueprints.Graph
import com.tinkerpop.gremlin.java.GremlinPipeline
import org.antlr.v4.runtime.misc.NotNull

/**
 * Builds a Gremlin query from a SQL input stream
 */
class GremlinSqlMappingVisitor extends GremlinSqlBaseListener {
    Graph g;
    GremlinPipeline pipeline;

    GremlinSqlMappingVisitor(Graph g) {
        this.g = g
    }

    @Override
    void enterSelect(@NotNull GremlinSqlParser.SelectContext ctx) {
        String tableName = ctx.table_name().any_name().text
        System.out.println(tableName);
        super.enterSelect(ctx)
    }

    @Override
    void exitSelect(@NotNull GremlinSqlParser.SelectContext ctx) {
        super.exitSelect(ctx)
    }
}
