package com.shiloh.calcengine.parsers

import com.shiloh.calcengine.antlr.AntlrExpressionBaseListener
import com.shiloh.calcengine.antlr.AntlrExpressionParser
import com.shiloh.calcengine.domainmodel.DomainClass
import com.shiloh.calcengine.domainmodel.DomainModel
import com.shiloh.calcengine.exceptions.FormulaParserException
import com.shiloh.calcengine.expressions.Expression
import com.shiloh.calcengine.formulas.Formula
import org.antlr.v4.runtime.misc.NotNull


class FormulaParserListener extends AntlrExpressionBaseListener {

	DomainModel model
	List<Formula> formulas = new ArrayList<Formula>()

	private Stack<Expression> stack = new Stack<>()
	private Formula currentFormula
	private DomainClass currentClass

	FormulaParserListener(DomainModel model) {
		this.model = model
	}


	// Formula
	// -------

	@Override
	void enterFormulaDeclaration(@NotNull AntlrExpressionParser.FormulaDeclarationContext ctx) {
		stack = new Stack<>()
		currentFormula = new Formula()
	}

	@Override
	void exitFormulaDeclaration(@NotNull AntlrExpressionParser.FormulaDeclarationContext ctx) {
		if (stack.size() != 1)
			throw new FormulaParserException("Formula should only have one root expression. Found {stack.size()}")

		currentFormula.formulaExpression = stack.pop()
		formulas << currentFormula

		currentFormula = null
	}

	@Override
	void exitQualifiedPropertyName(@NotNull AntlrExpressionParser.QualifiedPropertyNameContext ctx) {
		currentFormula.calculatedProperty = model.getDomainProperty(ctx.className.text, ctx.propertyName.text)
	}
}
