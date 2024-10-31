package org.example;

import java.util.Scanner;

public class Boletin6_ej4 {
    public static void main(String []args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime los segundos ");
        int minutos=teclado.nextInt();
        System.out.println("Dime las horas ");
        int horas=teclado.nextInt();
        System.out.println("Dime los dias ");
        int dias=teclado.nextInt();

        int conversion=conversionseg(minutos,horas,dias);
        System.out.println("Los segundos son "+conversion);
    }
    static int conversionseg(int minutos1,int horas1,int dias1){
        return minutos1*60+horas1*3600+dias1*86400;

    }

}
