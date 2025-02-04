/*
 * Autor: Daniel Figueroa
 * Versión: 1.0
 * Descripción: Programa para formatear un número agregando puntos como separadores de miles.
 *              Ejemplo: Con entrada "10000000", la salida será "10.000.000".
 */

package org.example;

public class Boletin8_2_ej4 {
    public static void main(String[] args) {
        String numero = "10000000";  // Número de entrada a formatear
        String numeroConPuntos = "";

        // Caso 1: La longitud del número es divisible exactamente por 3 (ej: 6, 9, 12 dígitos)
        if(numero.length() % 3 ==0){
            int contador=0;  // Cuenta los dígitos procesados para insertar puntos
            for(int i=0;i<numero.length();i++){
                numeroConPuntos += numero.charAt(i);
                contador++;
                // Inserta punto cada 3 dígitos, excepto al final
                if(contador==3 && i!=numero.length()-1){
                    numeroConPuntos+=".";
                    contador=0;  // Reinicia contador después del punto
                }
            }
            System.out.println(numeroConPuntos);
        }

        // Caso 2: La longitud deja residuo 2 al dividir por 3 (ej: 5, 8, 11 dígitos)
        else if(numero.length() % 3==2){
            int contador=0;
            boolean valid=true;  // Flag para manejar el primer grupo de 2 dígitos
            for(int i=0;i<numero.length();i++){
                numeroConPuntos += numero.charAt(i);
                contador++;
                // Primer grupo de 2 dígitos (solo se ejecuta una vez)
                if(contador==2 && valid && i!=numero.length()-1){
                    numeroConPuntos+=".";
                    contador=0;
                    valid=false;  // Desactiva el flag después del primer grupo
                }
                // Grupos posteriores de 3 dígitos
                if(contador==3 && i!=numero.length()-1){
                    numeroConPuntos+=".";
                    contador=0;
                }
            }
            System.out.println(numeroConPuntos);
        }

        // Caso 3: La longitud deja residuo 1 al dividir por 3 (ej: 4, 7, 10 dígitos)
        else if(numero.length() % 3==1){
            int contador=0;
            boolean valid=true;  // Flag para manejar el primer grupo de 1 dígito
            for(int i=0;i<numero.length();i++){
                numeroConPuntos += numero.charAt(i);
                contador++;
                // Primer grupo de 1 dígito (solo se ejecuta una vez)
                if(contador==1 && valid && i!=numero.length()-1){
                    numeroConPuntos+=".";
                    contador=0;
                    valid=false;  // Desactiva el flag después del primer grupo
                }
                // Grupos posteriores de 3 dígitos
                if(contador==3 && i!=numero.length()-1){
                    numeroConPuntos+=".";
                    contador=0;
                }
            }
            System.out.println(numeroConPuntos);
        }
    }
}