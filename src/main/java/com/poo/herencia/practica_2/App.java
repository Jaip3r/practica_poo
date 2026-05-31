package com.poo.herencia.practica_2;

public class App {
    
    public static void main(String[] args) {
        
        Producto p1 = new Producto("Producto 1", 10);
        Producto p2 = new ProductoFresco("Producto 2", 4,  20);
        Producto p3 = new ProductoRefrigerado("Producto 3", 30, 1);

        System.out.println("Compro 10 unidades del producto 1: " + p1.comprar(10));
        System.out.println("Compro 10 unidades del producto 2: " + p2.comprar(10));
        System.out.println("Compro 10 unidades del producto 3: " + p3.comprar(10));

    }

}