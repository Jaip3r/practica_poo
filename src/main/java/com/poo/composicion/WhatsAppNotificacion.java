package com.poo.composicion;

public class WhatsAppNotificacion implements CanalNotificacion {

    public WhatsAppNotificacion() {
    }

    @Override
    public void enviarNotificacion(String destinatario, String mensaje) {
        System.out.println("Enviando notificación por WhatsApp a " + destinatario + ": " + mensaje);
    }

}