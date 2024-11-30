package org.example;

/**
 * Busca un número dentro de un arreglo y retorna su índice si se encuentra, o -1 si no está presente.
 *
 * Funcionalidades:
 * - Define un arreglo de enteros.
 * - Busca un número específico en el arreglo.
 * - Retorna el índice del número encontrado o -1 si no está en el arreglo.
 *
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
public class Boletin7_ej5 {
    public static void main(String[] args) {
        // Declaración e inicialización de un arreglo de enteros
        int[] numeros = {10, 20, 40, 40, 50};

        // Número a buscar en el arreglo
        int a = 40;

        // Llama a la función array para buscar el número 'a' en el arreglo 'numeros'
        int vuelta = array(numeros, a);

        // Muestra el resultado: índice del número encontrado o -1 si no está en el arreglo
        System.out.println(vuelta);
    }

    /**
     * Busca un número en un arreglo y retorna su índice.
     *
     * @param lista  Arreglo de enteros donde buscar.
     * @param numero Número a buscar en el arreglo.
     * @return El índice del número si se encuentra, o -1 si no está presente.
     */
    static int array(int[] lista, int numero) {
        // Recorre el arreglo para buscar el número
        for (int i = 0; i < lista.length; i++) {
            // Si el número actual del arreglo coincide con el buscado, retorna su índice
            if (numero == lista[i]) {
                return i;
            }
        }
        // Si el número no se encuentra, retorna -1
        return -1;
    }
}
