/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon;

import javax.swing.JOptionPane;

/**
 *
 * @author carlos
 */
public class Sintactico {

    private String cadena = JOptionPane.showInputDialog("Dame la cadena: ");
    private String token;
    private int indice;
    private boolean correcto = false;
    private boolean error = false;
    
    public static void main(String[] args) {
        Sintactico app = new Sintactico();
        app.token = app.getToken();
        app.metodo_S();
        if (app.correcto == true) {
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        
    }
    
    private void metodo_S() {
        //token = getToken();
        metodo_E();
        if (token != null && token.equals(";")) {
            correcto = true;
        } else {
            error = true;
        }
        
    }
    
    private void metodo_E() {
        if (token != null && token.equals("(")) {
            token = getToken();
            metodo_E();
            if (token != null && token.equals(")")) {
                token = getToken();
                if (token != null && !token.equals(";")) {
                    metodo_X();
                    
                }
            } else {
                //token = getToken();
                error = true;
            }
        } else if (token != null && token.equals("num")) {
            token = getToken();
            if (token != null && !token.equals(";")) {
                metodo_X();
            }
        }
    }
    
    private void metodo_X() {
        if (token != null && token.equals("+")) {
            token = getToken();
            if (token != null) {
                metodo_X();
                token = getToken();
            }
        }else if(token !=null && token.equals("*")){
        token = getToken();
            if (token != null) {
                metodo_X();
                token = getToken();
            }
        }else{
        error = true;
        //metodo_E();
       
        }
       
    }
    
   
    private String getToken() {
        String token = null;
        if (indice < cadena.split(" ").length) {
            token = cadena.split(" ")[indice];
            indice++;
        } else {
            token = "EOF";
        }
        return token;
        
    }
}
