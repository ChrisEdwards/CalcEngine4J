package com.shiloh.calcengine.domainmodel


class DomainModel {
	List<DomainClass> classes = new ArrayList<>()

	public void addClass(DomainClass clazz){
		classes << clazz
	}
}
