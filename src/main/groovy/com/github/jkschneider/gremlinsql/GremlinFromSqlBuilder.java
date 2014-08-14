package com.github.jkschneider.gremlinsql;

import com.github.jkschneider.gremlinsql.grammar.GremlinSqlLexer;
import com.github.jkschneider.gremlinsql.grammar.GremlinSqlParser;
import com.tinkerpop.gremlin.java.GremlinPipeline;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class GremlinFromSqlBuilder {
    GremlinPipeline translateToGremlin(String sql) {
        GremlinSqlLexer lexer = new GremlinSqlLexer(new ANTLRInputStream(sql));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GremlinSqlParser parser = new GremlinSqlParser(tokens);
        ParserRuleContext tree = parser.select_core();

        ParseTreeWalker walker = new ParseTreeWalker();
        GremlinSqlMappingVisitor gremlinMapping = new GremlinSqlMappingVisitor();

        walker.walk(gremlinMapping, tree);
        return null;
    }
}
