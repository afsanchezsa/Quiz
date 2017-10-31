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
public class Coleccion {
    private ArrayList<Obra>obras;

    public Coleccion() {
    this.obras=new ArrayList<>();
    
    }
    
    
    public void AddObra(Obra obra){
    this.obras.add(obra);
        
    
    }
    public double ValorObra(String nombreobra){
    for(Obra o:this.obras){
  if(o.getNombre().equals(nombreobra)){
      return o.getValor()+(o.getValor()*0.02);
      
      
  }}
    return 0;
    
    }
    public Obra VenderObra(String nombreObra){
     for(Obra o:this.obras){
     if(o.getNombre().equals(nombreObra)){
     Obra obra=o;
     this.obras.remove(o);
     return obra;
     
     }
     
     }
    return null;
    
    }
    
}
