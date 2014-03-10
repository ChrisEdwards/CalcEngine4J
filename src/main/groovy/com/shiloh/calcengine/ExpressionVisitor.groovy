package com.shiloh.calcengine

import com.shiloh.calcengine.expressions.Expression
import com.shiloh.calcengine.expressions.FunctionExpression
import com.shiloh.calcengine.expressions.ValueExpression

class ExpressionVisitor {
	Stack stack = new Stack()

	def evaluate( Expression expression ){
		expression.visit(this)
		assert stack.size() == 1
		return stack.pop()
	}

	void visit(Expression node){
		throw new RuntimeException("Could not find visit method for node type ${node.getClass().name}")
	}

	void visit(ValueExpression node){
		stack.push node.getValue()
	}

	void visit(FunctionExpression node){
		node.visitChildren(this)
		node.function.run(stack)
	}
}
