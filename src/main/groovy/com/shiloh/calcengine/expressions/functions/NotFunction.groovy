package com.shiloh.calcengine.expressions.functions


class NotFunction extends Function {

	NotFunction() {
		arity = 1
		symbol = "not"
	}

	@Override
	protected def evaluate(List<Object> params) {
		!params[0]
	}
}
