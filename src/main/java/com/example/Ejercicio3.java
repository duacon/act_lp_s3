package com.example;

public class Ejercicio3 {
    public static void ejercicio3() {
    System.out.println("Ejercicio 3");
        
    int contador = 5;

    System.out.println("Valor inicial de contador: " + contador);

    System.out.println("Pre-incremento (++contador): " + (++contador)); 
    System.out.println("Post-incremento (contador++): " + (contador++));
    System.out.println("Pre-decremento (--contador): " + (--contador));
    System.out.println("Post-decremento (contador--): " + contador--);
    }
}
// Pre (++x o --x): Cambia el número primero y después lo muestra o lo usa.
// Post (x++ o x--): Muestra o usa el número primero y después lo cambia.
