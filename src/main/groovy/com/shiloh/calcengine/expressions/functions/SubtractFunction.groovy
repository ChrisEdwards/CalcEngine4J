package com.shiloh.calcengine.expressions.functions


class SubtractFunction extends BinaryFunction {

	SubtractFunction() {
		symbol = "-"
	}

	@Override
	protected evaluate(leftValue, rightValue) {
		leftValue - rightValue
	}
}
