package org.example;

import java.util.Scanner;
import java.util.Random;

public class Boletin7_2_ej4 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int tamaño;
        do {
            System.out.println("Elige el tamaño del tablero, tiene que ser superior a 4");
            tamaño = tec.nextInt();
        }while(tamaño<4);
        String [][] tablero = new String[tamaño][tamaño];
        boolean victoria = true;
        int puntuacion=tamaño*1000;
        generarTablero(tablero);
        do{
            victoria=mostrarTablero(tablero);
            if(victoria){
                System.out.println("Elige la posicion 1");
                int p1 = tec.nextInt();
                System.out.println("Elige la posicion 2");
                int p2 = tec.nextInt();
                puntuacion=puntuacion-200;
                recibirAtaque(tablero,p1,p2);
            }
        }while (victoria);
        System.out.println("ganaste y tu puntuacion es "+puntuacion);
    }
    public static void generarTablero(String [][]tablero){
        for (int i=0;i<tablero.length;i++){
            for(int j=0;j<tablero[0].length;j++){
                tablero[i][j]="~";
            }
        }
        Random rand = new Random();

        for (int i = 0; i < (tablero.length * tablero.length / 5); ) {
            int n1 = rand.nextInt(tablero.length);
            int n2 = rand.nextInt(tablero[0].length);

            if (tablero[n1][n2].equals("~")) {
                tablero[n1][n2] = "B";
                i++;
            }
        }
    }
    public static boolean mostrarTablero(String [][]tablero){
        int cont=0;
        for(int i=0;i<tablero.length;i++){
            for(int j=0;j<tablero[0].length;j++){
                if(tablero[i][j].equals("B")){
                    System.out.print(" ~");
                    cont++;
                }
                else {
                    System.out.print(" "+tablero[i][j]);
                }
            }
            System.out.println("");
        }
        if(cont==0){
            return false;
        }
        return true;

    }
    public static void recibirAtaque(String [][]tablero, int p1,int p2){
        if(p1>=0 && p1<tablero.length && p2<tablero.length && p2>=0) {
            switch (tablero[p1][p2]) {
                case "B":
                    tablero[p1][p2] = "X";
                    System.out.println("Hundido");
                    break;
                case "~":
                    tablero[p1][p2] = "O";
                    System.out.println("agua");
                    break;
                case "O", "X":
                    System.out.println("Ya atacaste");
                    break;
                default:
                    System.out.println("No valido");
            }
        }
        else {
            System.out.println("No es valido");
        }
    }
}
