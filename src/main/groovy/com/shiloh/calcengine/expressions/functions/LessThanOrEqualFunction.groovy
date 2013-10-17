package com.shiloh.calcengine.expressions.functions


class LessThanOrEqualFunction extends BinaryFunction {

	LessThanOrEqualFunction() {
		symbol = "<="
	}

	@Override
	protected evaluate(leftValue, rightValue) {
		leftValue <= rightValue
	}
}
