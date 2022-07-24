package com.example;

public class Clase8 {
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
        Elefante dumbo = new Elefante("Dumbo", "Gris", 3.0);
        System.out.println("Número de Animales antes: " + zoologico1.numeroAnimales());
        System.out.println("Número de Leones antes: " + zoologico1.numeroLeones());
        System.out.println("Número de Elefantes antes: " + zoologico1.numeroElefantes());
        zoologico1.agregaLeon(simba);
        zoologico1.agregaElefante(dumbo);
        System.out.println("Número de Leones después: " + zoologico1.numeroLeones());
        System.out.println("Número de Elefantes después: " + zoologico1.numeroElefantes());
        simba.come();
        simba.ruge();
        dumbo.come();
        dumbo.birrita();

        AnimalZoologico animalZoologico = new Elefante();
        animalZoologico.come();
        
        Cuidador cuidador = new Cuidador("Ricardo","Armadillos");
        zoologico1.agregaCuidador(cuidador);
        System.out.println("Número de Animales después: " + zoologico1.numeroAnimales());
        zoologico1.cierra();
        
        Elefante.prueba();
    }
}
