package com.shiloh.calcengine.expressions.functions


class EqualFunction extends BinaryFunction {

	EqualFunction() {
		symbol = "=="
	}

	@Override
	protected evaluate(leftValue, rightValue) {
		leftValue == rightValue
	}
}
