package org.example;

/**
 * Genera un arreglo con valores incrementados en 10 y realiza una copia del arreglo original.
 *
 * Funcionalidades:
 * - Crea un arreglo de enteros con valores que incrementan de 10 en 10.
 * - Realiza una copia del arreglo original.
 * - Muestra los valores del arreglo original y de su copia.
 *
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
public class Boletin7_ej7 {
    public static void main(String[] args) {
        // Declaración e inicialización del arreglo original
        int[] numeros = new int[90];

        // Llena el arreglo con valores incrementados en 10 y los imprime
        for (int i = 0, valor = 0; i < numeros.length; i++, valor += 10) {
            numeros[i] = valor; // Asigna el valor al arreglo
            System.out.print(numeros[i] + "-"); // Imprime el valor actual
        }
        System.out.println("\n");

        // Llama a la función array para realizar una copia del arreglo
        int[] copia = array(numeros);

        // Imprime los valores del arreglo copiado
        for (int numero : copia) {
            System.out.println("Número: " + numero);
        }
    }

    /**
     * Realiza una copia de un arreglo dado.
     *
     * @param lista Arreglo original a copiar.
     * @return Una nueva copia del arreglo.
     */
    static int[] array(int[] lista) {
        // Declaración del nuevo arreglo para la copia
        int[] list = new int[lista.length];

        // Copia los valores del arreglo original al nuevo arreglo
        for (int i = 0; i < lista.length; i++) {
            list[i] = lista[i];
        }

        // Retorna el arreglo copiado
        return list;
    }
}
