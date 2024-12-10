package org.example;

import java.util.Scanner;


public class Boletin7_2_ej2 {
    public static void main(String[] args) {
        String [][]tablero= new String[3][3];
        int eleccion1=0,eleccion2=0;
        Scanner scanner = new Scanner(System.in);

        do{
        generacion(tablero);
        System.out.println("Dime la primera posicion");
        eleccion1 = scanner.nextInt();
        System.out.println("Dime la segunda posicion");
        eleccion2 = scanner.nextInt();
        if(tablero[eleccion1][eleccion2]=="Tesoro"){
            System.out.println("Ganaste");
            mostrar(tablero);
        }
        else if(tablero[eleccion1][eleccion2]=="Trampa"){
                System.out.println("Perdiste");
                mostrar(tablero);
        }
        else {
            System.out.println("pillaste una entrada");
        }
        }while (tablero[eleccion1][eleccion2]=="Entrada");

    }
    public static void generacion(String tablero[][]){
        for(int i=0;i<tablero.length;i++){
            for(int j=0;j<tablero[0].length;j++){
                tablero[i][j]="Entrada";
            }
            System.out.println("");
        }
        int nu1 = (int)(Math.random() * 3);
        int nu2 = (int)(Math.random() * 3);
        int n = 0;
        tablero[nu1][nu2] = "Tesoro";

        do {
            int n1 = (int)(Math.random() * 3);
            int n2 = (int)(Math.random() * 3);
            if (n1 != nu1 || n2 != nu2) {
                tablero[n1][n2] = "Trampa";
                n = -1; // Condición para salir del bucle
            }
        } while (n == 0);

    }
    public static void mostrar(String tablero[][]){
        for(int i=0;i<tablero.length;i++){
            for(int j=0;j<tablero[0].length;j++){
                System.out.print(tablero[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
