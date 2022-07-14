package com.example;

class Variables {
    private static final String EL_NUMERO1_VALE = "El numero1 vale :";

    public static void main(String[] args) {
        int numero1 = 2;
        int numero2 = 3 + numero1;
        double numero3 = 3.0 / numero1;
        long numero4 = 123456788;
        short numero5 = 12;
        double numero6 = 1223445.65;
        boolean resultado = numero1 < numero2;
        boolean tipobool = true;
        char letra = 'a'; // Solo una letra
        String cadena = "Otra cosa";

        System.out.println(EL_NUMERO1_VALE + " " + cadena);
        System.out.println("El numero2 vale : " + numero2);
        System.out.println("El numero3 vale : " + numero3);
        System.out.println("El numero4 vale : " + numero4);
        System.out.println("El numero5 vale : " + numero5);
        System.out.println("El numero6 vale : " + numero6);
        System.out.println("El resultado es  : " + resultado);
        System.out.println("El resultado de tipobool es  : " + tipobool);
        System.out.println("El char vale : " + letra);
        System.out.println("Cadena vale : " + cadena);

        
    }
}
