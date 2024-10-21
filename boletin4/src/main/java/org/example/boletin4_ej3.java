
package org.example;

import java.util.Scanner;

public class boletin4_ej3 {
    /**
     * calcular o valor absoluto dun número que se solicita o usuario por teclado usando el operador ternario
     * @version 1.0
     * @autor Daniel Figueroa Vidal
     */

    public static void main(String []args){
        Scanner tec = new Scanner(System.in);
        int numero;
        System.out.println("Dime el numero que quieres pasar a valor absouluto");
        numero= tec.nextInt();
        //Pedimos el numero que queremos pasar al valor absoluto
        numero=(numero<0)?numero-numero-numero:numero;
        System.out.println("El numero en absoluto es "+numero);
        tec.close();

    }

}
