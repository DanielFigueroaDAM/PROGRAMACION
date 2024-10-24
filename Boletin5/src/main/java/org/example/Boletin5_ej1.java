package org.example;

import java.util.Scanner;

/**
 * De una lista de 10 numeros mostrar cuantas veces se puso un cero un negativo y un positivo.
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */


public class Boletin5_ej1 {
    public static void main(String []args) {
        Scanner tec = new Scanner(System.in);
        int numero, positivo = 0, negativo = 0, cero = 0;
        for (int i = 0; i<10;i++){ //En este for pediremos los números y aplicaremos las condiciones.
            System.out.println("Dime cada numero ");
            numero = tec.nextInt();
            if (numero > 0) { // Aplicaremos las condicioones con un contador para cada valor a determinar.
                positivo++;
            } else if (numero < 0) {
                negativo++;
            } else {
                cero++;
            }

        }
        System.out.println("El numero de positivos es "+positivo);
        System.out.println("El numero de negativos es "+negativo);
        System.out.println("El numero de ceros es "+cero);
        tec.close();
    }
}
