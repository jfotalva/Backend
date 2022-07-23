package com.example;

import java.util.Scanner;

public class Clase5 {

    /**
     *
     */
    private static final String AGRADECIMIENTO = "Gracias. En breve recibirá información de su viaje a %s para %d personas . A un costo de $%,2.2f %n";

    public static void main(String[] args) {
        System.out.println("*** Hola, Bienvenido a viajes américa ***");
        System.out.print("Indique su destino: ");
        Scanner scanner = new Scanner(System.in);
        String destino = scanner.nextLine();
        System.out.print("Indique el número de pasajeros: ");
        int numeroPersonas = scanner.nextInt();
        scanner.nextLine(); // Eliminar el ENTER extra
        boolean enPareja = false;
        if (numeroPersonas == 2) {
            System.out.print("¿Viaja usted en pareja? (S/N): ");
            String respuesta = scanner.nextLine();
            respuesta = respuesta.toUpperCase();

            // Forma 1
            /*
             * if (respuesta.equals("S")) {
             * enPareja = true;
             * } else {
             * enPareja = false;
             * }
             */

            // Forma 2 (? --> Operador ternario)
            // enPareja = respuesta.equals("S") ? true : false;

            // Forma 3
            enPareja = respuesta.equals("S");

        } else {
            System.err.println("No son dos personas");
        }

        System.out.println("Seleccione el tipo de habitación: ");
        System.out.println("1. - Standard ($2.000)");
        System.out.println("2. - Master Suite ($4.000)");
        System.out.println("3. - Suite Presidencial ($20.000)");
        int tipoHab = scanner.nextInt();
        scanner.nextLine(); // Eliminar el ENTER extra
        double monto = 0;
        // Forma 1
        /*
         * if (tipoHab == 1) {
         * monto = 2000;
         * } else if (tipoHab == 2) {
         * monto = 4000;
         * } else if (tipoHab == 3) {
         * monto = 20000;
         * }
         */

        // Forma 2
        switch (tipoHab) {
            case 1:
                monto = 2000;
                break;
            case 2:
                monto = 4000;
                break;
            case 3:
                monto = 20000;
                break;
            default:
                monto = 0;
                break;
        }

        System.out.printf(AGRADECIMIENTO,
                destino, numeroPersonas, monto);

        if (enPareja) {
            System.out.println("¡¡¡ Usted y su pareja la pasaran muy bien !!!");
        }
        scanner.close();
    }
}
