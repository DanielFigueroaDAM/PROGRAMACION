package org.example;

import java.util.Scanner;

public class mediadowhile {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int nota=0,x=-1,y=0; //Inicializo la variable x en -1 para que que no se sume la ultima vuelta del bucle.
        double media;
        do{
            y = y + nota;
            x = x + 1;
            System.out.println("Dime la nota");
            nota = sc.nextInt();
        }while(nota!=-1);
        media=(double)y/x;
        System.out.println("la media es"+media);
    }
}
