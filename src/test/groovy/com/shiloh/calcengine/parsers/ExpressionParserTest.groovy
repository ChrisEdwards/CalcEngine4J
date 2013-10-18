package com.shiloh.calcengine.parsers

import com.shiloh.calcengine.antlr.AntlrExpressionParser
import org.junit.Before
import spock.lang.Specification

class ExpressionParserTest extends Specification {

	ExpressionParser parser;

	@Before
	public void setup()  {
		parser = new ExpressionParser()
	}

	def "can parse integer"()
	{
		when:
		def result = parser.parse("4")

		then:
		result.getChild(0) instanceof AntlrExpressionParser.LiteralContext
		result.getChild(0).text == "4"
	}

	def "can parse addition"() {
		when:
		def result = parser.parse("1+2")

		then:
		result.getChild(0) instanceof AntlrExpressionParser.BinaryExpressionContext
		def addExpr = result.getChild(0) as AntlrExpressionParser.BinaryExpressionContext

		addExpr.op.type == AntlrExpressionParser.ADD

		addExpr.left instanceof AntlrExpressionParser.LiteralContext
		addExpr.left.text == "1"

		addExpr.right instanceof AntlrExpressionParser.LiteralContext
		addExpr.right.text == "2"
	}
}
