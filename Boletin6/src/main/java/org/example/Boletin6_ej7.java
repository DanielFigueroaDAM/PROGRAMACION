package org.example;

/**
 * Calcula el factorial de un número de forma recursiva.
 * El factorial de un número n (n!) se define como el producto de todos
 * los números enteros positivos desde 1 hasta n.
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
public class Boletin6_ej7 {
    public static void main(String[] args) {
        int fact = factorialRecursivo(8); // Llama a la función recursiva para calcular el factorial de 8
        System.out.println("El factorial es: " + fact); // Muestra el resultado
    }

    /**
     * Calcula el factorial de un número de forma recursiva.
     * Si el número es 0, retorna 1 (caso base). En caso contrario,
     * retorna el producto del número actual y el factorial del número anterior.
     *
     * @param numero El número del cual se desea obtener el factorial
     * @return El factorial del número dado
     */
    static int factorialRecursivo(int numero) {
        long res;

        // Caso base: si el número es 0, el factorial es 1
        if (numero == 0) {
            res = 1;
        }
        // Caso recursivo: multiplica el número por el factorial de (numero - 1)
        else {
            res = numero*factorialRecursivo(numero - 1);
        }

        // Retorna el resultado como un entero (casting explícito de long a int)
        return (int) res;
    }
}
