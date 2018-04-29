
package fes.aragon;
import static fes.aragon.Tokens.*;

%%
%class Lexico
%type Tokens
WHITE = [ /t/r/n]
%{
public String lexema;
%}
%%
{WHITE} {/*IGNORE*/}
"true" {return TRUE;}
"TRUE" {return TRUE;}
"false" {return FALSE;}
"FALSE" {return FALSE;}
"not" {return NOT;}
"NOT" {return NOT;}
"and" {return AND;}
"AND" {return AND;}
"si" {return SI;}
"SI" {return SI;}
"or" {return OR;}
"OR" {return OR;}
"sii" {return SII;}
"SII" {return SII;}
"(" {return PARENTIZQ;}
")" {return PARENTDER;}