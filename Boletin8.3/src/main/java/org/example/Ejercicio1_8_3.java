package org.example;

public class Ejercicio1_8_3 {
    public static void main(String[] args) {
        String palabra="casa";
        int secuencia=2;
        String [] array = new String[palabra.length()-secuencia+1];
        sec(palabra,secuencia,array);

    }
    public static void sec(String palabra, int secuencia,String[] array){
        for(int i=0;i<=palabra.length()-secuencia;i++){
            String variable=palabra.substring(i,secuencia+i);
            array[i]=variable;
        }
        for (int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
}
