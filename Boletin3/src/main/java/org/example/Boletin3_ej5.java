package org.example;

/**
 * Determinar cuál de tres números ingresados por el usuario es el mayor.
 * El programa solicita tres números y evalúa cuál es el mayor,
 * mostrando el resultado en pantalla.
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
import java.util.Scanner;

public class Boletin3_ej5 {
    public static void main(String[] args) {
        // Creación del objeto Scanner para leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);

        // Declaración de variables para los tres números
        int n1, n2, n3;

        // Solicita al usuario el primer número
        System.out.println("Dime el primer número");
        n1 = teclado.nextInt();

        // Solicita al usuario el segundo número
        System.out.println("Dime el segundo número");
        n2 = teclado.nextInt();

        // Solicita al usuario el tercer número
        System.out.println("Dime el tercer número");
        n3 = teclado.nextInt();

        // Determina cuál de los tres números es el mayor
        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("El primer número es el mayor");
            } else if (n1 < n3) {
                System.out.println("El tercer número es el mayor");
            } else {
                System.out.println("El primer y el tercer número son iguales y son los mayores");
            }
        } else if (n2 > n1) {
            if (n2 > n3) {
                System.out.println("El segundo número es el mayor");
            } else if (n2 < n3) {
                System.out.println("El tercer número es el mayor");
            } else {
                System.out.println("El segundo y el tercer número son iguales y son los mayores");
            }
        } else {
            if (n1 == n3) {
                System.out.println("Todos los números son iguales");
            } else {
                System.out.println("El tercer número es el mayor");
            }
        }

        // Cierra el objeto Scanner para liberar recursos
        teclado.close();
    }
}
