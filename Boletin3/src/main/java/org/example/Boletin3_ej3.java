package org.example;

/**
 * Determinar el signo de un número ingresado por el usuario.
 * El programa solicita un número y muestra un símbolo según su valor:
 * '+' si es positivo, '0' si es cero, y '-' si es negativo.
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
import java.util.Scanner;

public class Boletin3_ej3 {
    public static void main(String[] args) {
        // Creación del objeto Scanner para leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);

        // Declaración de variable para almacenar el número ingresado
        int a;

        // Solicita al usuario un número
        System.out.println("Dime un número");
        a = teclado.nextInt();

        // Evalúa el signo del número y muestra el símbolo correspondiente
        if (a > 0) {
            System.out.println("+");
        } else if (a == 0) {
            System.out.println("0");
        } else {
            System.out.println("-");
        }

        // Cierra el objeto Scanner para liberar recursos
        teclado.close();
    }
}
