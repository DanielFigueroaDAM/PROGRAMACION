package org.example;

/**
 * Calcular la superficie de un cuadrado utilizando un valor fijo para el lado.
 * El programa toma el valor del lado, calcula el área y la muestra en pantalla.
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
public class Boletin2_ej2 {
    public static void main(String[] args) {
        // Declaración e inicialización de la variable lado con un valor fijo
        int resultado, lado = 3;

        // Cálculo del área del cuadrado usando la fórmula: lado * lado
        resultado = lado * lado;

        // Imprime el área calculada en la consola
        System.out.println("El área del cuadrado es " + resultado);
    }
}
