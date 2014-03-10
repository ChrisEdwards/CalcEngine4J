package com.shiloh.calcengine.expressions

import com.shiloh.calcengine.exceptions.ChildNotAllowedException
import spock.lang.Specification


class LiteralNodeTest extends Specification {
	def "can contain an int value"(){
		when:
		def node = new LiteralExpression(10)

		then:
		node.getValue() == 10
	}

	def "can contain a String value"(){
		when:
		def node = new LiteralExpression("My Value")

		then:
		node.getValue() == "My Value"
	}

	def "cannot have children"(){
		when:
		def node = new LiteralExpression()
		node.addChild(new LiteralExpression())

		then:
		thrown ChildNotAllowedException
	}
}
