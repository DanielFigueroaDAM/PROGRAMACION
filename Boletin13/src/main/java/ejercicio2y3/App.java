package ejercicio2y3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        //Insertar 100 numeros aleatorios enteros del 1 al 10 en una lista
        ArrayList <Integer> lista = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            lista.add((int) (Math.random() * 10)+1);
        }
        //Mostrar la lista
        System.out.println("Lista de numeros aleatorios: " + lista);
        // Copiar la lista en otra lista
        ArrayList<Integer> lista2 = new ArrayList<>(lista);
        //Borrar todos los elementos que valen 5 y 7 pasandole una coleccion
        Collection<Integer> coleccion = new ArrayList<>();
        coleccion.add(5);
        coleccion.add(7);
        lista.removeAll(coleccion);
        //Mostrar la lista
        System.out.println("Lista de numeros aleatorios sin los 5 y 7: " + lista);
        //Borrar todos los elementos que valen 5 y 7 usando un iterador
        Iterator <Integer> iterator = lista2.iterator();
        while (iterator.hasNext()) {
            Integer numero = iterator.next();
            if (numero == 5 || numero == 7) {
                iterator.remove();
            }
        }
        //Mostrar la lista
        System.out.println("Lista de numeros aleatorios sin los 5 y 7 usando un iterador: " + lista2);




    }
}
