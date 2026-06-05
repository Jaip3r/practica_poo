package com.poo.composicion;

public class PushNotificacion implements CanalNotificacion {

    public PushNotificacion() {
    }

    @Override
    public void enviarNotificacion(String destinatario, String mensaje) {
        System.out.println("Enviando notificación Push a " + destinatario + ": " + mensaje);
    }

}