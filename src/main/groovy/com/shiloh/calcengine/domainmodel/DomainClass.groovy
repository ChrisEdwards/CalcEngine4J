package com.shiloh.calcengine.domainmodel

import java.util.concurrent.atomic.AtomicInteger


class DomainClass {

	static AtomicInteger idGenerator = new AtomicInteger()

	int id
	String name
	List<DomainProperty> properties = []

	DomainClass() {
		this.id = idGenerator.incrementAndGet()
	}

	void addProperty(DomainProperty property) {
		properties << property
		property.domainClass = this
	}

	List<DomainProperty> getKeyProperties() {
		properties.findAll { it.isKey }
	}
}
