package org.example;

import java.util.Scanner;

public class whilesuma {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n, sum=0, x=0;
        do{
            System.out.println("Dime cada numero(para salir ingresa el 999): ");
            n = sc.nextInt();
            if(n!=999) {
                sum = sum + n;
            }
            x++;
        }while (n!=999 && x<10);
        System.out.println("La suma es "+sum);
        sc.close();
    }
}
