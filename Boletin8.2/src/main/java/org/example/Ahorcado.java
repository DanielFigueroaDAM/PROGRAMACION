package org.example;

import java.util.Scanner;


public class Ahorcado {
    private static int contador=0;
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String interrogante="palabra";
        interrogante=interrogante.toLowerCase();
        interrogante=limpiarTildes(interrogante);
        interrogante=interrogante.replaceAll(" ","");
        String oculta="";
        boolean victoria=true;
        for (int i = 0; i < interrogante.length(); i++) {
            oculta=oculta+"_";
        }
        System.out.println(oculta);
        do {
            System.out.println("Vas a probar con letra o con palabra?");
            System.out.println("1.- Letra");
            System.out.println("2.- Palabra");
            int opcion=tec.nextInt();
            if(opcion==1){
                oculta=buscarletra4(pedir(),interrogante,oculta);
                mostrar(contador);
            }
            else if(opcion==2){
                System.out.println("Dime la palabra");
                String palabra=tec.next();
                palabra=palabra.toLowerCase();
                palabra=limpiarTildes(palabra);
                if(buscarPalabra(palabra,interrogante)){
                    break;
                }
                else{
                    System.out.println("Has fallado");
                    contador++;
                }
                mostrar(contador);
            }
            System.out.println(oculta);
            if(contador==8){
                victoria=false;
                break;
            }
        }while (!interrogante.equals(oculta));
        if (!victoria){
            System.out.println("La palabra era "+interrogante);
            System.out.println("Has perdido");
        }
        else {
            System.out.println("Has ganado");
        }

    }
    public static char pedir(){
        Scanner tec = new Scanner(System.in);
        System.out.println("Dime una letra");
        String caracter=tec.next();
        caracter=caracter.toLowerCase();
        caracter=limpiarTildes(caracter);
        if(caracter.length()>1){
            System.out.println("No es valido");
            return '!';
        }
        return caracter.charAt(0);
    }
    public static String buscarletra(char caracter,String interrogante, String oculta){
        char[] caracteres = oculta.toCharArray();
        boolean encontrado=false;
        for (int i=0;i<interrogante.length();i++) {
            if (caracter == interrogante.charAt(i)) {
                encontrado=true;
                caracteres[i] = caracter;
            }
        }
        if(!encontrado){
            System.out.println("No esta la letra");
            contador++;
        }
        String palabra = new String(caracteres);
        return palabra;
    }
    public static String buscarletra2(char caracter, String interrogante, String oculta) {
        boolean encontrado = false;
        String nuevaOculta = ""; // Cadena resultante.

        for (int i = 0; i < interrogante.length(); i++) {
            if (caracter == interrogante.charAt(i)) {
                encontrado = true;
                // Si la letra coincide, reemplazamos el carácter de `oculta` con el nuevo.
                nuevaOculta += caracter;
            } else {
                // Si no coincide, mantenemos el carácter de `oculta`.
                nuevaOculta += oculta.substring(i, i + 1);
            }
        }

        if (!encontrado) {
            System.out.println("No está la letra");
            contador++; // Incrementar el contador si no se encuentra la letra.
        }

        return nuevaOculta;
    }
    public static String buscarletra3(char caracter, String interrogante, String oculta) {
        boolean encontrado = false;
        String nuevaOculta = ""; // Cadena resultante.

        for (int i = 0; i < interrogante.length(); i++) {
            if (caracter == interrogante.charAt(i)) {
                encontrado = true;
                // Si la letra coincide, reemplazamos el carácter de `oculta` con el nuevo.
                nuevaOculta += caracter;
            } else {
                // Si no coincide, mantenemos el carácter de `oculta`.
                nuevaOculta += oculta.charAt(i);
            }
        }

        if (!encontrado) {
            System.out.println("No está la letra");
            contador++; // Incrementar el contador si no se encuentra la letra.
        }

        return nuevaOculta;
    }
    public static String buscarletra4(char caracter, String interrogante, String oculta) {
        char[] caracteres = oculta.toCharArray();
        int inicio = 0, i;
        boolean encontrado = false;

        do {
            i=interrogante.indexOf(caracter,inicio);
            if (i >= 0) {
                caracteres[i]=interrogante.charAt(i);
                inicio=i+1;
                encontrado=true;
            }
        } while (i>=0 && i<interrogante.length()-1);

        if (!encontrado) {
            System.out.println("No está la letra");
            contador++;
        }

        return new String(caracteres);
    }


    public static boolean buscarPalabra(String palabra,String interrogante){
        if(palabra.equals(interrogante)){
            return true;
        }
        return false;
    }
    public static void mostrar(int contador) {
        switch (contador) {
            case 1:
                System.out.println("""
                           
                           |         
                           |         
                           |        
                           |        
                           |        
                           |        
                           |        
                           |        
                           |_________
                        """);
                break;
            case 2:
                System.out.println("""
                           ___________
                           |         |
                           |         
                           |        
                           |        
                           |        
                           |        
                           |        
                           |        
                           |_________
                        """);
                break;
            case 3:
                System.out.println("""
                           ___________
                           |         |
                           |      ( °-° )
                           |        
                           |        
                           |        
                           |        
                           |        
                           |        
                           |_________
                        """);
                break;
            case 4:
                System.out.println("""
                           ___________
                           |         |
                           |      ( °-° )
                           |         |
                           |         |
                           |         |
                           |        
                           |        
                           |        
                           |_________
                        """);
                break;
            case 5:
                System.out.println("""
                           ___________
                           |         |
                           |      ( °-° )
                           |       --|
                           |         |
                           |         |
                           |        
                           |        
                           |        
                           |_________
                        """);
                break;
            case 6:
                System.out.println("""
                           ___________
                           |         |
                           |      ( °-° )
                           |       --|--
                           |         |
                           |         |
                           |        
                           |        
                           |        
                           |_________
                        """);
                break;
            case 7:
                System.out.println("""
                           ___________
                           |         |
                           |      ( °-° )
                           |       --|--
                           |         |
                           |        /
                           |        
                           |        
                           |        
                           |_________
                        """);
                break;
            case 8:
                System.out.println("""
                           ___________
                           |         |
                           |      ( x_x )
                           |       --|--
                           |         |
                           |        / \\
                           |        
                           |        
                           |        
                           |_________
                        """);
                break;
            default:
                System.out.println("No hay fallos");
        }

    }
    public static String limpiarTildes(String interrogante){
        interrogante=interrogante.toLowerCase();
        interrogante=interrogante.replace('á','a');
        interrogante=interrogante.replace('é','e');
        interrogante=interrogante.replace('í','i');
        interrogante=interrogante.replace('ó','o');
        interrogante=interrogante.replace('ú','u');
        return interrogante;
    }
}
