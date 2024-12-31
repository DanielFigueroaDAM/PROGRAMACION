package org.example;

/**
 * Programa que imprime una cadena de texto en orden inverso.
 *
 * Funcionalidad:
 * - Almacena una cadena de texto.
 * - Recorre la cadena de texto desde el final hacia el principio e imprime cada carácter.
 *
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
public class Boletin8_ej3 {
    public static void main(String[] args) {
        // Declara una variable String con el valor "Java dende 0"
        String text = "Java dende 0";

        // Recorre la cadena de texto desde el final hacia el principio y imprime cada carácter
        for(int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }
}
