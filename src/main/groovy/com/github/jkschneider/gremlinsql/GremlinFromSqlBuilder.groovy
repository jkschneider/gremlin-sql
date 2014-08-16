package com.github.jkschneider.gremlinsql

import com.github.jkschneider.gremlinsql.grammar.GremlinSqlLexer
import com.github.jkschneider.gremlinsql.grammar.GremlinSqlParser
import com.tinkerpop.blueprints.Graph
import com.tinkerpop.gremlin.java.GremlinPipeline
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream

class GremlinFromSqlBuilder {
    static GremlinPipeline translateToGremlin(String sql, Graph g) {
        GremlinSqlLexer lexer = new GremlinSqlLexer(new ANTLRInputStream(sql))
        CommonTokenStream tokens = new CommonTokenStream(lexer)

        GremlinSqlMappingVisitor sqlVisitor = new GremlinSqlMappingVisitor(g)
        return sqlVisitor.visitSelect(new GremlinSqlParser(tokens).select())
    }
}
