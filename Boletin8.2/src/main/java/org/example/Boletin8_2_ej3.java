/**
 * Clase para aplicar transformaciones limitadas a una cadena según un número máximo de operaciones.
 * Las operaciones incluyen inserción de comas, reemplazo de espacios, sustitución de dígitos y agrupación con puntos.
 *
 * @author Daniel Figueroa
 * @version 1.0
 */
package org.example;

public class Boletin8_2_ej3 {
    public static void main(String[] args) {
        String cadea = "Galicia esta en españa y estamos en 2025";
        int numero = 3;  // Número máximo de operaciones a realizar en cada método

        // Cada método trabaja con la cadena ORIGINAL, no con resultados intermedios
        System.out.println(comas(cadea, numero));      // Añade comas (hasta 3 veces)
        System.out.println(espacios(cadea, numero));   // Reemplaza espacios (hasta 3)
        System.out.println(numeros(cadea, numero));    // Sustituye dígitos (hasta 3)
        System.out.println(puntos(cadea, numero));     // Inserta puntos (hasta 3 grupos)
    }

    /**
     * Añade comas después de letras, limitado a un número máximo de inserciones.
     *
     * @param cadea Cadena original
     * @param numero Máximo de comas a insertar
     * @return Cadena modificada (ej: "Hola" → "H,o,l,a" con numero=3)
     */
    public static String comas(String cadea, int numero) {
        String cadeaNueva = "";
        int contador = 0;
        boolean valid = true;
        for (int i = 0; i < cadea.length(); i++) {
            cadeaNueva += cadea.charAt(i);
            if (Character.isLetter(cadea.charAt(i)) && valid) {
                if (i != cadea.length() - 1) {
                    cadeaNueva += ",";
                    contador++;
                    if (contador == numero) valid = false;  // Deja de añadir al alcanzar 'numero'
                }
            }
        }
        return cadeaNueva;
        // Nota: Añade comas incluso si hay caracteres no letra después (ej: "a1" → "a,1")
    }

    /**
     * Reemplaza espacios con "\_", limitado a un número máximo de reemplazos.
     *
     * @param cadea Cadena original
     * @param numero Máximo de espacios a reemplazar
     * @return Cadena modificada (ej: "a b c" → "a\_b\_c" con numero=2)
     */
    public static String espacios(String cadea, int numero) {
        String cadeaNueva = "";
        int contador = 0;
        boolean valid = true;
        for (int i = 0; i < cadea.length(); i++) {
            if (Character.isWhitespace(cadea.charAt(i)) && valid) {
                cadeaNueva += "\\_";  // Posible error: Se usa "\\_" en lugar de "_"
                contador++;
                if (contador == numero) valid = false;
            } else {
                cadeaNueva += cadea.charAt(i);
            }
        }
        return cadeaNueva;
    }

    /**
     * Sustituye dígitos por "X", limitado a un número máximo de sustituciones.
     *
     * @param cadea Cadena original
     * @param numero Máximo de dígitos a reemplazar
     * @return Cadena modificada (ej: "a1b2c3" → "aXbXc3" con numero=2)
     */
    public static String numeros(String cadea, int numero) {
        String cadeaNueva = "";
        int contador = 0;
        boolean valid = true;
        for (int i = 0; i < cadea.length(); i++) {
            if (Character.isDigit(cadea.charAt(i)) && valid) {
                cadeaNueva += "X";
                contador++;
                if (contador == numero) valid = false;
            } else {
                cadeaNueva += cadea.charAt(i);
            }
        }
        return cadeaNueva;
    }

    /**
     * Inserta puntos cada 3 caracteres, limitado a un número máximo de inserciones.
     *
     * @param cadea Cadena original
     * @param numero Máximo de puntos a insertar
     * @return Cadena modificada (ej: "abcdefgh" → "abc.def.gh" con numero=2)
     */
    public static String puntos(String cadea, int numero) {
        String cadeaNueva = "";
        int contador = 0, contadorPuntos = 0;
        boolean valid = true;
        for (int i = 0; i < cadea.length(); i++) {
            cadeaNueva += cadea.charAt(i);
            contador++;
            if (contador == 3 && valid) {
                cadeaNueva += ".";
                contador = 0;
                contadorPuntos++;
                if (contadorPuntos == numero) valid = false;  // Deja de insertar puntos
            }
        }
        return cadeaNueva;
        // Nota: Si la cadena termina en punto, lo mantiene (ej: "123456" → "123.456." con numero=2)
    }
}