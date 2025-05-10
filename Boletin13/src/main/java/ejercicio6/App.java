package ejercicio6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        // Crear una lista con 10 numeros aleatorios enteros del 1 al 10
        ArrayList <Integer> lista = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lista.add((int) (Math.random() * 10)+1);
        }
        // Mostrar la lista
        System.out.println("Lista de numeros aleatorios: " + lista);
        // Convertir a una lista sin repetidos pasandola lista a un set
        HashSet <Integer> set = new HashSet<>(lista);
        System.out.println("Lista sin repetidos: " + set);
        // Pasar a una lista con solo los elementos repetidos
        ArrayList <Integer> listaRepetidos = new ArrayList<>();
        for(Integer numero : lista){
            if(Collections.frequency(lista, numero) > 1){
                listaRepetidos.add(numero);
            }
        }
        // Eliminar los elementos repetidos de la lista
        HashSet <Integer> set2 = new HashSet<>(listaRepetidos);
        // Mostrar la lista con los elementos repetidos
        System.out.println("Lista con los elementos repetidos: " + set2);



    }
}
