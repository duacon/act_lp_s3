package com.example;

public class Ejercicio2 {
    public static void ejercicio2() {
        System.out.println("Ejercicio 2");

        int a = 10;
        int b = 3;

        int divisionEntera = a / b;

        double divisionDecimal = (double) a / b;

        double x = 15.5;
        double y = 4.2;

        double divisionDecimales = x / y;

        System.out.println("divisionEntera (a / b) = " + divisionEntera);
        System.out.println("divisionDecimal ((double) a / b) = " + divisionDecimal);
        System.out.println("divisionDecimales (x / y) = " + divisionDecimales);
    }
}
 
    // divisionEntera solo muestra la parte entera del resultado.
    // divisionDecimal muestra el resultado con decimales porque 'a' se convierte a double.
    // divisionDecimales también muestra decimales porque ambos operandos son double.