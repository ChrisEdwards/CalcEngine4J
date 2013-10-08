package com.shiloh.calcengine.expressions

import com.shiloh.calcengine.expressions.functions.FunctionRegistry


class ExpressionBuilder extends BuilderSupport {
	FunctionRegistry functionRegistry = new FunctionRegistry()

	@Override
	protected void setParent(Object parent, Object child) {
		(parent as Expression).addChild(child)
	}

	@Override
	protected Object createNode(Object name) {
		def function = functionRegistry.findByName(name)
		if (function) return new FunctionExpression(function)

		throw new RuntimeException("Builder method not implemented for createNode( $name )")
	}

	@Override
	protected Object createNode(Object name, Object value) {
		switch (name){
			case "literal":
				return new LiteralExpression(value)
		}
		throw new RuntimeException("Builder method not implemented for createNode( $name, $value )")
	}

	@Override
	protected Object createNode(Object name, Map attributes) {
		return null  //To change body of implemented methods use File | Settings | File Templates.
	}

	@Override
	protected Object createNode(Object name, Map attributes, Object value) {
		return null  //To change body of implemented methods use File | Settings | File Templates.
	}
}
