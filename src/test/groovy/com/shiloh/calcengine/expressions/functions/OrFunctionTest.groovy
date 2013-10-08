package com.shiloh.calcengine.expressions.functions

import groovyjarjarcommonscli.MissingArgumentException

class OrFunctionTest extends FunctionTestBase {

	@Override
	Function createFunction() {
		new OrFunction()
	}

	def "should only allow two parameters"() {
		expect:
		function.arity == 2
	}

	def "should have symbol of 'or'"(){
		expect:
		function.symbol == "or"
	}

	def "should OR boolean values from the stack"() {
		expect:
		runFunctionWithParams(param1, param2) == result

		where:
		param1 	| param2	| result
		true	| true		| true
		true	| false		| true
		false	| true		| true
		false	| false		| false
	}

	def "should OR two non-boolean true values from the stack using groovy truth"() {
		expect:
		runFunctionWithParams(param1, param2) == result

		where:
		param1 	| param2	| result
		1		| "bob"		| true
		2.5		| ""		| true
		0		| 25		| true
		null	| ""		| false
	}

	def "should fail if less than 2 params are on the stack"(){
		when:
		runFunctionWithParams() // no params

		then:
		thrown MissingArgumentException
	}
}
