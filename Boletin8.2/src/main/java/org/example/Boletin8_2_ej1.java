/*
 * Autor: Daniel Figueroa
 * Versión: 1.0
 * Descripción: Programa para realizar múltiples operaciones de manipulación de cadenas.
 *              Ejemplo: Con entrada "paco", se muestran subcadenas y transformaciones.
 */

package org.example;

public class Boletin8_2_ej1 {
    public static void main(String[] args) {
        String cadea = "paco";  // Cadena de entrada para las operaciones

        // Ejecutar todas las operaciones definidas
        dosPrimerosCaracteres(cadea);
        dosPrimerosCaracteresManual(cadea);
        System.out.println(" ");  // Separador visual
        dosPrimerosCaracteresArray(cadea);
        tresUltimosCaracteres(cadea);
        cadaDosCaracteres(cadea);
        mostrarinverso(cadea);
    }

    // Método 1: Obtiene los dos primeros caracteres con substring()
    public static void dosPrimerosCaracteres(String cadea){
        System.out.println(cadea.substring(0, 2));  // Subcadena desde índice 0 a 2 (exclusivo)
    }

    // Método 2: Obtiene los dos primeros caracteres con acceso manual por índice
    public static void dosPrimerosCaracteresManual(String cadea){
        for(int i=0;i<2;i++){
            System.out.print(cadea.charAt(i));  // Imprime carácter por carácter
        }
    }

    // Método 3: Obtiene los dos primeros caracteres usando un array de caracteres
    public static void dosPrimerosCaracteresArray(String cadea){
        char[] charArray = cadea.toCharArray();  // Convierte String a array
        for(int i=0;i<2;i++){
            System.out.print(charArray[i]);  // Acceso directo al array
        }
        System.out.println(" ");  // Salto de línea adicional
    }

    // Método 4: Obtiene los últimos tres caracteres (requiere cadena de al menos 3 caracteres)
    public static void tresUltimosCaracteres(String cadea){
        System.out.println(cadea.substring(cadea.length()-3,cadea.length()));  // Subcadena de los últimos 3
    }

    // Método 5: Imprime caracteres en posiciones pares (0, 2, 4...)
    public static void cadaDosCaracteres(String cadea){
        for(int i=0;i<cadea.length();i=i+2){
            System.out.print(cadea.charAt(i));  // Step de 2 en el loop
        }
        System.out.println(" ");  // Salto de línea
    }

    // Método 6: Muestra cadena original + su inversa (ej: "paco" → "pacoocap")
    public static void mostrarinverso(String cadea){
        System.out.print(cadea);  // Cadena original
        for(int i=cadea.length()-1;i>=0;i--){
            System.out.print(cadea.charAt(i));  // Caracteres en orden inverso
        }
    }
}