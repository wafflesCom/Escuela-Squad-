/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.recursos;

/**
 *
 * @author mildred
 */
public class Rangos {
    public boolean rangoaz_AZ(char simbolo){
        int ascii=(int)simbolo;
        boolean valido= false;
        if((ascii>=65 && ascii<=90)||(ascii>=97 && ascii<=122)){
           
            valido=true;
        }
        return valido;
    }
    
    public boolean rangoAZ(char simbolo){
        int ascii=(int)simbolo;
        boolean valido= false;
        if((ascii>=65 && ascii<=90)){
            
            valido=true;
        }
        return valido;
    }
    
    public boolean rangoaz(char simbolo){
        int ascii=(int)simbolo;
        boolean valido= false;
        if((ascii>=97 && ascii<=122)){
            
            valido=true;
        }
        return valido;
    }
    
    public boolean rangoAZ_09(char simbolo){
        int ascii=(int)simbolo;
        boolean valido= false;
        if((ascii>=65 && ascii<=90)||(ascii>=48 && ascii<=57)){
           
            valido=true;
        }
        return valido;
    }
    
    public boolean rangoaz_09(char simbolo){
        int ascii=(int)simbolo;
        boolean valido= false;
        if((ascii>=97 && ascii<=122)||(ascii>=48 && ascii<=57)){
            
            valido=true;
        }
        return valido;
    }
    
    public boolean rango09(char simbolo){
        int ascii=(int)simbolo;
        boolean valido= false;
        if((ascii>=48 && ascii<=57)){
            
            valido=true;
        }
        return valido;
    }
    
    public boolean rangoAZ_az_09(char simbolo){
        int ascii=(int)simbolo;
        boolean valido= false;
        if((ascii>=65 && ascii<=90)||(ascii>=97 && ascii<=122) ||(ascii>=48 && ascii<=57)){
            
            valido=true;
        }
        return valido;
    }
    
    public static void main(String[] args) {
        Rangos app = new Rangos();
        System.out.println(app.rangoAZ_09('Z'));
    }
}
