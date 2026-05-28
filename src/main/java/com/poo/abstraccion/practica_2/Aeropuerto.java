package com.poo.abstraccion.practica_2;

public abstract class Aeropuerto {
    
    private int id;
    private String nombre;
    private int anioInauguracion;
    private int capacidad;

    private static int idAutoIncrementado = 1;

    public Aeropuerto(String nombre, int anioInauguracion, int capacidad) {
        this.nombre = nombre;
        this.anioInauguracion = anioInauguracion;
        this.capacidad = capacidad;
        this.id = Aeropuerto.idAutoIncrementado++;
    }

    /**
     * Obtiene el id del aeropuerto.
     * @return el id del aeropuerto
     */
    public int getId() {
        return id;
    }

    /**
     * Obtiene el nombre del aeropuerto.
     * @return el nombre del aeropuerto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el año de inauguración del aeropuerto.
     * @return el año de inauguración del aeropuerto
     */
    public int getAnioInauguracion() {
        return anioInauguracion;
    }

    /**
     * Obtiene la capacidad del aeropuerto.
     * @return la capacidad del aeropuerto
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * Calcula las ganancias totales del aeropuerto.
     * @param cantidad la cantidad base para calcular las ganancias
     */
    public abstract void gananciasTotales(int cantidad);

    @Override
    public String toString() {
        return "id=" + id + ", nombre=" + nombre + ", anioInauguracion=" + anioInauguracion + ", capacidad="
                + capacidad;
    }

}