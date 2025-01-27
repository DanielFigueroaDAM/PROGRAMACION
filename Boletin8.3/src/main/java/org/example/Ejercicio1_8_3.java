package org.example;

public class Ejercicio1_8_3 {
    public static void main(String[] args) {
        String palabra="figorifico";
        int secuencia=4;
        String [] array = new String[palabra.length()-secuencia+1];

        for(int i=0;i<=palabra.length()-secuencia;i++){
            String variable=palabra.substring(i,secuencia+i);
            array[i]=variable;
            System.out.println(variable);
        }
        for (int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
}
