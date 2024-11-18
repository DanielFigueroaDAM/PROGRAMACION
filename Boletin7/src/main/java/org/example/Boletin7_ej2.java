package org.example;

public class Boletin7_ej2 {
    public static void main(String[] args) {
        int[] notas;
        int media = 0, alta = 0;
        notas = new int[30];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = (int) (Math.random() * 10);
            if(notas[i]>=5){
                System.out.println("aprobado "+notas[i]);
            }
            else{
                System.out.println("suspenso "+notas[i]);
            }

            media = media + notas[i];
            if (notas[i] > alta) {
                alta = notas[i];
            }

        }
        media = media / notas.length;
        System.out.println("\n La media es" + media);
        System.out.println("La nota mas alta es" + alta);

    }
}