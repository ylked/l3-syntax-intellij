package com.github.ylked.l3syntaxintellij.language

import com.github.ylked.l3syntaxintellij.filetypes.L3FileType
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import org.jetbrains.annotations.NotNull

class L3File(@NotNull viewProvider: FileViewProvider) : PsiFileBase(viewProvider, L3Language.INSTANCE) {
    override fun getFileType(): FileType {
        return L3FileType.INSTANCE
    }

    override fun toString(): String = "L3 file"
}