package org.example;

import java.util.Scanner;

public class forconbreak {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n, sum=0;
        for (int i=0;i<10;i++){
            System.out.println("Dime cada numero(para salir ingresa el 999): ");
            n = sc.nextInt();
            if(n==999){
                break;
            }
            sum=sum+n;

        }
        System.out.println("La suma es "+sum);
        sc.close();
    }
}
