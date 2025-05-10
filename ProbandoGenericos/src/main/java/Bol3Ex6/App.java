package Bol3Ex6;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int numeroRandom = (int) (Math.random() * 10) + 1;
            listaNumeros.add(numeroRandom);
        }
        Comparator<Integer> comparador = Comparator.naturalOrder();
        listaNumeros.sort(comparador);
        System.out.println(listaNumeros);
        Set<Integer> conjuntoNumerosDesordenado = Set.copyOf(listaNumeros);
        System.out.println(conjuntoNumerosDesordenado);
        Set<Integer> conjuntoNumerosOrdenado = new HashSet<>();
        conjuntoNumerosOrdenado.addAll(listaNumeros);
        System.out.println(conjuntoNumerosOrdenado);


        Set<Integer> repetidos = new HashSet<>();
        repetidos.addAll(listaNumeros);

    }
}



