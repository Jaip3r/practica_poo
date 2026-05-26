package com.poo.abstraccion.practica_1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CuentaBancaria {
    
    private int numeroCuenta;
    private String titular;
    private double saldo;
    private List<Transaccion> transacciones;

    private static int numeroCuentaAutoIncrementado = 1;

    public CuentaBancaria(String titular, double saldo) {
        if (titular == null || titular.isEmpty()) {
            throw new IllegalArgumentException("El titular no puede ser nulo o vacío.");
        }
        if (saldo < 0) {
            throw new IllegalArgumentException("El saldo no puede ser negativo.");
        }

        this.titular = titular;
        this.saldo = saldo;
        this.numeroCuenta = CuentaBancaria.numeroCuentaAutoIncrementado++;
        this.transacciones = new ArrayList<>();
    }

    /**
     * Obtiene el número de cuenta.
     * @return el número de cuenta
     */
    public int getNumeroCuenta() {
        return this.numeroCuenta;
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     * @return el nombre del titular de la cuenta
     */
    public String getTitular() {
        return this.titular;
    }

    /**
     * Deposita un monto en la cuenta.
     * @param monto el monto a depositar
     * @throws IllegalArgumentException si el monto es inválido
     */
    public void depositar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a depositar debe ser positivo.");
        }
        
        this.transacciones.add(new Transaccion(TipoTransaccion.DEPOSITO, monto, LocalDate.now(), this));
        this.saldo += monto;
    }

    /**
     * Retira un monto de la cuenta.
     * @param monto el monto a retirar
     * @throws IllegalArgumentException si el monto es inválido o hay fondos insuficientes
     */
    public void retirar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a retirar debe ser positivo.");
        }
        if (monto > this.saldo) {
            throw new IllegalArgumentException("Fondos insuficientes para realizar el retiro.");
        }

        this.transacciones.add(new Transaccion(TipoTransaccion.RETIRO, monto, LocalDate.now(), this));
        this.saldo -= monto;
    }

    /**
     * Consulta el saldo de la cuenta.
     * @return el saldo de la cuenta
     */
    public double consultarSaldo() {
        return this.saldo;
    }

    /**
     * Consulta las últimas 5 transacciones realizadas en la cuenta.
     * @return una lista de las últimas 5 transacciones realizadas en la cuenta
     */
    public List<Transaccion> consultarUltimasTransacciones() {
        if (this.transacciones.isEmpty()) {
            return new ArrayList<>();
        }

        return Collections.unmodifiableList(this.transacciones.subList(Math.max(0, this.transacciones.size() - 5), this.transacciones.size()));
    }

    @Override
    public String toString() {
        return "Número de Cuenta: " + this.getNumeroCuenta() + ", Titular: " + this.getTitular();
    }

}