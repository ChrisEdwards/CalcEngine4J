package com.shiloh.calcengine.expressions.generators

import com.shiloh.calcengine.expressions.BinaryExpression
import com.shiloh.calcengine.expressions.Expression
import com.shiloh.calcengine.expressions.LiteralExpression


class SqlExpressionGenerator {
	Stack stack = new Stack()
	Map<String, String> sqlOperatorMap = [
			'!=':'<>',
			'and':'AND',
			'or':'OR',
			'not':'NOT'
	]

	def generate( Expression expression ) {
		expression.visit(this)
		assert stack.size() == 1
		return stack.pop().toString()
	}

	void visit(BinaryExpression exp) {
		exp.visitChildren(this)
		def rhs = stack.pop()
		def lhs = stack.pop()
		def op = getSqlOperator(exp.function.symbol)
		stack.push( "( $lhs $op $rhs )")
	}

	void visit(LiteralExpression exp) {
		def value = exp.value
		if (value instanceof String) value = "'$value'"
		stack.push( value )
	}

	private String getSqlOperator(String originalSymbol){
		sqlOperatorMap[originalSymbol] ?: originalSymbol
	}
}
