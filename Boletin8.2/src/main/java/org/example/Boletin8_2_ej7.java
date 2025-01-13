package org.example;

public class Boletin8_2_ej7 {
    public static void main(String[] args) {
        String text1 ="casos";
        String text2 ="caso";
        System.out.println(estaContido(text1,text2));
        System.out.println(ordenAlfabetico(text1,text2));
    }
    public static boolean estaContido(String text1, String text2){
        if(text1.contains(text2) || text2.contains(text1)){
            return true;
        }
        else{
            return false;
        }
    }
    public static String ordenAlfabetico(String text1, String text2){
        for(int i=0;i<text1.length();i++) {
            if (text1.charAt(i) < text2.charAt(i)) {
                return text1;
            } else if (text1.charAt(i) > text2.charAt(i)) {
                return text2;
            }
            else if(text1.length()>text2.length()){
                return text2;
            }
            else if(text1.length()<text2.length()){
                return text1;
            }
        }
        return "iguales";
    }
}
