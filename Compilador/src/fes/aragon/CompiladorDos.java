/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon;

import fes.aragon.recursos.Rangos;
import javax.swing.JOptionPane;

/**
 *
 * @author mildred
 */
public class CompiladorDos {
    private String cadena="";
    private boolean aceptar;
    private int error=1;
    private int indice=0;
    private int estado=1;
    private char simbolo;
    public static void main (String[] args){
        CompiladorDos obj= new CompiladorDos();
        Rangos rango =new Rangos();
        obj.cadena=JOptionPane.showInputDialog("Dame la cadena");
        obj.simbolo=obj.siguienteCaracter();
        while(obj.simbolo!=' '|| obj.error!=0){
            switch(obj.estado){
                case 1:
                    if(rango.rangoaz_AZ(obj.simbolo)){
                        obj.estado=3;
                    }else if(rango.rango09(obj.simbolo)){
                        obj.estado=3;
                    }else{
                        obj.error=0;
                    }
                    break;
                
                case 2:
                    obj.error=0;
                    break;
                    
                case 3:   
                    if(rango.rangoaz_AZ(obj.simbolo)){
                        obj.estado=3;
                        obj.aceptar=true;
                    }else if(rango.rango09(obj.simbolo)){
                        obj.estado=3;
                        obj.aceptar=true;
                    }else{
                        obj.error=0;
                    }
                    break;
            }
            obj.simbolo=obj.siguienteCaracter();
        }
        
        if(!obj.aceptar){
            JOptionPane.showMessageDialog(null, "Valida");
        }else{
            JOptionPane.showMessageDialog(null, "Invalida");
        }
    }
    
    private char siguienteCaracter(){
        char c= ' ';
        if(indice<cadena.length()){
            cadena.charAt(indice);
            indice++;
        }
        return c;
    }
    
}
