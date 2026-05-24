package com.poo.abstraccion.practica_1;

public class App {

    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Juan Pérez", 1000.0);
        CuentaBancaria cuenta2 = new CuentaBancaria("María Gómez", 500.0);

        System.out.println("Número de cuenta: " + cuenta1.getNumeroCuenta());
        System.out.println("Titular: " + cuenta1.getTitular());
        System.out.println("Saldo: " + cuenta1.consultarSaldo());

        System.out.println("\nNúmero de cuenta: " + cuenta2.getNumeroCuenta());
        System.out.println("Titular: " + cuenta2.getTitular());
        System.out.println("Saldo: " + cuenta2.consultarSaldo());

        // Realizar un depósito
        try {
            cuenta1.depositar(200.0, cuenta2);
            System.out.println("\nDepósito realizado con éxito.");
        } catch (IllegalArgumentException e) {
            System.out.println("\nError al realizar el depósito: " + e.getMessage());
        }

        System.out.println("\nSaldo después del depósito:");
        System.out.println("Cuenta 1: " + cuenta1.consultarSaldo());

        // Realizar un retiro
        try {
            cuenta1.retirar(150.0);
            System.out.println("\nRetiro realizado con éxito.");
        } catch (IllegalArgumentException e) {
            System.out.println("\nError al realizar el retiro: " + e.getMessage());
        }

        System.out.println("\nSaldo después del retiro:");
        System.out.println("Cuenta 1: " + cuenta1.consultarSaldo());

        // Consultar transacciones
        Transaccion[] transacciones = cuenta1.consultarTransacciones();
        System.out.println("\nTransacciones de la cuenta 1:");
        for (Transaccion transaccion : transacciones) {
            System.out.println(transaccion.toString());
        }
    }
    
}
