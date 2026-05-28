package com.poo.abstraccion.practica_2;

public class AeropuertoPublico extends Aeropuerto {

    private int financiacion;
    private int numeroTrabajadoresDiscapacitados;
    
    public AeropuertoPublico(int financiacion, int numeroTrabajadoresDiscapacitados, String nombre, int anioInauguracion, int capacidad) {
        super(nombre, anioInauguracion, capacidad);
        this.financiacion = financiacion;
        this.numeroTrabajadoresDiscapacitados = numeroTrabajadoresDiscapacitados;
    }

    /**
     * Obtiene la financiación del aeropuerto.
     * @return la financiación del aeropuerto
     */
    public int getFinanciacion() {
        return financiacion;
    }

    /**
     * Obtiene el número de trabajadores discapacitados del aeropuerto.
     * @return el número de trabajadores discapacitados del aeropuerto
     */
    public int getNumeroTrabajadoresDiscapacitados() {
        return numeroTrabajadoresDiscapacitados;
    }

    @Override
    public void gananciasTotales(int cantidad) {
        double ganancias = cantidad + this.financiacion + (this.numeroTrabajadoresDiscapacitados * 1000);
        System.out.println("Las ganancias han sido de: " + ganancias);
    }

    @Override
    public String toString() {
        return super.toString() + ", financiacion=" + financiacion + ", numeroTrabajadoresDiscapacitados="
                + numeroTrabajadoresDiscapacitados;
    }
    
}