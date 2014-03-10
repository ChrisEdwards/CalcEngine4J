package com.shiloh.calcengine.expressions.functions

import groovyjarjarcommonscli.MissingArgumentException

class AndFunctionTest extends FunctionTestBase {

	@Override
	Function createFunction() {
		new AndFunction()
	}

	def "should only allow two parameters"() {
		expect:
		function.arity == 2
	}

	def "should have symbol of 'and'"(){
		expect:
		function.symbol == "and"
	}

	def "should AND boolean values from the stack"() {
		expect:
		runFunctionWithParams(param1, param2) == result

		where:
		param1 	| param2	| result
		true	| true		| true
		true	| false		| false
		false	| true		| false
		false	| false		| false
	}

	def "should AND two non-boolean true values from the stack using groovy truth"() {
		expect:
		runFunctionWithParams(param1, param2) == result

		where:
		param1 	| param2	| result
		1		| "bob"		| true
		2.5		| ""		| false
		0		| 25		| false
		null	| ""		| false
	}

	def "should fail if less than 2 params are on the stack"(){
		when:
		runFunctionWithParams() // no params

		then:
		thrown MissingArgumentException
	}
}
