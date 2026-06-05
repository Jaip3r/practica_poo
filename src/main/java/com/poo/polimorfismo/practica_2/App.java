package com.poo.polimorfismo.practica_2;

public class App {
    
    public static void main(String[] args) {
        
        Vehiculo v1 = new Vehiculo("Seat", "Ibiza");
        Vehiculo c1 = new Coche("Toyota", "Auris", 4);
        Vehiculo m1 = new Moto("Honda", "Superior", true);
        Vehiculo cd1 = new CocheDeportivo("Ferrari", "Maximus", 2, true);

        System.out.println(v1);
        System.out.println(c1);
        System.out.println(m1);
        System.out.println(cd1);

    }

}
