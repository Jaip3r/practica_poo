package com.poo.abstraccion.practica_2;

public class AeropuertoPrivado extends Aeropuerto {

    private int numeroSocios;

    public AeropuertoPrivado(int numeroSocios, String nombre, int anioInauguracion, int capacidad) {
        super(nombre, anioInauguracion, capacidad);
        this.numeroSocios = numeroSocios;
    }

    /**
     * Obtiene el número de socios del aeropuerto.
     * @return el número de socios del aeropuerto
     */
    public int getNumeroSocios() {
        return numeroSocios;
    }

    @Override
    public void gananciasTotales(int cantidad) {
        double gananciasSocio = cantidad / this.numeroSocios;
        System.out.println("Cada socio ha ganado: " + gananciasSocio);
    }

    @Override
    public String toString() {
        return super.toString() + ", numeroSocios=" + numeroSocios;
    }
    
}