package org.example;

/**
 * Programa que elimina todos los espacios en blanco de una cadena de texto.
 *
 * Funcionalidad:
 * - Almacena una cadena de texto.
 * - Reemplaza todos los espacios en blanco en la cadena por una cadena vacía.
 * - Imprime la cadena resultante sin espacios en blanco.
 *
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
public class Boletin8_ej4 {
    public static void main(String[] args) {
        // Declara una variable String con el valor "James Gosling Created Java"
        String text = "James Gosling Created Java";

        // Reemplaza todos los espacios en blanco en la cadena por una cadena vacía
        text = text.replaceAll("\\s", "");

        // Imprime la cadena resultante sin espacios en blanco
        System.out.println(text);
    }
}
