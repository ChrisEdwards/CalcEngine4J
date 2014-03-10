package com.shiloh.calcengine.expressions.functions


class OrFunction extends BinaryFunction {

	OrFunction() {
		symbol = "or"
	}

	@Override
	protected evaluate(leftValue, rightValue) {
		leftValue || rightValue
	}
}
