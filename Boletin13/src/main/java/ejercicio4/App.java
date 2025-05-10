package ejercicio4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Double numero;
        ArrayList <Double> listaPositivos = new ArrayList<>();
        ArrayList <Double> listaNegativos = new ArrayList<>();
        do {
            System.out.println("Introduce un numero real");
            numero = tec.nextDouble();
            if (numero > 0) {
                listaPositivos.add(numero);
            } else if (numero <0) {
                listaNegativos.add(numero);
            }
        } while (numero != 0);
        //sumar elementos de las listas
        Double sumaPositivos = 0.0;
        for (Double p : listaPositivos) {
            sumaPositivos += p;
        }
        Double sumaNegativos = 0.0;
        for (Double p : listaNegativos) {
            sumaNegativos += p;
        }
        //Mostrar la suma de los elementos de las listas
        System.out.println("La suma de los numeros positivos es: " + sumaPositivos + " y la suma de los negativos es: " + sumaNegativos);
        // Eliminar los elementos de la lista de positivos menores a 10
        listaPositivos.removeAll(List.of( 1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0));
        // Mostrar la lista de positivos
        System.out.println("Lista de numeros positivos con los numeros eliminados es: " + listaPositivos);
        // Eliminar los elementos de la lista de negativos menores a -10
        listaNegativos.removeAll(List.of( -1.0,-2.0,-3.0,-4.0,-5.0,-6.0,-7.0,-8.0,-9.0));
        // Mostrar la lista de negativos
        System.out.println("Lista de numeros negativos con los numeros eliminados es: " + listaNegativos);

    }
}
