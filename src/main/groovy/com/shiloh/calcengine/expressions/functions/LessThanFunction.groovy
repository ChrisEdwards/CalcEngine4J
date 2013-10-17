package com.shiloh.calcengine.expressions.functions


class LessThanFunction extends BinaryFunction {

	LessThanFunction() {
		symbol = "<"
	}

	@Override
	protected evaluate(leftValue, rightValue) {
		leftValue < rightValue
	}
}
