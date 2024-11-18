package org.example;

/**
 * Calcula el número de Fibonacci de un número dado de forma recursiva.
 * La secuencia de Fibonacci se define como:
 * F(0) = 0, F(1) = 1, y F(n) = F(n-1) + F(n-2) para n > 1.
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
public class Boletin6_ej9 {
    public static void main(String[] args) {
        int numero = fibonacciRecursivo(6); // Calcula el sexto número de Fibonacci
        System.out.println("El numero fibonacci es: " + numero); // Muestra el resultado
    }

    /**
     * Calcula el número de Fibonacci para un número entero dado usando recursión.
     * Si el número es 0, el resultado es 0; si es 1, el resultado es 1.
     * Para cualquier otro número mayor que 1, el resultado es la suma de los dos
     * números anteriores en la secuencia de Fibonacci.
     *
     * @param numero El número para el cual se calculará el término de Fibonacci
     * @return El término de Fibonacci correspondiente al número dado
     */
    static int fibonacciRecursivo(int numero) {
        int resultado;

        // Caso base 1: Si el número es 0, el resultado es 0
        if (numero == 0) {
            resultado = 0;
        }
        // Caso base 2: Si el número es 1, el resultado es 1
        else if (numero == 1) {
            resultado = 1;

        }
        // Caso recursivo: calcula el término sumando los dos términos anteriores
        else {
            resultado = fibonacciRecursivo(numero - 1) + fibonacciRecursivo(numero - 2);
        }
        // Retorna el resultado del cálculo del término de Fibonacci
        return resultado;
    }
}
