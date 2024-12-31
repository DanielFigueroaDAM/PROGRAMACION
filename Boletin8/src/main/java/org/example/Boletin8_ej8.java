package org.example;

/**
 * Programa que compara dos cadenas de texto para verificar si son iguales.
 *
 * Funcionalidad:
 * - Almacena dos cadenas de texto.
 * - Compara las cadenas y muestra si son iguales o no.
 *
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
public class Boletin8_ej8 {
    public static void main(String[] args) {
        // Declara dos variables String con los valores "Java" y "JavaScript"
        String txt1 = "Java";
        String txt2 = "JavaScript";

        // Compara las dos cadenas de texto y muestra si son iguales o no
        if(txt1.equals(txt2)) {
            System.out.println("Son iguales");
        }
        else {
            System.out.println("No son iguales");
        }
    }
}
