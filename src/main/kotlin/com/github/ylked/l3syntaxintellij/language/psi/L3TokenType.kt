package com.github.ylked.l3syntaxintellij.language.psi

import com.github.ylked.l3syntaxintellij.language.L3Language
import com.intellij.psi.tree.IElementType
import org.jetbrains.annotations.NonNls
import org.jetbrains.annotations.NotNull

class L3TokenType(@NotNull @NonNls debugName: String) : IElementType(debugName, L3Language.Companion.INSTANCE) {
    override fun toString(): String {
        return "L3TokenType." + super.toString()
    }
}