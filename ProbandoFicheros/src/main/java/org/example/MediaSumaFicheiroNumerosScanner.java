package org.example;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MediaSumaFicheiroNumerosScanner {
    public static void main(String[] args) {
        FileReader entrada = null;
        Scanner sc = null;
        int suma = 0, cuenta = 0;

        try {
            entrada = new FileReader("/home/dam/PROGRAMACION/ProbandoFicheros/src/main/java/org/example/numeros");
            sc = new Scanner(entrada);

            // Leemos todos los números (int) que haya en el fichero
            while (sc.hasNextInt()) {
                suma += sc.nextInt();
                cuenta++;
            }

        } catch (IOException e) {
            System.out.println("Error de E/S: " + e.getMessage());
        } finally {
            // Cerramos el Scanner y el FileReader
            if (sc != null) {
                sc.close();
            }
            if (entrada != null) {
                try {
                    entrada.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar: " + e.getMessage());
                }
            }
        }


        if (cuenta > 0) {
            System.out.println("La suma es: " + suma);
            System.out.println("La media es: " + ((double)suma / cuenta));
        } else {
            System.out.println("No se leyeron números.");
        }
    }
}
