package com.poo.herencia.practica_2;

public class ProductoRefrigerado extends Producto {

    private int cajon;

    public ProductoRefrigerado(String nombre, double precio, int cajon) {
        super(nombre, precio);
        this.cajon = cajon;
    }

    /**
     * Obtiene el número de cajón del producto refrigerado.
     * @return el número de cajón del producto refrigerado
     */
    public int getCajon() {
        return cajon;
    }
    
}