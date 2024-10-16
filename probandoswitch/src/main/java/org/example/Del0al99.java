package org.example;
import java.util.Scanner;

/**
 * Convierte un numero introducido de 0 a 99 en su equivalente en letras.
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
public class Del0al99 {

        public static void main(String[] args) {
            Scanner teclado=new Scanner (System.in);
            int numero, decenas, resto; //Declaramos las variables, la variable numero será el número que tendremos que convertir a letras.
            System.out.println("Dime un numero del 0 al 99");
            numero =teclado.nextInt();
            decenas = numero /10; //Haremos la división para obtener las decenas
            resto = numero %10;//Haremos el resto para saber cual es el segundo valor del numero del valor introducido, ej: del 87 seria el 7
            if(numero >9 && numero <16 || resto ==0 || numero ==0) {
                /*
                Esta condicion se usara para discriminar los numeros que no podremos unir o que nos provocan problemas a la hora de
                unir los numeros escritos
                 */
                switch (numero) {
                    case 0:
                        System.out.print("cero");
                        break;
                    case 10:
                        System.out.print("diez");
                        break;
                    case 11:
                        System.out.print("once");
                        break;
                    case 12:
                        System.out.print("doce");
                        break;
                    case 13:
                        System.out.print("trece");
                        break;
                    case 14:
                        System.out.print("catorce");
                        break;
                    case 15:
                        System.out.print("quince");
                        break;
                    case 20:
                        System.out.print("veinte");
                        break;
                    case 30:
                        System.out.print("treninta");
                        break;
                    case 40:
                        System.out.print("cuarenta");
                        break;
                    case 50:
                        System.out.print("cincuenta");
                        break;
                    case 60:
                        System.out.print("sesenta");
                        break;
                    case 70:
                        System.out.print("setenta");
                        break;
                    case 80:
                        System.out.print("ochenta");
                        break;
                    case 90:
                        System.out.print("noventa");
                        break;
                }
            }
            else {
                switch (decenas) {
                    case 0:
                        System.out.print(" ");
                        break;
                    case 1:
                        System.out.print("dieci");
                        break;
                    case 2:
                        System.out.print("veinti");
                        break;
                    case 3:
                        System.out.print("treinta y ");
                        break;
                    case 4:
                        System.out.print("cuarenta y ");
                        break;
                    case 5:
                        System.out.print("cincuenta y ");
                        break;
                    case 6:
                        System.out.print("sesenta y ");
                        break;
                    case 7:
                        System.out.print("setenta y ");
                        break;
                    case 8:
                        System.out.print("ochenta y ");
                        break;
                    case 9:
                        System.out.print("noventa y ");
                        break;
                    default:
                        System.out.print(" ");
                        break;
                }
                switch (resto) {
                    case 1:
                        System.out.println("uno");
                        break;
                    case 2:
                        System.out.println("dos");
                        break;
                    case 3:
                        System.out.println("tres");
                        break;
                    case 4:
                        System.out.println("cuatro");
                        break;
                    case 5:
                        System.out.println("cinco");
                        break;
                    case 6:
                        System.out.println("seis");
                        break;
                    case 7:
                        System.out.println("siete");
                        break;
                    case 8:
                        System.out.println("ocho");
                        break;
                    case 9:
                        System.out.println("nueve");
                        break;
                    default:
                        System.out.println(" ");
                        break;
                }
            }
            teclado.close();

    }
}
