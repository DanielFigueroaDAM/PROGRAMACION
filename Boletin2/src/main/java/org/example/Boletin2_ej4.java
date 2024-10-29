package org.example;
/**
 * Realizar operaciones aritméticas básicas (suma, resta y multiplicación) entre dos números.
 * El programa solicita dos números al usuario y muestra el resultado de la suma, resta y multiplicación de ambos.
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
import java.util.Scanner;

public class Boletin2_ej4 {
    public static void main(String[] args) {
        // Creación del objeto Scanner para leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);

        // Declaración de variables para los dos números y los resultados de las operaciones
        int numero1, numero2, suma, resta, producto;

        // Solicita al usuario el primer número
        System.out.println("Dime el número 1 ");
        numero1 = teclado.nextInt();

        // Solicita al usuario el segundo número
        System.out.println("Dime el número 2 ");
        numero2 = teclado.nextInt();

        // Realiza las operaciones aritméticas
        suma = numero2 + numero1;
        resta = numero1 - numero2;
        producto = numero1 * numero2;

        // Muestra los resultados de las operaciones
        System.out.println("La suma es " + suma);
        System.out.println("La resta es " + resta);
        System.out.println("La multiplicación es " + producto);

        // Cierra el objeto Scanner para liberar recursos
        teclado.close();
    }
}
