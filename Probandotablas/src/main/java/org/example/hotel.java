package org.example;

import java.util.List;
import java.util.Scanner;

/**
 * Programa de gestión de habitaciones en un hotel.
 *
 * Funcionalidades:
 * - Registrar usuarios en habitaciones específicas.
 * - Vaciar habitaciones ocupadas.
 * - Mostrar el estado de todas las habitaciones.
 *
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
public class hotel {
    public static void main(String[] args) {
        // Declaración de un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Declaración e inicialización de una matriz 2D para las habitaciones del hotel
        int local = 0, inicial = 0;
        String[][] arrayHotel = new String[3][6]; // 3 filas y 6 columnas para las habitaciones

        // Bucle principal para gestionar las opciones del menú
        do {
            System.out.println("Dime cual de las 4 opciones quieres hacer");
            System.out.println("1.Registrar usuario");
            System.out.println("2.Vaciar habitacion");
            System.out.println("3.Mostrar habitaciones");
            System.out.println("4.Salir");

            // Captura de la opción seleccionada por el usuario
            inicial = scanner.nextInt();

            // Llama a las funciones según la opción seleccionada
            if (inicial == 1) {
                asignar(arrayHotel, local);
            }
            if (inicial == 2) {
                vaciar(arrayHotel, local);
            }
            if (inicial == 3) {
                mostrar(arrayHotel);
            }
        } while (inicial != 4); // Finaliza el bucle si la opción seleccionada es 4 (Salir)
    }

    /**
     * Asigna un usuario a una habitación específica.
     *
     * @param arrayHotel Matriz que representa el estado de las habitaciones.
     * @param local      Índice de la fila correspondiente a la habitación.
     */
    public static void asignar(String arrayHotel[][], int local) {
        // Declaración de un objeto Scanner para entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Bucle para solicitar la información del usuario y registrar la habitación
        do {
            System.out.println("Dime el nombre del usuario a registrar");
            String nombre = scanner.next(); // Nombre del usuario

            System.out.println("Dime la habitación que hay que registrar (letra(mayúscula))");
            String localizacionL = scanner.next(); // Fila de la habitación

            System.out.println("Ahora el número");
            int localizacionN = scanner.nextInt(); // Número de la habitación

            // Conversión de la letra de fila a índice numérico
            switch (localizacionL) {
                case "A" -> local = 0;
                case "B" -> local = 1;
                case "C" -> local = 2;
                default -> {
                    System.out.println("No es válido");
                    continue; // Reintenta si la entrada no es válida
                }
            }

            // Verifica si la habitación está ocupada
            if (arrayHotel[local][localizacionN] != null) {
                System.out.println("Está ocupada esa habitación");
            } else {
                arrayHotel[local][localizacionN] = nombre; // Asigna el nombre al arreglo
                break; // Sale del bucle tras una asignación exitosa
            }
        } while (true); // Repite hasta que se registre exitosamente
    }

    /**
     * Vacía una habitación específica, marcándola como disponible.
     *
     * @param arrayHotel Matriz que representa el estado de las habitaciones.
     * @param local      Índice de la fila correspondiente a la habitación.
     */
    public static void vaciar(String arrayHotel[][], int local) {
        // Declaración de un objeto Scanner para entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Bucle para solicitar la habitación a vaciar
        do {
            System.out.println("Dime la habitación que quieres vaciar (letra(mayúscula))");
            String localizacionL = scanner.next(); // Fila de la habitación

            System.out.println("Ahora el número");
            int localizacionN = scanner.nextInt(); // Número de la habitación

            // Verifica si la habitación ya está vacía
            if (arrayHotel[local][localizacionN] == null) {
                System.out.println("Está vacía esa habitación");
            } else {
                arrayHotel[local][localizacionN] = null; // Vacía la habitación
                break; // Sale del bucle tras vaciar exitosamente
            }
        } while (true); // Repite hasta que se vacíe exitosamente
    }

    /**
     * Muestra el estado actual de todas las habitaciones.
     *
     * @param arrayHotel Matriz que representa el estado de las habitaciones.
     */
    public static void mostrar(String arrayHotel[][]) {
        // Recorre la matriz para mostrar habitaciones vacías
        for (int i = 0; i < arrayHotel.length; i++) {
            char fila = (char) ('A' + i); // Convierte el índice de fila en letra
            for (int j = 0; j < arrayHotel[i].length; j++) {
                if (arrayHotel[i][j] == null) {
                    System.out.println("Habitación " + fila + j + " está vacía.");
                }
            }
            System.out.println(); // Espaciado entre filas
        }

        // Recorre la matriz para mostrar habitaciones ocupadas
        for (int i = 0; i < arrayHotel.length; i++) {
            char fila = (char) ('A' + i); // Convierte el índice de fila en letra
            for (int j = 0; j < arrayHotel[i].length; j++) {
                if (arrayHotel[i][j] != null) {
                    System.out.println("Habitación " + fila + j + " está ocupada por " + arrayHotel[i][j] + ".");
                }
            }
        }
    }
}
