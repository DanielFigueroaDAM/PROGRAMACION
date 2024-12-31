package org.example;

/**
 * Programa que reemplaza caracteres en una cadena de texto.
 *
 * Funcionalidad:
 * - Almacena una cadena de texto.
 * - Reemplaza todas las apariciones de un carácter específico por otro.
 * - Imprime la cadena resultante.
 *
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
public class Boletin8_ej9 {
    public static void main(String[] args) {
        // Declara una variable String con el valor "Jeve jeve jeve"
        String text1 = "Jeve jeve jeve";

        // Reemplaza todas las apariciones del carácter 'e' por 'a'
        String text2 = text1.replaceAll("e", "a");

        // Imprime la cadena resultante
        System.out.println(text2);
    }
}
