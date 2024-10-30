package org.example;

import java.util.Scanner;

/**
 * Muestra los números comprendidos entre dos números dados.
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */

public class Boletin6_ej1 {
    public static void main(String[] args) {
        // Creación del objeto Scanner para leer entrada del usuario
        Scanner teclado = new Scanner(System.in);

        // Recoge los dos números ingresados por el usuario
        int nu1 = num1(teclado);
        int nu2 = num2(teclado);

        // Llama al método para mostrar los números comprendidos entre ambos
        numeros(nu1, nu2);
    }

    /**
     * Solicita y recoge el primer número ingresado por el usuario.
     * @since v1.0
     * @param teclado Objeto Scanner para la entrada de datos.
     * @return Primer número ingresado por el usuario.
     */
    static int num1(Scanner teclado) {
        System.out.println("Dime el primer número ");
        return teclado.nextInt();
    }

    /**
     * Solicita y recoge el segundo número ingresado por el usuario.
     * @since v1.0
     * @param teclado Objeto Scanner para la entrada de datos.
     * @return Segundo número ingresado por el usuario.
     */
    static int num2(Scanner teclado) {
        System.out.println("Dime el segundo número ");
        return teclado.nextInt();
    }

    /**
     * Muestra los números comprendidos entre dos números dados.
     * Si el primer número es menor que el segundo, muestra los números ascendentes.
     * Si el primer número es mayor que el segundo, muestra los números descendentes.
     * @param nume1 Primer número ingresado.
     * @param nume2 Segundo número ingresado.
     */
    static void numeros(int nume1, int nume2) {
        if (nume1 < nume2) {
            // Bucle para mostrar los números entre nume1 y nume2 en orden ascendente
            for (int i = nume1 + 1; i < nume2; i++) {
                System.out.println(i);
            }
        } else {
            // Bucle para mostrar los números entre nume2 y nume1 en orden ascendente
            for (int i = nume2 + 1; i < nume1; i++) {
                System.out.println(i);
            }
        }
    }
}
