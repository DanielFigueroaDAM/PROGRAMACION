/*
 * Autor: Daniel Figueroa
 * Versión: 1.0
 * Descripción: Programa para operaciones de manipulación de cadenas:
 *              - Extraer consonantes
 *              - Extraer vocales
 *              - Rotar vocales a siguiente en secuencia
 *              - Verificar palíndromo
 */

package org.example;

public class Boletin8_2_ej6 {
    public static void main(String[] args) {
        String cadea = "algoritmo";
        System.out.println(consonantes(cadea));    // Output: "lgrthm"
        System.out.println(vocales(cadea));        // Output: "aioo"
        System.out.println(siguienteVocal(cadea)); // Output: "elguritmu"
        System.out.println(palindromo("hola"));    // Output: false
    }

    /**
     * Extrae TODAS las consonantes de la cadena ignorando vocales.
     * - Solo considera vocales minúsculas sin acentos
     * - No maneja mayúsculas o caracteres especiales (ñ, ç)
     */
    public static String consonantes(String cadea) {
        String consonantes = "";
        for (int i = 0; i < cadea.length(); i++) {
            char c = cadea.charAt(i);
            // Filtra solo caracteres NO vocales (sistema simple)
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                consonantes += c;
            }
        }
        return consonantes;
    }

    /**
     * Extrae TODAS las vocales de la cadena.
     * - Similar limitación: solo vocales minúsculas básicas
     */
    public static String vocales(String cadea) {
        String vocales = "";
        for (int i = 0; i < cadea.length(); i++) {
            char c = cadea.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vocales += c;
            }
        }
        return vocales;
    }

    /**
     * Rota cada vocal a la siguiente en la secuencia (a→e, e→i,..., u→a).
     * - Mantiene caracteres originales para no vocales
     * - No afecta mayúsculas o vocales acentuadas
     */
    public static String siguienteVocal(String cadea) {
        String siguienteVocal = "";
        for (int i = 0; i < cadea.length(); i++) {
            char c = cadea.charAt(i);
            switch (c) {  // Solo aplica a vocales minúsculas
                case 'a': siguienteVocal += 'e'; break;
                case 'e': siguienteVocal += 'i'; break;
                case 'i': siguienteVocal += 'o'; break;
                case 'o': siguienteVocal += 'u'; break;
                case 'u': siguienteVocal += 'a'; break;
                default:  siguienteVocal += c;   // Conserva otros caracteres
            }
        }
        return siguienteVocal;
    }

    /**
     * Verifica si una cadena es palíndromo (se lee igual al revés).
     * - Ignora espacios y diferencias de mayúsculas
     * - Simplifica algunos caracteres acentuados (á→a, é→e,...)
     * - No limpia otros símbolos (!, ¿, etc.)
     */
    public static boolean palindromo(String cadea) {
        // Normalización básica
        String minus = cadea.toLowerCase();
        String limpia = minus.replaceAll(" ", "");  // Elimina solo espacios

        // Reemplazo de vocales acentuadas (cobertura limitada)
        String limpia2 = "";
        for (int i = 0; i < limpia.length(); i++) {
            char c = limpia.charAt(i);
            switch (c) {
                case 'á': c = 'a'; break;
                case 'é': c = 'e'; break;
                case 'í': c = 'i'; break;
                case 'ó': c = 'o'; break;
                case 'ú': c = 'u'; break;
            }
            limpia2 += c;
        }

        // Creación de versión inversa
        String inversa = new StringBuilder(limpia2).reverse().toString();

        return limpia2.equals(inversa);  // Comparación final
    }
}