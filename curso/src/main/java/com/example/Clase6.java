package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Clase6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            if (i == 20) {
                break;
            }
        }
        int numeroHijos = -1;
        // Forma 1
        /*
         * while (numeroHijos < 0) {
         * System.out.print("¿Cuantos hijos tienes? ");
         * try {
         * numeroHijos = scanner.nextInt();
         * } catch (InputMismatchException e) {
         * System.out.println("Introduzca un número válido de hijos");
         * }
         * scanner.nextLine(); // Eliminar el ENTER extra
         * }
         */

        // Forma 2
        do {
            System.out.print("¿Cuantos hijos tienes? ");
            try {
                numeroHijos = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Introduzca un número válido de hij@s.");
            }
            scanner.nextLine(); // Eliminar el ENTER extra
        } while (numeroHijos < 0);

        System.out.printf("Tienes %d hijos %n", numeroHijos);
        scanner.close();
    }
}
