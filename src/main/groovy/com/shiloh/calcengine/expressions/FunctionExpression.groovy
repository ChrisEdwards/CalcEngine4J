package com.shiloh.calcengine.expressions

import com.shiloh.calcengine.expressions.functions.Function


class FunctionExpression extends Expression {

	String name
	Function function

	FunctionExpression(Function function) {
		this.function = function
	}
}
