package org.example;


public class Main {
    public static void main(String[] args) {
        int[] edades = new int[5];
        edades[0] = 31;
        edades[1] = 23;
        edades[2] = 56;
        edades[3] = 12;
        edades[4] = 32;

        // Imprimir un valor específico
        System.out.println(edades[4]);

        String[] nomes = {"Manuel", "Jose", "Rosa", "Ana"};
        System.out.println(nomes[3]);

        // Calcular el valor mínimo usando un bucle for normal
        int minimo = edades[0];
        for (int i = 1; i < edades.length; i++) {
            if (minimo > edades[i]) {
                minimo = edades[i];
            }
        }
        System.out.println("O valor minimo de edades é " + minimo);

        // Calcular el valor mínimo usando for-each
        minimo = edades[0]; // Reiniciar el valor mínimo
        for (int edad : edades) {
            if (minimo > edad) {
                minimo = edad;
            }
        }
        System.out.println("O valor minimo de edades é " + minimo);
    }

}