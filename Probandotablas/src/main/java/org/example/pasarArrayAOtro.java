package org.example;

public class pasarArrayAOtro {
    public static void main(String[] args) {
        int[] notas;
        int media = 0, alta = 0, suspensos=0,aprobados=0, j=0;
        notas = new int[30];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = (int) (Math.random() * 11);
            if(notas[i]>=5){
                aprobados++;
            }
            else{
                suspensos++;
            }
            media = media + notas[i];
            if (notas[i] > alta) {
                alta = notas[i];
            }

        }
        int[] aprobadosarr;
        aprobadosarr = new int[aprobados+1];
        for(int i = 0; i < notas.length; i++){
            if(notas[i]>=5) {
                j++;
                aprobadosarr[j] = notas[i];
                System.out.println(aprobadosarr[j]);
            }
        }

        media = media / notas.length;
        System.out.println("El numero de suspensos es "+suspensos);
        System.out.println("El numero de aprobados es "+aprobados);
        System.out.println("\n La media es" + media);
        System.out.println("La nota mas alta es" + alta);

    }

}
