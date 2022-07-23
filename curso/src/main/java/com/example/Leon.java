package com.example;



public class Leon {
    private String nombre;
    private String color;
    private double consumoAlimento;
    private double tamaño;

    public Leon() {
    }

    public Leon(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public Double getConsumoAlimento() {
        return consumoAlimento;
    }

    public Double getTamaño() {
        return tamaño;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumoAlimento(Double consumoAlimento) {
        this.consumoAlimento = consumoAlimento;
    }

    public void setTamaño(Double tamaño) {
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

    public void ruge() {
        {
            System.out.println("Grrrrr");
        }
    }
}
