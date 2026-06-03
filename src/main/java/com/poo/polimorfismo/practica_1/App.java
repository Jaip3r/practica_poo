package com.poo.polimorfismo.practica_1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    
    public static void main(String[] args) {
        // Lista polimórfica general
        List<CuentaBancaria> todasLasCuentas = new ArrayList<>();

        // Lista de rentables
        List<Rentable> cuentasRentables = new ArrayList<>();

        // Instancias de cuentas
        CuentaAhorro cuentaAhorro = new CuentaAhorro("Juan Pérez", 1000.0, 4.5);
        CuentaCorriente cuentaCorriente = new CuentaCorriente("María García", 2000.0, 500.0);
        CuentaInversion cuentaInversion = new CuentaInversion("Carlos López", 3000.0, 8.5, LocalDate.of(2026, 12, 31));

        // Agregar cuentas a la lista polimórfica general
        todasLasCuentas.add(cuentaAhorro);
        todasLasCuentas.add(cuentaCorriente);
        todasLasCuentas.add(cuentaInversion);

        // Agregar cuentas rentables a la lista de rentables
        cuentasRentables.add(cuentaAhorro);
        cuentasRentables.add(cuentaInversion);

        // Depositar en todas
        for (CuentaBancaria cuenta : todasLasCuentas) {
            cuenta.depositar(500.0);
            System.out.println("Depósito de 500.0 en la cuenta de " + cuenta.getTitular() + ". Saldo actual: " + cuenta.consultarSaldo());
        }

        // Calcular los intereses
        for (Rentable rentable : cuentasRentables) {
            double intereses = rentable.calcularIntereses();
            System.out.println("Intereses calculados para la cuenta de " + ((CuentaBancaria) rentable).getTitular() + ": " + intereses);
        }
        
    }
    
}