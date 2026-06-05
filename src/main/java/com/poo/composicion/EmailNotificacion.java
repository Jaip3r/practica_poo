package com.poo.composicion;

public class EmailNotificacion implements CanalNotificacion {

    public EmailNotificacion() {
    }

    @Override
    public void enviarNotificacion(String destinatario, String mensaje) {
        System.out.println("Enviando notificación por Email a " + destinatario + ": " + mensaje);
    }
    
}