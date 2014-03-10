package com.shiloh.calcengine.expressions.functions


class MultiplyFunction extends BinaryFunction {

	MultiplyFunction() {
		symbol = "*"
	}

	@Override
	protected evaluate(leftValue, rightValue) {
		leftValue * rightValue
	}
}
