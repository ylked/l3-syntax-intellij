package com.github.ylked.l3syntaxintellij.highlighter

import com.github.ylked.l3syntaxintellij.language.L3LexerAdapter
import com.github.ylked.l3syntaxintellij.language.psi.L3Types
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType

class L3SyntaxHighlighter : SyntaxHighlighterBase() {
    companion object {
        val FUNCTION = createTextAttributesKey("L3FUN", DefaultLanguageHighlighterColors.FUNCTION_DECLARATION)
        val COMMENT = createTextAttributesKey("L3COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
        val PARENTHESES = createTextAttributesKey("L3PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES)
        val IDENT = createTextAttributesKey("L3IDENT", DefaultLanguageHighlighterColors.IDENTIFIER)
        val KEYWORD = createTextAttributesKey("L3KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)
        val STRING = createTextAttributesKey("L3STRING", DefaultLanguageHighlighterColors.STRING)
        val NUMBER = createTextAttributesKey("L3NUMBER", DefaultLanguageHighlighterColors.NUMBER)
        val CHAR = createTextAttributesKey("L3CHAR", DefaultLanguageHighlighterColors.CONSTANT)
        val BOOL = createTextAttributesKey("L3BOOL", DefaultLanguageHighlighterColors.CONSTANT)
        val BAD_CHAR = createTextAttributesKey("L3BAD_CHAR", HighlighterColors.BAD_CHARACTER)

        private val FUNCTION_KEYS = arrayOf(FUNCTION)
        private val COMMENT_KEYS = arrayOf(COMMENT)
        private val PARENTHESES_KEYS = arrayOf(PARENTHESES)
        private val IDENTS_KEYS = arrayOf(IDENT)
        private val KEYWORD_KEYS = arrayOf(KEYWORD)
        private val STRINGS_KEYS = arrayOf(STRING)
        private val NUMBER_KEYS = arrayOf(NUMBER)
        private val CHARS_KEYS = arrayOf(CHAR)
        private val BOOL_KEYS = arrayOf(BOOL)
        private val BAD_CHARS_KEYS = arrayOf(BAD_CHAR)
        private val EMPTY_KEYS = emptyArray<TextAttributesKey>()

        private val COLORS_MAP = mapOf(
            L3Types.AND to KEYWORD_KEYS,
            L3Types.AT to KEYWORD_KEYS,
            L3Types.BEGIN to KEYWORD_KEYS,
            L3Types.BLOCK_TAG to KEYWORD_KEYS,
            L3Types.BOOL_FALSE to BOOL_KEYS,
            L3Types.BOOL_FALSE to BOOL_KEYS,
            L3Types.CHAR to CHARS_KEYS,
            L3Types.COMMENT to COMMENT_KEYS,
            L3Types.COND to KEYWORD_KEYS,
            L3Types.DEF to FUNCTION_KEYS,
            L3Types.DEFREC to FUNCTION_KEYS,
            L3Types.FUN to FUNCTION_KEYS,
            L3Types.IF to KEYWORD_KEYS,
            L3Types.IDENT to IDENTS_KEYS,
            L3Types.LET to FUNCTION_KEYS,
            L3Types.LETREC to FUNCTION_KEYS,
            L3Types.LETSTAR to FUNCTION_KEYS,
            L3Types.LPAREN to PARENTHESES_KEYS,
            L3Types.NOT to KEYWORD_KEYS,
            L3Types.NUMBER to NUMBER_KEYS,
            L3Types.OR to KEYWORD_KEYS,
            L3Types.PRIM_NAME to KEYWORD_KEYS,
            L3Types.REC to KEYWORD_KEYS,
            L3Types.RPAREN to PARENTHESES_KEYS,
            L3Types.STRING to STRINGS_KEYS,
            L3Types.UNIT to KEYWORD_KEYS,
        )

    }

    override fun getHighlightingLexer(): Lexer {
        return L3LexerAdapter()
    }

    override fun getTokenHighlights(tokenType: IElementType?): Array<out TextAttributesKey?> {
        return COLORS_MAP.getOrDefault(tokenType, EMPTY_KEYS)
    }
}