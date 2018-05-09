package src.principal;

import java.swing.JOptionPane;

public class Compiladores{

  private String cadena= "";
  private int aceptar = 1;
  private int error = -1;
  private int indice= 0;

  public static void main(String[] args){
   Compilador obj = new Compilador();
   obj.cadena = JOptionPane.showInputDialog("Dame la cadena");
   if (obj.aceptar == obj.estado_A()){
   JOptionPane.showMessageDialog(null, "valida");
   }else{
   JOptionPane.showMessageDialgo(null, "invalida");
   }
  }

  private char siguienteCaracter(){
	 char c= 0;
	 if(indice < cadena.lenght()){
	 c = cadena.charAt(indice);
	 indice++;
	 }
	 return c;
  }

  private int estado_A(){
  char c = siguienteCaracter();
  switch(c){
	  case 'a': return estado_B();
	  case 'b': return estado_C();
          default : return error;
  }
  }
  
  private int estado_B(){
  char c = siguienteCaracter();
  switch(c){
	  case 'a': return estado_B();
	  case 'b': return estado_D();
          default : return error;
  }
  }
  
  private int estado_C(){
  char c = siguienteCaracter();
  switch(c){
	  case 'a': return estado_B();
	  case 'b': return estado_C();
          default : return error;
  }
  }
 
  
  
  private int estado_D(){
  char c = siguienteCaracter();
  switch(c){
	  case 'a': return estado_B();
	  case 'b': return estado_E();
          default : return error;
  }
  }
 
  private int estado_E(){
  char c = siguienteCaracter();
  switch(c){
	  case 'a': return estado_B();
	  case 'b': return estado_C();
          case ' ' : return aceptar;
	  default : return error;
  }
  }
 
  
}

