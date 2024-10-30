package org.example;

import java.util.Scanner;
/**
 * Numeros comprendidos entre dos numeros
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */

public class PrimeraFuncion {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int nu1 = num1(teclado);
        int nu2 = num2(teclado);
        numeros(nu1,nu2);

    }

    /**
     * Recoge un numero por teclado
     * @since v1.0
     * @param teclado Es el nombre del escaner
     * @return el numero recodido
     */
    static int num1(Scanner teclado){
        System.out.println("Dime el primer numero ");
        return teclado.nextInt();
    }

    /**
     * Recoge un numero por teclado
     * @since v1.0
     * @param teclado Es el nombre del escaner
     * @return el numero recodido
     */
    static int num2(Scanner teclado){
        System.out.println("Dime el segundo numero ");
        return teclado.nextInt();

    }

    /**
     *bucle para mostrar los comprendidos entre ellos
     * @param nume1 el primer numero escrito
     * @param nume2 el segundo numero escrito
     */
    static void numeros(int nume1, int nume2){
        if(nume1<nume2){
            for(int i=nume1+1;nume1<nume2;nume1++) {
            System.out.println(nume1);
            }
        }
        else{
            for(int i=nume2+1;nume2<nume1;nume2++) {
                    System.out.println(nume2);
            }
        }
    }

}
