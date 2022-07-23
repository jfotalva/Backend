package com.example;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private String nombre;
    private String direccion;
    private String horario;

    private List<Leon> leones;
    private List<Elefante> elefantes;

    public Zoologico() {
        leones = new ArrayList<>();
        elefantes = new ArrayList<>();
    }

    public Zoologico(String nombre) {
        this.nombre = nombre;
        leones = new ArrayList<>();
        elefantes = new ArrayList<>();
    }

    public Zoologico(String nombre, String direccion, String horario) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.horario = horario;
        leones = new ArrayList<>();
        elefantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getHorario() {
        return horario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override //
    public String toString() {
        return "Nombre: " + this.nombre + ". Dirección: " + this.direccion + ". Horario: " + this.horario;
    }

    public void agregaLeon(Leon leon) {
        leones.add(leon);
    }

    public int numeroLeones() {
        return leones.size();
    }

    public void agregaElefante(Elefante elefante) {
        elefantes.add(elefante);
    }

    public int numeroElefantes() {
        return elefantes.size();
    }
}
