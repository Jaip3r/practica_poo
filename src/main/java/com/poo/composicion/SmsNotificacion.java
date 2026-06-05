package com.poo.composicion;

public class SmsNotificacion implements CanalNotificacion {

    public SmsNotificacion() {
    }

    @Override
    public void enviarNotificacion(String destinatario, String mensaje) {
        System.out.println("Enviando notificación por SMS a " + destinatario + ": " + mensaje);
    }
    
}