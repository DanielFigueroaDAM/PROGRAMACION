package org.example;

import java.util.Scanner;
/**
 * Hacer un programa que calcule el area de un rectangulo, pero tiene que comprobar que el numero sea positivo, si no no se debería realizar dicho calculo.
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */


public class Boletin5_ej3 {
    public static void main(String []args){
        Scanner tec = new Scanner(System.in);
        int altura=0, base=0, area;
        boolean comprobador = false, comprobador2 = false; //Usaremos los boleanos para no tener que usar dos bucles.
        do {

            if(comprobador==false) { //En la primera vuelta será falso porque se inicializó así.
                System.out.println("Dime la base(tiene que ser un numero positivo)");
                altura = tec.nextInt();
                if(altura>0){ //Si la variable altura es positivo el la variable boolean será true.
                    comprobador=true;
                }
                else{
                    System.out.println("El numero no es valido");
                }
            }

            if(comprobador2==false) { //En la primera vuelta será falso porque se inicializó así.
                System.out.println("Dime la altura(tiene que ser un numero positivo)");
                base = tec.nextInt();
                if(base>0){ //Si la variable altura es positivo el la variable boolean será true.
                    comprobador2=true;
                }
                else{
                    System.out.println("El numero no es valido");
                }
            }


        }while(comprobador==false || comprobador2==false); //Cuando las dos variables sean true, saldremos del bucle.
        area=base*altura;
        System.out.println("El area del rectangulo es "+area);
    }
}
