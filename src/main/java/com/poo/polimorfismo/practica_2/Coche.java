package com.poo.polimorfismo.practica_2;

public class Coche extends Vehiculo {
    
    private int numeroPuertas;

    public Coche(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return super.toString() + ", numeroPuertas=" + numeroPuertas;
    }

}