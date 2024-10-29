package org.example;

/**
 * Comparar el peso entre dos personas y mostrar quién pesa más.
 * El programa solicita el nombre y el peso de dos personas,
 * y luego muestra cuál de ellas pesa más junto con la diferencia de peso.
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
import java.util.Scanner;

public class Boletin3_ej4 {
    public static void main(String[] args) {
        // Creación del objeto Scanner para leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);

        // Declaración de variables para los nombres y pesos de las personas
        double p1, p2, dif;
        String nom1, nom2;

        // Solicita el nombre de la primera persona
        System.out.println("Dime el nombre de la primera persona");
        nom1 = teclado.nextLine();

        // Solicita el peso de la primera persona
        System.out.println("Ahora dime su peso");
        p1 = teclado.nextDouble();
        teclado.nextLine(); // Consume la línea pendiente

        // Solicita el nombre de la segunda persona
        System.out.println("Dime el nombre de la segunda persona");
        nom2 = teclado.nextLine();

        // Solicita el peso de la segunda persona
        System.out.println("Ahora dime su peso");
        p2 = teclado.nextDouble();
        teclado.nextLine(); // Consume la línea pendiente

        // Compara los pesos y muestra el resultado correspondiente
        if (p1 < p2) {
            dif = p2 - p1;
            System.out.println("La que pesa más es " + nom2 + ", su peso es " + p2 + " y la diferencia es " + dif);
        } else if (p2 < p1) {
            dif = p1 - p2;
            System.out.println("La que pesa más es " + nom1 + ", su peso es " + p1 + " y la diferencia es " + dif);
        } else {
            System.out.println("Ambas personas pesan lo mismo.");
        }

        // Cierra el objeto Scanner para liberar recursos
        teclado.close();
    }
}
