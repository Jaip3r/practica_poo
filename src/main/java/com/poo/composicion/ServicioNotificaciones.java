package com.poo.composicion;

import java.util.ArrayList;
import java.util.List;

public class ServicioNotificaciones {
    
    private List<CanalNotificacion> canales;

    public ServicioNotificaciones() {
        this.canales = new ArrayList<>();
    }

    public ServicioNotificaciones(List<CanalNotificacion> canales) {
        this.canales = canales;
    }

    /**
     * Notifica a los canales registrados sobre un depósito realizado en una cuenta bancaria.
     * @param titular El titular de la cuenta bancaria
     * @param numeroCuenta El número de cuenta bancaria
     * @param monto El monto del depósito realizado
     */
    public void notificarDeposito(String titular, int numeroCuenta, double monto) {
        if (monto > 1000000) {
            String mensaje = "Se ha realizado un depósito de " + monto + " en la cuenta " + numeroCuenta;
            for (CanalNotificacion canal : canales) {
                canal.enviarNotificacion(titular, mensaje);
            }
        }
    }

    /**
     * Notifica a los canales registrados sobre un retiro realizado en una cuenta bancaria.
     * @param titular El titular de la cuenta bancaria
     * @param numeroCuenta El número de cuenta bancaria
     * @param monto El monto del retiro realizado
     * @param saldoAnterior El saldo anterior a la realización del retiro
     */
    public void notificarRetiro(String titular, int numeroCuenta, double monto, double saldoAnterior) {
        if (monto > saldoAnterior * 0.5) {
            String mensaje = "Se ha realizado un retiro de " + monto + " en la cuenta " + numeroCuenta;
            for (CanalNotificacion canal : canales) {
                canal.enviarNotificacion(titular, mensaje);
            }
        }
    }

    /**
     * Agrega un canal de notificación al servicio de notificaciones.
     * @param canal El canal de notificación a agregar
     */
    public void agregarCanalNotificacion(CanalNotificacion canal) {
        this.canales.add(canal);
    }

    /**
     * Elimina un canal de notifiación del servicio de notificaciones.
     * @param canal El canal de notificación a eliminar
     */
    public void eliminarCanalNotificacion(CanalNotificacion canal) {
        this.canales.remove(canal);
    }

}