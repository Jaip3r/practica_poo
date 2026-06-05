package com.poo.composicion;

public class App {
 
    public static void main(String[] args) {
        CuentaBancariaConNotificaciones cuenta = new CuentaBancariaConNotificaciones("Juan Pérez", 500000);

        // Agregar un canal de notificación y depositar un monto para probar las notificaciones
        cuenta.agregarCanalNotificacion(new SmsNotificacion());
        cuenta.depositar(1500000);

        // Depósito pequeño
        cuenta.depositar(50000);

        // Agregar otro canal de notificación y realizar otro depósito para probar las notificaciones
        cuenta.agregarCanalNotificacion(new WhatsAppNotificacion());
        cuenta.depositar(2000000);
    }
    
}