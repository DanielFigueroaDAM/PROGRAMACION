package ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Integer numeros=0;
        Scanner tec = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        do {
            System.out.println("Introduce un numero entero");
            numeros = tec.nextInt();
            if (numeros > 0) {
                lista.add(numeros);
            } else {
                System.out.println("El numero es menor o igual a 0");
            }
        }while (numeros != -1);
        for(int i = 2; i < lista.size(); i= i+2){
            System.out.println("El numero en la posicion " + i + " es: " + lista.get(i)*100);
        }
    }
}
