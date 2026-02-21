package com.github.ylked.l3syntaxintellij.language

import com.intellij.lang.Language


class L3Language : Language {
    companion object {
        val INSTANCE: L3Language = L3Language()
    }

    private constructor() : super("L3")
}