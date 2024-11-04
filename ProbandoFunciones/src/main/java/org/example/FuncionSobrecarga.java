package org.example;

import java.util.Scanner;
/**
 * Numeros comprendidos entre dos numeros
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */

public class FuncionSobrecarga {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int nu1 = num1(teclado);
        int nu2 = num2(teclado);
        double nu3=6;
        double nu4=9;
        numerosComprendidos(nu1,nu2);
        numerosComprendidos(nu3,nu4);
        numerosComprendidos(nu1);

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
    static void numerosComprendidos(int nume1, int nume2){
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
    /**
     *bucle para mostrar los comprendidos entre ellos(ahora con double)
     * @param nume1 el primer numero escrito
     * @param nume2 el segundo numero escrito
     */
    static void numerosComprendidos(double nume1, double nume2){
        int num1Int = (int)Math.round(nume1);
        int num2Int = (int)Math.round(nume2);
        System.out.println(" ");
        numerosComprendidos(num1Int,num2Int);
    }
    static void numerosComprendidos(int nume1){
        System.out.println(" ");
        numerosComprendidos(0,nume1);

    }

}
