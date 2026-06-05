package com.poo.polimorfismo.practica_2;

public class Moto extends Vehiculo {
    
    private boolean sideCar;

    public Moto(String marca, String modelo, boolean sideCar) {
        super(marca, modelo);
        this.sideCar = sideCar;
    }

    public boolean isSideCar() {
        return sideCar;
    }

    @Override
    public String toString() {
        return super.toString() + ", sideCar=" + sideCar;
    }

}