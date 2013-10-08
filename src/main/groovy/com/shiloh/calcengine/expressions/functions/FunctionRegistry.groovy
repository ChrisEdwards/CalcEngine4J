package com.shiloh.calcengine.expressions.functions

import groovy.inspect.Inspector


class FunctionRegistry {
	LinkedHashMap<String, Function> functions = [:]

	FunctionRegistry() {
		add new AddFunction()
		add new SubtractFunction()
		add new MultiplyFunction()
		add new DivideFunction()
		add new AndFunction()
		add new OrFunction()
		add new NotFunction()
		add new RoundFunction()
	}

	Function findByName(String name) {
		functions[name]
	}

	private static String getFunctionName(Function func) {
		Inspector.shortName(func.class).toLowerCase() - "function"
	}

	void add(Function function){
		functions.put( getFunctionName(function), function )
	}
}
