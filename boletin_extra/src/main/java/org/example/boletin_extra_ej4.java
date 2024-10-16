package org.example;
import java.util.Scanner;
public class boletin_extra_ej4 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int cantidad, b100, resto, resultado, b20, resto2,b5,b1;
        System.out.println("Dime la cantidad de dinero");
        cantidad = teclado.nextInt();
        resto=cantidad%100;
        resultado=cantidad-resto;
        b100=resultado/100;
        System.out.println("La cantidad de billetes de 100 es "+b100);
        resto2=resto%20;
        resultado=resto-resto2;
        b20=resultado/20;
        System.out.println("La cantidad de billetes de 20 es "+b20);
        resto=resto2%5;
        resultado=resto2-resto;
        b5=resultado/5;
        System.out.println("La cantidad de billetes de 5 es "+b5);
        resto2=resto%1;
        resultado=resto-resto2;
        b1=resultado/1;
        System.out.println("la cantidad de monedas de 1 es "+b1);
        teclado.close();
    }
}