package com.shiloh.calcengine.domainmodel

import com.shiloh.calcengine.exceptions.UndefinedDomainClassException
import com.shiloh.calcengine.exceptions.UndefinedDomainPropertyException


class DomainModel {
	List<DomainClass> classes = new ArrayList<>()

	public void addClass(DomainClass clazz){
		classes << clazz
	}

	DomainProperty getDomainProperty(String className, String propertyName) {
		def clazz = classes.find { it.name == className }
		if (!clazz)
			throw new UndefinedDomainClassException("Unknown domain class '{className}' encountered when resolving property '{className}.{propertyName}'")

		def property = clazz.properties.find { it.name == propertyName }
		if (!property)
			throw new UndefinedDomainPropertyException("Unknown domain property '{propertyName}' encountered on domain class '{className}'.")
	}
}
