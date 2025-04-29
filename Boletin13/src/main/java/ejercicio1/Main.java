package ejercicio1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer [] array1 = {1, 2, 3};
        Integer [] array2 = {4, 5, 6};
        Integer[] arrayNuevo = concatenarArrays(array1, array2);
        for(Integer p : arrayNuevo ){
            System.out.println(p);
        }

    }
    public static <T> T[] concatenarArrays(T[] primeiro,T[] segundo){
        T[] nuevoArray = Arrays.copyOf(primeiro,primeiro.length + segundo.length);
        System.arraycopy(segundo, 0, nuevoArray, primeiro.length, segundo.length);
        return nuevoArray;
    }
}
