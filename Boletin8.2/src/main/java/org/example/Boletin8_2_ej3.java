package org.example;

public class Boletin8_2_ej3 {
    public static void main(String[] args) {
        String cadea="Galicia esta en españa y estamos en 2025";
        int numero=3;
        String conComas= comas(cadea,numero);
        System.out.println(conComas);
        String sinEspacios= espacios(cadea,numero);
        System.out.println(sinEspacios);
        String sinNumeros= numeros(cadea,numero);
        System.out.println(sinNumeros);
        String conPuntos=puntos(cadea,numero);
        System.out.println(conPuntos);
    }
    public static String comas(String cadea, int numero){
        String cadeaNueva="";
        int contador=0;
        boolean valid=true;
        for(int i=0;i<cadea.length();i++){
            cadeaNueva =cadeaNueva + cadea.charAt(i);
            if(Character.isLetter(cadea.charAt(i))) {
                if(i!=cadea.length()-1 && valid) {
                    cadeaNueva=cadeaNueva+",";
                    contador++;
                    if(contador==numero){
                        valid=false;
                    }
                }
            }

        }
        return cadeaNueva;
    }
    public static String espacios(String cadea,int numero){
        String cadeaNueva="";
        int contador=0;
        boolean valid=true;
        for(int i=0;i<cadea.length();i++){
            if(Character.isWhitespace(cadea.charAt(i)) && valid) {
                cadeaNueva=cadeaNueva+"\\_";
                contador++;
                if(contador==numero){
                    valid=false;
                }
            }
            else {
                cadeaNueva =cadeaNueva + cadea.charAt(i);
            }
        }
        return cadeaNueva;
    }
    public static String numeros(String cadea, int numero){
        String cadeaNueva="";
        int contador=0;
        boolean valid=true;
        for(int i=0;i<cadea.length();i++){
            if(Character.isDigit(cadea.charAt(i)) && valid) {
                cadeaNueva=cadeaNueva+"X";
                contador++;
                if(contador==numero){
                    valid=false;
                }
            }
            else {
                cadeaNueva =cadeaNueva + cadea.charAt(i);
            }
        }
        return cadeaNueva;
    }
    public static String puntos(String cadea, int numero){
        String cadeaNueva="";
        int contador=0,contador2=0;
        int lenght=cadea.length();
        boolean valid=true;
        for(int i=0;i<lenght;i++){
            cadeaNueva =cadeaNueva + cadea.charAt(i);
            contador++;
            if(contador==3 && valid){
                cadeaNueva=cadeaNueva+".";
                contador=0;
                contador2++;
                if(contador2==numero){
                    valid=false;
                }
            }
        }
        return cadeaNueva;
    }

}
