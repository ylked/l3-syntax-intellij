package com.github.ylked.l3syntaxintellij.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.github.ylked.l3syntaxintellij.language.psi.L3Types;

%%

%class L3FlexLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%public

%state STRING

WHITESPACE   = [ \t\r\n]+
LINECOMMENT  = ";"[^\r\n]*

DIGIT        = [0-9]
HEX          = [0-9A-Fa-f]
BIN          = [01]

NUM2         = "#b"{BIN}+
NUM16        = "#x"{HEX}+
NUM10        = "-"?{DIGIT}+
NUMBER       = ({NUM2}|{NUM16}|{NUM10})

IDENTSTART   = [A-Za-z+\-*/<>=?!_:$%&\^~]
IDENT        = {IDENTSTART}({IDENTSTART}|{DIGIT})*

BLOCK_TAG    = "#_"{IDENT}

CHAR         = \'(\\.|[^\\\'])\'

STRING_LIT   = \"([^\"\\\r\n]|\\.)*\"

%%

{WHITESPACE}            { return com.intellij.psi.TokenType.WHITE_SPACE; }
{LINECOMMENT}           { return L3Types.COMMENT; }

"("                     { return L3Types.LPAREN; }
")"                     { return L3Types.RPAREN; }
"@"                     { return L3Types.AT; }

"def"                   { return L3Types.DEF; }
"defrec"                { return L3Types.DEFREC; }
"fun"                   { return L3Types.FUN; }
"let"                   { return L3Types.LET; }
"let*"                  { return L3Types.LETSTAR; }
"letrec"                { return L3Types.LETREC; }
"rec"                   { return L3Types.REC; }
"begin"                 { return L3Types.BEGIN; }
"if"                    { return L3Types.IF; }
"cond"                  { return L3Types.COND; }
"and"                   { return L3Types.AND; }
"or"                    { return L3Types.OR; }
"not"                   { return L3Types.NOT; }

"#t"                    { return L3Types.BOOL_TRUE; }
"#f"                    { return L3Types.BOOL_FALSE; }
"#u"                    { return L3Types.UNIT; }

{NUMBER}                { return L3Types.NUMBER; }
{BLOCK_TAG}             { return L3Types.BLOCK_TAG; }
{STRING_LIT}            { return L3Types.STRING; }
{CHAR}                  { return L3Types.CHAR; }

{IDENT}                 { return L3Types.IDENT; }

.                       { return com.intellij.psi.TokenType.BAD_CHARACTER; }