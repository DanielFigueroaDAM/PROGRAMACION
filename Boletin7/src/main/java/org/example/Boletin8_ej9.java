package org.example;


import static java.util.Arrays.binarySearch;

public class Boletin8_ej9 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 20, 40, 40, 50, 60};
        int[] vuelta=array1(numeros);
        for(int numero:vuelta) {
            System.out.println(numero);
        }

    }
    /*
    static int[] array(int[] lista){
        int [] temporal = new int [0];
        int[] taboa;
        for(int elemento : taboa){
            if(binarySearch (temporal,elemento==-1) {
                int[] novo = new int[temporal.lenght + 1];
                for (int i = 0; i < temporal.lenght; i++) {
                    novo[i] = temporal[i];
                }
                novo[temporal.length] = elemento;
                temporal = novo;
            }
        }

        return temporal;
    }
    */
    
    static int[] array1(int[] lista){
        int restante=0;
        int[] list = new int[lista.length];
        for(int i = 0; i < lista.length; i++){
            list[i] = lista[i];
        }
        for(int i=0;i<lista.length;i++){
            for (int j=i+1;j<list.length;j++) {
                if (list[j] == lista[i]) {
                    restante++;

                }
            }
        }
        int finalSize = lista.length - restante;
        int[] result = new int[finalSize];

        int index = 0;
        for(int i=0;i<lista.length;i++){
            boolean duplicador = false;
            for (int j=i+1;j<list.length;j++) {
                if (list[j] == lista[i]) {
                    duplicador = true;
                    break;
                }
                result[i]=list[i];
            }
            if (!duplicador) {
                result[index] = lista[i];
                index++;
            }
        }
        return result;
    }
}
