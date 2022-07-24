package com.example;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private String nombre;
    private String direccion;
    private String horario;

    private List<Leon> leones;
    private List<Elefante> elefantes;
    private List<AnimalZoologico> animales;
    private List<Cuidador> cuidadores;
    private List<ElementoZoologico> elementos;

    public Zoologico() {
        inicializaListas();
    }

    private void inicializaListas() {
        leones = new ArrayList<>();
        elefantes = new ArrayList<>();
        animales = new ArrayList<>();
        cuidadores = new ArrayList<>();
        elementos = new ArrayList<>();
    }

    public Zoologico(String nombre) {
        this.nombre = nombre;
        inicializaListas();
    }

    public Zoologico(String nombre, String direccion, String horario) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.horario = horario;
        inicializaListas();
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
        return "*Nombre: " + this.nombre + ". *Dirección: " + this.direccion + ". *Horario: " + this.horario;
    }

    public void agregaLeon(Leon leon) {
        leones.add(leon);
        animales.add(leon);
        elementos.add(leon);
    }

    public int numeroLeones() {
        return leones.size();
    }

    public void agregaElefante(Elefante elefante) {
        elefantes.add(elefante);
        animales.add(elefante);
        elementos.add(elefante);
    }

    public int numeroElefantes() {
        return elefantes.size();
    }

    public int numeroAnimales() {
        return animales.size();
    }

    public void cierra() {
        for (ElementoZoologico elementoZoologico : elementos) {
            elementoZoologico.duerme();
        }
    }

    public void agregaCuidador(Cuidador cuidador) {
        cuidadores.add(cuidador);
        elementos.add(cuidador);
    }
}
