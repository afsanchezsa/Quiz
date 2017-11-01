/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.Artista;
import Datos.Obra;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Escritura {
    public void NuevoArtista( Artista a) throws FileNotFoundException, IOException{
     File carpeta=new File("Artistas");
     String []archivos=null; 
     if(carpeta.isDirectory()){
      archivos=carpeta.list();
      
      }  
     if(VerificarExistencia(a.getNombre(), archivos)){
     
     
     }else{
     File file=new File("Artistas/"+a.getNombre());
     file.createNewFile();
      PrintStream salida=new PrintStream(file);
      salida.println(a.getNombre()+",");
     
     
     
     }
    
    }
    public void agregarobra(String nombreArtista,Obra obra) throws FileNotFoundException{
    ArrayList<String>lineas;
        File Carpeta=new  File("Artistas");
    String[]archivos=null;
    if(Carpeta.isDirectory()){
    archivos=Carpeta.list();
    }
    for(String s:archivos){
    File file=new File("Artistas/"+s);
    Scanner entrada=new Scanner(file);
    entrada.useDelimiter(",");
    String nombre=entrada.next();
    if(nombre.equals(nombreArtista)){
    lineas=SalvarInfo(s);
    entrada.close();
    PrintStream salida=new PrintStream(file);
    for(String m:lineas){
    
    salida.println(m);
    }
        salida.println(obra.getNombre()+","+obra.getEstilo()+","+obra.getTecnica()+","+obra.getValor()+",");
    salida.flush();
    salida.close();
    }
    
    
    
    }
    }
public boolean VerificarExistencia(String Nombre,String[] archivos) throws FileNotFoundException{
for(String s:archivos){
File archivointerno=new File("Artistas/"+s);
Scanner entrada=new Scanner(archivointerno);
entrada.useDelimiter(",");
if(entrada.next().equals(Nombre)){
return true;
}
}
return false;
}
public ArrayList<String> SalvarInfo(String archivo) throws FileNotFoundException{
ArrayList<String>Lineas=new ArrayList<>();
String linea;
Scanner entrada=new Scanner(new File("Artistas/"+archivo));
while(entrada.hasNextLine()){
 linea=entrada.nextLine();
 Lineas.add(linea);

}
return Lineas;
}

}




