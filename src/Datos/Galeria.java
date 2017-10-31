/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Galeria {
     private ArrayList<Usuario> usuarios;
     private Coleccion coleccion;
    public Galeria() {
        this.usuarios = new ArrayList<>();
        this.coleccion=new Coleccion();
    }
    public void addObra(Obra obra){
    this.coleccion.AddObra(obra);
    
    
    }

    public Obra getObra(String nombreobra) {
        return this.coleccion.VenderObra(nombreobra);
    }
    
    
     
}
