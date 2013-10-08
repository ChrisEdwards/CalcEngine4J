package com.shiloh.calcengine.expressions.functions


class AndFunction extends BinaryFunction {

	AndFunction() {
		symbol = "and"
	}

	@Override
	protected evaluate(leftValue, rightValue) {
		leftValue && rightValue
	}
}
