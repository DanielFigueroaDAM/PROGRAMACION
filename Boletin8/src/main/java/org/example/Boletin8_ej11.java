package org.example;

/**
 * Programa que analiza una cadena de texto y cuenta letras, números y espacios.
 *
 * Funcionalidad:
 * - Almacena una cadena de texto.
 * - Llama a un método para analizar el texto y contar letras, números y espacios.
 *
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
public class Boletin8_ej11 {
    public static void main(String[] args) {
        // Declara una variable String con el valor "Ola, son alumno de DAM1, e son programador desde o 2024"
        String texto = "Ola, son alumno de DAM1, e son programador desde o 2024";

        // Llama al método analizarTexto para analizar el contenido de la cadena
        analizarTexto(texto);
    }

    /**
     * Método que analiza una cadena de texto y cuenta letras, números y espacios.
     *
     * @param string La cadena de texto a analizar.
     */
    public static void analizarTexto(String string) {
        int numeroLetras = 0, numeroNumeros = 0, numeroEspacios = 0;

        // Recorre cada carácter de la cadena de texto y cuenta letras, números y espacios
        for (char c : string.toCharArray()) {
            if (Character.isLetter(c)) {
                numeroLetras++;
            } else if (Character.isDigit(c)) {
                numeroNumeros++;
            } else if (Character.isWhitespace(c)) {
                numeroEspacios++;
            }
        }
    }
}
