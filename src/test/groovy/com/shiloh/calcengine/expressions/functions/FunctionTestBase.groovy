package com.shiloh.calcengine.expressions.functions

import org.junit.Before
import spock.lang.Specification


abstract class FunctionTestBase extends Specification {

	Stack stack
	Function function

	abstract Function createFunction()

	@Before
	void setup(){
		stack = new Stack()
		function = createFunction()
	}

	protected runFunctionWithParams(Object... params) {
		params.each { stack.push it }
		function.run stack
		assert stack.size() == 1
		return stack.pop()
	}
}
