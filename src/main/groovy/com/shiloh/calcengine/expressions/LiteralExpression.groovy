package com.shiloh.calcengine.expressions

class LiteralExpression extends ValueExpression {
	private def value

	LiteralExpression(value) {
		this.value = value
	}

	@Override
	def getValue() {
		return value
	}
}
