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
	 * Enter a parse tree produced by {@link AntlrExpressionParser#CalculatedAndOrAbstractProperty}.
	 * @param ctx the parse tree
	 */
	void enterCalculatedAndOrAbstractProperty(@NotNull AntlrExpressionParser.CalculatedAndOrAbstractPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrExpressionParser#CalculatedAndOrAbstractProperty}.
	 * @param ctx the parse tree
	 */
	void exitCalculatedAndOrAbstractProperty(@NotNull AntlrExpressionParser.CalculatedAndOrAbstractPropertyContext ctx);

	/**
	 * Enter a parse tree produced by {@link AntlrExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull AntlrExpressionParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull AntlrExpressionParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link AntlrExpressionParser#PrimaryKeyProperty}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyProperty(@NotNull AntlrExpressionParser.PrimaryKeyPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrExpressionParser#PrimaryKeyProperty}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyProperty(@NotNull AntlrExpressionParser.PrimaryKeyPropertyContext ctx);

	/**
	 * Enter a parse tree produced by {@link AntlrExpressionParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(@NotNull AntlrExpressionParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrExpressionParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(@NotNull AntlrExpressionParser.RootContext ctx);

	/**
	 * Enter a parse tree produced by {@link AntlrExpressionParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull AntlrExpressionParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrExpressionParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull AntlrExpressionParser.ExpressionListContext ctx);

	/**
	 * Enter a parse tree produced by {@link AntlrExpressionParser#entity}.
	 * @param ctx the parse tree
	 */
	void enterEntity(@NotNull AntlrExpressionParser.EntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrExpressionParser#entity}.
	 * @param ctx the parse tree
	 */
	void exitEntity(@NotNull AntlrExpressionParser.EntityContext ctx);

	/**
	 * Enter a parse tree produced by {@link AntlrExpressionParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDeclaration(@NotNull AntlrExpressionParser.PropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrExpressionParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDeclaration(@NotNull AntlrExpressionParser.PropertyDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link AntlrExpressionParser#entityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEntityExpression(@NotNull AntlrExpressionParser.EntityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrExpressionParser#entityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEntityExpression(@NotNull AntlrExpressionParser.EntityExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link AntlrExpressionParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull AntlrExpressionParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrExpressionParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull AntlrExpressionParser.ClassDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link AntlrExpressionParser#filteredEntityExpression}.
	 * @param ctx the parse tree
	 */
	void enterFilteredEntityExpression(@NotNull AntlrExpressionParser.FilteredEntityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrExpressionParser#filteredEntityExpression}.
	 * @param ctx the parse tree
	 */
	void exitFilteredEntityExpression(@NotNull AntlrExpressionParser.FilteredEntityExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link AntlrExpressionParser#formulaDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFormulaDeclaration(@NotNull AntlrExpressionParser.FormulaDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrExpressionParser#formulaDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFormulaDeclaration(@NotNull AntlrExpressionParser.FormulaDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link AntlrExpressionParser#relationshipDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRelationshipDeclaration(@NotNull AntlrExpressionParser.RelationshipDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrExpressionParser#relationshipDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRelationshipDeclaration(@NotNull AntlrExpressionParser.RelationshipDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link AntlrExpressionParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(@NotNull AntlrExpressionParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrExpressionParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(@NotNull AntlrExpressionParser.ClassBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link AntlrExpressionParser#chainedEntityExpression}.
	 * @param ctx the parse tree
	 */
	void enterChainedEntityExpression(@NotNull AntlrExpressionParser.ChainedEntityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrExpressionParser#chainedEntityExpression}.
	 * @param ctx the parse tree
	 */
	void exitChainedEntityExpression(@NotNull AntlrExpressionParser.ChainedEntityExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link AntlrExpressionParser#qualifiedPropertyName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedPropertyName(@NotNull AntlrExpressionParser.QualifiedPropertyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrExpressionParser#qualifiedPropertyName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedPropertyName(@NotNull AntlrExpressionParser.QualifiedPropertyNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link AntlrExpressionParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull AntlrExpressionParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrExpressionParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull AntlrExpressionParser.LiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link AntlrExpressionParser#baseClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBaseClassDeclaration(@NotNull AntlrExpressionParser.BaseClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrExpressionParser#baseClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBaseClassDeclaration(@NotNull AntlrExpressionParser.BaseClassDeclarationContext ctx);
}