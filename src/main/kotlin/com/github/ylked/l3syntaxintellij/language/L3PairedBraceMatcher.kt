package com.github.ylked.l3syntaxintellij.language

import com.github.ylked.l3syntaxintellij.language.psi.L3Types
import com.intellij.lang.BracePair
import com.intellij.lang.PairedBraceMatcher
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IElementType

class L3PairedBraceMatcher : PairedBraceMatcher {
    private val pairs = arrayOf(
        BracePair(L3Types.LPAREN, L3Types.RPAREN, /* structural = */ false),
    )

    override fun getPairs(): Array<BracePair> = pairs

    override fun isPairedBracesAllowedBeforeType(
        lbraceType: IElementType,
        contextType: IElementType?
    ): Boolean = true

    override fun getCodeConstructStart(file: PsiFile?, openingBraceOffset: Int): Int = openingBraceOffset
}