package org.example;

public class Boletin8_2_ej5 {
    public static void main(String[] args) {
        String text = "republica de Argentina";
        System.out.println(iniciales(text));
        System.out.println(mayusculas(text));
        System.out.println(letrasA(text));
    }

    public static String iniciales(String text) {
        String iniciales = "";
        String[] palabras = text.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            iniciales = iniciales + palabras[i].charAt(0);
        }
        return iniciales;
    }

    public static String mayusculas(String text) {
        String mayusculas = "";
        char inicial = 0;
        int contador = 0;
        String[] palabras = text.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            inicial = palabras[i].charAt(0);
            inicial = Character.toUpperCase(inicial);
            if (i != palabras.length - 1) {
                    mayusculas = mayusculas + inicial + palabras[i].substring(1, palabras[i].length()) + " ";
                }
            else{
                    mayusculas = mayusculas + inicial + palabras[i].substring(1, palabras[i].length());
            }
        }
        return mayusculas;
    }
    public static String letrasA(String text){
        String letrasA="";
        String[] palabras = text.split(" ");
        for(int i=0;i<palabras.length;i++){
            if(palabras[i].charAt(0)=='a' || palabras[i].charAt(0)=='A'){
                letrasA=letrasA+palabras[i]+" ";
            }
        }
        return letrasA;
    }
}

