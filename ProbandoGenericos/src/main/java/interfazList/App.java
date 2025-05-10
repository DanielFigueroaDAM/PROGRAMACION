package interfazList;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List <Integer> listaEnteiros = new ArrayList<>();
        listaEnteiros.add(1);
        listaEnteiros.add(2);
        listaEnteiros.add(5);
        listaEnteiros.add(3);
        listaEnteiros.add(4);
        listaEnteiros.add(9);
        listaEnteiros.add(13);
        listaEnteiros.add(7);
        listaEnteiros.add(9);
        listaEnteiros.add(13);
        System.out.println(listaEnteiros);
        System.out.println(listaEnteiros.get(3));
        listaEnteiros.set(3, 10); // Cambia o valor do índice 3 por 10
        System.out.println(listaEnteiros);
        listaEnteiros.add(6, 33); // Engade o valor 33 na posición 6 e move o resto
        System.out.println(listaEnteiros);
        listaEnteiros.addAll(5, listaEnteiros); // Engade a lista a partir do índice 5
        System.out.println(listaEnteiros);
        listaEnteiros.remove(5); // Elimina o valor do índice 5
    }
}
