package org.example; // Declaración del paquete

/**
 * Boletin8_2_ej12
 *
 * Esta clase contiene un programa que analiza una cadena de texto, contando el número de palabras,
 * el número de letras y determinando la palabra más larga.
 *
 * @author Daniel Figueroa
 * @version 1.0
 */
public class Boletin8_2_ej12 {

    /**
     * Método principal que ejecuta el programa.
     *
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        String cadea = "Holassssssssssssssssssssssssssssssssss holasss hol Holasassssssssss";
        analizador(cadea);
    }

    /**
     * Método que analiza una cadena de texto.
     *
     * @param cadea La cadena de texto a analizar
     */
    public static void analizador(String cadea) {
        // Pasar a array
        String[] palabras = cadea.split(" ");
        // Contar palabras
        System.out.println("Numero de palabras: " + palabras.length);
        // Contar letras y determinar la palabra más larga
        int contadorLetras = 0;
        String palabraMasLarga = "";
        for (int i = 0; i < cadea.length(); i++) {
            if (cadea.charAt(i) != ' ') {
                contadorLetras++;
            }
        }
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > palabraMasLarga.length()) {
                palabraMasLarga = palabras[i];
            }
        }
        System.out.println("Numero de letras: " + contadorLetras);
        System.out.println("Palabra mas larga: " + palabraMasLarga);
    }
}










