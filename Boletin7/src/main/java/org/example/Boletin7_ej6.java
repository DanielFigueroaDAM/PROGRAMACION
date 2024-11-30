package org.example;

/**
 * Implementa una versión recursiva para buscar un número en un arreglo dividiendo el rango en mitades.
 *
 * Funcionalidades:
 * - Llena un arreglo con valores que incrementan de 10 en 10.
 * - Utiliza un método recursivo para buscar un número en el arreglo.
 * - Divide el arreglo en mitades hasta encontrar el número o determinar que no existe.
 *
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
public class Boletin7_ej6 {
    public static void main(String[] args) {
        // Declaración e inicialización del arreglo con valores incrementados de 10 en 10
        int[] numeros = new int[90];
        for (int i = 0, valor = 0; i < numeros.length; i++, valor += 10) {
            numeros[i] = valor; // Llena el arreglo
            System.out.print(numeros[i] + "-"); // Imprime el valor actual
        }
        System.out.println("\n");

        // Llama al método array para buscar el número 600 en el arreglo
        int[] indice = array(numeros, 600);
        System.out.println("\n" + indice);
    }

    /**
     * Método recursivo que busca un número dividiendo el arreglo en mitades.
     *
     * @param lista  Arreglo donde se busca el número.
     * @param numero Número a buscar.
     * @return Un arreglo con el índice del número encontrado o {-1} si no existe.
     */
    static int[] array(int[] lista, int numero) {
        int mitad = lista.length / 2; // Calcula la posición de la mitad del arreglo
        int j = 0, y = 0; // Contadores para el nuevo arreglo
        int[] lista2 = new int[mitad]; // Nuevo arreglo con la mitad de tamaño del original

        // Caso donde el número está en la segunda mitad del rango
        if (numero > lista[mitad]) {
            for (int i = mitad; i < lista.length; i++) {
                lista2[j++] = lista[i];
            }
            return array(lista2, numero); // Llamada recursiva con la segunda mitad
        }

        // Caso donde el número está en la primera mitad del rango
        else if (numero < lista[mitad]) {
            for (int i = 0; i < mitad; i++) {
                lista2[y++] = lista[i];
            }
            return array(lista2, numero); // Llamada recursiva con la primera mitad
        }

        // Caso base: el número coincide con el valor en la posición central
        else if (numero == lista[mitad]) {
            System.out.println("Número encontrado en el índice: " + mitad);
            return new int[]{mitad}; // Retorna el índice donde se encuentra el número
        }

        // Caso donde el número no está en el rango del arreglo
        return new int[]{-1};
    }
}
