package com.poo.herencia.practica_2;

public class Producto {
    
    private int id;
    private String nombre;
    private double precio;

    private static int idAutoIncrementado = 1;

    public Producto(String nombre, double precio) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre del producto no puede ser nulo o vacío");
        }
        if (precio < 0) {
            throw new IllegalArgumentException("El precio debe ser positivo");
        }

        this.nombre = nombre;
        this.precio = precio;
        this.id = Producto.idAutoIncrementado++;
    }

    /**
     * Obtiene el ID del producto.
     * @return el ID del producto
     */
    public int getId() {
        return id;
    }

    /**
     * Obtiene el nombre del producto.
     * @return el nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el precio del producto.
     * @return el precio del producto
     */    
    public double getPrecio() {
        return precio;
    }

    /**
     * Calcula el precio total de la compra de una cantidad especifica del producto.
     * @param cantidad La cantidad del producto a comprar
     * @return El precio total de la compra
     * @throws IllegalArgumentException
     */
    public double comprar(int cantidad) throws IllegalArgumentException {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad a adquirir debe ser positiva");
        }

        return this.precio * cantidad;
    }

}