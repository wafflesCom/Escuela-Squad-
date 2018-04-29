public class Rangos{


public boolean rango_AZ(char simbolo){
int ascii = (int)simbolo;
boolean valido = false;

if((ascii >= 65 && ascii <= 90) || 
	(ascii >= 97 && ascii <=122)){
  System.out.println("Validos");
  valido = true;  
		
	}
  return valido;

}
public boolean rangoAZ(char simbolo){
int ascii = (int)simbolo;
boolean valido = false;

if((ascii >= 65 && ascii <= 90)){
  System.out.println("Validos");
  valido = true;  
		
	}
  return valido;

}
public boolean rango_az(char simbolo){
int ascii = (int)simbolo;
boolean valido = false;

if((ascii >= 97 && ascii <= 122)){
  System.out.println("Validos");
  valido = true;  
		
	}
  return valido;

}
public boolean rango_AZNum(char simbolo){
int ascii = (int)simbolo;
boolean valido = false;

if((ascii >= 65 && ascii <= 90) || (ascii >= 48 && ascii <= 57 )){
  System.out.println("Validos");
  valido = true;  
		
	}
  return valido;

}

public boolean rango_azNum(char simbolo){
int ascii = (int)simbolo;
boolean valido = false;

if((ascii >= 48 && ascii <= 57) || 
	(ascii >= 97 && ascii <=122)){
  System.out.println("Validos");
  valido = true;  
		
	}
  return valido;

}
public boolean rango_Num(char simbolo){
int ascii = (int)simbolo;
boolean valido = false;

if((ascii >= 48 && ascii <= 57)){
  System.out.println("Validos");
  valido = true;  
		
	}
  return valido;

}
public boolean rango_AZ_az_NUM(char simbolo){
int ascii = (int)simbolo;
boolean valido = false;

if((ascii >= 65 && ascii <= 90) || 
	(ascii >= 97 && ascii <=122) || (ascii >= 48 && ascii <= 57)){
  System.out.println("Validos");
  valido = true;  
		
	}
  return valido;

}

public static void main(String[] args){
Rangos obj = new Rangos();
obj.rango_AZ_az_NUM('1');

}

}
