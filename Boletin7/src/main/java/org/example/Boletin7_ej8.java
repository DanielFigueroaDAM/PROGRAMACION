package org.example;

public class Boletin7_ej8 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 33, 40, 40, 50};
        System.out.println("\n");
        int copia[] =array(numeros);
        for (int numero : copia) {
            System.out.println("Número: " + numero);
        }


    }
    static int[] array(int[] lista){
        int j=0, count=0;
        for(int i = 0; i < lista.length; i++){
            if(lista[i]%2==0){
                count++;
            }
        }
        int[] list = new int[count];
        for(int i = 0; i < lista.length; i++){
            if(lista[i]%2==0) {
                list[j] = lista[i];
                j++;
            }

        }
        return list;

    }
}
