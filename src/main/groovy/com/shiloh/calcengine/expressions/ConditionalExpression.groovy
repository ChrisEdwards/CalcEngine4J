package com.shiloh.calcengine.expressions


class ConditionalExpression extends Expression {

	ConditionalExpression(Expression conditionalExpression, Expression trueExpression, Expression falseExpression) {
		addChild(conditionalExpression)
		addChild(trueExpression)
		addChild(falseExpression)
	}

	Expression getConditionExpression() {
		children[0]
	}

	Expression getTrueExpression() {
		children[1]
	}

	Expression getFalseExpression() {
		children[2]
	}
}
