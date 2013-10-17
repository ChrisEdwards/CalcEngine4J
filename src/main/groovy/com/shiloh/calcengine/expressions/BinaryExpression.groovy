package com.shiloh.calcengine.expressions

import com.shiloh.calcengine.expressions.functions.BinaryFunction
import com.shiloh.calcengine.expressions.functions.Function


class BinaryExpression extends Expression {

	BinaryFunction function

	BinaryExpression(BinaryFunction function) {
		this.function = function
	}

	BinaryExpression(Expression leftExpression, Expression rightExpression, BinaryFunction function) {
		addChild(leftExpression)
		addChild(rightExpression)
		this.function = function
	}


	Expression getLeftExpression() {
		children[0]
	}

	Expression getRightExpression() {
		children[1]
	}
}
