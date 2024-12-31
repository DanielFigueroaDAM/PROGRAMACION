package org.example;

/**
 * Programa que imprime cada carácter de una cadena de texto en líneas separadas.
 *
 * Funcionalidad:
 * - Almacena una cadena de texto.
 * - Recorre la cadena y muestra cada carácter en una nueva línea.
 *
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
public class Boletin8_ej2 {
    public static void main(String[] args) {
        // Declara una variable String con el valor "Java"
        String text = "Java";

        // Recorre cada carácter de la cadena de texto y lo imprime en una nueva línea
        for(int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }
}
