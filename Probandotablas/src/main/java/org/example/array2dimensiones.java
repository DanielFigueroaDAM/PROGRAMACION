package org.example;

public class array2dimensiones {
    public static void main(String[] args) {
        int [][]dosd;
        dosd =new int[][]{
            {1,1,0,0,0},
            {1,1,0,0,0},
            {1,1,0,0,0},
            {1,1,0,0,0},
            {1,1,0,0,0},
        };
        int j=0;
        for(int i=0;i<5;i++){
            for(;j<5;j++){
                System.out.println(dosd[i][j]);
            }
            j=0;
        }

    }
}
