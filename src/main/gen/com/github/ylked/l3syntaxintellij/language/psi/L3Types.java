// This is a generated file. Not intended for manual editing.
package com.github.ylked.l3syntaxintellij.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.ylked.l3syntaxintellij.language.psi.impl.*;

public interface L3Types {

  IElementType AND_FORM = new L3ElementType("AND_FORM");
  IElementType APP_FORM = new L3ElementType("APP_FORM");
  IElementType BEGIN_FORM = new L3ElementType("BEGIN_FORM");
  IElementType BINDING = new L3ElementType("BINDING");
  IElementType COND_CLAUSE = new L3ElementType("COND_CLAUSE");
  IElementType COND_FORM = new L3ElementType("COND_FORM");
  IElementType DEFREC_FORM = new L3ElementType("DEFREC_FORM");
  IElementType DEF_FORM = new L3ElementType("DEF_FORM");
  IElementType EXPR = new L3ElementType("EXPR");
  IElementType EXPRS = new L3ElementType("EXPRS");
  IElementType FUN_BINDING = new L3ElementType("FUN_BINDING");
  IElementType FUN_FORM = new L3ElementType("FUN_FORM");
  IElementType IDENTIFIER = new L3ElementType("IDENTIFIER");
  IElementType IDNAME = new L3ElementType("IDNAME");
  IElementType IF_FORM = new L3ElementType("IF_FORM");
  IElementType LETREC_FORM = new L3ElementType("LETREC_FORM");
  IElementType LET_FORM = new L3ElementType("LET_FORM");
  IElementType LET_STAR_FORM = new L3ElementType("LET_STAR_FORM");
  IElementType NOT_FORM = new L3ElementType("NOT_FORM");
  IElementType OR_FORM = new L3ElementType("OR_FORM");
  IElementType PRIM_FORM = new L3ElementType("PRIM_FORM");
  IElementType PRIM_NAME_REF = new L3ElementType("PRIM_NAME_REF");
  IElementType PROGRAM_PREFIX = new L3ElementType("PROGRAM_PREFIX");
  IElementType PROGRAM_PREFIX_ITEM = new L3ElementType("PROGRAM_PREFIX_ITEM");
  IElementType REC_FORM = new L3ElementType("REC_FORM");

  IElementType AND = new L3TokenType("and");
  IElementType AT = new L3TokenType("@");
  IElementType BEGIN = new L3TokenType("begin");
  IElementType BLOCK_TAG = new L3TokenType("BLOCK_TAG");
  IElementType BOOL_FALSE = new L3TokenType("#f");
  IElementType BOOL_TRUE = new L3TokenType("#t");
  IElementType CHAR = new L3TokenType("CHAR");
  IElementType COMMENT = new L3TokenType("COMMENT");
  IElementType COND = new L3TokenType("cond");
  IElementType DEF = new L3TokenType("def");
  IElementType DEFREC = new L3TokenType("defrec");
  IElementType FUN = new L3TokenType("fun");
  IElementType IDENT_ARITY = new L3TokenType("IDENT_ARITY");
  IElementType IDENT_BARE = new L3TokenType("IDENT_BARE");
  IElementType IF = new L3TokenType("if");
  IElementType LET = new L3TokenType("let");
  IElementType LETREC = new L3TokenType("letrec");
  IElementType LETSTAR = new L3TokenType("let*");
  IElementType LPAREN = new L3TokenType("(");
  IElementType NOT = new L3TokenType("not");
  IElementType NUMBER = new L3TokenType("NUMBER");
  IElementType OR = new L3TokenType("or");
  IElementType PRIM_NAME = new L3TokenType("PRIM_NAME");
  IElementType REC = new L3TokenType("rec");
  IElementType RPAREN = new L3TokenType(")");
  IElementType STRING = new L3TokenType("STRING");
  IElementType UNIT = new L3TokenType("#u");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == AND_FORM) {
        return new L3AndFormImpl(node);
      }
      else if (type == APP_FORM) {
        return new L3AppFormImpl(node);
      }
      else if (type == BEGIN_FORM) {
        return new L3BeginFormImpl(node);
      }
      else if (type == BINDING) {
        return new L3BindingImpl(node);
      }
      else if (type == COND_CLAUSE) {
        return new L3CondClauseImpl(node);
      }
      else if (type == COND_FORM) {
        return new L3CondFormImpl(node);
      }
      else if (type == DEFREC_FORM) {
        return new L3DefrecFormImpl(node);
      }
      else if (type == DEF_FORM) {
        return new L3DefFormImpl(node);
      }
      else if (type == EXPR) {
        return new L3ExprImpl(node);
      }
      else if (type == EXPRS) {
        return new L3ExprsImpl(node);
      }
      else if (type == FUN_BINDING) {
        return new L3FunBindingImpl(node);
      }
      else if (type == FUN_FORM) {
        return new L3FunFormImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new L3IdentifierImpl(node);
      }
      else if (type == IDNAME) {
        return new L3IdnameImpl(node);
      }
      else if (type == IF_FORM) {
        return new L3IfFormImpl(node);
      }
      else if (type == LETREC_FORM) {
        return new L3LetrecFormImpl(node);
      }
      else if (type == LET_FORM) {
        return new L3LetFormImpl(node);
      }
      else if (type == LET_STAR_FORM) {
        return new L3LetStarFormImpl(node);
      }
      else if (type == NOT_FORM) {
        return new L3NotFormImpl(node);
      }
      else if (type == OR_FORM) {
        return new L3OrFormImpl(node);
      }
      else if (type == PRIM_FORM) {
        return new L3PrimFormImpl(node);
      }
      else if (type == PRIM_NAME_REF) {
        return new L3PrimNameRefImpl(node);
      }
      else if (type == PROGRAM_PREFIX) {
        return new L3ProgramPrefixImpl(node);
      }
      else if (type == PROGRAM_PREFIX_ITEM) {
        return new L3ProgramPrefixItemImpl(node);
      }
      else if (type == REC_FORM) {
        return new L3RecFormImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
