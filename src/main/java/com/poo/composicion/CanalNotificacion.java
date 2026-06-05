package com.poo.composicion;

public interface CanalNotificacion {
    /**
     * Envía una notificación al destinatario con el mensaje proporcionado.
     * @param destinatario El destinatario de la notificación.
     * @param mensaje El mensaje de la notificación.
     */
    void enviarNotificacion(String destinatario, String mensaje);
}