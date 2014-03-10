package com.shiloh.calcengine.domainmodel

import com.shiloh.calcengine.expressions.utils.DomainAssertions
import org.junit.Before
import spock.lang.Specification


class DomainModelBuilderTest extends Specification {

	DomainModelBuilder builder
	DomainModel model

	@Before
	void setup(){
		builder = new DomainModelBuilder()
	}

	def "can build class with properties"() {
		when:
		def clazz = builder.domainClass("Order") {
			property "Property1"
			property "Property2"
		}

		then:
		use(DomainAssertions) {
			clazz = clazz.assertIsDomainClass()
			assert clazz.name == "Order"
			assert clazz.properties.size() == 2

			def property1 = clazz.properties[0].assertIsDomainProperty()
			assert property1.name == "Property1"
			assert property1.domainClass == clazz

			def property2 = clazz.properties[1].assertIsDomainProperty()
			assert property2.name == "Property2"
			assert property2.domainClass == clazz
			1==1 // Why does this make it work? Won't compile otherwise.
		}
	}

	def "can build domain model with class"() {
		when:
		model = builder.domainModel() {
			domainClass("Class1") {
				property "Class1Property1"
				property "Class1Property2"
			}
			domainClass("Class2") {
				property "Class2Property1"
				property "Class2Property2"
			}
		}

		then:
		use(DomainAssertions) {
			assert model.classes.size() == 2

			def class1 = model.classes[0].assertIsDomainClass()
			assert class1.name == "Class1"
			assert class1.properties.size() == 2

			def class1property1 = class1.properties[0].assertIsDomainProperty()
			assert class1property1.name == "Class1Property1"
			assert class1property1.domainClass == class1

			def class1property2 = class1.properties[1].assertIsDomainProperty()
			assert class1property2.name == "Class1Property2"
			assert class1property2.domainClass == class1

			def class2 = model.classes[1].assertIsDomainClass()
			assert class2.name == "Class2"
			assert class2.properties.size() == 2

			def class2property1 = class2.properties[0].assertIsDomainProperty()
			assert class2property1.name == "Class2Property1"
			assert class2property1.domainClass == class2

			def class2property2 = class2.properties[1].assertIsDomainProperty()
			assert class2property2.name == "Class2Property2"
			assert class2property2.domainClass == class2
			1==1 // Why does this make it work? Won't compile otherwise.
		}
	}
}

