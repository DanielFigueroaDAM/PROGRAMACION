package org.example;

/**
 * Determinar si un número ingresado por el usuario es positivo, negativo o cero.
 * El programa solicita un número, luego evalúa su valor e imprime el resultado en pantalla.
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
import java.util.Scanner;

public class Boletin3_ej1 {
    public static void main(String[] args) {
        // Creación del objeto Scanner para leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);

        // Declaración de variable para almacenar el número ingresado
        int a;

        // Solicita al usuario un número
        System.out.println("Dime un número");
        a = teclado.nextInt();

        // Evalúa si el número es positivo, negativo o cero
        if (a > 0) {
            System.out.println(a + " es positivo");
        } else if (a == 0) {
            System.out.println("El número es 0");
        } else {
            System.out.println(a + " es negativo");
        }

        // Cierra el objeto Scanner para liberar recursos
        teclado.close();
    }
}
