package org.example;

public class Boletin8_ej6 {
    public static void main(String[] args) {
        String text="www. javadende0. com";
        int indiceText = text.indexOf('d');
        String copiedStartText = text.substring(0, indiceText);
        String copiedEndText = text.substring(indiceText, text.length());
        String newText = copiedStartText + copiedEndText;
        System.out.println(newText);
    }
}
