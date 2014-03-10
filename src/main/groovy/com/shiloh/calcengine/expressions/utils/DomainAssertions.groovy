package com.shiloh.calcengine.expressions.utils

import com.shiloh.calcengine.domainmodel.DomainClass
import com.shiloh.calcengine.domainmodel.DomainProperty


class DomainAssertions {

	static DomainClass assertIsDomainClass(Object obj){
		assert obj instanceof DomainClass
		obj as DomainClass
	}

	static DomainProperty assertIsDomainProperty(Object obj){
		assert obj instanceof DomainProperty
		obj as DomainProperty
	}
}
