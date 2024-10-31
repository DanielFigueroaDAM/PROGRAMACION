package org.example;
import java.util.Scanner;

/**
 * Repite la palabra "Ecoo" una cantidad de veces indicada por el usuario.
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */

public class Boletin6_ej2 {
    public static void main(String[] args) {
        // Llama al método para ejecutar el programa
        eco();
    }

    /**
     * Solicita al usuario un número entero y repite el mensaje "Ecoo" tantas veces como indique el número ingresado.
     * El método crea un objeto Scanner para capturar la entrada del usuario y cierra el recurso al finalizar.
     * @since v1.0
     */
    static void eco() {
        Scanner teclado = new Scanner(System.in);  // Inicializa el Scanner para la entrada de datos
        System.out.println("Dime el numero: ");

        int n = teclado.nextInt();  // Captura el número de veces que se repetirá "Ecoo"

        // Bucle para repetir la palabra "Ecoo" tantas veces como se indicó
        for (int i = 0; i < n; i++) {
            System.out.println("Ecoo");
        }

        teclado.close();  // Cierra el objeto Scanner para liberar el recurso
    }
}
