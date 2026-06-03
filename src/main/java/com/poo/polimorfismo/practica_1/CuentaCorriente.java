package com.poo.polimorfismo.practica_1;

import java.time.LocalDate;

import com.poo.abstraccion.practica_1.TipoTransaccion;
import com.poo.abstraccion.practica_1.Transaccion;

public class CuentaCorriente extends CuentaBancaria {

    private double limiteSobregiro;

    public CuentaCorriente(String titular, double saldo, double limiteSobregiro) {
        super(titular, saldo);
        if (limiteSobregiro < 0) {
            throw new IllegalArgumentException("El límite de sobregiro no puede ser negativo.");
        }
        this.limiteSobregiro = limiteSobregiro;
    }

    /**
     * Obtiene el limite de sobregiro de la cuenta corriente.
     * @return el limite de sobregiro de la cuenta corriente
     */
    public double getLimiteSobregiro() {
        return this.limiteSobregiro;
    }

    @Override
    public void retirar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a retirar debe ser positivo.");
        }
        if (monto > this.consultarSaldo() + this.limiteSobregiro) {
            throw new IllegalArgumentException("No se puede retirar más del saldo disponible más el límite de sobregiro.");
        }

        // No se delega a super.retirar() porque la lógica de sobregiro
        // requiere una validación diferente de fondos que la del padre.
        this.ajustarSaldo(-monto);
        this.registrarTransaccion(new Transaccion(TipoTransaccion.RETIRO, monto, LocalDate.now()));
    }
     
}