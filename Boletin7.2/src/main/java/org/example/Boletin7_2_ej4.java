package org.example;

import java.util.Scanner;

/**
 * Programa de gestión de una agenda semanal.
 *
 * Funcionalidades:
 * - Mostrar el horario semanal con las actividades programadas.
 * - Cambiar las actividades en horarios específicos.
 * - Finalizar el programa.
 *
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
public class Boletin7_2_ej4 {
    public static void main(String[] args) {
        // Declaración de un objeto Scanner para entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Inicialización de la matriz que representa la agenda
        String[][] axenda = {
                {"Matematicas", "Historia", "Deporte", "Compra", "Piscina", "Libre", "Libre"},
                {"Matematicas", "Historia", "Deporte", "Compra", "Piscina", "Libre", "Libre"},
                {"Matematicas", "Historia", "Deporte", "Compra", "Piscina", "Libre", "Libre"},
                {"Matematicas", "Historia", "Deporte", "Compra", "Piscina", "Libre", "Libre"},
                {"Matematicas", "Historia", "Deporte", "Compra", "Piscina", "Libre", "Libre"}
        };

        int inicial;

        // Bucle principal para gestionar el menú de opciones
        do {
            System.out.println("Dime cual de las 3 opciones quieres hacer");
            System.out.println("1. Mostrar horario");
            System.out.println("2. Cambiar agenda");
            System.out.println("3. Salir");

            // Captura la opción seleccionada por el usuario
            inicial = scanner.nextInt();

            // Ejecuta la opción seleccionada
            if (inicial == 1) {
                mostrar(axenda);  // Llama a la función mostrar() para mostrar la agenda
            } else if (inicial == 2) {
                cambiar(axenda);  // Llama a la función cambiar() para modificar una actividad
            } else if (inicial != 3) {
                // Si la opción no es válida, muestra un mensaje de error
                System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (inicial != 3);  // Finaliza el bucle si la opción es 3 (Salir)

        System.out.println("Programa finalizado.");  // Muestra mensaje al finalizar el programa
    }

    /**
     * Muestra el horario semanal con las actividades programadas.
     *
     * @param axenda Matriz que representa el horario semanal.
     */
    public static void mostrar(String axenda[][]) {
        // Declaración de días de la semana y horas correspondientes
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        String[] horas = {"10:00", "11:00", "12:00", "13:00", "14:00"};

        // Imprime el encabezado de los días de la semana
        System.out.print("Hora/Día\t");
        for (String dia : diasSemana) {
            System.out.print(dia + "   ");  // Imprime los días de la semana
        }
        System.out.println();

        // Imprime el horario con las actividades programadas
        for (int i = 0; i < axenda.length; i++) {
            System.out.print(horas[i] + "\t");  // Imprime la hora
            for (int j = 0; j < axenda[i].length; j++) {
                System.out.print(axenda[i][j] + "   ");  // Imprime la actividad para cada día
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------");  // Línea de separación
    }

    /**
     * Cambia una actividad en la agenda según el día y la hora seleccionados.
     *
     * @param axenda Matriz que representa el horario semanal.
     */
    public static void cambiar(String[][] axenda) {
        // Declaración de un objeto Scanner para entrada del usuario
        Scanner scanner = new Scanner(System.in);

        int local1 = -1, local2 = -1;

        System.out.println("Vamos a cambiar una tarea");

        // Solicita al usuario el día de la actividad a cambiar
        do {
            System.out.println("Dime el día");
            String dia = scanner.next();
            switch (dia) {
                case "Lunes" -> local1 = 0;
                case "Martes" -> local1 = 1;
                case "Miercoles" -> local1 = 2;
                case "Jueves" -> local1 = 3;
                case "Viernes" -> local1 = 4;
                case "Sabado" -> local1 = 5;
                case "Domingo" -> local1 = 6;
                default -> {
                    // Si el día no es válido, muestra un mensaje y vuelve a pedir el día
                    System.out.println("Ese día no es válido");
                    local1 = -1;
                }
            }
        } while (local1 == -1);

        // Solicita al usuario la hora de la actividad a cambiar
        do {
            System.out.println("Dime la hora");
            String hora = scanner.next();
            switch (hora) {
                case "10" -> local2 = 0;
                case "11" -> local2 = 1;
                case "12" -> local2 = 2;
                case "13" -> local2 = 3;
                case "14" -> local2 = 4;
                default -> {
                    // Si la hora no es válida, muestra un mensaje y vuelve a pedir la hora
                    System.out.println("Esa hora no es válida");
                    local2 = -1;
                }
            }
        } while (local2 == -1);

        // Solicita la nueva actividad que se desea poner en la agenda
        System.out.println("¿Cuál es la nueva tarea?");
        String nueva = scanner.next();

        // Actualiza la matriz con la nueva actividad en el día y hora seleccionados
        axenda[local2][local1] = nueva;

        // Muestra el horario actualizado con la nueva actividad
        mostrar(axenda);
    }
}
