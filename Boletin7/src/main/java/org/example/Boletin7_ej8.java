package org.example;

/**
 * Filtra los números pares de un arreglo y crea un nuevo arreglo con solo esos valores.
 *
 * Funcionalidades:
 * - Define un arreglo inicial con números enteros.
 * - Crea un nuevo arreglo con los números pares del original.
 * - Imprime los valores del nuevo arreglo.
 *
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
public class Boletin7_ej8 {
    public static void main(String[] args) {
        // Declaración e inicialización del arreglo original
        int[] numeros = {10, 20, 33, 40, 40, 50};

        System.out.println("\n");

        // Llama a la función array para filtrar los números pares
        int[] copia = array(numeros);

        // Imprime los valores del nuevo arreglo que contiene solo números pares
        for (int numero : copia) {
            System.out.println("Número: " + numero);
        }
    }

    /**
     * Filtra los números pares de un arreglo y retorna un nuevo arreglo con ellos.
     *
     * @param lista Arreglo original de enteros.
     * @return Un nuevo arreglo que contiene solo los números pares del arreglo original.
     */
    static int[] array(int[] lista) {
        int count = 0; // Contador para los números pares

        // Primer recorrido: contar cuántos números pares hay en el arreglo original
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 2 == 0) { // Verifica si el número es par
                count++;
            }
        }

        // Crea un nuevo arreglo con el tamaño exacto para los números pares
        int[] list = new int[count];
        int j = 0; // Índice para llenar el nuevo arreglo

        // Segundo recorrido: llenar el nuevo arreglo con los números pares
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 2 == 0) { // Si el número es par
                list[j] = lista[i]; // Añade el número al nuevo arreglo
                j++;
            }
        }

        // Retorna el nuevo arreglo con solo números pares
        return list;
    }
}
