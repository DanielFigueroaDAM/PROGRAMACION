package org.example;

/**
 * Clase que crea un array ordenado un array de números y busca un valor específico en él.
 * Creador: Daniel Figueroa
 */
public class ordenar_array {

    /**
     * Método principal que inicializa el programa.
     * @param args Argumentos de línea de comando (no utilizados).
     */
    public static void main(String[] args) {
        // Crear un array de tamaño 90
        int[] numeros = new int[90];

        // Llenar el array con valores incrementales de 10 y mostrarlos en consola
        for (int i = 0, valor = 0; i < numeros.length; i++, valor += 10) {
            numeros[i] = valor; // Asignar valores incrementales al array
            System.out.print(numeros[i] + "-"); // Imprimir valores separados por guiones
        }
        System.out.println("\n"); // Salto de línea tras imprimir el array

        // Buscar el número 657 en el array y mostrar su índice
        int indice = array(numeros, 657);
        System.out.println("\n" + indice); // Imprimir índice encontrado o -1 si no existe
    }

    /**
     * Busca un número en un array utilizando una división en mitades.
     * Imprime los valores recorridos durante la búsqueda.
     *
     * @param lista Array de enteros donde buscar.
     * @param numero Número a buscar dentro del array.
     * @return El índice del número si se encuentra, o -1 si no está presente.
     */
    static int array(int[] lista, int numero) {
        // Calcular la posición de la mitad del array
        int mitad = lista.length / 2;

        // Si el número buscado es mayor que el valor en la mitad del array
        if (numero > lista[mitad]) {
            // Recorrer e imprimir la segunda mitad del array
            for (int i = mitad; i < lista.length; i++) {
                System.out.print(lista[i] + "-");
            }

            // Buscar el número en la segunda mitad
            for (int i = mitad; i < lista.length; i++) {
                if (numero == lista[i]) { // Si se encuentra el número
                    return i; // Retornar su índice
                }
                if (numero < lista[i]) { // Si el número es menor al actual
                    break; // Salir del bucle, ya no puede estar en el array
                }
            }
        }
        // Si el número buscado es menor o igual que el valor en la mitad del array
        else if (numero <= lista[mitad]) {
            // Recorrer e imprimir la primera mitad del array
            for (int i = mitad; i >= 0; i--) {
                System.out.print(lista[i] + "-");
            }

            // Buscar el número en la primera mitad
            for (int i = mitad; i >= 0; i--) {
                if (numero == lista[i]) { // Si se encuentra el número
                    return i; // Retornar su índice
                }
            }
        }

        // Retornar -1 si el número no está en el array
        return -1;
    }
}
