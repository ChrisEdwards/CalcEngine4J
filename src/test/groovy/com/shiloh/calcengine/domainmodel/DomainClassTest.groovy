package com.shiloh.calcengine.domainmodel

import spock.lang.Specification


class DomainClassTest extends Specification {

	def "should generate unique id for each class"() {
		when:
		def class1 = new DomainClass()
		def class2 = new DomainClass()

		then:
		class1.id
		class2.id
		class1.id != class2.id
	}

	def "can create class with name"() {
		when:
		def clazz = new DomainClass(name:"ClassName")

		then:
		clazz.name == "ClassName"
	}

	def "adding a property should also set the property's domainClass"() {
		given:
		def clazz = new DomainClass(name:"ClassName")
		def property = new DomainProperty(name:"PropertyName")

		when:
		clazz.addProperty(property)

		then:
		clazz.properties.contains(property)
		property.domainClass == clazz
	}

	def "getting the keys should only return properties marked as key"() {
		given:
		def clazz = new DomainClass(name:"ClassName")
		def key1 = new DomainProperty(name:"Key1", isKey:true)
		def key2 = new DomainProperty(name:"Key2", isKey:true)
		def nonKeyProperty = new DomainProperty(name:"NonKeyProperty")

		clazz.addProperty(key1)
		clazz.addProperty(key2)
		clazz.addProperty(nonKeyProperty)

		when:
		def keys = clazz.getKeyProperties()

		then:
		keys
		keys.contains(key1)
		keys.contains(key2)
		!keys.contains(nonKeyProperty)
	}
}
