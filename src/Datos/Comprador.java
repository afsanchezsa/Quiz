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
public class Comprador extends Usuario {

private Account cuenta;
private ArrayList<Obra>Obrascompradas;
    
    public Comprador(String Nombre, String Usuario, int Id,Galeria galeria,Account cuenta) {
        super(Nombre, Usuario, Id,galeria,cuenta);
        this.cuenta=cuenta;
        this.Obrascompradas=new ArrayList<>();
    }
    public void ComprarObra(String nombreobra){
        this.Obrascompradas.add(this.galeria.getObra(nombreobra));
  this.cuenta.Retirar(this.galeria.getObra(nombreobra).getValor());
    
    }
    
    
    }
    

