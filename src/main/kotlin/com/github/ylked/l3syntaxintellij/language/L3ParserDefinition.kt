package com.github.ylked.l3syntaxintellij.language

import com.github.ylked.l3syntaxintellij.language.parser.L3Parser
import com.github.ylked.l3syntaxintellij.language.psi.L3Types
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

final class L3ParserDefinition : ParserDefinition {
    companion object {
        val FILE = IFileElementType(L3Language.INSTANCE)
    }

    override fun createLexer(p0: Project?): Lexer {
        return L3LexerAdapter()
    }

    override fun createParser(p0: Project?): PsiParser {
        return L3Parser()
    }

    override fun getFileNodeType(): IFileElementType {
        return FILE
    }

    override fun getCommentTokens(): TokenSet {
        return L3TokenSets.COMMENTS
    }

    override fun getStringLiteralElements(): TokenSet {
        return L3TokenSets.STRINGS
    }

    override fun createElement(node: ASTNode?): PsiElement {
        return L3Types.Factory.createElement(node)
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return L3File(viewProvider)
    }
}