package com.poo.abstraccion.practica_1;

import java.time.LocalDate;
import java.util.Arrays;

public class CuentaBancaria {
    
    private int numeroCuenta;
    private String titular;
    private double saldo;
    private Transaccion[] transacciones;
    private int numTransacciones;

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
        this.transacciones = new Transaccion[50];
        this.numTransacciones = 0;
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
    public void depositar(double monto, CuentaBancaria cuentaDestino) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a depositar debe ser positivo.");
        }
        if (cuentaDestino == null) {
            throw new IllegalArgumentException("La cuenta destino no puede ser nula.");
        }
        if (this.numTransacciones >= this.transacciones.length) {
            throw new IllegalStateException("Limite de transacciones alcanzado. No se pueden registrar más trasacciones en esta cuenta.");
        }
        
        this.transacciones[this.numTransacciones++] = new Transaccion("Depósito", monto, LocalDate.now(), cuentaDestino);
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
        if (this.numTransacciones >= this.transacciones.length) {
            throw new IllegalStateException("Limite de transacciones alcanzado. No se pueden registrar más trasacciones en esta cuenta.");
        }

        this.transacciones[this.numTransacciones++] = new Transaccion("Retiro", monto, LocalDate.now(), this);
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
     * @return un arreglo de las últimas 5 transacciones realizadas en la cuenta
     */
    public Transaccion[] consultarUltimasTransacciones() {
        if (this.numTransacciones == 0) {
            return new Transaccion[0];
        }

        Transaccion[] ultimas = new Transaccion[5];

        for (int i = 0; i < 5; i++) {
            if (i < this.numTransacciones) {
                ultimas[i] = this.transacciones[this.numTransacciones - i - 1];
            }
        }
        return ultimas;
    }

    /**
     * Consulta las transacciones realizadas en la cuenta.
     * @return un arreglo de transacciones realizadas en la cuenta
     */
    public Transaccion[] consultarTransacciones() {
        return Arrays.copyOf(this.transacciones, this.numTransacciones);
    }

    @Override
    public String toString() {
        return "Número de Cuenta: " + this.getNumeroCuenta() + ", Titular: " + this.getTitular();
    }

}