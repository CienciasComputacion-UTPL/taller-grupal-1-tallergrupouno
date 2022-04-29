/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.utpl.edu.poo.semana3.trabajogrupal.grupo1;

/**
 *
 * @author Unknown Network
 */
public class CuentaAhorros {
    
    // atributos
    private double saldo = 0;
    public static int contCuenta; 
    
    // constructores
    public CuentaAhorros(){
        saldo = 0;
        contCuenta++;
    }
    
    public CuentaAhorros(double saldo) {
        this.saldo = saldo; 
        contCuenta++;
    }
    
    // metodos
    
        // CONSULTAR
        
    public double getSaldo() {
        return saldo;
    }
    
        // DEPOSITAR
    
    public void depositar(double cantidad) {
        
        if (cantidad < 0) {
            throw new IllegalArgumentException("El deposito no puede ser un valor negativo, ingrese una cantidad mayor a 0.00");
        } else {
            this.saldo = saldo + cantidad;
        }
       
    }
    
        // RETIRAR
    
    public void retirar(double cantidad) {
        
        if (cantidad < 0) {
            throw new IllegalArgumentException("El deposito no puede ser un valor negativo, ingrese una cantidad mayor a 0.00");
        } else {
            if (cantidad > saldo) {
                throw new IllegalArgumentException("Fondos insuficientes");
            } else {
                this.saldo = saldo - cantidad;
            }
        }
       
    }
    
    
}
