package org.example;

/**
 * Simula la generación de notas para un grupo de estudiantes y calcula estadísticas como:
 * - Número de aprobados y suspensos.
 * - Media de las notas.
 * - Nota más alta obtenida.
 *
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */

public class Boletin7_ej2 {
    public static void main(String[] args) {
        // Declaración de variables
        int[] notas;  // Arreglo para almacenar las notas
        int media = 0, alta = 0, suspensos = 0, aprobados = 0; // Variables para estadísticas

        // Inicialización del arreglo para almacenar 30 notas
        notas = new int[30];

        // Generación de notas aleatorias y cálculo de estadísticas
        for (int i = 0; i < notas.length; i++) {
            // Genera una nota aleatoria entre 0 y 9
            notas[i] = (int) (Math.random() * 10);

            // Incrementa el contador de aprobados o suspensos según la nota
            if (notas[i] >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }

            // Suma la nota actual a la media acumulada
            media = media + notas[i];

            // Actualiza la nota más alta si la nota actual es mayor
            if (notas[i] > alta) {
                alta = notas[i];
            }
        }

        // Calcula la media dividiendo la suma total por el número de notas
        media = media / notas.length;

        // Muestra las estadísticas calculadas
        System.out.println("El número de suspensos es: " + suspensos);
        System.out.println("El número de aprobados es: " + aprobados);
        System.out.println("\nLa media es: " + media);
        System.out.println("La nota más alta es: " + alta);
    }
}
