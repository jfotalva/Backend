package com.example;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Clase3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingresa tu edad: ");
        try {
            int edad = scanner.nextInt();
            String buenosdias = "Buenos días";
            System.out.printf("Hola %s, gusto en conocerte. %s. Tienes %d Años %n", nombre, buenosdias, edad);
            System.out.printf("Hola %S, gusto en conocerte. %S. Tienes %S Años %n", nombre, buenosdias, edad);

        } catch (InputMismatchException e) {
            System.out.println("Hubo un error con la edad --> " + e.toString());
        }

        System.out.print("Ingresa un monto: ");
        double monto = scanner.nextDouble();
        System.out.printf(Locale.US, "Su monto por $%,2.2f fue aceptado.%n", monto);
        scanner.close();
    }
}
