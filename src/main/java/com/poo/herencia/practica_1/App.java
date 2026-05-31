package com.poo.herencia.practica_1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.poo.abstraccion.practica_1.CuentaBancaria;

public class App {
    
    public static void main(String[] args) {
        List<CuentaBancaria> cuentas = new ArrayList<>();

        cuentas.add(new CuentaAhorro("Juan Pérez", 1000.0, 4.5));
        cuentas.add(new CuentaCorriente("María García", 2000.0, 500.0));
        cuentas.add(new CuentaInversion("Carlos López", 3000.0, 8.5, LocalDate.of(2026, 12, 31)));

        for (CuentaBancaria cuentaBancaria : cuentas) {
            System.out.println("\n\nCuenta de " + cuentaBancaria.getTitular() + " con saldo inicial: " + cuentaBancaria.consultarSaldo());
            cuentaBancaria.depositar(500.0);
            System.out.println("Depóisto de 500.0");
            System.out.println("Saldo después del depósito en la cuenta de " + cuentaBancaria.getTitular() + ": " + cuentaBancaria.consultarSaldo());

            try {
                cuentaBancaria.retirar(200.0);
                System.out.println("\nRetiro de 200.0");
                System.out.println("Saldo después del retiro en la cuenta de " + cuentaBancaria.getTitular() + ": " + cuentaBancaria.consultarSaldo());
            } catch (IllegalArgumentException e) {
                System.out.println("Error al retirar de la cuenta de " + cuentaBancaria.getTitular() + ": " + e.getMessage());
            }
        }
    }
    
}
