package org.example;

public class Boletin7_ej7 {
    public static void main(String[] args) {
        int[] numeros = new int[90];
        for (int i = 0, valor = 0; i < numeros.length; i++, valor += 10) {
            numeros[i] = valor;
            System.out.print(numeros[i]+"-");
        }
        System.out.println("\n");
        int copia[] =array(numeros);
        for (int numero : copia) {
            System.out.println("Número: " + numero);
        }


    }
    static int[] array(int[] lista){
        int[] list = new int[lista.length];
        for(int i = 0; i < lista.length; i++){
            list[i] = lista[i];
        }
        return list;

    }
}
