package org.example;

import java.util.Scanner;
/**
 * Programa para introducir el sueldo de cada trabajador en una empresa y calcular:
 * 1. La cantidad de trabajadores con sueldos entre 1000 y 1750 euros, ambos valores incluidos.
 * 2. El porcentaje de trabajadores que ganan menos de 1000 euros.
 * No conocemos el número total de trabajadores antes de ejecutar el programa.
 * Los sueldos deben ser positivos, y la entrada de datos finaliza al ingresar un sueldo de 0.
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */

public class Boletin5_ej5 {
    public static void main(String[] args){
        Scanner tec=new Scanner(System.in);
        int porcentaje, cantidadm=0, sueldo, menosmil=0,contador=0;
        boolean comparador=false;

        // Bucle principal que solicita los sueldos de los trabajadores
        while (!comparador){
            System.out.println("Dime el sueldo de los trabajadores ");
            sueldo=tec.nextInt();// Lee el sueldo ingresado por el usuario

            // Condición para finalizar el bucle si el sueldo es 0
            if (sueldo==0){
                comparador=true;
            }else if(sueldo<0){ // Verificación de sueldo negativo
                    System.out.println("Repita el numeor, no es válido");
                }
                else{

                // Incrementa el contador de trabajadores
                    contador++;

                // Contabiliza los trabajadores cuyo sueldo está entre 1000 y 1750
                    if (sueldo>=1000 && sueldo<=1750){
                        cantidadm++;
                    }

                    // Contabiliza los trabajadores que ganan menos de 1000
                    else if(sueldo<1000){
                        menosmil++;
                    }
                }
        }

        // Si hay trabajadores registrados, calcula y muestra los resultados
        if(contador>0) {
            System.out.println("La cantidad de trabajadores que estan entre 1000 y 1750 es " + cantidadm);

            // Calcula el porcentaje de trabajadores que ganan menos de 1000
            porcentaje = (menosmil * 100) / contador;
            System.out.println("El porcentaje de trabajadores que cobran menos de 1000 es de " + porcentaje + "%");
        }
        tec.close();

    }
}
