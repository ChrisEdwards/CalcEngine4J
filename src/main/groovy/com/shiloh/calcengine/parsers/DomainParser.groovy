package com.shiloh.calcengine.parsers

import com.shiloh.calcengine.antlr.AntlrExpressionLexer
import com.shiloh.calcengine.antlr.AntlrExpressionParser
import com.shiloh.calcengine.domainmodel.DomainModel
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker


class DomainParser {

	DomainModel parse(String text) {
		// Get ParseTree
		def inputStream = new ANTLRInputStream(text)
		def lexer = new AntlrExpressionLexer(inputStream)
		def tokenStream = new CommonTokenStream(lexer)
		def parser = new AntlrExpressionParser(tokenStream)
		def tree = parser.root()

		// Walk the tree
		def walker = new ParseTreeWalker()
		def listener = new DomainModelParserListener()
		walker.walk(listener, tree)

		return listener.model
	}
}
