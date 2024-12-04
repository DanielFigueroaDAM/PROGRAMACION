package org.example;

public class HundirLaFlota {
    public static void main(String[] args) {
        int [][]tablero;
        tablero =new int[][]{
                {4,4,4,4,0},
                {0,0,0,0,0},
                {0,0,0,0,2},
                {0,0,0,0,2},
                {0,0,1,0,0},
        };
        recorrerTablero(tablero);
    }

    private static void recorrerTablero(int[][] tablero) {
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(tablero[i][j]>0) {
                    switch (tablero[i][j]){
                        case 0-> System.out.println("Es agua"+i+","+j);
                        case 1-> System.out.println("Es un buque y sus cordenadas son "+i+","+j);
                        case 2-> System.out.println("Es un submarino y sus cordenadas son "+i+","+j);
                        case 4-> System.out.println("Es un portaviones y sus cordenadas son "+i+","+j);
                        default -> System.out.println(-1);
                    }
                }
            }
        }
    }

}
