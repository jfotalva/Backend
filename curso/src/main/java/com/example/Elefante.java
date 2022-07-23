package com.example;

public class Elefante {
    private String nombre;
    private String color;
    private double consumoAlimento;
    private double tamaño;
    private double tamañoColmillos;

    
    public Elefante() {
    }
    
    public Elefante(String nombre, String color, double tamañoColmillos) {
        this.nombre = nombre;
        this.color = color;
        this.tamañoColmillos = tamañoColmillos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public double getConsumoAlimento() {
        return consumoAlimento;
    }

    public double getTamaño() {
        return tamaño;
    }

    public double getTamañoColmillos() {
        return tamañoColmillos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumoAlimento(double consumoAlimento) {
        this.consumoAlimento = consumoAlimento;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public void setTamañoColmillos(double tamañoColmillos) {
        this.tamañoColmillos = tamañoColmillos;
    }

    public void duerme() {
        {
            System.out.println("Voy a dormir");
        }
    }

    public void come() {
        {
            System.out.println("Voy a comer");
        }
    }

    public void birrita() {
        {
            System.out.println("Brrrrr");
        }
    }

}
