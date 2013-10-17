package com.shiloh.calcengine.expressions.utils

import com.shiloh.calcengine.expressions.BinaryExpression
import com.shiloh.calcengine.expressions.Expression
import com.shiloh.calcengine.expressions.FunctionExpression
import com.shiloh.calcengine.expressions.LiteralExpression


class ExpressionAssertions {

	static FunctionExpression assertIsFunction(Expression expression, Class functionClass){
		assert expression instanceof FunctionExpression
		expression = expression as FunctionExpression
		assert expression.function.class == functionClass
		return expression
	}

	static BinaryExpression assertIsBinaryExpression(Expression expression, Class functionClass) {
		assert expression instanceof BinaryExpression
		expression = expression as BinaryExpression
		assert expression.function.class == functionClass
		return expression
	}

	static LiteralExpression assertIsLiteral(Expression expression, value){
		assert expression instanceof LiteralExpression
		expression = expression as LiteralExpression
		assert expression.value == value
		return expression
	}
}
