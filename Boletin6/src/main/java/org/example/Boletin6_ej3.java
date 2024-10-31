package org.example;

/**
 * Calcula el área o volumen de un cubo según la opción seleccionada por el usuario.
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */

public class Boletin6_ej3 {
    public static void main(String[] args) {
        // Definición del lado del cubo y opción de cálculo
        double lado1 = 5;    // Lado del cubo
        int opcion1 = 1;     // Opción de cálculo: 1 para área, 2 para volumen

        // Llama al método calculos para obtener el resultado según la opción
        double resultado = calculos(opcion1, lado1);

        // Muestra el resultado en consola
        System.out.println(resultado);
    }

    /**
     * Calcula el área superficial o el volumen de un cubo.
     * @param opcion Determina el cálculo a realizar (1 para área, 2 para volumen).
     * @param lado Longitud de un lado del cubo.
     * @return El área si se selecciona opción 1, el volumen si se selecciona opción 2,
     * o -1 si la opción es inválida.
     */
    static double calculos(int opcion, double lado) {
        if (opcion == 1) {
            // Calcula el área superficial (6 * lado^2) si la opción es 1
            return 6 * lado * lado;
        } else if (opcion == 2) {
            // Calcula el volumen (lado^3) si la opción es 2
            return lado * lado * lado;
        } else {
            // Retorna -1 si la opción no es válida
            return -1;
        }
    }
}
