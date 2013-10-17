package com.shiloh.calcengine.expressions

import com.shiloh.calcengine.expressions.functions.AddFunction
import com.shiloh.calcengine.expressions.functions.AndFunction
import com.shiloh.calcengine.expressions.functions.DivideFunction
import com.shiloh.calcengine.expressions.functions.EqualFunction
import com.shiloh.calcengine.expressions.functions.GreaterThanFunction
import com.shiloh.calcengine.expressions.functions.GreaterThanOrEqualFunction
import com.shiloh.calcengine.expressions.functions.LessThanFunction
import com.shiloh.calcengine.expressions.functions.LessThanOrEqualFunction
import com.shiloh.calcengine.expressions.functions.MultiplyFunction
import com.shiloh.calcengine.expressions.functions.NotEqualFunction
import com.shiloh.calcengine.expressions.functions.NotFunction
import com.shiloh.calcengine.expressions.functions.OrFunction
import com.shiloh.calcengine.expressions.functions.RoundFunction
import com.shiloh.calcengine.expressions.functions.SubtractFunction
import com.shiloh.calcengine.expressions.utils.ExpressionAssertions
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
		use(ExpressionAssertions) {
			expression.assertIsBinaryExpression(AddFunction)
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
		use(ExpressionAssertions) {
			def root = expression.assertIsBinaryExpression(AddFunction)
			def multiply = root.children[0].assertIsBinaryExpression(MultiplyFunction)
			def round = multiply.children[0].assertIsFunction(RoundFunction)
			def subtract = multiply.children[1].assertIsBinaryExpression(SubtractFunction)
			def divide = root.children[1].assertIsBinaryExpression(DivideFunction)
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
		use(ExpressionAssertions) {
			def and = expression.assertIsBinaryExpression(AndFunction)
			def not = and.children[0].assertIsFunction(NotFunction)
			def or = and.children[1].assertIsBinaryExpression(OrFunction)
		}
	}

	def "should be able to build comparison operators"() {
		when:
		expression = builder.equal() {
			greaterThan {
				greaterThanOrEqual {
					literal 1
					literal 1
				}
				notEqual {
					literal 1
					literal 1
				}
			}
			lessThan {
				lessThanOrEqual {
					literal 1
					literal 1
				}
				literal 1
			}
		}

		then:
		use(ExpressionAssertions) {
			def eq = expression.assertIsBinaryExpression(EqualFunction)
			def gt = eq.children[0].assertIsBinaryExpression(GreaterThanFunction)
			def ge = gt.children[0].assertIsBinaryExpression(GreaterThanOrEqualFunction)
			def ne = gt.children[1].assertIsBinaryExpression(NotEqualFunction)
			def lt = eq.children[1].assertIsBinaryExpression(LessThanFunction)
			def le = lt.children[0].assertIsBinaryExpression(LessThanOrEqualFunction)
		}
	}
}
