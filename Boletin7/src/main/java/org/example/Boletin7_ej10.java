package org.example;

/**
 * Modifica un arreglo eliminando un número dado y reorganiza los elementos.
 *
 * Funcionalidades:
 * - Toma un número y un arreglo ordenado, elimina el número y reordena los elementos.
 * - Hace lo mismo para un arreglo desordenado.
 * - Imprime los resultados.
 *
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
public class Boletin7_ej10 {
    public static void main(String[] args) {
        // Declaración de los arreglos iniciales
        int[] numOrden = {1, 2, 3, 4, 5}; // Arreglo ordenado
        int[] numDesord = {2, 3, 1, 5, 4}; // Arreglo desordenado
        int num = 2; // Número que se desea eliminar

        // Llamadas a las funciones para procesar los arreglos
        int arraynuevo1[] = funcionArrayOrder(numOrden, num);
        int arraynuevo2[] = funcionArrayDesorder(numDesord, num);

        // Imprime el arreglo resultante ordenado
        for (int numero : arraynuevo1) {
            System.out.print(numero + "-");
        }
        System.out.println("\n");

        // Imprime el arreglo resultante desordenado
        for (int numero : arraynuevo2) {
            System.out.print(numero + "-");
        }
    }

    /**
     * Elimina un número dado de un arreglo ordenado y reorganiza los elementos.
     *
     * @param arrayn1 Arreglo original ordenado.
     * @param n Número a eliminar.
     * @return Nuevo arreglo sin el número especificado.
     */
    static int[] funcionArrayOrder(int[] arrayn1, int n) {
        int[] arraynuevo = new int[arrayn1.length - 1]; // Nuevo arreglo con tamaño reducido
        int contador = 0, contador2 = 0; // Contadores para controlar índices

        // Recorre el arreglo original para procesar el número
        for (int i = 0; i <= arrayn1.length; i++) {
            // Si encuentra el número a eliminar, copia el resto del arreglo
            if (arrayn1[i] == n) {
                for (int j = contador + 1; j <= arrayn1.length - 1; j++) {
                    arraynuevo[contador2] = arrayn1[j];
                    contador2++;
                }
                break; // Sal del bucle una vez que se procesa el número
            }
            arraynuevo[i] = arrayn1[i]; // Copia los elementos al nuevo arreglo
            contador++;
            contador2++;
        }
        return arraynuevo; // Retorna el arreglo modificado
    }

    /**
     * Elimina un número dado de un arreglo desordenado y reorganiza los elementos.
     *
     * @param arrayn2 Arreglo original desordenado.
     * @param n Número a eliminar.
     * @return Nuevo arreglo sin el número especificado.
     */
    static int[] funcionArrayDesorder(int[] arrayn2, int n) {
        int[] arraynuevo = new int[arrayn2.length - 1]; // Nuevo arreglo con tamaño reducido
        int contador = 0, contador2 = 0; // Contadores para controlar índices

        // Recorre el arreglo original para procesar el número
        for (int i = 0; i <= arrayn2.length; i++) {
            // Si encuentra el número a eliminar, copia el resto del arreglo
            if (arrayn2[i] == n) {
                for (int j = contador + 1; j <= arrayn2.length - 1; j++) {
                    arraynuevo[contador2] = arrayn2[j];
                    contador2++;
                }
                break; // Sal del bucle una vez que se procesa el número
            }
            arraynuevo[i] = arrayn2[i]; // Copia los elementos al nuevo arreglo
            contador++;
            contador2++;
        }
        return arraynuevo; // Retorna el arreglo modificado
    }
}
