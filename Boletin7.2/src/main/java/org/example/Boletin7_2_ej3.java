package org.example;

import java.util.Scanner;

/**
 * Programa para gestionar un menú y realizar un pedido en un restaurante.
 *
 * Funcionalidades:
 * - Mostrar un menú con opciones de primer plato, segundo plato y postre.
 * - Permitir al usuario realizar un pedido seleccionando un plato de cada categoría.
 * - Mostrar el pedido realizado por el usuario.
 * - El usuario puede salir del programa.
 *
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
public class Boletin7_2_ej3 {
    public static void main(String[] args) {
        // Objeto Scanner para la entrada del usuario
        Scanner tec = new Scanner(System.in);
        int local;

        // Definición del menú con opciones de primer plato, segundo plato y postre
        String[][] menu = {
                { "Sopa", "Ensalada", "Gazpacho", "Pasta", "Crema de verduras", "Arroz", "Verduras salteadas", "Consomé" }, // Primeros platos
                { "Pollo asado", "Pescado al horno", "Filete de ternera", "Lasaña", "Hamburguesa", "Estofado", "Paella", "Tortilla" }, // Segundos platos
                { "Helado", "Tarta de queso", "Flan", "Fruta", "Natillas", "Brownie", "Mousse de chocolate", "Yogur" } // Postres
        };

        // Declaración del array para almacenar el pedido
        String[] pedido = new String[3];

        // Menú principal del programa
        do {
            System.out.println("1.Mostrar menú");
            System.out.println("2.Hacer pedido");
            System.out.println("3.Salir");
            local = tec.nextInt(); // Lee la opción elegida por el usuario
            switch (local) {
                case 1:
                    mostrarMenu(menu); // Muestra el menú
                    break;
                case 2:
                    hacerPedido(menu, pedido); // Permite al usuario hacer un pedido
                    // Muestra el pedido realizado
                    for (int i = 0; i < pedido.length; i++) {
                        System.out.println(pedido[i]);
                    }
                    break;
                case 3:
                    break; // Sale del programa
                default:
                    System.out.println("NO VALIDO"); // Opción no válida
            }
        } while (local != 3); // El bucle continúa hasta que el usuario elige salir

    }

    /**
     * Muestra el menú con las opciones disponibles para el usuario.
     *
     * @param menu Matriz que contiene los platos disponibles (primeros, segundos y postres).
     */
    public static void mostrarMenu(String[][] menu) {
        int numero = 0;
        // Recorre las filas del menú (primeros, segundos y postres)
        for (int i = 0; i < menu.length; i++) {
            // Recorre las columnas (los diferentes platos dentro de cada categoría)
            for (int j = 0; j < menu[0].length; j++) {
                // Muestra el número y el nombre de cada plato
                System.out.print(numero + "." + menu[i][j] + " ");
                numero++;
            }
            System.out.println(); // Salto de línea después de cada categoría
            numero = 0; // Reinicia el contador de platos para la siguiente categoría
        }
    }

    /**
     * Permite al usuario hacer un pedido seleccionando un plato de cada categoría.
     * El usuario debe ingresar un número válido entre 1 y 8 para cada plato.
     *
     * @param menu   Matriz que contiene los platos disponibles (primeros, segundos y postres).
     * @param pedido Array donde se guardan los platos seleccionados por el usuario.
     */
    public static void hacerPedido(String[][] menu, String[] pedido) {
        // Objeto Scanner para la entrada del usuario
        Scanner tec = new Scanner(System.in);
        // Variables para controlar si el usuario ha hecho una selección válida
        boolean comp1 = false, comp2 = false, comp3 = false;
        int primerP = 0, segundoP = 0, postre = 0;

        // Bucle para pedir al usuario que seleccione un plato hasta que todas las selecciones sean válidas
        do {
            if (!comp1) {
                System.out.println("Dime el primer plato (Del 1 al 8)");
                primerP = tec.nextInt(); // Lee la selección para el primer plato
                // Comprobación de validez de la selección
                if (primerP > 8 || primerP < 1) {
                    System.out.println("No es válido");
                } else {
                    comp1 = true; // Marca como válida la selección del primer plato
                }
            }
            if (!comp2) {
                System.out.println("Dime el segundo plato (Del 1 al 8)");
                segundoP = tec.nextInt(); // Lee la selección para el segundo plato
                // Comprobación de validez de la selección
                if (segundoP > 8 || segundoP < 1) {
                    System.out.println("No es válido");
                } else {
                    comp2 = true; // Marca como válida la selección del segundo plato
                }
            }
            if (!comp3) {
                System.out.println("Dime el postre (Del 1 al 8)");
                postre = tec.nextInt(); // Lee la selección para el postre
                // Comprobación de validez de la selección
                if (postre > 8 || postre < 1) {
                    System.out.println("No es válido");
                } else {
                    comp3 = true; // Marca como válida la selección del postre
                }
            }
        } while (!comp1 || !comp2 || !comp3); // Continúa hasta que todas las selecciones sean válidas

        // Asigna los platos seleccionados al array del pedido
        pedido[0] = menu[0][primerP - 1]; // Primer plato
        pedido[1] = menu[1][segundoP - 1]; // Segundo plato
        pedido[2] = menu[2][postre - 1]; // Postre
    }
}
