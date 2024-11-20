package org.example;

public class Boletin7_ej3 {
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
        int u=0;
        for(int z=0;z<aprobadosarr.length;z++){
            for(int p=0;p<aprobadosarr.length-1;p++){
                if(aprobadosarr[z]<aprobadosarr[u+1]){
                    int temp = aprobadosarr[p];
                    aprobadosarr[p] = aprobadosarr[p + 1];
                    aprobadosarr[p + 1] = temp;
                }
            }
        }

        media = media / notas.length;
        System.out.println("El numero de suspensos es "+suspensos);
        System.out.println("El numero de aprobados es "+aprobados);
        System.out.println("\n La media es" + media);
        System.out.println("La nota mas alta es" + alta);

    }
}
