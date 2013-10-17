package com.shiloh.calcengine.domainmodel

import java.util.concurrent.atomic.AtomicInteger


class DomainProperty {

	static AtomicInteger idGenerator = new AtomicInteger()

	int id
	String name
	boolean isAbstract
	boolean isCalculated
	boolean isKey
	DomainClass domainClass

	DomainProperty() {
		id = idGenerator.incrementAndGet()
	}
}
