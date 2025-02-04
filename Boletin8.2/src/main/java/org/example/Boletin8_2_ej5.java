/**
 * Clase para demostrar diferentes operaciones de manipulación de cadenas:
 * 1. Extraer iniciales de cada palabra
 * 2. Capitalizar la primera letra de cada palabra
 * 3. Filtrar palabras que comienzan con 'A/a'
 *
 * @author Daniel Figueroa
 * @version 1.0
 */
package org.example;

public class Boletin8_2_ej5 {
    public static void main(String[] args) {
        String text = "republica de Argentina";
        System.out.println(iniciales(text));    // Output: "rda"
        System.out.println(mayusculas(text));   // Output: "Republica De Argentina"
        System.out.println(letrasA(text));      // Output: "Argentina " (con espacio final)
    }

    /**
     * Extrae la primera letra de cada palabra en la cadena.
     * - Asume que las palabras están separadas por un único espacio
     * - No maneja casos con espacios múltiples o palabras vacías
     *
     * @param text Cadena de entrada (ej: "hola mundo")
     * @return Iniciales concatenadas (ej: "hm")
     */
    public static String iniciales(String text) {
        String iniciales = "";
        String[] palabras = text.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            iniciales += palabras[i].charAt(0);  // Fallará si hay palabras vacías
        }
        return iniciales;
    }

    /**
     * Capitaliza la primera letra de cada palabra, manteniendo el resto del texto original.
     * - Preserva mayúsculas existentes en medio de palabras (ej: "hEllo" → "HEllo")
     * - Añade espacio después de cada palabra excepto la última
     *
     * @param text Cadena de entrada (ej: "republica de")
     * @return Cadena capitalizada (ej: "Republica De")
     */
    public static String mayusculas(String text) {
        String mayusculas = "";
        String[] palabras = text.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            char inicial = Character.toUpperCase(palabras[i].charAt(0));
            String resto = palabras[i].substring(1);  // Funciona incluso si length=1 (substring(1,1) = "")
            mayusculas += inicial + resto;
            mayusculas += (i != palabras.length - 1) ? " " : "";  // Evita espacio final
        }
        return mayusculas;
    }

    /**
     * Filtra palabras que comienzan con 'A' o 'a'.
     * - Incluye un espacio después de cada palabra coincidente
     * - Resultado podría tener espacio final no deseado (ej: "a1 a2 " → necesita trim())
     *
     * @param text Cadena de entrada (ej: "Argentina alto")
     * @return Palabras filtradas concatenadas con espacios (ej: "Argentina alto ")
     */
    public static String letrasA(String text) {
        String letrasA = "";
        String[] palabras = text.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            char primeraLetra = palabras[i].charAt(0);
            if (primeraLetra == 'a' || primeraLetra == 'A') {
                letrasA += palabras[i] + " ";  // Espacio añadido siempre, incluso al final
            }
        }
        return letrasA;
    }
}
