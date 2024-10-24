package org.example;

import java.util.Scanner;
/**
 * Saber cual es la letra correspondiente al dni que insertará el usuario.
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */

public class boletin4_ej5 {
    public static void main(String []args){
        Scanner tec = new Scanner(System.in);
        int dni,letra;
        System.out.println("Dime el numero de dni(8 digitos)");
        dni = tec.nextInt();
        //Pedimos el dni sin letra
        if(dni>0 && dni<=99999999){
            letra=dni%22;
            //Hacemos el calculo para descubrir el numero necesario para hacer la conversion.
                switch (letra) {
                case 0 -> System.out.println("La letra sería T");
                case 1 -> System.out.println("La letra sería R");
                case 2 -> System.out.println("La letra sería W");
                case 3 -> System.out.println("La letra sería A");
                case 4 -> System.out.println("La letra sería G");
                case 5 -> System.out.println("La letra sería M");
                case 6 -> System.out.println("La letra sería Y");
                case 7 -> System.out.println("La letra sería F");
                case 8 -> System.out.println("La letra sería P");
                case 9 -> System.out.println("La letra sería D");
                case 10 -> System.out.println("La letra sería X");
                case 11 -> System.out.println("La letra sería B");
                case 12 -> System.out.println("La letra sería N");
                case 13 -> System.out.println("La letra sería J");
                case 14 -> System.out.println("La letra sería Z");
                case 15 -> System.out.println("La letra sería S");
                case 16 -> System.out.println("La letra sería Q");
                case 17 -> System.out.println("La letra sería V");
                case 18 -> System.out.println("La letra sería H");
                case 19 -> System.out.println("La letra sería L");
                case 20 -> System.out.println("La letra sería C");
                case 21 -> System.out.println("La letra sería K");
                case 22 -> System.out.println("La letra sería E");
                //En el switch hacemos la correspondencia de numeros y letras
            };

        }
        else {
            System.out.println("Su numero no es valido");
        }
        tec.close();
        //Esta condición impide que el usuario ponga un numero mayor a 9 digitos o un numero negativo.
    }
}
