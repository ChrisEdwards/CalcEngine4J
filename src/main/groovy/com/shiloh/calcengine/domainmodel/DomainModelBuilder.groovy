package com.shiloh.calcengine.domainmodel


class DomainModelBuilder extends FactoryBuilderSupport {
	{
		registerFactory "domainModel", new DomainModelFactory()
		registerFactory "domainClass", new DomainClassFactory()
		registerFactory "property", new DomainPropertyFactory()
	}
}

class DomainModelFactory extends AbstractFactory {

	@Override
	Object newInstance(FactoryBuilderSupport builder, Object name, Object value, Map attributes) throws InstantiationException, IllegalAccessException {
		return new DomainModel()
	}
}

class DomainClassFactory extends AbstractFactory {
	@Override
	Object newInstance(FactoryBuilderSupport builder, Object name, Object value, Map attributes) throws InstantiationException, IllegalAccessException {
		return new DomainClass(name:value)
	}

	@Override
	void setParent(FactoryBuilderSupport builder, Object parent, Object child) {
		(parent as DomainModel).addClass(child as DomainClass)
	}
}

class DomainPropertyFactory extends AbstractFactory {
	@Override
	Object newInstance(FactoryBuilderSupport builder, Object name, Object value, Map attributes) throws InstantiationException, IllegalAccessException {
		new DomainProperty(name:value)
	}

	@Override
	boolean isLeaf() {
		true
	}

	@Override
	void setParent(FactoryBuilderSupport builder, Object parent, Object child) {
		(parent as DomainClass).addProperty(child as DomainProperty)
	}
}
