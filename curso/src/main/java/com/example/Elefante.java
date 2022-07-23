package com.example;

public class Elefante extends AnimalZoologico {

    private double tamañoColmillos;

    public Elefante() {
    }

    public Elefante(String nombre, String color, double tamañoColmillos) {
        this.nombre = nombre;
        this.color = color;
        this.tamañoColmillos = tamañoColmillos;
    }

    public void birrita() {
        {
            System.out.println("Brrrrr");
        }
    }

}
