package com.poo.polimorfismo.practica_2;

public class CocheDeportivo extends Coche {

    private boolean descapotable;

    public CocheDeportivo(String marca, String modelo, int numeroPuertas, boolean descapotable) {
        super(marca, modelo, numeroPuertas);
        this.descapotable = descapotable;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    @Override
    public String toString() {
        return super.toString() + ", descapotable=" + descapotable;
    }

}