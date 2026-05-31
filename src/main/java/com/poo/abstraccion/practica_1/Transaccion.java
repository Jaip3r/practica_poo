package com.poo.abstraccion.practica_1;

import java.time.LocalDate;

public final class Transaccion {
    
    private final int idTransaccion;
    private final TipoTransaccion tipoTransaccion;
    private final double monto;
    private final LocalDate fecha;

    private static int idTransaccionAutoIncrementado = 1;

    public Transaccion(TipoTransaccion tipoTransaccion, double monto, LocalDate fecha) {
        if (tipoTransaccion == null) {
            throw new IllegalArgumentException("El tipo de transacción no puede ser nulo.");
        }
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto de la transacción debe ser positivo.");
        }
        if (fecha == null) {
            throw new IllegalArgumentException("La fecha de la transacción no puede ser nula.");
        }

        this.tipoTransaccion = tipoTransaccion;
        this.monto = monto;
        this.fecha = fecha;
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
    public TipoTransaccion getTipoTransaccion() {
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

    @Override
    public String toString() {
        return "Transacción ID: " + idTransaccion + ", Tipo: " + tipoTransaccion + ", Monto: " + monto + ", Fecha: " + fecha ;
    }

}