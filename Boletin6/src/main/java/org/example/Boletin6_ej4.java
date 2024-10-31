package org.example;

import java.util.Scanner;

/**
 * Convierte días, horas y minutos a segundos.
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */

public class Boletin6_ej4 {
    public static void main(String[] args) {
        // Inicialización del objeto Scanner para la entrada de datos
        Scanner teclado = new Scanner(System.in);

        // Solicita al usuario la cantidad de minutos
        System.out.println("Dime los minutos: ");
        int minutos = teclado.nextInt();

        // Solicita al usuario la cantidad de horas
        System.out.println("Dime las horas: ");
        int horas = teclado.nextInt();

        // Solicita al usuario la cantidad de días
        System.out.println("Dime los días: ");
        int dias = teclado.nextInt();

        // Llama a la función conversionseg para realizar la conversión a segundos
        int conversion = conversionseg(minutos, horas, dias);

        // Muestra el resultado de la conversión en segundos
        System.out.println("Los segundos son " + conversion);

        // Cierra el Scanner
        teclado.close();
    }

    /**
     * Convierte minutos, horas y días a segundos.
     * @param minutos1 La cantidad de minutos.
     * @param horas1 La cantidad de horas.
     * @param dias1 La cantidad de días.
     * @return El total de segundos resultante de la conversión.
     */
    static int conversionseg(int minutos1, int horas1, int dias1) {
        // Calcula el total de segundos a partir de minutos, horas y días
        return minutos1 * 60 + horas1 * 3600 + dias1 * 86400;
    }
}
