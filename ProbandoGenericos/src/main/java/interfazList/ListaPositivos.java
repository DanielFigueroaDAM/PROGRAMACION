package interfazList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaPositivos {
    public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<>();
        Scanner tec = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Introduce un número positivo (-1 para salir): ");
            numero = tec.nextInt();
            if (numero == -1) {
                System.out.println("Fin da recollida de numeros.");
            } else if (numero < 0) {
                System.out.println("El número no es positivo.");
            } else {
                System.out.println("Número positivo: " + numero);
                listaNumeros.add(numero);
            }
        } while (numero != -1);
        for (Integer n : listaNumeros) {
            if(n % 2 == 0) {
                System.out.print(n*100+" - ");
            }
        }
    }
}
