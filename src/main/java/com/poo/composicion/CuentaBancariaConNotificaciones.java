package com.poo.composicion;

import java.util.ArrayList;
import java.util.List;

import com.poo.polimorfismo.practica_1.CuentaBancaria;

public class CuentaBancariaConNotificaciones extends CuentaBancaria {
    
    private List<CanalNotificacion> canales;

    public CuentaBancariaConNotificaciones(String titular, double saldo) {
        super(titular, saldo);
        this.canales = new ArrayList<>();
    }

    @Override
    public void depositar(double monto) {
        super.depositar(monto);
        
        if (monto > 1000000) {
            String mensaje = "Se ha realizado un depósito de " + monto + " en la cuenta " + this.getNumeroCuenta();
            for (CanalNotificacion canal : canales) {
                canal.enviarNotificacion(this.getTitular(), mensaje);
            }
        }
    }

    @Override
    public void retirar(double monto) {
        double saldoAnterior = this.consultarSaldo();
        super.retirar(monto);

        if (monto > saldoAnterior * 0.5) {
            String mensaje = "Se ha realizado un retiro de " + monto + " en la cuenta " + this.getNumeroCuenta();
            for (CanalNotificacion canal : canales) {
                canal.enviarNotificacion(this.getTitular(), mensaje);
            }
        }
    }

    /**
     * Agrega un canal de notificación a la cuenta bancaria.
     * @param canal El canal de notificación a agregar
     */
    public void agregarCanalNotificacion(CanalNotificacion canal) {
        this.canales.add(canal);
    }

    /**
     * Elimina un canal de notifiación de la cuenta bancaria.
     * @param canal El canal de notificación a eliminar
     */
    public void eliminarCanalNotificacion(CanalNotificacion canal) {
        this.canales.remove(canal);
    }

}