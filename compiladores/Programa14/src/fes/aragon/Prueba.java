/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon;

import java.util.Stack;

/**
 *
 * @author carlos
 */
public class Prueba {
    public String cadena = "abcd;";
    private int indice = 0 ;
    private boolean funciona = true;
    private String[][] tabla = {{"ABC", "ABC", "ABC", "ABC","e"},
        {" ", "b","c", " ","e"}, {"abC", "e", "e ","  ","e"},{"e","e","e","d", "e"}};
    private String[] terminal = {"a","b","c","d",";"};
    private String[] noTerminal = {"S","A","B","C"};
    private Stack pilas = new Stack();
    
    public void pila(){
    pilas.push(terminal[terminal.length-1]);
    
    }
    
    public char get_Char(){
       char[] charCadena = cadena.toCharArray();
        char c = 0;
        if (indice < charCadena.length) {
           c  = charCadena[indice];
           indice++;
        }
        return c;
       
    }
    public static void main(String[] args) {
        Prueba apa = new Prueba();
        apa.pila();
       
    }
    
}

