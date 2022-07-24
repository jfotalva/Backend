package com.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Clase9 {
    public static void imprimirLista(List<String> lista) {
        System.out.println("La lista es: ");
        for (String elemento : lista) {
            System.out.println("--> " + elemento);
        }
    }

    public static void imprimirStack(Stack<String> stack) {
        System.out.println("El stack es: ");
        for (String elemento : stack) {
            System.out.println("--> " + elemento);
        }
    }

    public static void imprimirSet(Set<String> set) {
        System.out.println("El set es: ");
        for (String elemento : set) {
            System.out.println("--> " + elemento);
        }
    }

    public static void main(String[] args) {
        // 
        List<String> animales = new ArrayList<>();
        animales.add("Leon");
        animales.add("Elefante");
        animales.add("Jirafa");
        animales.add("Oso");
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
        
        //Agregar y sacar cosas del final
        Stack<String> stackAnimales = new Stack<>();
        stackAnimales.push("Leon");
        stackAnimales.push("Elefante");
        stackAnimales.push("Jirafa");
        stackAnimales.push("Oso");
        stackAnimales.push("Oso");
        imprimirStack(stackAnimales);
        String ultimo = stackAnimales.pop();
        imprimirStack(stackAnimales);
        System.out.println("Último: " + ultimo);
        System.out.println(stackAnimales.peek());

        // Objetos no duplicados pero sin orden
        Set<String> setAnimales = new HashSet<String>();
        setAnimales.add("Leon");
        setAnimales.add("Elefante");
        setAnimales.add("Jirafa");
        setAnimales.add("Oso");
        setAnimales.add("Oso");
        imprimirSet(setAnimales);
    }
}
