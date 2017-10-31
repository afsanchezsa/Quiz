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
public class Account {
    private String titular;
    private double Saldo;

    public Account(String titular) {
        this.titular = titular;
    this.Saldo=0;
    
       }
    public void Consignar( double monto){
    this.Saldo+=monto;
    }
    public void Retirar(double monto){
    this.Saldo-=monto;
    
    }
    }
    

