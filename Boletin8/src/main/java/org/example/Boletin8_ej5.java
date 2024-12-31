package org.example;

/**
 * Programa que cuenta el número de vocales y consonantes en una cadena de texto.
 *
 * Funcionalidad:
 * - Almacena una cadena de texto.
 * - Elimina los espacios en blanco y convierte la cadena a minúsculas.
 * - Recorre la cadena de texto y cuenta el número de vocales y consonantes.
 * - Imprime el número de vocales y consonantes.
 *
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
public class Boletin8_ej5 {
    public static void main(String[] args) {
        // Declara una variable String con el valor "java java java"
        String txt = "java java java";

        // Elimina los espacios en blanco y convierte la cadena a minúsculas
        txt = txt.replaceAll("\\s", "").toLowerCase();

        int vocalesCount = 0, consonatesCount = 0;

        // Recorre la cadena de texto y cuenta el número de vocales y consonantes
        for (char c : txt.toCharArray()) {
            if(Character.isLetter(c)) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vocalesCount++;
                }
                else {
                    consonatesCount++;
                }
            }
        }

        // Imprime el número de vocales y consonantes
        System.out.println("El número de vocales: " + vocalesCount);
        System.out.println("El número de consonantes: " + consonatesCount);
    }
}
