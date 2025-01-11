package org.example;

public class Boletin8_2_ej6 {
    public static void main(String[] args) {
        String cadea="algoritmo";
        System.out.println(consonantes(cadea));
        System.out.println(vocales(cadea));
        System.out.println(siguienteVocal(cadea));
        System.out.println(palindromo("hola"));
    }
    public static String consonantes(String cadea){
        String consonantes="";
        for(int i=0;i<cadea.length();i++){
            if(cadea.charAt(i)!='a' && cadea.charAt(i)!='e' && cadea.charAt(i)!='i' && cadea.charAt(i)!='o' && cadea.charAt(i)!='u'){
                consonantes=consonantes+cadea.charAt(i);
            }
        }
        return consonantes;

    }
    public static String vocales(String cadea){
        String vocales="";
        for(int i=0;i<cadea.length();i++){
            if(cadea.charAt(i)=='a' || cadea.charAt(i)=='e' || cadea.charAt(i)=='i' || cadea.charAt(i)=='o' || cadea.charAt(i)=='u'){
                vocales=vocales+cadea.charAt(i);
            }
        }
        return vocales;

    }
    public static String siguienteVocal(String cadea){
        String siguienteVocal="";
        for(int i=0;i<cadea.length();i++){
            if(cadea.charAt(i)=='a'){
                siguienteVocal=siguienteVocal+'e';
            }
            else if(cadea.charAt(i)=='e'){
                siguienteVocal=siguienteVocal+'i';
            }
            else if(cadea.charAt(i)=='i'){
                siguienteVocal=siguienteVocal+'o';
            }
            else if(cadea.charAt(i)=='o'){
                siguienteVocal=siguienteVocal+'u';
            }
            else if(cadea.charAt(i)=='u'){
                siguienteVocal=siguienteVocal+'a';
            }
            else{
                siguienteVocal=siguienteVocal+cadea.charAt(i);
            }
        }
        return siguienteVocal;
    }
    public static boolean palindromo(String cadea){
        boolean palindromo=true;
        String minus=cadea.toLowerCase();
        String limpia = minus.replaceAll(" ","");
        String limpia2="";
        char sub=0;
        for(int i=0;i<limpia.length();i++){
            sub=switch (limpia.charAt(i)) {
                case 'á' -> 'a';
                case 'é' -> 'e';
                case 'í' -> 'i';
                case 'ó' -> 'o';
                case 'ú' -> 'u';
                default -> limpia.charAt(i);
            };
            limpia2+=sub;
        }
        String inversa="";
        for(int i = limpia2.length()-1; i>=0;i--){
            inversa+=limpia2.charAt(i);
        }
        if(!limpia2.equals(inversa)){
            palindromo=false;
        }
        return palindromo;
    }
}
