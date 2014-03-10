package com.shiloh.calcengine.expressions.functions


class DivideFunction extends BinaryFunction {

	DivideFunction() {
		symbol = "/"
	}

	@Override
	protected evaluate(leftValue, rightValue) {
		leftValue / rightValue
	}
}
