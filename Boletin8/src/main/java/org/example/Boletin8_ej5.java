package org.example;

public class Boletin8_ej5 {
    public static void main(String[] args) {
        String txt="java java java";
        txt=txt.replaceAll("\\s", "").toLowerCase();
        int vocalesCount = 0,consonatesCount = 0;
        for (char c : txt.toCharArray()) {
            if(Character.isLetter(c)) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vocalesCount++;
                }
                else {
                    consonatesCount++;
                }
            }
        }
        System.out.println("El numero de vocales: "+vocalesCount);
        System.out.println("El numero de consonantes: "+consonatesCount);
    }
}
