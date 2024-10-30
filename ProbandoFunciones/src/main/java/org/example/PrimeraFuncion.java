package org.example;

import java.util.Scanner;


public class PrimeraFuncion {
    public static void main(String[] args){
        Scanner teclado1 = new Scanner(System.in);
        int nu1 = num1(teclado1);
        int nu2 = num2(teclado1);
        System.out.println(" ");
        System.out.println(" ");
        numeros(nu1,nu2);

    }
    static int num1(Scanner teclado1){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el primer numero ");
        return teclado.nextInt();
    }
    static int num2(Scanner teclado1){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el segundo numero ");
        return teclado.nextInt();

    }
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
