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
public class Obra {
    private String nombre;
    private String estilo;
    private String tecnica;
    private double Valor;
    private Artista artista;
    public Obra(String nombre, String estilo, String tecnica, double Valor,Artista artista) {
        this.nombre = nombre;
        this.estilo = estilo;
        this.tecnica = tecnica;
        this.Valor = Valor;
        this.artista=artista;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstilo() {
        return estilo;
    }

    public String getTecnica() {
        return tecnica;
    }

    public double getValor() {
        return Valor;
    }
    public String getNombreArtista(){
    return this.artista.getNombre();
    
    }
}
