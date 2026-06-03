package com.poo.polimorfismo.practica_1;

public class CuentaAhorro extends CuentaBancaria implements Rentable {
    
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

    @Override
    public double calcularIntereses() {
        return this.consultarSaldo() * (this.tasaInteres / 100);
    }

}