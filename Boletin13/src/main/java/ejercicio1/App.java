package ejercicio1;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Integer [] array1 = {1, 2, 3};
        Integer [] array2 = {4, 5, 6};
        Integer[] arrayNuevo = concatenarArrays(array1, array2);
        for(Integer p : arrayNuevo ){
            System.out.println(p);
        }
        String [] array3 = {"Hola", "Mundo"};
        String [] array4 = {"Adios", "Mundo"};
        String[] arrayNuevo2 = concatenarArrays(array3, array4);
        for(String p : arrayNuevo2 ){
            System.out.println(p);
        }
        String [] array5 = concatenarElementosArrays(array1, array2);
        for(String p : array5 ){
            System.out.println(p);
        }

    }
    public static <T> T[] concatenarArrays(T[] primeiro,T[] segundo){
        T[] nuevoArray = Arrays.copyOf(primeiro,primeiro.length + segundo.length);
        System.arraycopy(segundo, 0, nuevoArray, primeiro.length, segundo.length);
        return nuevoArray;
    }

    /**
     * Concatenar elementos pasandolo a tipo String
     * @param primeiro
     * @param segundo
     * @return
     * @param <T>
     */
    public static <T> String[] concatenarElementosArrays(T[] primeiro,T[] segundo){
        String[] nuevoArray = new String[primeiro.length];
        if(primeiro.length!= segundo.length){
            throw new IllegalArgumentException("Los arrays no tienen la misma longitud");
        }else {
            for (int i = 0; i < primeiro.length; i++) {
                nuevoArray[i] = primeiro[i]+""+segundo[i];
            }
        }
        return nuevoArray;
    }
}
