package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Clase10 {
    public static void main(String[] args) {
        // Acceder a un elemento por su nombre
        Map<String, AnimalZoologico> animalesMap = new HashMap<>();
        //Map<String, AnimalZoologico> animalesMap = new TreeMap<>();
        Leon simba = new Leon("Simba", "amarillo");
        Leon mufasa = new Leon("Mufasa", "Cafe");
        Leon alex = new Leon("Alex", "Cafe");

        animalesMap.put("Simba", simba);
        animalesMap.put("Mufasa", mufasa);
        animalesMap.put("Alex", alex);

        AnimalZoologico buscado = animalesMap.get("Simba");
        System.out.println("Buscado: " + buscado.getNombre() + " " + buscado.getColor());
        System.out.println(animalesMap.toString());
        if (animalesMap.containsKey("Mufasa")) {
            System.out.println("Existe");
        } else {
            System.out.println("No Existe");
        }

        for (String Key : animalesMap.keySet()) {
            AnimalZoologico animal = animalesMap.get(Key);
            System.out.println("Hola, soy : " + animal.getNombre());
        }

        List<String> setAnimales = new ArrayList<>();
        setAnimales.add("Leon");
        setAnimales.add("Elefante");
        setAnimales.add("Jirafa");
        setAnimales.add("Oso");
        setAnimales.add("Oso");

        Collections.sort(setAnimales);

        for (String elemento : setAnimales) {
            System.out.println("--> " + elemento);
        }

    }
}
