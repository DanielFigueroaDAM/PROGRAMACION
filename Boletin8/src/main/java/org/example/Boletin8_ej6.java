package org.example;

/**
 * Programa que manipula una cadena de texto eliminando espacios.
 *
 * Funcionalidad:
 * - Almacena una cadena de texto.
 * - Encuentra el índice de la primera aparición de un carácter específico.
 * - Copia partes de la cadena y las une.
 * - Imprime la cadena resultante.
 *
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
public class Boletin8_ej6 {
    public static void main(String[] args) {
        // Declara una variable String con el valor "www. javadende0. com"
        String text = "www. javadende0. com";

        // Encuentra el índice de la primera aparición del carácter 'd'
        int indiceText = text.indexOf('d');

        // Copia partes de la cadena desde el inicio hasta el índice y desde el índice hasta el final
        String copiedStartText = text.substring(0, indiceText);
        String copiedEndText = text.substring(indiceText, text.length());

        // Une las partes copiadas de la cadena
        String newText = copiedStartText + copiedEndText;

        // Imprime la cadena resultante
        System.out.println(newText);
    }
}
