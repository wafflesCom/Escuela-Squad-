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

    private String cadena = JOptionPane.showInputDialog("dame la cadena");
    private String token;
    private int indice;
    private boolean correcto = false;
    private boolean error = false;

    public static void main(String[] args) {
        Sintactico app = new Sintactico();
        app.token = app.getToken();
        app.metodo_S();
        if(app.isError){
            System.out.println("Error de sintaxis");
        }else{
            System.out.println("correcto");
        }
        
    }
    
    private void metodo_S(){
        do {            
            metodo_Z();
            if (token != null && token.equals(";")) {
                    correcto = true;
                } else {
                    error = true;
                }             
              if (!error && correcto) {
            System.out.println("Sintaxis correcta");

        } else {
            System.out.println("Sintaxis incorrecta");
        }
              token = getToken();
              correcto = false;
              error = false;
            
            
        } while (!token.equals("EOF") );
    }

    private void metodo_Z() {
        if (token != null && token.equals("a")) {
            token = getToken();
            metodo_A();
            if (token != null && token.equals("b")) {
                token = getToken();
                
            } else {
                error = true;
            }

        } else {
            error = true;
        }
    }

    private void metodo_A() {
        if (token != null && token.equals("c")) {
            token = getToken();
            metodo_B();
            if (token != null && token.equals("c")) {
                token = getToken();
                return;
            }
        } else {
            error = true;
        }

    }
    
    private void metodo_B(){
        if (token != null && token.equals("d")) {
            token = getToken();
            metodo_B();
        }else if(token != null && token.equals("w")){
            token = getToken();
            return;
    }else{
        error = true;
        }
    }

    private String getToken() {
        String token = null;
        if (indice < cadena.split(" ").length) {
            token = cadena.split(" ")[indice];
            indice++;
        }
        else{
        token = "EOF";
        }
        return token;

    }

}
