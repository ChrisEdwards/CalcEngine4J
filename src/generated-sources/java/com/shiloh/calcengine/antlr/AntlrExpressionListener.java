// Generated from C:\Projects\calcengine\src\main\antlr\AntlrExpression.g4 by ANTLR 4.1
package com.shiloh.calcengine.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AntlrExpressionParser}.
 */
public interface AntlrExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AntlrExpressionParser#BinaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpression(@NotNull AntlrExpressionParser.BinaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrExpressionParser#BinaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpression(@NotNull AntlrExpressionParser.BinaryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link AntlrExpressionParser#Literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull AntlrExpressionParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrExpressionParser#Literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull AntlrExpressionParser.LiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link AntlrExpressionParser#Id}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull AntlrExpressionParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrExpressionParser#Id}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull AntlrExpressionParser.IdContext ctx);

	/**
	 * Enter a parse tree produced by {@link AntlrExpressionParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterFormula(@NotNull AntlrExpressionParser.FormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrExpressionParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitFormula(@NotNull AntlrExpressionParser.FormulaContext ctx);
}