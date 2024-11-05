package org.example;

public class Boletin6_ej8 {
    public static void main(String[] args) {
        int exp = exponenteRecursivo(2,2);
        System.out.println("El exponente es: " + exp);
    }


    static int exponenteRecursivo(int base, int exponente) {
        int resultado;
        if(exponente==0){
            resultado=1;
        }
        else {
            resultado=base*exponenteRecursivo(base,exponente-1);
        }
        return resultado;
    }
}
