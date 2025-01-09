package org.example;

public class Boletin8_2_ej4 {
    public static void main(String[] args) {
        String numero = "55";
        String numeroConPuntos = "";
        if(numero.length() % 3 ==0){
            int contador=0;
            for(int i=0;i<numero.length();i++){
                numeroConPuntos =numeroConPuntos + numero.charAt(i);
                contador++;
                if(contador==3 && i!=numero.length()-1){
                    numeroConPuntos=numeroConPuntos+".";
                    contador=0;
                }
            }
            System.out.println(numeroConPuntos);
        }
        else if(numero.length() % 3==2){
            int contador=0;
            boolean valid=true;
            for(int i=0;i<numero.length();i++){
                numeroConPuntos =numeroConPuntos + numero.charAt(i);
                contador++;
                if(contador==2 && valid && i!=numero.length()-1){
                    numeroConPuntos=numeroConPuntos+".";
                    contador=0;
                    valid=false;
                }
                if(contador==3 && i!=numero.length()-1){
                    numeroConPuntos=numeroConPuntos+".";
                    contador=0;
                }

            }
            System.out.println(numeroConPuntos);
        }
        else if(numero.length() % 3==1){
            int contador=0;
            boolean valid=true;
            for(int i=0;i<numero.length();i++){
                numeroConPuntos =numeroConPuntos + numero.charAt(i);
                contador++;
                if(contador==1 && valid && i!=numero.length()-1){
                    numeroConPuntos=numeroConPuntos+".";
                    contador=0;
                    valid=false;
                }
                if(contador==3 && i!=numero.length()-1){
                    numeroConPuntos=numeroConPuntos+".";
                    contador=0;
                }

            }
            System.out.println(numeroConPuntos);
        }


    }

}
