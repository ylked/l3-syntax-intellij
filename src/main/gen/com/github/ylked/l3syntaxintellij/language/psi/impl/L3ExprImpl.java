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

public class L3ExprImpl extends ASTWrapperPsiElement implements L3Expr {

  public L3ExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull L3Visitor visitor) {
    visitor.visitExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof L3Visitor) accept((L3Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public L3AndForm getAndForm() {
    return findChildByClass(L3AndForm.class);
  }

  @Override
  @Nullable
  public L3AppForm getAppForm() {
    return findChildByClass(L3AppForm.class);
  }

  @Override
  @Nullable
  public L3BeginForm getBeginForm() {
    return findChildByClass(L3BeginForm.class);
  }

  @Override
  @Nullable
  public L3CondForm getCondForm() {
    return findChildByClass(L3CondForm.class);
  }

  @Override
  @Nullable
  public L3FunForm getFunForm() {
    return findChildByClass(L3FunForm.class);
  }

  @Override
  @Nullable
  public L3Identifier getIdentifier() {
    return findChildByClass(L3Identifier.class);
  }

  @Override
  @Nullable
  public L3Idname getIdname() {
    return findChildByClass(L3Idname.class);
  }

  @Override
  @Nullable
  public L3IfForm getIfForm() {
    return findChildByClass(L3IfForm.class);
  }

  @Override
  @Nullable
  public L3LetForm getLetForm() {
    return findChildByClass(L3LetForm.class);
  }

  @Override
  @Nullable
  public L3LetStarForm getLetStarForm() {
    return findChildByClass(L3LetStarForm.class);
  }

  @Override
  @Nullable
  public L3LetrecForm getLetrecForm() {
    return findChildByClass(L3LetrecForm.class);
  }

  @Override
  @Nullable
  public L3NotForm getNotForm() {
    return findChildByClass(L3NotForm.class);
  }

  @Override
  @Nullable
  public L3OrForm getOrForm() {
    return findChildByClass(L3OrForm.class);
  }

  @Override
  @Nullable
  public L3PrimForm getPrimForm() {
    return findChildByClass(L3PrimForm.class);
  }

  @Override
  @Nullable
  public L3RecForm getRecForm() {
    return findChildByClass(L3RecForm.class);
  }

}
