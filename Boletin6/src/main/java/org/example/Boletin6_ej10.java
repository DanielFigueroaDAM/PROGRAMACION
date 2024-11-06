package org.example;

/**
 * Calcula el Máximo Común Divisor (MCD) de dos números de forma recursiva
 * utilizando el algoritmo de Euclides.
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
public class Boletin6_ej10 {
    public static void main(String[] args) {
        int maxi = maximoDivisorRecursivo(252, 105); // Llama a la función para calcular el MCD de 252 y 105
        System.out.println("El máximo común divisor es: " + maxi); // Muestra el resultado
    }

    /**
     * Calcula el Máximo Común Divisor de dos números usando recursión y el algoritmo de Euclides.
     * Si el segundo número es 0, el MCD es el primer número (caso base).
     * Si no, llama a la función con el segundo número y el resto de la división del primer número entre el segundo.
     *
     * @param numero1 El primer número para el cálculo del MCD
     * @param numero2 El segundo número para el cálculo del MCD
     * @return El MCD de numero1 y numero2
     */
    static int maximoDivisorRecursivo(int numero1, int numero2) {
        int resultado;

        // Caso base: si numero2 es 0, el MCD es numero1
        if (numero2 == 0) {
            resultado = numero1;
        }
        // Caso recursivo: aplica el algoritmo de Euclides llamando a la función con
        // numero2 y el resto de la división numero1 % numero2
        else {
            resultado = maximoDivisorRecursivo(numero2, numero1 % numero2);
        }

        // Retorna el resultado que representa el MCD
        return resultado;
    }
}
