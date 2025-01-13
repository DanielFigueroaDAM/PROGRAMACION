package org.example;

import java.util.Scanner;


public class Ahorcado {
    private static int contador=0;
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String interrogante="camioneta";
        String oculta="";
        boolean victoria=true;
        for (int i = 0; i < interrogante.length(); i++) {
            oculta=oculta+"_";
        }
        do {
            System.out.println("Vas a probar con letra o con palabra?");
            System.out.println("1.- Letra");
            System.out.println("2.- Palabra");
            int opcion=tec.nextInt();
            if(opcion==1){
                oculta=buscarletra(pedir(),interrogante,oculta);
                mostrar(contador);
            }
            else if(opcion==2){
                System.out.println("Dime la palabra");
                String palabra=tec.next();
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
                           |       (x_x)
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
                           |       (x_x)
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
                           |       (x_x)
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
                           |       (x_x)
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
                           |       (x_x)
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
                           |       (x_x)
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
}
