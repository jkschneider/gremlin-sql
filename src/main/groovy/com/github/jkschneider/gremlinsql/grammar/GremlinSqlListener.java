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
	 * Enter a parse tree produced by {@link GremlinSqlParser#whereAnd}.
	 * @param ctx the parse tree
	 */
	void enterWhereAnd(@NotNull GremlinSqlParser.WhereAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link GremlinSqlParser#whereAnd}.
	 * @param ctx the parse tree
	 */
	void exitWhereAnd(@NotNull GremlinSqlParser.WhereAndContext ctx);

	/**
	 * Enter a parse tree produced by {@link GremlinSqlParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(@NotNull GremlinSqlParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GremlinSqlParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(@NotNull GremlinSqlParser.Literal_valueContext ctx);

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
	 * Enter a parse tree produced by {@link GremlinSqlParser#whereCompare}.
	 * @param ctx the parse tree
	 */
	void enterWhereCompare(@NotNull GremlinSqlParser.WhereCompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link GremlinSqlParser#whereCompare}.
	 * @param ctx the parse tree
	 */
	void exitWhereCompare(@NotNull GremlinSqlParser.WhereCompareContext ctx);

	/**
	 * Enter a parse tree produced by {@link GremlinSqlParser#whereOr}.
	 * @param ctx the parse tree
	 */
	void enterWhereOr(@NotNull GremlinSqlParser.WhereOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GremlinSqlParser#whereOr}.
	 * @param ctx the parse tree
	 */
	void exitWhereOr(@NotNull GremlinSqlParser.WhereOrContext ctx);

	/**
	 * Enter a parse tree produced by {@link GremlinSqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(@NotNull GremlinSqlParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GremlinSqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(@NotNull GremlinSqlParser.Column_nameContext ctx);

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

	/**
	 * Enter a parse tree produced by {@link GremlinSqlParser#whereIn}.
	 * @param ctx the parse tree
	 */
	void enterWhereIn(@NotNull GremlinSqlParser.WhereInContext ctx);
	/**
	 * Exit a parse tree produced by {@link GremlinSqlParser#whereIn}.
	 * @param ctx the parse tree
	 */
	void exitWhereIn(@NotNull GremlinSqlParser.WhereInContext ctx);
}