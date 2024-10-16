package org.example;

import java.util.Scanner;

public class Del0al99 {

        public static void main(String[] args) {
            Scanner teclado=new Scanner (System.in);
            int n,n1,n2;
            System.out.println("Dime un numero del 0 al 99");
            n=teclado.nextInt();
            n1=n/10;
            n2=n%10;
            if(n>9 && n<16 || n2==0 || n==0) {
                switch (n) {
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
                switch (n1) {
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
                switch (n2) {
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
