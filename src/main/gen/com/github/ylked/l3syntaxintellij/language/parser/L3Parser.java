// This is a generated file. Not intended for manual editing.
package com.github.ylked.l3syntaxintellij.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.ylked.l3syntaxintellij.language.psi.L3Types.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class L3Parser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return program(b, l + 1);
  }

  /* ********************************************************** */
  // LPAREN AND expr expr expr* RPAREN
  public static boolean and_form(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_form")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LPAREN, AND);
    r = r && expr(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && and_form_4(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, AND_FORM, r);
    return r;
  }

  // expr*
  private static boolean and_form_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_form_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "and_form_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LPAREN expr expr* RPAREN
  public static boolean app_form(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "app_form")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && expr(b, l + 1);
    r = r && app_form_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, APP_FORM, r);
    return r;
  }

  // expr*
  private static boolean app_form_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "app_form_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "app_form_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LPAREN BEGIN exprs RPAREN
  public static boolean begin_form(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "begin_form")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LPAREN, BEGIN);
    r = r && exprs(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, BEGIN_FORM, r);
    return r;
  }

  /* ********************************************************** */
  // LPAREN idname expr RPAREN
  public static boolean binding(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binding")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && idname(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, BINDING, r);
    return r;
  }

  /* ********************************************************** */
  // LPAREN expr exprs RPAREN
  public static boolean cond_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cond_clause")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && expr(b, l + 1);
    r = r && exprs(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, COND_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // LPAREN COND cond_clause+ RPAREN
  public static boolean cond_form(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cond_form")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LPAREN, COND);
    r = r && cond_form_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, COND_FORM, r);
    return r;
  }

  // cond_clause+
  private static boolean cond_form_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cond_form_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cond_clause(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!cond_clause(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "cond_form_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LPAREN DEF idname expr RPAREN
  public static boolean def_form(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "def_form")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LPAREN, DEF);
    r = r && idname(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, DEF_FORM, r);
    return r;
  }

  /* ********************************************************** */
  // LPAREN DEFREC idname fun_form RPAREN
  public static boolean defrec_form(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defrec_form")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LPAREN, DEFREC);
    r = r && idname(b, l + 1);
    r = r && fun_form(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, DEFREC_FORM, r);
    return r;
  }

  /* ********************************************************** */
  // fun_form
  //       | let_form
  //       | let_star_form
  //       | letrec_form
  //       | rec_form
  //       | begin_form
  //       | if_form
  //       | cond_form
  //       | and_form
  //       | or_form
  //       | not_form
  //       | app_form
  //       | prim_form
  //       | identifier
  //       | idname
  //       | NUMBER
  //       | BLOCK_TAG
  //       | STRING
  //       | CHAR
  //       | BOOL_TRUE
  //       | BOOL_FALSE
  //       | UNIT
  public static boolean expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR, "<expr>");
    r = fun_form(b, l + 1);
    if (!r) r = let_form(b, l + 1);
    if (!r) r = let_star_form(b, l + 1);
    if (!r) r = letrec_form(b, l + 1);
    if (!r) r = rec_form(b, l + 1);
    if (!r) r = begin_form(b, l + 1);
    if (!r) r = if_form(b, l + 1);
    if (!r) r = cond_form(b, l + 1);
    if (!r) r = and_form(b, l + 1);
    if (!r) r = or_form(b, l + 1);
    if (!r) r = not_form(b, l + 1);
    if (!r) r = app_form(b, l + 1);
    if (!r) r = prim_form(b, l + 1);
    if (!r) r = identifier(b, l + 1);
    if (!r) r = idname(b, l + 1);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, BLOCK_TAG);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, CHAR);
    if (!r) r = consumeToken(b, BOOL_TRUE);
    if (!r) r = consumeToken(b, BOOL_FALSE);
    if (!r) r = consumeToken(b, UNIT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expr+
  public static boolean exprs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprs")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRS, "<exprs>");
    r = expr(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!expr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "exprs", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // COMMENT
  static boolean force_comment_token(PsiBuilder b, int l) {
    return consumeToken(b, COMMENT);
  }

  /* ********************************************************** */
  // LPAREN idname fun_form RPAREN
  public static boolean fun_binding(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fun_binding")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && idname(b, l + 1);
    r = r && fun_form(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, FUN_BINDING, r);
    return r;
  }

  /* ********************************************************** */
  // LPAREN FUN LPAREN idname* RPAREN exprs RPAREN
  public static boolean fun_form(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fun_form")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LPAREN, FUN, LPAREN);
    r = r && fun_form_3(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && exprs(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, FUN_FORM, r);
    return r;
  }

  // idname*
  private static boolean fun_form_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fun_form_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!idname(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "fun_form_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENT_BARE | IDENT_ARITY
  public static boolean identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier")) return false;
    if (!nextTokenIs(b, "<identifier>", IDENT_ARITY, IDENT_BARE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENTIFIER, "<identifier>");
    r = consumeToken(b, IDENT_BARE);
    if (!r) r = consumeToken(b, IDENT_ARITY);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENT_BARE | IDENT_ARITY | PRIM_NAME
  public static boolean idname(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "idname")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDNAME, "<idname>");
    r = consumeToken(b, IDENT_BARE);
    if (!r) r = consumeToken(b, IDENT_ARITY);
    if (!r) r = consumeToken(b, PRIM_NAME);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LPAREN IF expr expr expr? RPAREN
  public static boolean if_form(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_form")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LPAREN, IF);
    r = r && expr(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && if_form_4(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, IF_FORM, r);
    return r;
  }

  // expr?
  private static boolean if_form_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_form_4")) return false;
    expr(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LPAREN LET LPAREN binding* RPAREN exprs RPAREN
  public static boolean let_form(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_form")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LPAREN, LET, LPAREN);
    r = r && let_form_3(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && exprs(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, LET_FORM, r);
    return r;
  }

  // binding*
  private static boolean let_form_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_form_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!binding(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "let_form_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LPAREN LETSTAR LPAREN binding* RPAREN exprs RPAREN
  public static boolean let_star_form(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_star_form")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LPAREN, LETSTAR, LPAREN);
    r = r && let_star_form_3(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && exprs(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, LET_STAR_FORM, r);
    return r;
  }

  // binding*
  private static boolean let_star_form_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_star_form_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!binding(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "let_star_form_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LPAREN LETREC LPAREN fun_binding* RPAREN exprs RPAREN
  public static boolean letrec_form(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "letrec_form")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LPAREN, LETREC, LPAREN);
    r = r && letrec_form_3(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && exprs(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, LETREC_FORM, r);
    return r;
  }

  // fun_binding*
  private static boolean letrec_form_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "letrec_form_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!fun_binding(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "letrec_form_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LPAREN NOT expr RPAREN
  public static boolean not_form(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "not_form")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LPAREN, NOT);
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, NOT_FORM, r);
    return r;
  }

  /* ********************************************************** */
  // LPAREN OR expr expr expr* RPAREN
  public static boolean or_form(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "or_form")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LPAREN, OR);
    r = r && expr(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && or_form_4(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, OR_FORM, r);
    return r;
  }

  // expr*
  private static boolean or_form_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "or_form_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "or_form_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LPAREN AT prim_name_ref expr* RPAREN
  public static boolean prim_form(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prim_form")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LPAREN, AT);
    r = r && prim_name_ref(b, l + 1);
    r = r && prim_form_3(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, PRIM_FORM, r);
    return r;
  }

  // expr*
  private static boolean prim_form_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prim_form_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "prim_form_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // PRIM_NAME
  public static boolean prim_name_ref(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prim_name_ref")) return false;
    if (!nextTokenIs(b, PRIM_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PRIM_NAME);
    exit_section_(b, m, PRIM_NAME_REF, r);
    return r;
  }

  /* ********************************************************** */
  // program_prefix expr?
  static boolean program(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "program")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = program_prefix(b, l + 1);
    r = r && program_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expr?
  private static boolean program_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "program_1")) return false;
    expr(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // program_prefix_item*
  public static boolean program_prefix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "program_prefix")) return false;
    Marker m = enter_section_(b, l, _NONE_, PROGRAM_PREFIX, "<program prefix>");
    while (true) {
      int c = current_position_(b);
      if (!program_prefix_item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "program_prefix", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // def_form | defrec_form | expr
  public static boolean program_prefix_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "program_prefix_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROGRAM_PREFIX_ITEM, "<program prefix item>");
    r = def_form(b, l + 1);
    if (!r) r = defrec_form(b, l + 1);
    if (!r) r = expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LPAREN REC idname LPAREN binding* RPAREN exprs RPAREN
  public static boolean rec_form(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rec_form")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LPAREN, REC);
    r = r && idname(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && rec_form_4(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && exprs(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, REC_FORM, r);
    return r;
  }

  // binding*
  private static boolean rec_form_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rec_form_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!binding(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "rec_form_4", c)) break;
    }
    return true;
  }

}
