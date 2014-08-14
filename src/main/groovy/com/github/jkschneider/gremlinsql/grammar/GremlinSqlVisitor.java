// Generated from /home/jon/git/gremlin-sql/src/main/antlr4/GremlinSql.g4 by ANTLR 4.2.2
package com.github.jkschneider.gremlinsql.grammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GremlinSqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GremlinSqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GremlinSqlParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(@NotNull GremlinSqlParser.Literal_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link GremlinSqlParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(@NotNull GremlinSqlParser.Column_aliasContext ctx);

	/**
	 * Visit a parse tree produced by {@link GremlinSqlParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(@NotNull GremlinSqlParser.Any_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link GremlinSqlParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(@NotNull GremlinSqlParser.Column_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link GremlinSqlParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_column(@NotNull GremlinSqlParser.Result_columnContext ctx);

	/**
	 * Visit a parse tree produced by {@link GremlinSqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull GremlinSqlParser.ExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link GremlinSqlParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(@NotNull GremlinSqlParser.KeywordContext ctx);

	/**
	 * Visit a parse tree produced by {@link GremlinSqlParser#select_core}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_core(@NotNull GremlinSqlParser.Select_coreContext ctx);

	/**
	 * Visit a parse tree produced by {@link GremlinSqlParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(@NotNull GremlinSqlParser.Table_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link GremlinSqlParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(@NotNull GremlinSqlParser.TableContext ctx);

	/**
	 * Visit a parse tree produced by {@link GremlinSqlParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(@NotNull GremlinSqlParser.Table_aliasContext ctx);
}