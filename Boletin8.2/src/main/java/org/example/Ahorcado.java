package org.example;

import java.util.Scanner;


public class Ahorcado {
    public static void main(String[] args) {
        String interrogante="Palabra";
        String oculta="";
        for (int i = 0; i < interrogante.length(); i++) {
            oculta=oculta+"_";
        }
        int contador=0;
        do {
            oculta=buscar(pedir(),interrogante,oculta);
            contador++;
            System.out.println(oculta);
        }while (interrogante.equals(oculta));

    }
    public static char pedir(){
        Scanner tec = new Scanner(System.in);
        System.out.println("Dime una letra");
        String caracter=tec.next();
        if(caracter.length()>1){
            System.out.println("No es valido");
            return '!';
        }
        return caracter.charAt(0);
    }
    public static String buscar(char caracter,String interrogante, String oculta){
        char[] caracteres = oculta.toCharArray();
        for (int i=0;i<interrogante.length();i++) {
            if (caracter == interrogante.charAt(i)) {
                caracteres[i] = caracter;
            }
        }
        String palabra = new String(caracteres);
        return palabra;
    }

}
