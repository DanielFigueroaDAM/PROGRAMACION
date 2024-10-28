package org.example;

import java.util.Scanner;

public class paresbucle {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        for (int i=0;i<10;i++){
            if((i%2)!=0){
                continue;
            }
            System.out.print("+"+i);
            sum=sum+i;
        }
        System.out.println("="+sum);
    }
}
