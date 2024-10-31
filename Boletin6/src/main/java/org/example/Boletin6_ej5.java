package org.example;

public class Boletin6_ej5 {
    public static void main(String []args){
        int hora11=6, minuto11=2, hora22=3, minuto22=1;
        int diferencia=diferenciaMin(hora11,minuto11,hora22,minuto22);
        System.out.println(diferencia+" minutos");
    }


    static int diferenciaMin (int hora1, int minuto1, int hora2, int minuto2){

        int resultado1=hora1*60+minuto1;
        int resultado2=hora2*60+minuto2;
        if(resultado2 <= resultado1){
            return resultado1-resultado2;
        }
        else{
            return resultado2-resultado1;
        }
    }
}

