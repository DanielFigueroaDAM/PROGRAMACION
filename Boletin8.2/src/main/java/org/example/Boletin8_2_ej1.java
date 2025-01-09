package org.example;

public class Boletin8_2_ej1 {
    public static void main(String[] args) {
        String cadea = "paco";
        dosPrimerosCaracteres(cadea);
        dosPrimerosCaracteresManual(cadea);
        System.out.println(" ");
        dosPrimerosCaracteresArray(cadea);
        tresUltimosCaracteres(cadea);
        cadaDosCaracteres(cadea);
        mostrarinverso(cadea);
    }
    public static void dosPrimerosCaracteres(String cadea){
        System.out.println(cadea.substring(0, 2));
    }
    public static void dosPrimerosCaracteresManual(String cadea){
        for(int i=0;i<2;i++){
            System.out.print(cadea.charAt(i));
        }
    }
    public static void dosPrimerosCaracteresArray(String cadea){
        char[] charArray = cadea.toCharArray();
        for(int i=0;i<2;i++){
            System.out.print(charArray[i]);
        }
        System.out.println(" ");
    }
    public static void tresUltimosCaracteres(String cadea){
        System.out.println(cadea.substring(cadea.length()-3,cadea.length()));
    }
    public static void cadaDosCaracteres(String cadea){
        for(int i=0;i<cadea.length();i=i+2){
            System.out.print(cadea.charAt(i));
        }
        System.out.println(" ");
    }
    public static void mostrarinverso(String cadea){
        System.out.print(cadea);
        for(int i=cadea.length()-1;i>=0;i--){
            System.out.print(cadea.charAt(i));
        }
    }
}
