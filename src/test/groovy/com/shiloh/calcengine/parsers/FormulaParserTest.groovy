package com.shiloh.calcengine.parsers

import com.shiloh.calcengine.domainmodel.DomainModel
import com.shiloh.calcengine.exceptions.UndefinedDomainClassException
import com.shiloh.calcengine.exceptions.UndefinedDomainPropertyException
import spock.lang.Specification


class FormulaParserTest extends Specification {

	def "should throw error if formula is for a property on an undefined class"() {
		when:
		def parser = new FormulaParser(new DomainModel())
		parser.parse("UnknownClass.PropertyName = 1")

		then:
		thrown(UndefinedDomainClassException)
	}

	def "should throw error if formula is for an undefined property on an existing class"() {
		given:
		def model = (new DomainParser()).parse("class MyClass{}")

		when:
		def parser = new FormulaParser(model)
		parser.parse("MyClass.UnknownPropertyName = 1")
    
		then:
		thrown(UndefinedDomainPropertyException)
	}
}
