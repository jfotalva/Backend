package com.example;

public class Cuidador implements ElementoZoologico{
    private String nombre;
    private String especialidad;

    public Cuidador() {
    }

    public Cuidador(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public void duerme() {
        System.out.println(this.nombre + ": Voy a dormir ...");
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}
