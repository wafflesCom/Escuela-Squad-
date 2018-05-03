package fes.aragon;
import static fes.aragon.Tokens.*;
%%
%class Lexico
%type Tokens
L= [a-zA-Z_]
D= [0-9]
WHITE = [ \t\r\n]
%{
public String lexema;
%}
%%
{WHITE} {/*Ignore*/}
"(" {return ParentIzq;}
")" {return ParentDer;}
"true" {return verdadero;}
"TRUE" {return TRUE;}
"false" {return falso;}
"FALSE" {return FALSE;}
"not" {return not;}
"NOT" {return NOT;}
"or" {return or;}
"OR" {return OR;}
"and" {return and;}
"AND" {return AND;}
"si" {return si;}
"SI" {return SI;}
"sii" {return sii;}
"SII" {return SII;}
{L}({L}|{D})* {lexema=yytext();
                System.out.println("Codigo");
                return ID;}
("(-"{D}+")")|{D}+ {lexema=yytext(); return INT;}
. {return ERROR;}
