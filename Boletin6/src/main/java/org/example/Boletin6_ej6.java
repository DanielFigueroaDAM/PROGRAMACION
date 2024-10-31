package org.example;

public class Boletin6_ej6 {
    public static void main(String[] args){
        int numero1=1184,numero2=1210;
        numerosamigos(numero1,numero2);

    }

    static void numerosamigos(int a,int b){
        int suma1=0,suma2=0;
        for(int i=1;i<a;i++){
            int resto1=a%i;
            if(resto1==0){
                suma1=suma1+i;
            }
        }
        for(int i=1;i<b;i++){
            int resto2=b%i;
            if(resto2==0){
                suma2=suma2+i;
            }
        }
        if(suma1==b && suma2==a){
            System.out.println("Son numeros amigos");
        }
        else{
            System.out.println("No son numeros amigos");
        }
    }
}
