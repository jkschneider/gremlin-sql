package com.github.jkschneider.gremlinsql

import com.github.jkschneider.gremlinsql.grammar.GremlinSqlBaseListener
import com.github.jkschneider.gremlinsql.grammar.GremlinSqlParser
import org.antlr.v4.runtime.misc.NotNull

/**
 * Builds a Gremlin query from a SQL input stream
 */
class GremlinSqlMappingVisitor extends GremlinSqlBaseListener {
    @Override
    void enterSelect_core(@NotNull GremlinSqlParser.Select_coreContext ctx) {
        String tableName = ctx.table().text
        System.out.println(tableName);
        super.enterSelect_core(ctx)
    }

    @Override
    void exitSelect_core(@NotNull GremlinSqlParser.Select_coreContext ctx) {
        super.exitSelect_core(ctx)
    }
}
