package com.poo.composicion;

import com.poo.polimorfismo.practica_1.CuentaBancaria;

public class CuentaBancariaConNotificaciones extends CuentaBancaria {
    
    private ServicioNotificaciones servicioNotificaciones;

    public CuentaBancariaConNotificaciones(String titular, double saldo, ServicioNotificaciones servicioNotificaciones) {
        super(titular, saldo);
        this.servicioNotificaciones = servicioNotificaciones;
    }

    @Override
    public void depositar(double monto) {
        super.depositar(monto);
        this.servicioNotificaciones.notificarDeposito(this.getTitular(), this.getNumeroCuenta(), monto);
    }

    @Override
    public void retirar(double monto) {
        double saldoAnterior = this.consultarSaldo();
        super.retirar(monto);
        this.servicioNotificaciones.notificarRetiro(this.getTitular(), this.getNumeroCuenta(), monto, saldoAnterior);
    }

}