package com.poo.abstraccion.practica_2;

public class App {
    
    public static void main(String[] args) {
        
        AeropuertoPublico aPublico = new AeropuertoPublico(100000, 10, "Adolfo Suarez", 1980, 200000);
        AeropuertoPrivado aPrivado = new AeropuertoPrivado( 10, "Qujote", 2000, 200000);

        System.out.println(aPublico);
        System.out.println(aPrivado);

        aPublico.gananciasTotales(20000);
        aPrivado.gananciasTotales(20000);
        
    }

}
