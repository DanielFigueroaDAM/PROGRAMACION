package org.example;

/**
 * Programa que convierte una cadena de texto a mayúsculas y luego de nuevo a minúsculas.
 *
 * Funcionalidad:
 * - Almacena una cadena de texto.
 * - Convierte la cadena a mayúsculas y la imprime.
 * - Convierte la cadena en mayúsculas a minúsculas y la imprime.
 *
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
public class Boletin8_ej7 {
    public static void main(String[] args) {
        // Declara una variable String con el valor "javeros"
        String text = "javeros";

        // Convierte la cadena a mayúsculas y la imprime
        String textMayus = text.toUpperCase();
        System.out.println(textMayus);

        // Convierte la cadena en mayúsculas a minúsculas y la imprime
        String newMinusculas = textMayus.toLowerCase();
        System.out.println(newMinusculas);
    }
}
