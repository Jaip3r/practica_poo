package com.poo.clases;

public class Empresa {
    
    private String CIF;
    private String nombre;

    public Empresa(String cIF, String nombre) {
        CIF = cIF;
        this.nombre = nombre;
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String cIF) {
        CIF = cIF;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empresa [CIF=" + CIF + ", nombre=" + nombre + "]";
    }

}