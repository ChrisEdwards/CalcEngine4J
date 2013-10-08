package com.shiloh.calcengine.expressions.functions

import spock.lang.Specification


class AddFunctionTest extends Specification {
	def "should only allow two parameters"() {
		when:
		def addFunction = new AddFunction()

		then:
		addFunction.arity == 2
	}

	def "should have symbol of +"(){
		when:
		def addFunction = new AddFunction()

		then:
		addFunction.symbol == "+"
	}

	def "should add numbers from the stack"(){
		given:
		Stack stack = new Stack()
		stack.push 10
		stack.push 20
		def addFunction = new AddFunction()

		when:
		addFunction.run(stack)

		then:
		stack.size() == 1
		stack.pop() == 30
	}
}
