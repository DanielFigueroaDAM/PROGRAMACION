package org.example;

import java.io.FileReader;
import java.io.IOException;

public class ExemploFileReader {
    public static void main(String[] args) {
        String texto = "";
        FileReader entrada = null;

        try {
            entrada = new FileReader("/home/dam/PROGRAMACION/ProbandoFicheros/src/main/java/org/example/ficheiroTextoProba");
            int caracter = entrada.read();

            while (caracter != -1) {
                texto += (char) caracter;
                caracter = entrada.read();
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

        System.out.println("O texto do ficheiro é: " + texto);
    }
}
