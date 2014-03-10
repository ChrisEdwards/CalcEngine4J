package com.shiloh.calcengine.expressions

import com.shiloh.calcengine.exceptions.ChildNotAllowedException


abstract class ValueExpression extends Expression {

	@Override
	void addChild(Expression child) {
		throw new ChildNotAllowedException("ValueExpression does not allow children.")
	}

	abstract def getValue()
}
