package com.shiloh.calcengine.expressions

import com.shiloh.calcengine.ExpressionVisitor
import com.shiloh.calcengine.expressions.functions.AddFunction
import spock.lang.Specification


class NodeVisitorTest extends Specification {
	def "should calc 1 + 1"() {
		given:
		def expression = new FunctionExpression( new AddFunction() )
		expression.addChild( new LiteralExpression(1) )
		expression.addChild( new LiteralExpression(1) )
		def evaluator = new ExpressionVisitor()

		when:
		def result = evaluator.evaluate( expression )

		then:
		result == 2
	}
}
