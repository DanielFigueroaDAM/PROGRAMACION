package org.example;

public class Boletin8_ej11 {
    public static void main(String[] args) {
        String texto = "Ola, son alumno de DAM1, e son programador desde o 2024";
        analizarTexto(texto);
    }
    public static void analizarTexto(String string){
        int numeroLetras = 0, numeroNumeros = 0, numeroEspacios = 0;
        for (char c : string.toCharArray()) {
            if(Character.isLetter(c)) {
                numeroLetras++;
            }
            else if(Character.isDigit(c)) {
                numeroNumeros++;
            }
            else if(Character.isWhitespace(c)) {
                numeroEspacios++;
            }
        }
    }
}
