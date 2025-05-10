package empresa;

import java.util.ArrayList;
import java.util.Collection;

public class ListaNumeros {
    public static void main(String[] args) {
        // crear un array list de enteros con collection
        Collection<Integer> coleccionNumeros;
        coleccionNumeros = new ArrayList<>();
        // añadir 100 numeros random del 1 al 10
        for (int i = 0; i < 100; i++) {
            int numeroRandom = (int) (Math.random() * 10) + 1;
            coleccionNumeros.add(numeroRandom);
        }
        for( Integer numero: coleccionNumeros){
            System.out.println(numero);
        }
        // mostrar la coleccion
        Collection<Integer> collectionDeBorrado = new ArrayList<>();
        collectionDeBorrado.add(7);
        collectionDeBorrado.add(8);
        coleccionNumeros.removeAll(collectionDeBorrado);
        System.out.println("------------------");
        // mostrar la coleccion
        for(Integer numero: coleccionNumeros){
            System.out.println(numero);
        }
    }
}
