package org.example;

/**
 * Programa que convierte una cadena de texto a su representación ASCII.
 *
 * Funcionalidad:
 * - Almacena una cadena de texto.
 * - Convierte cada carácter de la cadena a su código ASCII.
 * - Imprime la representación ASCII de la cadena.
 *
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
public class Boletin8_ej10 {
    public static void main(String[] args) {
        // Declara una variable String con el valor "ABCD"
        String textNotAscii = "ABCD";

        // StringBuilder para construir la representación ASCII
        StringBuilder textAscii = new StringBuilder();

        // Convierte cada carácter de la cadena a su código ASCII
        for (char c : textNotAscii.toCharArray()) {
            textAscii.append((int) c).append(" ");
        }

        // Imprime la representación ASCII de la cadena
        System.out.println("Representación ASCII: " + textAscii.toString().trim());
    }
}
