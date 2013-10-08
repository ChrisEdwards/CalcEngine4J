package com.shiloh.calcengine.expressions

import com.shiloh.calcengine.expressions.functions.AddFunction
import com.shiloh.calcengine.expressions.functions.AndFunction
import com.shiloh.calcengine.expressions.functions.DivideFunction
import com.shiloh.calcengine.expressions.functions.MultiplyFunction
import com.shiloh.calcengine.expressions.functions.NotFunction
import com.shiloh.calcengine.expressions.functions.OrFunction
import com.shiloh.calcengine.expressions.functions.RoundFunction
import com.shiloh.calcengine.expressions.functions.SubtractFunction
import com.shiloh.calcengine.expressions.utils.ExpressionExtensions
import org.junit.Before
import spock.lang.Specification


class ExpressionBuilderTest extends Specification {

	ExpressionBuilder builder
	Expression expression

	@Before
	def setup(){
		builder = new ExpressionBuilder()
	}


	def "should be able to build 1+1"() {
		when:
		expression = builder.add() {
			literal(1)
			literal(2)
		}

		then:
		use(ExpressionExtensions) {
			expression.assertIsFunction(AddFunction)
			expression.children[0].assertIsLiteral(1)
			expression.children[1].assertIsLiteral(2)
		}
	}


	def "should be able to build all numeric function types"() {
		when:
		expression = builder.add() {
			multiply {
				round {
					literal 2.125
					literal 2
				}
				subtract {
					literal 10
					literal 20
				}
			}
			divide {
				literal 100
				literal 10
			}
		}

		then:
		use(ExpressionExtensions) {
			def root = expression.assertIsFunction(AddFunction)
			def multiply = root.children[0].assertIsFunction(MultiplyFunction)
			def round = multiply.children[0].assertIsFunction(RoundFunction)
			def subtract = multiply.children[1].assertIsFunction(SubtractFunction)
			def divide = root.children[1].assertIsFunction(DivideFunction)
		}
	}


	def "should be able to build all logical function types"() {
		when:
		expression = builder.and() {
			not {
				literal false
			}
			or {
				literal true
				literal false
			}
		}

		then:
		use(ExpressionExtensions) {
			def and = expression.assertIsFunction(AndFunction)
			def not = and.children[0].assertIsFunction(NotFunction)
			def or = and.children[1].assertIsFunction(OrFunction)
		}
	}
}
