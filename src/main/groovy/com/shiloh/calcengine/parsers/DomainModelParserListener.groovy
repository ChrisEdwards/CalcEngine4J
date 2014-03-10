package com.shiloh.calcengine.parsers

import com.shiloh.calcengine.antlr.AntlrExpressionBaseListener
import com.shiloh.calcengine.antlr.AntlrExpressionParser
import com.shiloh.calcengine.domainmodel.DomainClass
import com.shiloh.calcengine.domainmodel.DomainModel
import com.shiloh.calcengine.domainmodel.DomainProperty
import org.antlr.v4.runtime.misc.NotNull

class DomainModelParserListener extends AntlrExpressionBaseListener {

	DomainModel model = new DomainModel()

	private DomainClass currentClass
	private DomainProperty currentProperty

	// Class Methods
	// -------------
	@Override
	void enterClassDeclaration(@NotNull AntlrExpressionParser.ClassDeclarationContext ctx) {
		currentClass = new DomainClass()
	}

	@Override
	void exitClassDeclaration(@NotNull AntlrExpressionParser.ClassDeclarationContext ctx) {
		currentClass.name = ctx.name.text
		model.addClass(currentClass)
		currentClass == null
	}


	// Property Methods
	// ----------------
	@Override
	void enterPropertyDeclaration(@NotNull AntlrExpressionParser.PropertyDeclarationContext ctx) {
		currentProperty = new DomainProperty()
	}

	@Override
	void exitPropertyDeclaration(@NotNull AntlrExpressionParser.PropertyDeclarationContext ctx) {
		currentProperty.name = ctx.name.text
		currentClass.addProperty(currentProperty)
		currentProperty = null
	}

	@Override
	void exitPrimaryKeyProperty(@NotNull AntlrExpressionParser.PrimaryKeyPropertyContext ctx) {
		currentProperty.isKey = true
	}

	@Override
	void exitCalculatedAndOrAbstractProperty(@NotNull AntlrExpressionParser.CalculatedAndOrAbstractPropertyContext ctx) {
		ctx.children.each {
			if (it.text == 'calculated')
				currentProperty.isCalculated = true
			if (it.text == 'abstract')
				currentProperty.isAbstract = true
		}
	}
}
