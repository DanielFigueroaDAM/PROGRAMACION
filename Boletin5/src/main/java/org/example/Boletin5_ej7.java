package org.example;

import java.util.Scanner;


public class Boletin5_ej7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            // Espacios iniciales para centrar el triángulo
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Asteriscos y espacios intermedios
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println(); // Salto de línea
        }

        scanner.close();
    }

}
/*
package org.example;

import java.util.Scanner;


public class Boletin5_ej7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número n: ");
        int n = scanner.nextInt();

        for(int i=1;i<=n;i++){
            for (int j=0;j<=n-i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
        }

        scanner.close();
    }

}
