/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import Datos.Artista;
import Datos.Obra;
import Negocio.Escritura;
import Negocio.Lectura;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estudiante
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Marque una opcion");
        System.out.println("1.Ver las obras");
        System.out.println("2. Ver Obras segun Artista");
        System.out.println("3.obtener valor total de la obras");
        System.out.println("4. registrar un nuevo artista");
        System.out.println("5. añadir una obra al artista");
Lectura lectura=new Lectura();
int Id;
double valor;
String estilo,tecnica,nombreartista;
  ArrayList<Obra>obras=new ArrayList<>();
        try {
            obras=lectura.LeerArchivos();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
     Scanner entry=new Scanner(System.in);
     int opcion=entry.nextInt();
     entry.nextLine();//se comporta de forma extraña un nextLine luego de nextInt por eso pongo un nextLine vacio
     switch(opcion){
         case 1:
             for(Obra o: obras){
                 System.out.println("Artista"+o.getNombreArtista());
                 System.out.println("Nombre"+o.getNombre());
                 System.out.println("Estilo:"+o.getEstilo());
                 System.out.println("Tecnica"+o.getTecnica());
                 System.out.println("Valor"+o.getValor());
                 System.out.println("----------------------------------");
             }
             break;
         case 2:
             System.out.println("digite el nombre del artista");
             String nombre=entry.nextLine();
             System.out.println("el artista"+nombre+"Tiene las siguientes obras");
             for(Obra o:obras){
             if(o.getNombreArtista().equalsIgnoreCase(nombre)){
                 System.out.println("Obra:"+o.getNombre());
                 System.out.println("Estilo"+o.getEstilo());
                 System.out.println("Tecnica"+o.getTecnica());
                 System.out.println("valor"+o.getValor());
                 System.out.println("---------------------------------");
             }
             }
          break;
         case 3:
             double total=0,total2=0;
             for(Obra o:obras){
             total+=o.getValor();
             
             }
             total2=total+(total*0.02);
             
             System.out.println("el Valor total de las obras es:"+total);
             System.out.println("valor total con comision es: "+total2);
     break;
         case 4:
             System.out.println("digite el nombre del artista");
             nombre=entry.nextLine();
             System.out.println("ingrese el Id ");
             Id=entry.nextInt();
             Artista artista=new Artista(nombre, nombre, Id, null, null);//los declaro nulos y en la proxima ejecucion del prgrama la clase lectura les asigna cuenta y galeria
             Escritura escribir=new Escritura();
        {
            try {
                escribir.NuevoArtista(artista);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        break;
         case 5:
             System.out.println("ingrese nombre");
             nombre=entry.nextLine();
             System.out.println("ingrese el estilo");
             estilo=entry.next();
             System.out.println("ingrese la tecnica");
             tecnica=entry.next();
             System.out.println("ingrese el valor");
             valor=entry.nextDouble();
             entry.nextLine();
             System.out.println("ingrese el nombre del artista");
             nombreartista=entry.nextLine();
             Lectura leer=new Lectura();
        {
            try {
           obras=leer.LeerArchivos();
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            
        }
            for(Obra o:obras){
                if(o.getNombreArtista().equals(nombreartista)){
                
                }
                
                
            }}
            
             Obra obra=new Obra(nombre,estilo,tecnica,valor,null);
             Escritura escritura=new Escritura();
        {
            try {
                escritura.agregarobra(nombreartista, obra);
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
        }
     }

    }
    
}
