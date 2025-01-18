package org.example;
import java.util.Scanner;
public class Boletin8_2_ej10 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        boolean buc=true;
        do {
            System.out.println("Escribe la contraseña");
            System.out.println("Condiciones-> Entre 8 y 20 caracteres, tiene que tener alguan letra mayuscula y alguna letra minuscula,");
            System.out.println("tiene que tener algún caracter raro como: $ % _ * y tiene que tener algún numero");
            String contraseña = tec.nextLine();
            buc=comprobador(contraseña);

        }while (buc==false);
        System.out.println("Su contraseña es valida");
    }
    public static boolean comprobador(String contraseña){
        boolean comprobadorMayus=false,comprobadorMinus=false,comprobadorDigit=false,comprobadorRaro=false;
        if (contraseña.length() >= 8 && contraseña.length() <= 20) {
            for (int i=0;i<contraseña.length();i++) {
                if(!comprobadorMayus) {
                    comprobadorMayus = Character.isUpperCase(contraseña.charAt(i));
                }
                if(!comprobadorMinus) {
                    comprobadorMinus = Character.isLowerCase(contraseña.charAt(i));
                }
                if(!comprobadorDigit) {
                    comprobadorDigit = Character.isDigit(contraseña.charAt(i));
                }
                if(!comprobadorRaro){
                    if (contraseña.charAt(i) == '*' || contraseña.charAt(i) == '$' || contraseña.charAt(i) == '_' || contraseña.charAt(i) == '%') {
                        comprobadorRaro = true;
                    }
                }

            }
            if(!comprobadorMayus || !comprobadorDigit || !comprobadorMinus || !comprobadorRaro){
                System.out.println("Repita la contraseña, no es valida");
                return false;
            }
        } else {
            System.out.println("La contraseña no cumple con las condiciones de longitud");
            return false;
        }
        return true;
    }
}
