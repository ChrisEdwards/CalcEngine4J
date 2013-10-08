package com.shiloh.calcengine.expressions.functions

import java.math.RoundingMode


class RoundFunction extends Function {

	public static final int SCALE = 0
	public static final int VALUE = 1

	RoundFunction() {
		arity = 2
		symbol = "round"
	}

	@Override
	protected def evaluate(List<Object> params) {
		BigDecimal value = params[VALUE] as BigDecimal
		int scale = params[SCALE] as int

		return value.setScale(scale, RoundingMode.HALF_UP)
	}
}
