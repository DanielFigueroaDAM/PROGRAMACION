package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExemploBufferedReader {
    public static void main(String[] args) {
        String texto = "";
        BufferedReader entrada = null;

        try {
            System.out.println("O texto do ficheiro é: ");
            entrada = new BufferedReader(new FileReader("/home/dam/PROGRAMACION/ProbandoFicheros/src/main/java/org/example/ficheiroTextoProba"));
            String linea = entrada.readLine();
            while (linea!=null) {
                System.out.println(linea);
                linea = entrada.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro de entrada/saida: " + e.getMessage());
        } finally {
            if (entrada != null) {
                try {
                    entrada.close();
                } catch (IOException e) {
                    System.out.println("Erro de entrada/saida al cerrar: " + e.getMessage());
                }
            }
        }
    }
}
