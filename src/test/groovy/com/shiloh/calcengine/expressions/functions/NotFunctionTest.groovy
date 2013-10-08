package com.shiloh.calcengine.expressions.functions

import groovyjarjarcommonscli.MissingArgumentException

class NotFunctionTest extends FunctionTestBase {

	@Override
	Function createFunction() {
		new NotFunction()
	}

	def "should only allow only one parameter"() {
		expect:
		function.arity == 1
	}

	def "should have symbol of 'not'"(){
		expect:
		function.symbol == "not"
	}

	def "should negate boolean values from the stack"() {
		expect:
		runFunctionWithParams(param) == result

		where:
		param 	| result
		true	| false
		false	| true
	}

	def "should negate non-boolean values from the stack using groovy truth"() {
		expect:
		runFunctionWithParams(param) == result

		where:
		param 	| result
		""		| true
		"bob"	| false
		0		| true
		1		| false
		0.0		| true
		2.5		| false
	}

	def "should fail if less than 2 params are on the stack"(){
		when:
		runFunctionWithParams() // no params

		then:
		thrown MissingArgumentException
	}
}
