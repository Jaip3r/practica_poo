package com.poo.abstraccion.practica_1;

public class CuentaBancaria {
    
    private int numeroCuenta;
    private String titular;
    private double saldo;

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
        this.saldo -= monto;
    }

    /**
     * Consulta el saldo de la cuenta.
     * @return el saldo de la cuenta
     */
    public double consultarSaldo() {
        return this.saldo;
    }
    
}
