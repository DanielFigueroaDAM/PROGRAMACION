package org.example;

import java.util.Scanner;

public class WhileMedia {

        public static void main(String []args){
            Scanner sc = new Scanner(System.in);
            int nota=0,x=0,y=0;
            double media;
            System.out.println("Dime la nota(para salir escribe -1)");
            nota = sc.nextInt();
            while (nota!=-1){
                x = x + 1;
                y = y + nota;
                System.out.println("Dime la nota(para salir escribe -1)");
                nota = sc.nextInt();

            }
            media=(double)y/x;
            System.out.println("la media es"+media);
        }
    }
/*
        public static void main(String []args){
            Scanner sc = new Scanner(System.in);
            int nota=0,x=0,y=0;
            double media;
            while (nota!=-1){
                System.out.println("Dime la nota");
                nota = sc.nextInt();
                if (nota == -1) {
                    System.out.println("");
                }
                else {
                    y = y + nota;
                    x = x + 1;
                }
            }
            media=(double)y/x;
            System.out.println("la media es"+media);
        }