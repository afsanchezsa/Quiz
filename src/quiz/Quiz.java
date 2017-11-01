/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import Datos.Obra;
import Negocio.Lectura;
import java.io.FileNotFoundException;
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
Lectura lectura=new Lectura();
  ArrayList<Obra>obras=null;
        try {
            obras=lectura.LeerArchivos();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
     Scanner entrada=new Scanner(System.in);
     int opcion=entrada.nextInt();
     switch(opcion){
         case 1:
             for(Obra o: obras){
                 System.out.println("Artista"+o.getNombreArtista());
                 System.out.println("Nombre"+o.getNombre());
                 System.out.println("Estilo:"+o.getEstilo());
                 System.out.println("Tecnica"+o.getTecnica());
             
             }
     }

    }
    
}
