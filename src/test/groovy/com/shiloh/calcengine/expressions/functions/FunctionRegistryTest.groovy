package com.shiloh.calcengine.expressions.functions

import groovy.inspect.Inspector
import spock.lang.Specification


class FunctionRegistryTest extends Specification {

	def "can find function by name"(){
		when:
		def registry = new FunctionRegistry()
		def function = registry.findByName("add")

		then:
		function
		Inspector.shortName(function.class) == "AddFunction"
	}
}
