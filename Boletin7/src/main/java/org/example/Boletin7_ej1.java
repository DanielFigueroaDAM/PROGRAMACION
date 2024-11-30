package org.example;

/**
 * Genera un arreglo de números aleatorios y los muestra en el orden en que se generaron
 * y en orden inverso.
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */

public class Boletin7_ej1 {

    public static void main(String[] args) {
        // Declaración del arreglo para almacenar los números
        int[] numeros;

        // Inicialización del arreglo con una longitud de 6
        numeros = new int[6];

        // Rellena el arreglo con números aleatorios entre 0 y 50
        for (int i = 0; i < numeros.length; i++) {
            // Genera un número aleatorio y lo asigna a la posición actual del arreglo
            numeros[i] = (int) (Math.random() * 51);

            // Muestra el número generado en la consola
            System.out.println(numeros[i]);
        }

        // Imprime una línea separadora
        System.out.println("----");

        // Recorre el arreglo en orden inverso y muestra los números
        for (int i = numeros.length - 1; i >= 0; i--) {
            // Imprime el número actual en orden inverso
            System.out.println(numeros[i]);
        }
    }
}
