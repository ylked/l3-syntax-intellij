package com.github.ylked.l3syntaxintellij.language

import com.intellij.psi.TokenType
import com.intellij.psi.tree.TokenSet
import com.github.ylked.l3syntaxintellij.language.psi.L3Types

interface L3TokenSets {

    companion object {
        /** Whitespace (usually you just use TokenType.WHITE_SPACE directly) */
        val WHITESPACE: TokenSet = TokenSet.create(TokenType.WHITE_SPACE)

        /** Line comments starting with ';' */
        val COMMENTS: TokenSet = TokenSet.create(L3Types.COMMENT)

        /** String + char literals */
        val STRINGS: TokenSet = TokenSet.create(L3Types.STRING)
        val CHARS: TokenSet = TokenSet.create(L3Types.CHAR)

        /** Numeric-ish literals */
        val NUMBERS: TokenSet = TokenSet.create(L3Types.NUMBER)
        val BLOCK_TAGS: TokenSet = TokenSet.create(L3Types.BLOCK_TAG)

        /** Booleans + unit */
        val BOOLEANS: TokenSet = TokenSet.create(L3Types.BOOL_TRUE, L3Types.BOOL_FALSE)
        val UNIT: TokenSet = TokenSet.create(L3Types.UNIT)

        /** Keywords / special forms */
        val KEYWORDS: TokenSet = TokenSet.create(
            L3Types.DEF,
            L3Types.DEFREC,
            L3Types.FUN,
            L3Types.LET,
            L3Types.LETSTAR,
            L3Types.LETREC,
            L3Types.REC,
            L3Types.BEGIN,
            L3Types.IF,
            L3Types.COND,
            L3Types.AND,
            L3Types.OR,
            L3Types.NOT
        )

        /** Punctuation / operators that are tokens */
        val PARENS: TokenSet = TokenSet.create(L3Types.LPAREN, L3Types.RPAREN)
        val AT_SIGN: TokenSet = TokenSet.create(L3Types.AT)

        /** Identifiers */
        val IDENTIFIERS: TokenSet = TokenSet.create(L3Types.IDENT)
        val PRIM_NAMES: TokenSet = TokenSet.create(L3Types.PRIM_NAME)

        /** If your lexer returns BAD_CHARACTER for unexpected chars */
        val BAD_CHARS: TokenSet = TokenSet.create(TokenType.BAD_CHARACTER)

        /** Handy “all literals” set */
        val LITERALS: TokenSet = TokenSet.orSet(
            STRINGS, CHARS, NUMBERS, BLOCK_TAGS, BOOLEANS, UNIT
        )
    }
}