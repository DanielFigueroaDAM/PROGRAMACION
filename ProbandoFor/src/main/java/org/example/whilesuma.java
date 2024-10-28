```java
        package org.example;

import java.util.Scanner;

public class whilesuma {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n, sum=0, x=0;

        // Bucle que pide números al usuario, finaliza si se introduce 999 o si se llega a 10 números
        do{
            System.out.println("Dime cada numero(para salir ingresa el 999): ");
            n = sc.nextInt();
            if(n!=999) { // Si el número no es 999, se suma al total
                sum = sum + n;
            }
            x++; // Aumenta el contador de números ingresados
        }while (n!=999 && x<10); // Condición para salir del bucle
        System.out.println("La suma es "+sum); // Muestra el total de la suma
        sc.close();
    }
}
```