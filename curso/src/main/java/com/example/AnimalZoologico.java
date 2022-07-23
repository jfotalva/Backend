package com.example;

public class AnimalZoologico {
    protected String nombre;
    protected String color;
    protected double consumoAlimento;
    protected double tamaño;

    public AnimalZoologico() {
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
}
