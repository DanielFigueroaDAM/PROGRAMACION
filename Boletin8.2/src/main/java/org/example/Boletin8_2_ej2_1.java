package org.example;

public class Boletin8_2_ej2_1 {
    public static void main(String[] args) {
        String cadea="Galicia esta en españa y estamos en 2025";
        System.out.println(comas(cadea));
        System.out.println(espacios(cadea));
        System.out.println(numeros(cadea));
        System.out.println(puntos(cadea));

    }
    public static int comas(String cadea){
        String cadeaNueva="";
        int comas=0;
        for(int i=0;i<cadea.length();i++){
            cadeaNueva =cadeaNueva + cadea.charAt(i);
            if(Character.isLetter(cadea.charAt(i))) {
                if(i!=cadea.length()-1) {
                    comas++;
                }
            }

        }
        return comas;
    }
    public static int espacios(String cadea){
        String cadeaNueva="";
        int contador=0;
        for(int i=0;i<cadea.length();i++){
            if(Character.isWhitespace(cadea.charAt(i))) {
                contador++;
            }
            else {
                cadeaNueva =cadeaNueva + cadea.charAt(i);
            }
        }
        return contador;
    }
    public static int numeros(String cadea){
        String cadeaNueva="";
        int contador=0;
        for(int i=0;i<cadea.length();i++){
            if(Character.isDigit(cadea.charAt(i))) {
                contador++;
            }
            else {
                cadeaNueva =cadeaNueva + cadea.charAt(i);
            }
        }
        return contador;
    }
    public static int puntos(String cadea){
        String cadeaNueva="";
        int contador=0,cuentaPuntos=0;
        int lenght=cadea.length();
        for(int i=0;i<lenght;i++){
            cadeaNueva =cadeaNueva + cadea.charAt(i);
            contador++;
            if(contador==3){
                cadeaNueva=cadeaNueva+".";
                cuentaPuntos++;
                contador=0;
            }
        }
        return cuentaPuntos;
    }

}
