package org.example;

public class Boletin6_ej9 {
    public static void main(String[] args) {
        int numero = fibonacciRecursivo(6);
        System.out.println("El numero fibonacci es: " + numero);
    }


    static int fibonacciRecursivo(int numero) {
        int resultado;
        if(numero==0){
            resultado=0;
        }
        else if(numero==1){
            resultado=1;
        }
        else{
            resultado=fibonacciRecursivo(numero-1)+fibonacciRecursivo(numero-2);
        }
        return resultado;
    }
}
