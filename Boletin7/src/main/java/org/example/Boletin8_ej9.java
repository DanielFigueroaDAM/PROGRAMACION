package org.example;


import static java.util.Arrays.binarySearch;

public class Boletin8_ej9 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 20, 40, 40, 50, 60};
        int[] resultado = eliminarDuplicados(numeros);

        // Imprimir el arreglo resultante
        for (int numero : resultado) {
            System.out.println(numero);
        }
    }

    static int[] eliminarDuplicados(int[] lista) {
        int[] temporal = new int[lista.length]; // Arreglo temporal para almacenar únicos
        int contador = 0; // Contador para elementos únicos

        for (int i = 0; i < lista.length; i++) {
            if (!existeEnArreglo(temporal, contador, lista[i])) {
                temporal[contador] = lista[i];
                contador++;
            }
        }

        // Crear un nuevo arreglo con el tamaño exacto de elementos únicos
        int[] resultado = new int[contador];
        for (int i = 0; i < contador; i++) {
            resultado[i] = temporal[i];
        }

        return resultado;
    }

    // Método auxiliar para verificar si un número ya existe en el arreglo
    static boolean existeEnArreglo(int[] arreglo, int tamaño, int numero) {
        for (int i = 0; i < tamaño; i++) {
            if (arreglo[i] == numero) {
                return true; // El número ya existe en el arreglo
            }
        }
        return false; // El número no existe en el arreglo
    }
}

















    /*
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
*/