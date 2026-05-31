package com.poo.herencia.practica_2;

public class ProductoFresco extends Producto {

    private int diasCaducidad;

    public ProductoFresco(String nombre, double precio, int diasCaducidad) {
        super(nombre, precio);
        this.diasCaducidad = diasCaducidad;
    }

    /**
     * Obtiene los días de caducidad del producto fresco.
     * @return los días de caducidad del producto fresco
     */
    public int getDiasCaducidad() {
        return diasCaducidad;
    }

    @Override
    public double comprar(int cantidad) throws IllegalArgumentException {
        double precioFinal = super.comprar(cantidad);

        if (this.diasCaducidad >= 3 && this.diasCaducidad <= 5) {
            precioFinal *= 0.6;
        } else if (this.diasCaducidad < 3) {
            precioFinal *= 0.3;
        }

        return precioFinal;
    }
    
}