package org.example;

public class array2d_butacas {
    public static void main(String[] args) {
        boolean[][] dosd;
        dosd = new boolean[][]{
                {true,true,true,true},
                {true,true,true,true},
                {true,true,true,true},
                {true,false,true,true},
                {true,true,true,true},
        };
        int j=0;
        for(int i=0;i< dosd.length;i++){
            for(;j<dosd[0].length;j++){
                if(dosd[i][j]==true){
                    System.out.print("o ");
                }
                else {
                    System.out.print("l _");
                }
            }
            j=0;
            System.out.print("\n");
        }

    }

}
