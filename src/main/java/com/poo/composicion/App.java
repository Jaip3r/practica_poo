package com.poo.composicion;

public class App {
 
    public static void main(String[] args) {
        // Crear el servicio de notificaciones
        ServicioNotificaciones servicio = new ServicioNotificaciones();
        servicio.agregarCanalNotificacion(new SmsNotificacion());
        servicio.agregarCanalNotificacion(new EmailNotificacion());

        // Crear la cuenta bancaria
        CuentaBancariaConNotificaciones cuenta = new CuentaBancariaConNotificaciones("Juan Pérez", 500000, servicio);

        // Depositar un monto para probar las notificaciones
        cuenta.depositar(1500000);

        // Depósito pequeño
        cuenta.depositar(50000);

        // Agregar otro canal de notificación y realizar otro depósito para probar las notificaciones
        servicio.agregarCanalNotificacion(new WhatsAppNotificacion());
        cuenta.depositar(2000000);
    }
    
}