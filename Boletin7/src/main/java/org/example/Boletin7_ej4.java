package org.example;

/**
 * Calcula la letra correspondiente a un número de DNI basado en el resto de dividir el número entre 23.
 * El programa utiliza un arreglo de caracteres que representa las letras del sistema de cálculo de DNI en España.
 *
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
public class Boletin7_ej4 {
    public static void main(String[] args) {
        // Arreglo con las letras correspondientes al sistema de DNI
        char[] letras = {
                'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
        };

        // Número de DNI proporcionado
        int dni = 55555555;

        // Cálculo del resto al dividir el DNI entre 23
        int resto = dni % 23;

        // Recorre el arreglo de letras para encontrar la que corresponde al resto
        for (int i = 0; i < letras.length; i++) {
            if (resto == i) {
                // Muestra la letra correspondiente al resto calculado
                System.out.println("La letra que equivale a ese número es: " + letras[i]);
            }
        }
    }
}
