// This is a generated file. Not intended for manual editing.
package com.github.ylked.l3syntaxintellij.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.ylked.l3syntaxintellij.language.psi.L3Types.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.ylked.l3syntaxintellij.language.psi.*;

public class L3IdnameImpl extends ASTWrapperPsiElement implements L3Idname {

  public L3IdnameImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull L3Visitor visitor) {
    visitor.visitIdname(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof L3Visitor) accept((L3Visitor)visitor);
    else super.accept(visitor);
  }

}
