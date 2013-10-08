package com.shiloh.calcengine.expressions.functions

import groovyjarjarcommonscli.MissingArgumentException


abstract class Function {

	String symbol
	int arity

	void run(Stack stack){
		if (stack.size() < arity) throw new MissingArgumentException("Not enough arguments on the stack for this function.\n" +
																			 "Expected $arity but was ${stack.size()}")

		def params = []
		arity.times { params << stack.pop() }
		params.reverse()


		def result = evaluate(params)

		stack.push result
	}

	protected def evaluate(List<Object> params){}
}
