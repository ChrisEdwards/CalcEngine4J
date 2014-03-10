package com.shiloh.calcengine.domainmodel

import spock.lang.Specification


class DomainPropertyTest extends Specification {

	def "should generate unique id for each property"() {
		when:
		def property1 = new DomainProperty()
		def property2 = new DomainProperty()

		then:
		property1.id
		property2.id
		property1.id != property2.id
	}

	def "can create propery with name"() {
		when:
		def property = new DomainProperty(name:"PropertyName")

		then:
		property.name == "PropertyName"
	}
}
