package org.example;
import java.util.Scanner;




public class boletin4_ej1 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Dime cual es la cantidad de ventas anuais");
        int nventas = tec.nextInt();
        if(nventas<=100){
            System.out.println("baixo");
        }
        else if(nventas>100 && nventas<=500){
            System.out.println("medio");
        }
        else if(nventas>500 && nventas<=1000){
            System.out.println("alto");
        }
        else if(nventas>100) {
            System.out.println("Primeira necesidade");
        }
        tec.close();
        }


    }