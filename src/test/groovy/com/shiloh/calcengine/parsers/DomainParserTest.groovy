package com.shiloh.calcengine.parsers

import com.shiloh.calcengine.domainmodel.DomainClass
import com.shiloh.calcengine.domainmodel.DomainModel
import com.shiloh.calcengine.domainmodel.DomainProperty
import spock.lang.Specification


class DomainParserTest extends Specification {

	def "can parse a class with properties"() {
		when:
		def model = parseDomainModel("""
				class Order {
					property OrderId;
					property TotalAmount;
				}
			""")

		then:
		model.classes.size() == 1

		DomainClass clazz = model.classes[0]
		clazz.name == "Order"
		clazz.properties.size() == 2

		DomainProperty property1 = clazz.properties[0]
		property1.name == "OrderId"

		DomainProperty property2 = clazz.properties[1]
		property2.name == "TotalAmount"
	}

	def "can parse calculated property"() {
		when:
		def model = parseDomainModel("""
				class Order {
					property TotalAmount calculated;
				}
			""")

		then:
		def property = model.classes[0].properties[0]
		property.name == 'TotalAmount'
		!property.isAbstract
		property.isCalculated
		!property.isKey
	}

	def "can parse key property"() {
		when:
		def model = parseDomainModel("""
				class Order {
					property OrderId primarykey;
				}
			""")

		then:
		def property = model.classes[0].properties[0]
		property.name == 'OrderId'
		!property.isAbstract
		!property.isCalculated
		property.isKey
	}

	def "can parse non-calculated property"() {
		when:
		def model = parseDomainModel("""
				class Order {
					property Comment;
				}
			""")

		then:
		def property = model.classes[0].properties[0]
		property.name == 'Comment'
		!property.isAbstract
		!property.isCalculated
		!property.isKey
	}

	def "ignores single and multi-line comments"() {
		when:
		def model = parseDomainModel("""
				/* Multi
				 * Line
				 * Comment
				 */
				// Single Line Comment
				class Order {}
			""")

		then:
		model.classes.size() == 1
	}



	private static DomainModel parseDomainModel(String domainModelString) {
		def parser = new DomainParser()
		DomainModel result = parser.parse(domainModelString)
		result
	}
}
