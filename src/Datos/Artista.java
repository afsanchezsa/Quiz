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
public class Artista extends Usuario {
private ArrayList<Obra>obras;
    public Artista(String Nombre, String Usuario, int Id, Galeria galeria,Account cuenta) {
        super(Nombre, Usuario, Id, galeria,cuenta);
        this.obras=new ArrayList<>();
    }
public void publicarObra(String NombreObra){
for(Obra o:this.obras){
if(o.getNombre().equals( NombreObra)){
this.galeria.addObra(o);
}
}

}
public void CrearObra(String nombre, String estilo, String tecnica, double Valor,Artista artista){
this.obras.add(new Obra(nombre, estilo, tecnica, Valor,artista));

}

}
