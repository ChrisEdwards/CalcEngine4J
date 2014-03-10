package com.shiloh.calcengine.expressions.functions

import groovyjarjarcommonscli.MissingArgumentException

class RoundFunctionTest extends FunctionTestBase {

	@Override
	Function createFunction() {
		new RoundFunction()
	}

	def "should allow two parameters"() {
		expect:
		function.arity == 2
	}

	def "should have symbol of 'round'"(){
		expect:
		function.symbol == "round"
	}

	def "should round decimal values"() {
		expect:
		runFunctionWithParams(value, scale) == result

		where:
		value 	| scale	| result
		0.1		| 0		| 0
		0.5		| 0		| 1
		0.1234	| 3		| 0.123
		0.1235	| 3		| 0.124
		0.12345	| 3		| 0.123
		-0.11	| 1		| -0.1
		-0.15	| 1		| -0.2
	}

	def "should round double values"() {
		expect:
		runFunctionWithParams(value, scale) == result

		where:
		value 		| scale	| result
		0.1d		| 0		| 0
		0.5d		| 0		| 1
		0.1234d		| 3		| 0.123
		0.1235d		| 3		| 0.124
		0.12345d	| 3		| 0.123
		-0.11d		| 1		| -0.1
		-0.15d		| 1		| -0.2
	}

	def "should fail if less than 2 params are on the stack"(){
		when:
		runFunctionWithParams(1) // no params

		then:
		thrown MissingArgumentException
	}
}
