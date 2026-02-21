// This is a generated file. Not intended for manual editing.
package com.github.ylked.l3syntaxintellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface L3Expr extends PsiElement {

  @Nullable
  L3AndForm getAndForm();

  @Nullable
  L3AppForm getAppForm();

  @Nullable
  L3BeginForm getBeginForm();

  @Nullable
  L3CondForm getCondForm();

  @Nullable
  L3FunForm getFunForm();

  @Nullable
  L3Identifier getIdentifier();

  @Nullable
  L3IfForm getIfForm();

  @Nullable
  L3LetForm getLetForm();

  @Nullable
  L3LetStarForm getLetStarForm();

  @Nullable
  L3LetrecForm getLetrecForm();

  @Nullable
  L3NotForm getNotForm();

  @Nullable
  L3OrForm getOrForm();

  @Nullable
  L3PrimForm getPrimForm();

  @Nullable
  L3RecForm getRecForm();

}
