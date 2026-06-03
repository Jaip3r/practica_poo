package com.poo.polimorfismo.practica_1;

import java.time.LocalDate;

public class CuentaInversion extends CuentaBancaria implements Rentable {
    
    private double tasaInteres;
    private LocalDate fechaVencimiento;

    public CuentaInversion(String titular, double saldo, double tasaInteres, LocalDate fechaVencimiento) {
        super(titular, saldo);
        if (tasaInteres < 0) {
            throw new IllegalArgumentException("La tasa de interés no puede ser negativa.");
        }
        if (fechaVencimiento == null || fechaVencimiento.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha de vencimiento no puede ser nula o anterior a la fecha actual.");
        }
        this.tasaInteres = tasaInteres;
        this.fechaVencimiento = fechaVencimiento;
    }

    /**
     * Obtiene la tasa de interés de la cuenta de inversión.
     * @return la tasa de interés de la cuenta de inversión
     */
    public double getTasaInteres() {
        return this.tasaInteres;
    }

    /**
     * Obtiene la fecha de vencimiento de la cuenta de inversión.
     * @return la fecha de vencimiento de la cuenta de inversión
     */
    public LocalDate getFechaVencimiento() {
        return this.fechaVencimiento;
    }

    @Override
    public void retirar(double monto) {
        if (LocalDate.now().isBefore(this.fechaVencimiento)) {
            throw new IllegalArgumentException("No se puede retirar fondos antes de la fecha de vencimiento.");
        }
        super.retirar(monto);
    }

    @Override
    public double calcularIntereses() {
        return this.consultarSaldo() * (this.tasaInteres / 100);
    }

}