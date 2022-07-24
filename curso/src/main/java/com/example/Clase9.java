package com.example;

import java.util.ArrayList;
import java.util.List;

public class Clase9 {
    public static void imprimirLista(List<String> lista) {
        System.out.println("La lista es: ");
        for (String elemento : lista) {
            System.out.println("--> " + elemento);
        }
    }

    public static void main(String[] args) {
        List<String> animales = new ArrayList<>();
        animales.add("Leon");
        animales.add("Elefante");
        animales.add("Jirafa");
        animales.add("Oso");
        System.out.println("La lista mide: " + animales.size());
        imprimirLista(animales);

        String animalIndex = animales.get(1);
        System.out.println(animalIndex);

        animales.add(1, "Perro");
        imprimirLista(animales);
        animales.remove(0);
        imprimirLista(animales);
        System.out.println(animales.get(animales.size() - 1));
    }
}
