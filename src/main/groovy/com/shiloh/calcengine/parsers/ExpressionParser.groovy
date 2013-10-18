package com.shiloh.calcengine.parsers

import com.shiloh.calcengine.antlr.AntlrExpressionLexer
import com.shiloh.calcengine.antlr.AntlrExpressionParser
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree


class ExpressionParser {

	public ParseTree parse(String expressionString){
		def inputStream = new ANTLRInputStream(expressionString)
		def lexer = new AntlrExpressionLexer(inputStream)
		def tokenStream = new CommonTokenStream(lexer)
		def parser = new AntlrExpressionParser(tokenStream)
		return parser.formula()
	}
}
