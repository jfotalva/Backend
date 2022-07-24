package com.example;

public class Elefante extends AnimalZoologico {
    public static String numeroTotal;
    private double tamañoColmillos;

    public Elefante() {
    }

    public Elefante(String nombre, String color, double tamañoColmillos) {
        this.nombre = nombre;
        this.color = color;
        this.tamañoColmillos = tamañoColmillos;
    }

    // Método que no necesita tener una instancia, se puede acceder directamente al ser estático.
    public static void prueba() {
        System.out.println("Este método es de prueba.");
    }

    public double getTamañoColmillos() {
        return tamañoColmillos;
    }

    public void setTamañoColmillos(double tamañoColmillos) {
        this.tamañoColmillos = tamañoColmillos;
    }

    public void birrita() {
        {
            System.out.println("Brrrrr");
        }
    }
}
