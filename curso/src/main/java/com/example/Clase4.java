package com.example;

import java.util.Locale;
import java.util.Scanner;

public class Clase4 {

    public static void main(String[] args) {
        // %d = Entero
        // %f = Flotante
        System.out.print("Ingrese un número: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        double division = numero / 3.0;
        System.out.printf("EL número es :%d, Su doble es :%d , Sumado 120 es :%d, Dividido es :%,2.5f, " +
                "El siguiente número es %d \n",
                numero,
                (numero * 2),
                (120 + numero),
                division,
                numero);
                System.out.printf("Su cuadrado es: %d %n", numero * numero);
                System.out.printf(Locale.US,"Su cuadrado es: %f %n", Math.pow(numero, 2));
        scanner.close();
    }
}
