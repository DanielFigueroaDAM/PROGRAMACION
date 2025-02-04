/**
 * Esta clase proporciona métodos para contar caracteres específicos y transformaciones en una cadena.
 * Incluye conteo de comas después de letras, espacios, dígitos y puntos insertados cada tres caracteres.
 *
 * @author Daniel Figueroa
 * @version 1.0
 */
package org.example;

public class Boletin8_2_ej2_1 {
    public static void main(String[] args) {
        String cadea = "Galicia esta en españa y estamos en 2025";
        System.out.println(comas(cadea));
        System.out.println(espacios(cadea));
        System.out.println(numeros(cadea));
        System.out.println(puntos(cadea));
    }

    /**
     * Cuenta cuántas comas se insertarían después de cada letra en la cadena.
     * Una coma se añade después de cada letra que no sea el último carácter.
     *
     * @param cadea Cadena de entrada a analizar
     * @return Número total de comas calculadas
     */
    public static int comas(String cadea) {
        String cadeaNueva = "";
        int comas = 0;
        for (int i = 0; i < cadea.length(); i++) {
            cadeaNueva = cadeaNueva + cadea.charAt(i);
            if (Character.isLetter(cadea.charAt(i))) {
                if (i != cadea.length() - 1) {
                    comas++;
                }
            }
        }
        return comas;
    }

    /**
     * Cuenta el número de espacios en blanco en la cadena.
     *
     * @param cadea Cadena de entrada a examinar
     * @return Cantidad de espacios encontrados
     */
    public static int espacios(String cadea) {
        String cadeaNueva = "";
        int contador = 0;
        for (int i = 0; i < cadea.length(); i++) {
            if (Character.isWhitespace(cadea.charAt(i))) {
                contador++;
            } else {
                cadeaNueva = cadeaNueva + cadea.charAt(i);
            }
        }
        return contador;
    }

    /**
     * Cuenta la cantidad de dígitos numéricos en la cadena.
     *
     * @param cadea Cadena de entrada a evaluar
     * @return Número total de dígitos detectados
     */
    public static int numeros(String cadea) {
        String cadeaNueva = "";
        int contador = 0;
        for (int i = 0; i < cadea.length(); i++) {
            if (Character.isDigit(cadea.charAt(i))) {
                contador++;
            } else {
                cadeaNueva = cadeaNueva + cadea.charAt(i);
            }
        }
        return contador;
    }

    /**
     * Calcula cuántos puntos se insertarían al agrupar la cadena en bloques de tres caracteres.
     * Los puntos se añaden cada tres caracteres, incluso si el último bloque está incompleto.
     *
     * @param cadea Cadena de entrada a procesar
     * @return Número total de puntos insertados
     */
    public static int puntos(String cadea) {
        String cadeaNueva = "";
        int contador = 0, cuentaPuntos = 0;
        int lenght = cadea.length();
        for (int i = 0; i < lenght; i++) {
            cadeaNueva = cadeaNueva + cadea.charAt(i);
            contador++;
            if (contador == 3) {
                cadeaNueva = cadeaNueva + ".";
                cuentaPuntos++;
                contador = 0;
            }
        }
        return cuentaPuntos;
    }
}
}
