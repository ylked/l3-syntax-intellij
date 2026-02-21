package com.github.ylked.l3syntaxintellij.filetypes

import com.github.ylked.l3syntaxintellij.icons.L3Icon
import com.github.ylked.l3syntaxintellij.language.L3Language
import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.util.NlsContexts
import com.intellij.openapi.util.NlsSafe
import org.jetbrains.annotations.NonNls
import javax.swing.Icon

class L3ModuleFileType : LanguageFileType {
    companion object {
        val INSTANCE: L3ModuleFileType = L3ModuleFileType()
    }

    private constructor() : super(L3Language.INSTANCE)

    override fun getName(): @NonNls String {
        return "L3 Module File"
    }

    override fun getDescription(): @NlsContexts.Label String {
        return "EPFL CS-420 L3 (Lisp Like Language) module file"
    }

    override fun getDefaultExtension(): @NlsSafe String {
        return "l3m"
    }

    override fun getIcon(): Icon {
        return L3Icon.L3M
    }
}