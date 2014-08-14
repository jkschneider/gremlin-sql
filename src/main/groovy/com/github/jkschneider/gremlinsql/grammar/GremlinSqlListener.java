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
	 * Enter a parse tree produced by {@link GremlinSqlParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(@NotNull GremlinSqlParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link GremlinSqlParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(@NotNull GremlinSqlParser.Column_aliasContext ctx);

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
	 * Enter a parse tree produced by {@link GremlinSqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull GremlinSqlParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GremlinSqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull GremlinSqlParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link GremlinSqlParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(@NotNull GremlinSqlParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GremlinSqlParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(@NotNull GremlinSqlParser.KeywordContext ctx);

	/**
	 * Enter a parse tree produced by {@link GremlinSqlParser#select_core}.
	 * @param ctx the parse tree
	 */
	void enterSelect_core(@NotNull GremlinSqlParser.Select_coreContext ctx);
	/**
	 * Exit a parse tree produced by {@link GremlinSqlParser#select_core}.
	 * @param ctx the parse tree
	 */
	void exitSelect_core(@NotNull GremlinSqlParser.Select_coreContext ctx);

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
	 * Enter a parse tree produced by {@link GremlinSqlParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(@NotNull GremlinSqlParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GremlinSqlParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(@NotNull GremlinSqlParser.TableContext ctx);

	/**
	 * Enter a parse tree produced by {@link GremlinSqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(@NotNull GremlinSqlParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link GremlinSqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(@NotNull GremlinSqlParser.Table_aliasContext ctx);
}