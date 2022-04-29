/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.utpl.edu.poo.semana3.trabajogrupal.grupo1;
import java.util.*;
/**
 *
 * @author Unknown Network
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        // variables
        
        double saldo = 0; 
        
        // ingreso de datos
        
        System.out.println("BANCO VIRTUAL");
        System.out.println("");
        
        // cuenta 1 iniciada en 0
        
        System.out.println("");
        System.out.println("CUENTA1");
        System.out.println("");
        
        CuentaAhorros cuenta1 = new CuentaAhorros(saldo);
        
        saldo = 0;
        System.out.println("El saldo inicial es: " + cuenta1.getSaldo());
        
        cuenta1.depositar(50);
        System.out.println("*Se deposito $50*");
        System.out.println("El saldo actual es: " + cuenta1.getSaldo());
        
        cuenta1.retirar(10);
        System.out.println("*Se retiro $10*");
        System.out.println("El saldo actual es: " + cuenta1.getSaldo());
        
        
        
        // cuenta 2 iniciada mayor a 0
        
        System.out.println("");
        System.out.println("CUENTA2");
        System.out.println("");
        
        saldo = 100;
        
        CuentaAhorros cuenta2 = new CuentaAhorros(saldo);
        
        System.out.println("El saldo inicial es: " + cuenta2.getSaldo());
        
        cuenta2.depositar(25);
        System.out.println("*Se deposito $25*");
        System.out.println("El saldo actual es: " + cuenta2.getSaldo());
        
        cuenta2.retirar(15);
        System.out.println("*Se retiro $15*");
        System.out.println("El saldo actual es: " + cuenta2.getSaldo());
        
        System.out.println(cuenta1.contCuenta);
        System.out.println(cuenta2.contCuenta);
    }
    
}
