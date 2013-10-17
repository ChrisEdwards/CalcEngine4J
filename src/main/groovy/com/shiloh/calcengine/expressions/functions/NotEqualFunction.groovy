package com.shiloh.calcengine.expressions.functions


class NotEqualFunction extends BinaryFunction {

	NotEqualFunction() {
		symbol = "!="
	}

	@Override
	protected evaluate(leftValue, rightValue) {
		leftValue != rightValue
	}
}
