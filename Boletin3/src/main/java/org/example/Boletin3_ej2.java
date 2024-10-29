package org.example;

/**
 * Realizar operaciones aritméticas básicas (suma y resta) entre dos números enteros cortos.
 * El programa solicita dos números al usuario y muestra el resultado de la suma y, si corresponde,
 * de la resta del primer número menos el segundo.
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
import java.util.Scanner;

public class Boletin3_ej2 {
    public static void main(String[] args) {
        // Creación del objeto Scanner para leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);

        // Declaración de variables para los números y los resultados de las operaciones
        short a, b, resta, suma;

        // Solicita al usuario el primer número
        System.out.println("Dime un número");
        a = teclado.nextShort();

        // Solicita al usuario el segundo número
        System.out.println("Dime un número");
        b = teclado.nextShort();

        // Calcula la suma de ambos números
        suma = (short)(a + b);

        // Si el primer número es mayor o igual al segundo, calcula la resta
        if (a >= b) {
            resta = (short)(a - b);
            System.out.println("La resta es " + resta);
        }

        // Muestra el resultado de la suma en pantalla
        System.out.println("La suma es " + suma);

        // Cierra el objeto Scanner para liberar recursos
        teclado.close();
    }
}
