package org.example;

import java.util.Scanner;

public class ArrayLifo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] grados;
        grados= new int[5];
        int puntero =-1;
        boolean desborde;
        System.out.println("Introduce un numero");
        int num=teclado.nextInt();
        puntero=arrayfifo(grados,puntero,num);
        puntero=arrayfifo(grados,puntero,6);
        puntero=arrayfifo(grados,puntero,44);
        puntero=arrayfifo(grados,puntero,75);
        puntero=arrayfifo(grados,puntero,9);
        arrayleer(grados,puntero);
        puntero=arrayeliminar(grados,puntero);
        arrayleer(grados,puntero);
        puntero=arrayfifo(grados,puntero,68);
        puntero=arrayfifo(grados,puntero,11);
        puntero=arrayfifo(grados,puntero,10);
        puntero=arrayeliminar(grados,puntero);
        puntero=arrayeliminar(grados,puntero);
        puntero=arrayeliminar(grados,puntero);
        puntero=arrayeliminar(grados,puntero);
        puntero=arrayeliminar(grados,puntero);
        arrayleer(grados,puntero);
        /*
        for (int grad : grados) {
            System.out.println(grad);
        }
         */
    }
    public static int arrayfifo(int[]grados2,int puntero,int n){
        if(puntero<grados2.length-1){
            grados2[puntero+1]=n;
            puntero++;
            System.out.println("El numero apilado es"+ n);
        }
        else {
            System.out.println("Te has pasado");
        }
        return puntero;
    }
    public static void arrayleer(int[]gradosl,int cont) {
        if(cont>=0) {
            for (int i = cont; i >=0; i--) {
                System.out.println(gradosl[i]);
            }
        }
        else{
            System.out.println("Pila vacia");
        }
    }
    public static int arrayeliminar(int[]gradosl,int cont) {
        if(cont>=0){
            cont--;
            System.out.println("---------");
        }
        else{
            System.out.println("Está vacia");
        }
        return cont;
    }

}
