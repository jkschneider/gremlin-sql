// Generated from /home/jon/git/gremlin-sql/src/main/antlr4/GremlinSql.g4 by ANTLR 4.2.2
package com.github.jkschneider.gremlinsql.grammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GremlinSqlParser}.
 */
public interface GremlinSqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GremlinSqlParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(@NotNull GremlinSqlParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link GremlinSqlParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(@NotNull GremlinSqlParser.SelectContext ctx);

	/**
	 * Enter a parse tree produced by {@link GremlinSqlParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(@NotNull GremlinSqlParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GremlinSqlParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(@NotNull GremlinSqlParser.Any_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link GremlinSqlParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterResult_column(@NotNull GremlinSqlParser.Result_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link GremlinSqlParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitResult_column(@NotNull GremlinSqlParser.Result_columnContext ctx);

	/**
	 * Enter a parse tree produced by {@link GremlinSqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(@NotNull GremlinSqlParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GremlinSqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(@NotNull GremlinSqlParser.Table_nameContext ctx);
}