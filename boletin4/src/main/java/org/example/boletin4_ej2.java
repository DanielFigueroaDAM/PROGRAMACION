package org.example;

import java.util.Scanner;
/**
 * Calcular la superficie de una figura(cuadrado, circulo o triangulo) dando a escoger al usuario dicha figura y
 * dichos parametros para calcularla.
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */

public class boletin4_ej2 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int opcion;
        double lado, superficie=0, altura, base, radio;
        /* Eligiendo las distintas variables, se podría reducir muchas de ellas, pero así lo haremos  para que sea más entendible el programa.
        Usé "double" para que el resultado sea mas exacto y no genere problemas de inexactitudes.
         */
        System.out.println("Elige entre las distintas opciones \n"+ "1...Cuadrado \n"+"2...Triangulo \n"+"3...Circulo \n");
        opcion = tec.nextInt();
        //Preguntamos al usuario cual es  la figura que quiere cualcular su superficie.
        switch (opcion) {
            //El problema exige que usermos el switch, pero se podría usar otros metodos.
            case 1:
                System.out.println("Cuanto mide el lado del cuadrado: ");
                lado = tec.nextDouble();
                //Pedimos el lado para  calcular la superficie del cuadrado.
                superficie = lado * lado;
                //Calcular la superficie
                System.out.print("La superficie del cuadrado es ");
                // Mostraremos esto por pantalla para que se entienda el resultado.
                break;
            case 2:
                System.out.println("Cuanto mide la base del triangulo: ");
                base = tec.nextDouble();
                System.out.println("Cuanto mide la altura del triangulo: ");
                altura = tec.nextDouble();
                //Pedimos la base y la altura del triangulo para  calcular su superficie.
                superficie = (base * altura) / 2;
                //Calcular la superficie
                System.out.print("La superficie del triangulo es ");
                // Mostraremos esto por pantalla para que se entienda el resultado.
                break;
            case 3:
                System.out.println("Cuanto mide el radio del circulo: ");
                radio = tec.nextDouble();
                //Pedimos el radio del circulo para  calcular su superficie.
                superficie = 2 * radio * 3.1415;
                //Calcular la superficie
                System.out.print("La superficie del circulo es ");
                // Mostraremos esto por pantalla para que se entienda el resultado.
                break;
            default:
                System.out.println("La respuesta no es valida");
                //En el caso de que el usuario haya escrito un numero diferente a los mostrados, se invalidará.
                break;
        }
        if(opcion == 1 || opcion==2 || opcion == 3){
            System.out.println(superficie);
        }
        //Esto es para que en caso de que el usuario pusiera otro numero no se muestre ningun resultado.

        tec.close();
    }

    public static class boletin4_ej3 {
    }
}