package com.example;

public class Clase7 {

    public static void main(String[] args) {
        // Forma 1
        Zoologico zoologico1 = new Zoologico("Zoologico de Barbosa");
        // Forma 2
        zoologico1.setDireccion("Av. Reforma. Cdmx");
        zoologico1.setHorario("De 8 a.m a 6 p.m");

        // Forma 3
        Zoologico zoologico2 = new Zoologico("Zoologico de Aragon", "Av. Aragon. Cdmx", "De 8 a.m a 6 p.m");

        // Forma 1
        System.out.println(zoologico1.toString());
        // Forma 2
        System.out.println(zoologico2);

        Leon simba = new Leon("Simba", "amarillo");
        System.out.println("Número de Leones antes: " + zoologico1.numeroLeones());
        zoologico1.agregaLeon(simba);
        System.out.println("Número de Leones después: " + zoologico1.numeroLeones());

    }
}
