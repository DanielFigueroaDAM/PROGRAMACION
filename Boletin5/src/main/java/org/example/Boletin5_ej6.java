package org.example;

import java.util.Scanner;
/**
 * Programa que calcula el factorial de un número entero ingresado por el usuario.
 * Muestra el proceso de cálculo multiplicando desde el número ingresado hasta 1.
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
public class Boletin5_ej6 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int n, contador = 1; // 'n' guarda el número ingresado, 'contador' almacena el factorial

        System.out.println("Dime un numero para realizar su factorial ");
        n = tec.nextInt(); // Lee el número ingresado por el usuario

        System.out.print(n + "!=");

        // Bucle para calcular el factorial de 'n'
        for (int i = n; i >= 1; i--) {
            // Imprime el número seguido de "x" (o solo el número si es el último)
            if (i == 1) {
                System.out.print(i); // Último número sin "x"
            } else {
                System.out.print(i + "x"); // Imprime número seguido de "x"
            }
            contador = contador * i; // Multiplica para acumular el factorial
        }

        System.out.print("=" + contador); // Imprime el resultado final del factorial
    }
}
