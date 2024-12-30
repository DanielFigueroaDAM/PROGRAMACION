package org.example;

import java.util.Scanner;

/**
 * Programa para jugar a un minijuego de tablero.
 *
 * Funcionalidades:
 * - Generar un tablero de 3x3 con casillas aleatorias (Entrada, Tesoro, Trampa).
 * - El jugador selecciona posiciones para encontrar el tesoro o evitar trampas.
 * - Finaliza el juego al encontrar el Tesoro o una Trampa.
 *
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
public class Boletin7_2_ej2 {
    public static void main(String[] args) {
        // Declaración de un tablero de 3x3 y variables para la elección del jugador
        String [][]tablero = new String[3][3];
        int eleccion1 = 0, eleccion2 = 0;

        // Objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Bucle principal del juego
        do {
            // Genera el tablero inicial
            generacion(tablero);

            // Solicita al jugador la primera coordenada
            System.out.println("Dime la primera posición");
            eleccion1 = scanner.nextInt();

            // Solicita al jugador la segunda coordenada
            System.out.println("Dime la segunda posición");
            eleccion2 = scanner.nextInt();

            // Comprueba el contenido de la casilla seleccionada
            if (tablero[eleccion1][eleccion2] == "Tesoro") {
                System.out.println("Ganaste");
                mostrar(tablero); // Muestra el tablero final
            } else if (tablero[eleccion1][eleccion2] == "Trampa") {
                System.out.println("Perdiste");
                mostrar(tablero); // Muestra el tablero final
            } else {
                System.out.println("Pillaste una entrada");
            }
        } while (tablero[eleccion1][eleccion2] == "Entrada"); // Continúa mientras no se gane o pierda
    }

    /**
     * Genera un tablero 3x3 con valores predeterminados.
     * Todas las casillas son inicializadas como "Entrada", excepto una "Tesoro" y una "Trampa".
     *
     * @param tablero Matriz que representa el tablero del juego.
     */
    public static void generacion(String tablero[][]) {
        // Inicializa todas las casillas del tablero como "Entrada"
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                tablero[i][j] = "Entrada";
            }
        }

        // Genera aleatoriamente la posición del "Tesoro"
        int nu1 = (int)(Math.random() * 3);
        int nu2 = (int)(Math.random() * 3);
        tablero[nu1][nu2] = "Tesoro";

        // Genera aleatoriamente la posición de la "Trampa", asegurándose de no coincidir con el "Tesoro"
        int n;
        do {
            int n1 = (int)(Math.random() * 3);
            int n2 = (int)(Math.random() * 3);
            if (n1 != nu1 || n2 != nu2) {
                tablero[n1][n2] = "Trampa";
                n = -1; // Salir del bucle
            } else {
                n = 0; // Continúa buscando una posición válida
            }
        } while (n == 0);
    }

    /**
     * Muestra el estado actual del tablero.
     *
     * @param tablero Matriz que representa el tablero del juego.
     */
    public static void mostrar(String tablero[][]) {
        // Recorre y muestra cada fila del tablero
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println(""); // Nueva línea al final de cada fila
        }
    }
}
