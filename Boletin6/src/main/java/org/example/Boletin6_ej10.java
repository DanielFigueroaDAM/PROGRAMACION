package org.example;

public class Boletin6_ej10 {
    public static void main(String[] args) {
        int maxi = maximoDivisorRecursivo(16,28);
        System.out.println("El máximo común divisor es: " + maxi);
    }


    static int maximoDivisorRecursivo(int numero1, int numero2) {
        int resultado;
        if(numero2==0){
            resultado=numero1;
        }
        else {
            resultado=maximoDivisorRecursivo(numero2,numero1%numero2);
        }
        return resultado;
    }
}
