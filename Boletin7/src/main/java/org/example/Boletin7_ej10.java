package org.example;

public class Boletin7_ej10 {
    public static void main(String[] args) {
        int[] numOrden = {1, 2, 3, 4, 5};
        int[] numDesord= {2, 3, 1, 5, 4};
        int num=2;
        int arraynuevo1[]=funcionArrayOrder(numOrden,num);
        int arraynuevo2[]=funcionArrayDesorder(numDesord,num);
        for(int numero:arraynuevo1){
            System.out.print(numero+"-");
        }
        System.out.println("\n");
        for(int numero:arraynuevo2){
            System.out.print(numero+"-");
        }
    }
    static int[] funcionArrayOrder(int[]arrayn1,int n){
        int[] arraynuevo = new int[arrayn1.length-1];
        int contador=0,contador2=0;
        for(int i=0;i<=arrayn1.length;i++){
            if(arrayn1[i]==n){
                for(int j=contador+1;j<=arrayn1.length-1;j++){
                        arraynuevo[contador2]=arrayn1[j];
                        contador2++;
                }
                break;
            }
            arraynuevo[i]=arrayn1[i];
            contador++;
            contador2++;

        }
        return arraynuevo;
    }
    static int[] funcionArrayDesorder(int[]arrayn2,int n){
        int[] arraynuevo = new int[arrayn2.length-1];
        int contador=0,contador2=0;
        for(int i=0;i<=arrayn2.length;i++){
            if(arrayn2[i]==n){
                for(int j=contador+1;j<=arrayn2.length-1;j++){
                    arraynuevo[contador2]=arrayn2[j];
                    contador2++;
                }
                break;
            }
            arraynuevo[i]=arrayn2[i];
            contador++;
            contador2++;

        }
        return arraynuevo;
    }
}
