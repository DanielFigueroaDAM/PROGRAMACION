package org.example;

import java.io.FileReader;
import java.io.IOException;

public class MediaSumaFicheiroNumerosScanner {
    public static void main(String[] args) {
        try {

            FileReader entrada = null;
            int suma=0,cuenta=0;

            try {
                entrada = new FileReader("/home/dam/PROGRAMACION/ProbandoFicheros/src/main/java/org/example/numeros");

                int caracter = entrada.read();

                while (caracter != -1) {
                    if((char)caracter!=' '){
                        suma += Character.getNumericValue((char) caracter);
                        cuenta++;
                    }
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

            System.out.println("La suma es: " + suma);
            System.out.println("La media es: "+suma/cuenta);

        }catch (ArithmeticException e){
            System.out.println("No se puede dividir por 0");
        }
    }
}
