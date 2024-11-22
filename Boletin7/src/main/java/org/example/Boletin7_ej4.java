package org.example;

public class Boletin7_ej4 {
    public static void main(String[] args) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int dni=55555555;
        int resto=dni%23;
        for(int i=0;i<letras.length;i++){
            if(resto==i){
                System.out.println("La letra que equivale a ese numero es "+letras[i]);
            }

        }
    }
}
