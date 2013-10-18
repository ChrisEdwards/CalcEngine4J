// Generated from C:\Projects\calcengine\src\main\antlr\AntlrExpression.g4 by ANTLR 4.1
package com.shiloh.calcengine.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AntlrExpressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AntlrExpressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AntlrExpressionParser#BinaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpression(@NotNull AntlrExpressionParser.BinaryExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link AntlrExpressionParser#Literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull AntlrExpressionParser.LiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link AntlrExpressionParser#Id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull AntlrExpressionParser.IdContext ctx);

	/**
	 * Visit a parse tree produced by {@link AntlrExpressionParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormula(@NotNull AntlrExpressionParser.FormulaContext ctx);
}