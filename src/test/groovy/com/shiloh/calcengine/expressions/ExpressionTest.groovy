package com.shiloh.calcengine.expressions

import spock.lang.Specification


class ExpressionTest extends Specification {

	private class SampleExpression extends Expression{}

	def "can add child to a node"(){
		given:
		def node = new SampleExpression()
		def child = new SampleExpression()

		when:
		node.addChild(child)

		then:
		node.children.contains(child)
		child.parent == node
	}

	def "should have unique id"(){
		when:
		def node1 = new SampleExpression()
		def node2 = new SampleExpression()

		then:
		node1.id
		node2.id
		node1.id != node2.id
	}
}
