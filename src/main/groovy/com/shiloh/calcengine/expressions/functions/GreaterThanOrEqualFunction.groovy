package com.shiloh.calcengine.expressions.functions


class GreaterThanOrEqualFunction extends BinaryFunction {

	GreaterThanOrEqualFunction() {
		symbol = ">="
	}

	@Override
	protected evaluate(leftValue, rightValue) {
		leftValue >= rightValue
	}
}
