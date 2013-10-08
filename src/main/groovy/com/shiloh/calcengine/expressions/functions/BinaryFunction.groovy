package com.shiloh.calcengine.expressions.functions

import groovyjarjarcommonscli.MissingArgumentException


abstract class BinaryFunction extends Function {

	BinaryFunction() {
		arity = 2
	}

	void run(Stack stack) {
		if (stack.size() < 2)
			throw new MissingArgumentException("Not enough arguments on the stack for this function. Expected 2 but was ${stack.size()}")

		def rightValue = stack.pop()
		def leftValue = stack.pop()

		def result = evaluate(leftValue, rightValue)

		stack.push(result)
	}

	protected abstract def evaluate(leftValue, rightValue)
}
