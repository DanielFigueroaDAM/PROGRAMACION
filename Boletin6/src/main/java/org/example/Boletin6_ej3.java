package org.example;

public class Boletin6_ej3 {
    public static void main(String[] args) {
        double lado1=5;
        int opcion1=1;

        double resultado = calculos(opcion1,lado1);
        System.out.println(resultado);
    }
    static double calculos(int opcion, double lado){
        if(opcion == 1){
            return 6*lado*lado;
        }else if(opcion == 2){
            return lado*lado*lado;
        }else {
            return -1;
        }
    }
}
