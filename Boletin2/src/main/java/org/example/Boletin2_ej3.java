package org.example;
/**
 * Conversor de euros a dólares, basado en una tasa de cambio fija.
 * El programa solicita una cantidad en euros, la convierte a dólares y muestra el resultado.
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
import java.util.Scanner;

public class Boletin2_ej3 {

    public static void main(String[] args) {
        // Creación del objeto Scanner para leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);

        // Declaración de variables para la cantidad en euros, la tasa de cambio y el resultado en dólares
        double euros, cambio, dolares;

        // Asignación de una tasa de cambio fija
        cambio = 1.1071; // <-- esa cantidad representa el cambio actual de euros a dólares

        // Solicita al usuario la cantidad en euros
        System.out.println("Dame la cantidad en euros");
        euros = teclado.nextDouble();

        // Calcula el equivalente en dólares
        dolares = euros * cambio;

        // Muestra el resultado en pantalla
        System.out.println("El cambio sería " + dolares + " en dólares");

        // Cierra el objeto Scanner para liberar recursos
        teclado.close();
    }
}
