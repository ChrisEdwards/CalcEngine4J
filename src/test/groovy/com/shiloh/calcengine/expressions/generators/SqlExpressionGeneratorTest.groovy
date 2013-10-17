package com.shiloh.calcengine.expressions.generators

import com.shiloh.calcengine.expressions.Expression
import com.shiloh.calcengine.expressions.ExpressionBuilder
import org.junit.Before
import spock.lang.Specification


class SqlExpressionGeneratorTest extends Specification {
	ExpressionBuilder builder
	Expression expression
	SqlExpressionGenerator generator

	@Before
	void setup(){
		builder = new ExpressionBuilder()
		generator = new SqlExpressionGenerator()
	}

	def "can render integers"() {
		given:
		expression = builder.literal(12345)

		when:
		def result = generator.generate(expression)

		then:
		result == "12345"
	}

	def "can render strings surrounded with single quotes"() {
		given:
		expression = builder.literal("12345")

		when:
		def result = generator.generate(expression)

		then:
		result == "'12345'"
	}

	def "can generate equals expression"() {
		given:
		expression = builder.equal() {
			literal 10
			literal 20
		}

		when:
		def result = generator.generate(expression)

		then:
		result == "( 10 == 20 )"
	}

	def "can generate not equals expression"() {
		given:
		expression = builder.notEqual() {
			literal "A"
			literal "B"
		}

		when:
		def result = generator.generate(expression)

		then:
		result == "( 'A' <> 'B' )"
	}

	def "can generate greater than expression"() {
		given:
		expression = builder.greaterThan() {
			literal "A"
			literal "B"
		}

		when:
		def result = generator.generate(expression)

		then:
		result == "( 'A' > 'B' )"
	}

	def "can generate greater than or equal to expression"() {
		given:
		expression = builder.greaterThanOrEqual() {
			literal "A"
			literal "B"
		}

		when:
		def result = generator.generate(expression)

		then:
		result == "( 'A' >= 'B' )"
	}

	def "can generate less than expression"() {
		given:
		expression = builder.lessThan() {
			literal "A"
			literal "B"
		}

		when:
		def result = generator.generate(expression)

		then:
		result == "( 'A' < 'B' )"
	}

	def "can generate less than or equal to expression"() {
		given:
		expression = builder.lessThanOrEqual() {
			literal "A"
			literal "B"
		}

		when:
		def result = generator.generate(expression)

		then:
		result == "( 'A' <= 'B' )"
	}

	def "can generate add expression"() {
		given:
		expression = builder.add() {
			literal 1
			literal 2
		}

		when:
		def result = generator.generate(expression)

		then:
		result == "( 1 + 2 )"
	}

	def "can generate subtract expression"() {
		given:
		expression = builder.subtract() {
			literal 1
			literal 2
		}

		when:
		def result = generator.generate(expression)

		then:
		result == "( 1 - 2 )"
	}

	def "can generate multiply expression"() {
		given:
		expression = builder.multiply() {
			literal 1
			literal 2
		}

		when:
		def result = generator.generate(expression)

		then:
		result == "( 1 * 2 )"
	}

	def "can generate divide expression"() {
		given:
		expression = builder.divide() {
			literal 1
			literal 2
		}

		when:
		def result = generator.generate(expression)

		then:
		result == "( 1 / 2 )"
	}

	def "can generate and expression"() {
		given:
		expression = builder.and() {
			literal 1
			literal 2
		}

		when:
		def result = generator.generate(expression)

		then:
		result == "( 1 AND 2 )"
	}

	def "can generate or expression"() {
		given:
		expression = builder.or() {
			literal 1
			literal 2
		}

		when:
		def result = generator.generate(expression)

		then:
		result == "( 1 OR 2 )"
	}
}
