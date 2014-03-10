package com.shiloh.calcengine.expressions

import com.shiloh.calcengine.ExpressionVisitor

import java.util.concurrent.atomic.AtomicInteger


abstract class Expression {

	static AtomicInteger idGenerator = new AtomicInteger()

	int id
	List<Expression> children  = []
	Expression parent

	Expression() {
		id = idGenerator.incrementAndGet()
	}

	void addChild(Expression child) {
		child.parent = this
		children << child
	}

	void visit(visitor) {
		visitor.visit(this)
	}

	void visitChildren(visitor) {
		children.each { it.visit(visitor) }
	}

}
