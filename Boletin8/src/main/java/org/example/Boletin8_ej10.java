package org.example;

public class Boletin8_ej10 {
    public static void main(String[] args) {
        String textNotAscii = "ABCD";
        StringBuilder textAscii = new StringBuilder();

        for (char c : textNotAscii.toCharArray()) {
            textAscii.append((int) c).append(" ");
        }

        System.out.println("Representacion ASCII: " + textAscii.toString().trim());
    }
}
