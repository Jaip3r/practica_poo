package com.poo.abstraccion.practica_1;

import java.time.LocalDate;

public class Transaccion {
    
    private int idTransaccion;
    private String tipoTransaccion; // "Depósito" o "Retiro"
    private double monto;
    private LocalDate fecha;
    private CuentaBancaria cuentaDestino;

    private static int idTransaccionAutoIncrementado = 1;

    public Transaccion(String tipoTransaccion, double monto, LocalDate fecha, CuentaBancaria cuentaDestino) {
        if (tipoTransaccion == null || (!tipoTransaccion.equalsIgnoreCase("Depósito") && !tipoTransaccion.equalsIgnoreCase("Retiro"))) {
            throw new IllegalArgumentException("El tipo de transacción debe ser 'Depósito' o 'Retiro'.");
        }
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto de la transacción debe ser positivo.");
        }
        if (fecha == null) {
            throw new IllegalArgumentException("La fecha de la transacción no puede ser nula.");
        }
        if (cuentaDestino == null) {
            throw new IllegalArgumentException("La cuenta destino no puede ser nula.");
        }

        this.tipoTransaccion = tipoTransaccion;
        this.monto = monto;
        this.fecha = fecha;
        this.cuentaDestino = cuentaDestino;
        this.idTransaccion = Transaccion.idTransaccionAutoIncrementado++;
    }

    /**
     * Obtiene el ID de la transacción.
     * @return el ID de la transacción
     */
    public int getIdTransaccion() {
        return this.idTransaccion;
    }

    /**
     * Obtiene el tipo de transacción.
     * @return el tipo de transacción
     */
    public String getTipoTransaccion() {
        return this.tipoTransaccion;
    }

    /**
     * Obtiene el monto de la transacción.
     * @return el monto de la transacción
     */
    public double getMontoTransaccion() {
        return this.monto;
    }

    /**
     * Obtiene la fecha de la transacción.
     * @return la fecha de la transacción
     */
    public LocalDate getFechaTransaccion() {
        return this.fecha;
    }

    /**
     * Obtiene la información de la cuenta destino.
     * @return la información de la cuenta destino
     */
    public String getInfoCuentaDestino() {
        return this.cuentaDestino.toString();
    }

}