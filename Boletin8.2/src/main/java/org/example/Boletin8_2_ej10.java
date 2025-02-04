package org.example;
import java.util.Scanner;

/**
 * Clase para validar contraseñas según criterios específicos.
 *
 * @author Daniel Figueroa
 * @version 1.0
 */
public class Boletin8_2_ej10 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        boolean buc = true;
        do {
            System.out.println("Escribe la contraseña");
            System.out.println("Condiciones-> Entre 8 y 20 caracteres, tiene que tener alguna letra mayúscula y alguna minúscula,");
            System.out.println("tiene que tener algún carácter especial como: $ % _ * y algún número");
            String contraseña = tec.nextLine();
            buc = comprobador(contraseña);
        } while (!buc);
        System.out.println("Su contraseña es válida");
    }

    /**
     * Valida una contraseña según los criterios establecidos.
     *
     * @param contraseña La contraseña a validar
     * @return true si la contraseña es válida, false en caso contrario
     */
    public static boolean comprobador(String contraseña) {
        boolean tieneMayus = false, tieneMinus = false, tieneNumero = false, tieneEspecial = false;
        String especiales = "$%_*";  // Caracteres especiales válidos

        // Verifica longitud
        if (contraseña.length() < 8 || contraseña.length() > 20) {
            System.out.println("La contraseña no cumple con la longitud requerida (8-20 caracteres).");
            return false;
        }

        // Verifica cada carácter
        for (int i = 0; i < contraseña.length(); i++) {
            char c = contraseña.charAt(i);
            if (Character.isUpperCase(c)) {
                tieneMayus = true;
            } else if (Character.isLowerCase(c)) {
                tieneMinus = true;
            } else if (Character.isDigit(c)) {
                tieneNumero = true;
            } else if (especiales.indexOf(c) != -1) {  // Verifica si el carácter está en la lista de especiales
                tieneEspecial = true;
            }
        }

        // Verifica si se cumplieron todas las condiciones
        if (!tieneMayus) {
            System.out.println("Falta al menos una letra mayúscula.");
        }
        if (!tieneMinus) {
            System.out.println("Falta al menos una letra minúscula.");
        }
        if (!tieneNumero) {
            System.out.println("Falta al menos un número.");
        }
        if (!tieneEspecial) {
            System.out.println("Falta al menos un carácter especial ($, %, _, *).");
        }

        return tieneMayus && tieneMinus && tieneNumero && tieneEspecial;
    }
}