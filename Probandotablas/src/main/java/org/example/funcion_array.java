package org.example;

public class funcion_array {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 40, 40, 50};
        int a=40;
        int vuelta=array(numeros,a);
        System.out.println(vuelta);

    }
    static int array(int[] lista, int numero){
        for(int i=0;i<lista.length;i++){
            if(numero==lista[i]){
                return i;
            }

        }
        return -1;
    }
}
