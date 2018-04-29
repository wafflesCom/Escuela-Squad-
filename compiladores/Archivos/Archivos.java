import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import javax.swing.JOptionPane;
public class Archivos{

File archivo = new File("texto.txt");
FileWriter escribirArchivo;
FileReader leer;
BufferedReader leerArchivo;


public void escribirArchivos(String contenido){
try{
 escribirArchivo = new FileWriter(archivo, true);
 escribirArchivo.write(contenido);
 escribirArchivo.close();
}catch (Exception e){
 System.out.println("Ha ocurrido un error");
}

}
public void leerArchivos(){
  try{
  String texto = "";
  leer = new FileReader(archivo);
  leerArchivo = new BufferedReader(leer);
  while((texto = leerArchivo.readLine()) != null){
  System.out.println(texto);
  }
  }catch(Exception e){
  System.out.println("Error al leer");
  
  }
}

public static void main(String[] args){
Archivos obj = new Archivos();

String cadena = JOptionPane.showInputDialog("Escribe");
String salto = "\n";
obj.escribirArchivos(cadena);
obj.escribirArchivos(salto);
obj.leerArchivos();

}


}
