package org.example;

import java.util.Scanner;

/**
 * Calcular el porcentaje de un descuento dado el precio inicial y el precio final de un producto.
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */

public class boletin_extra_ej1 {


        public static void main(String[] args) {
            // Crear un objeto Scanner para leer la entrada del usuario
            Scanner sc = new Scanner(System.in);

            // Solicitar el precio de la tarifa
            System.out.print("Introduce el precio de la tarifa: ");
            double precioTarifa = sc.nextDouble();

            // Solicitar el precio pagado
            System.out.print("Introduce el precio pagado: ");
            double precioPagado = sc.nextDouble();

            // Calcular el porcentaje de descuento
            double descuento = ((precioTarifa - precioPagado) / precioTarifa) * 100;

            // Mostrar el porcentaje de descuento
            System.out.printf("El porcentaje descontado es: %.2f%%\n", descuento);

            // Cerrar el Scanner
            sc.close();
        }
    }



