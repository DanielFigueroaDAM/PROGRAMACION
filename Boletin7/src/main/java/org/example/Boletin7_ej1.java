package org.example;

public class Boletin7_ej1 {
    public static void main(String[] args) {
        int [] numeros;
        numeros=new int[6];
        for(int i=0;i<numeros.length;i++){
            numeros[i]= (int) (Math.random() * 51);
            System.out.println(numeros[i]);
        }
        System.out.println("----");
        for(int i = numeros.length - 1; i >= 0; i--){
            System.out.println(numeros[i]);
        }
    }
}
