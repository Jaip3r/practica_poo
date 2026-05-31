package com.poo.herencia.practica_1;

import com.poo.abstraccion.practica_1.CuentaBancaria;

public class CuentaAhorro extends CuentaBancaria {
    
    private double tasaInteres;

    public CuentaAhorro(String titular, double saldo, double tasaInteres) {
        super(titular, saldo);
        if (tasaInteres < 0) {
            throw new IllegalArgumentException("La tasa de interés no puede ser negativa.");
        }
        this.tasaInteres = tasaInteres;
    }

    /**
     * Obtiene la tasa de interés de la cuenta de ahorro.
     * @return la tasa de interés de la cuenta de ahorro
     */
    public double getTasaInteres() {
        return this.tasaInteres;
    }

    /**
     * Calcula los intereses generados por la cuenta de ahorro.
     * @return los intereses generados por la cuenta de ahorro
     */
    public double calcularIntereses() {
        return this.consultarSaldo() * (this.tasaInteres / 100);
    }

}