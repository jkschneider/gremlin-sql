package com.github.jkschneider.gremlinsql

import com.github.jkschneider.gremlinsql.grammar.GremlinSqlBaseListener
import com.github.jkschneider.gremlinsql.grammar.GremlinSqlParser
import com.google.common.collect.LinkedListMultimap
import com.google.common.collect.Multimap
import com.google.common.collect.TreeMultimap
import com.tinkerpop.blueprints.Graph
import com.tinkerpop.gremlin.java.GremlinPipeline
import org.antlr.v4.runtime.misc.MultiMap
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

    Multimap<String, GremlinPipeline> pipesByLabel = LinkedListMultimap.create();

    @Override
    void enterSelect(@NotNull GremlinSqlParser.SelectContext ctx) {
        String tableName = ctx.table_name().text
        pipesByLabel.put(tableName, new GremlinPipeline().has('_label', tableName))
        super.enterSelect(ctx)
    }

    @Override
    void exitSelect(@NotNull GremlinSqlParser.SelectContext ctx) {
        pipeline = pipesByLabel.values().inject(g.V) { pipe, nextPipe ->
            pipe.step(nextPipe)
        }
        super.exitSelect(ctx)
    }
}
