package org.example;

import java.util.Scanner;
/**
 * Mostrar las tablsa de multiplicar de los números pedidos por pantalla, y cuando se ingrese el 0 que termine el programa.
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */

public class Boletin5_ej4 {
    public static void main(String []args){
        Scanner tec = new Scanner(System.in);
        int numero=1, resultado;
        while (numero!=0) { //Repetiremos el bucle hasta que se ingrese el cero.
            System.out.println("Dime el numero");
            numero= tec.nextInt();
            if(numero!=0) { //Excuimos en el caso de que se ingrese el 0.
                for (int i = 0; i <= 10; i++) { //Este bucle funciona para mostrar los 10 numeros de la tabla.
                    resultado = numero * i;
                    System.out.println(numero + "x" + i + "=" + resultado);
                }
            }
        }
        System.out.println("Fin");
        tec.close();
    }
}
