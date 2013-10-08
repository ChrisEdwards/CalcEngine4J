package com.shiloh.calcengine.expressions.functions

import groovyjarjarcommonscli.MissingArgumentException
import org.junit.Before
import spock.lang.Specification


class DivideFunctionTest extends Specification {

	DivideFunction function
	Stack stack

	@Before
	void setup(){
		stack = new Stack()
		function = new DivideFunction()
	}

	def "should only allow two parameters"() {
		expect:
		function.arity == 2
	}

	def "should have symbol of /"(){
		expect:
		function.symbol == "/"
	}

	def "should divide numbers from the stack"(){
		given:
		stack.push 10
		stack.push 20

		when:
		function.run(stack)

		then:
		stack.size() == 1
		stack.pop() == 0.5
	}

	def "should fail when dividing by zero"(){
		given:
		stack.push 10
		stack.push 0

		when:
		function.run stack

		then:
		thrown ArithmeticException
	}

	def "should fail if less than 2 params are on the stack"(){
		given:
		// no pushes to stack = empty stack

		when:
		function.run stack

		then:
		thrown MissingArgumentException
	}
}
