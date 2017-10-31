/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Estudiante
 */
public class Usuario {
    protected String Nombre;
    protected String Usuario;
    protected int Id;
    protected Galeria galeria;
    private Account cuenta;

    public Usuario(String Nombre, String Usuario, int Id, Galeria galeria,Account cuenta) {
        this.Nombre = Nombre;
        this.Usuario = Usuario;
        this.Id = Id;
        this.galeria=galeria;
        this.cuenta=cuenta;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getUsuario() {
        return Usuario;
    }

    public int getId() {
        return Id;
    }
    
    
}
