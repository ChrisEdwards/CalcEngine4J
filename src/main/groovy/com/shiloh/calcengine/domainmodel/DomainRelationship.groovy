package com.shiloh.calcengine.domainmodel

import com.shiloh.calcengine.expressions.Expression


class DomainRelationship {
	String name
	DomainClass sourceClass
	DomainClass targetClass
	Expression joinCriteria
}
