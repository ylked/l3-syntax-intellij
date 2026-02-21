package com.github.ylked.l3syntaxintellij.language

import com.intellij.lexer.FlexAdapter


class L3LexerAdapter : FlexAdapter(L3FlexLexer(null)) {
}