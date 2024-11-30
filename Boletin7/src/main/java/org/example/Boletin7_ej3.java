package org.example;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Genera notas aleatorias para un grupo de estudiantes, calcula estadísticas y permite
 * consultar la nota de un estudiante específico por su nombre.
 *
 * Funcionalidades:
 * - Generación de notas aleatorias entre 0 y 10.
 * - Cálculo de aprobados, suspensos, media y la nota más alta.
 * - Ordenación de aprobados y suspensos.
 * - Consulta de la nota de un estudiante por su nombre.
 *
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
public class Boletin7_ej3 {
    public static void main(String[] args) {
        // Inicialización de variables y arreglos
        Scanner sc = new Scanner(System.in);
        int[] notas = new int[30]; // Arreglo para almacenar las notas
        int media = 0, alta = 0, suspensos = 0, aprobados = 0; // Variables para estadísticas
        String[] nombres = { // Arreglo con los nombres de los estudiantes
                "Carlos", "María", "José", "Ana", "Luis",
                "Lucía", "Pedro", "Carmen", "Miguel", "Laura",
                "Francisco", "Elena", "Manuel", "Isabel", "Jorge",
                "Sofía", "Antonio", "Marta", "Raúl", "Paula",
                "David", "Sara", "Juan", "Clara", "Alejandro",
                "Julia", "Pablo", "Victoria", "Héctor", "Irene"
        };

        System.out.println("-----------------------------------------");
        // Generar notas aleatorias y calcular estadísticas
        for (int i = 0; i < notas.length; i++) {
            notas[i] = (int) (Math.random() * 11); // Generar nota aleatoria entre 0 y 10
            media += notas[i]; // Acumular notas para calcular la media

            // Contar aprobados y suspensos
            if (notas[i] >= 5) {
                aprobados++;
                System.out.println(nombres[i] + " " + notas[i]); // Mostrar aprobados con sus nombres
            } else {
                suspensos++;
            }

            // Determinar la nota más alta
            if (notas[i] > alta) {
                alta = notas[i];
            }
        }
        System.out.println("-----------------------------------------");

        // Calcular la media dividiendo la suma total por la cantidad de estudiantes
        media /= notas.length;

        // Crear arreglo de aprobados
        int[] aprobadosarr = new int[aprobados];
        int y = 0; // Índice para el arreglo de aprobados
        for (int nota : notas) {
            if (nota >= 5) {
                aprobadosarr[y++] = nota;
            }
        }

        // Crear arreglo de suspensos
        int[] suspensosarr = new int[suspensos];
        int k = 0; // Índice para el arreglo de suspensos
        for (int nota : notas) {
            if (nota < 5) {
                suspensosarr[k++] = nota;
            }
        }

        // Ordenar aprobados y suspensos
        Arrays.sort(aprobadosarr);
        Arrays.sort(suspensosarr);

        // Mostrar resultados
        System.out.println("Notas ordenadas: " + Arrays.toString(suspensosarr) + Arrays.toString(aprobadosarr));
        System.out.println("El número de suspensos es " + suspensos);
        System.out.println("El número de aprobados es " + aprobados);
        System.out.println("La media es " + media);
        System.out.println("La nota más alta es " + alta);

        // Consulta de la nota de un estudiante por nombre
        System.out.print("Dime el nombre del alumno: ");
        String alumno = sc.next();
        boolean encontrado = false; // Bandera para verificar si se encuentra el nombre
        for (int i = 0; i < nombres.length; i++) {
            if (alumno.equals(nombres[i])) {
                System.out.println("La nota de " + nombres[i] + " es " + notas[i]);
                encontrado = true;
                break;
            }
        }

        // Mensaje si el nombre no está en la lista
        if (!encontrado) {
            System.out.println("El nombre no está en la lista");
        }

        // Cerrar el escáner
        sc.close();
    }
}
