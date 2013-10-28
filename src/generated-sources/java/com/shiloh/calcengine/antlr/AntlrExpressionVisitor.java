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
	 * Visit a parse tree produced by {@link AntlrExpressionParser#CalculatedAndOrAbstractProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculatedAndOrAbstractProperty(@NotNull AntlrExpressionParser.CalculatedAndOrAbstractPropertyContext ctx);

	/**
	 * Visit a parse tree produced by {@link AntlrExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull AntlrExpressionParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link AntlrExpressionParser#PrimaryKeyProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKeyProperty(@NotNull AntlrExpressionParser.PrimaryKeyPropertyContext ctx);

	/**
	 * Visit a parse tree produced by {@link AntlrExpressionParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(@NotNull AntlrExpressionParser.RootContext ctx);

	/**
	 * Visit a parse tree produced by {@link AntlrExpressionParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(@NotNull AntlrExpressionParser.ExpressionListContext ctx);

	/**
	 * Visit a parse tree produced by {@link AntlrExpressionParser#entity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity(@NotNull AntlrExpressionParser.EntityContext ctx);

	/**
	 * Visit a parse tree produced by {@link AntlrExpressionParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDeclaration(@NotNull AntlrExpressionParser.PropertyDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link AntlrExpressionParser#entityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityExpression(@NotNull AntlrExpressionParser.EntityExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link AntlrExpressionParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(@NotNull AntlrExpressionParser.ClassDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link AntlrExpressionParser#filteredEntityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilteredEntityExpression(@NotNull AntlrExpressionParser.FilteredEntityExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link AntlrExpressionParser#formulaDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormulaDeclaration(@NotNull AntlrExpressionParser.FormulaDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link AntlrExpressionParser#relationshipDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationshipDeclaration(@NotNull AntlrExpressionParser.RelationshipDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link AntlrExpressionParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(@NotNull AntlrExpressionParser.ClassBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link AntlrExpressionParser#chainedEntityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChainedEntityExpression(@NotNull AntlrExpressionParser.ChainedEntityExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link AntlrExpressionParser#qualifiedPropertyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedPropertyName(@NotNull AntlrExpressionParser.QualifiedPropertyNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link AntlrExpressionParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull AntlrExpressionParser.LiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link AntlrExpressionParser#baseClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseClassDeclaration(@NotNull AntlrExpressionParser.BaseClassDeclarationContext ctx);
}