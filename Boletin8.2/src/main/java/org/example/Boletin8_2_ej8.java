/**
 * Clase para convertir una cadena binaria a su equivalente decimal.
 *
 * @author Daniel Figueroa
 * @version 1.0
 */
package org.example;

public class Boletin8_2_ej8 {
    public static void main(String[] args) {
        String binario = "1010";
        System.out.println(binarioADecimal(binario)); // Output: 10
    }

    /**
     * Convierte una cadena binaria a número decimal.
     * - Valida caracteres binarios ('0'/'1')
     * - Retorna -1 para entradas inválidas (caracteres no binarios, null o vacías)
     *
     * @param binario Cadena binaria (ej: "1010")
     * @return Valor decimal equivalente o -1 si hay error
     */
    public static int binarioADecimal(String binario) {
        // Validación de entrada
        if (binario == null || binario.isEmpty()) {
            return -1;
        }

        int decimal = 0;
        int longitud = binario.length();

        for (int i = 0; i < longitud; i++) {
            char c = binario.charAt(i);

            // Verificar carácter válido
            if (c != '0' && c != '1') {
                return -1;
            }

            // Calcular valor decimal del bit actual
            if (c == '1') {
                try {
                    decimal += Math.pow(2, longitud - 1 - i);
                } catch (ArithmeticException e) {
                    return -1; // Overflow detectado
                }
            }
        }
        return decimal;
    }
}