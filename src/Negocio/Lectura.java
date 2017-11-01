/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.Account;
import Datos.Artista;
import Datos.Galeria;
import Datos.Obra;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Lectura {
    
    public ArrayList<Obra> LeerArchivos() throws FileNotFoundException{
    ArrayList<Obra>obras=new ArrayList<>();
        String[] Archivos=null;
     String NombreArtista;
     String Obras;   
     int numeroobras;
     String NombreObra;
     String Estilo;
     String Tecnica;
     String Precio;
     double preciofinal;
     Galeria galeria=new Galeria();
         
    File carpeta=new File("Artistas");
    if(carpeta.isDirectory()){
     Archivos=carpeta.list();
    }
    int Id=0;
    for(String s:Archivos){
    Id++;
    Scanner entrada=new Scanner(new File("Artistas/"+s));
    entrada.useDelimiter(",");
     NombreArtista=entrada.next();
    Obras=entrada.next();
//    numeroobras=Integer.parseInt(Obras);
    while(entrada.hasNext()){
     NombreObra=entrada.next();
     Estilo=entrada.next();
    Tecnica=entrada.next();
    Precio=entrada.next();
    preciofinal=Double.parseDouble(Precio);
    obras.add(new Obra(NombreObra,Estilo,Tecnica,preciofinal,new Artista(NombreArtista,NombreArtista,Id,galeria,new Account(NombreArtista))));
    }
    
    
    
    }
    return obras;
    }
}
