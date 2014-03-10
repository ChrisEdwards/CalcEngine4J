package com.shiloh.calcengine.expressions.functions


class AddFunction extends BinaryFunction {

	AddFunction() {
		symbol = "+"
	}

	@Override
	protected evaluate(leftValue, rightValue) {
		leftValue + rightValue
	}
}
