package org.example;

import java.util.Scanner;

/**
 * Clase principal que implementa el juego del ahorcado.
 * El jugador debe adivinar una palabra oculta letra por letra o intentando adivinar la palabra completa.
 * El juego termina cuando el jugador adivina la palabra o cuando se agotan los intentos.
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
public class Ahorcado {

    private static int contador = 0; // Contador de intentos fallidos.

    /**
     * Método principal que inicia el juego.
     * @param args Argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String interrogante = "palabra"; // Palabra a adivinar.
        interrogante = interrogante.toLowerCase();
        interrogante = limpiarTildes(interrogante);
        interrogante = interrogante.replaceAll(" ", "");

        String oculta = ""; // Representación oculta de la palabra.
        boolean victoria = true;

        // Inicializa la palabra oculta con guiones bajos.
        for (int i = 0; i < interrogante.length(); i++) {
            oculta = oculta + "_";
        }

        System.out.println(oculta);

        // Bucle principal del juego.
        do {
            System.out.println("Vas a probar con letra o con palabra?");
            System.out.println("1.- Letra");
            System.out.println("2.- Palabra");
            int opcion = tec.nextInt();

            if (opcion == 1) {
                oculta = buscarletra4(pedir(), interrogante, oculta);
                mostrar(contador);
            } else if (opcion == 2) {
                System.out.println("Dime la palabra");
                String palabra = tec.next();
                palabra = palabra.toLowerCase();
                palabra = limpiarTildes(palabra);
                if (buscarPalabra(palabra, interrogante)) {
                    break;
                } else {
                    System.out.println("Has fallado");
                    contador++;
                }
                mostrar(contador);
            }

            System.out.println(oculta);

            if (contador == 8) {
                victoria = false;
                break;
            }

        } while (!interrogante.equals(oculta));

        // Mensaje final del juego.
        if (!victoria) {
            System.out.println("La palabra era " + interrogante);
            System.out.println("Has perdido");
        } else {
            System.out.println("Has ganado");
        }
    }

    /**
     * Solicita al jugador una letra.
     * @return La letra ingresada por el jugador.
     */
    public static char pedir() {
        Scanner tec = new Scanner(System.in);
        System.out.println("Dime una letra");
        String caracter = tec.next();
        caracter = caracter.toLowerCase();
        caracter = limpiarTildes(caracter);
        if (caracter.length() > 1) {
            System.out.println("No es valido");
            return '!';
        }
        return caracter.charAt(0);
    }

    /**
     * Busca una letra en la palabra oculta y actualiza la representación oculta.
     * @param caracter La letra a buscar.
     * @param interrogante La palabra a adivinar.
     * @param oculta La representación oculta de la palabra.
     * @return La representación oculta actualizada.
     */
    public static String buscarletra(char caracter, String interrogante, String oculta) {
        char[] caracteres = oculta.toCharArray();
        boolean encontrado = false;

        for (int i = 0; i < interrogante.length(); i++) {
            if (caracter == interrogante.charAt(i)) {
                encontrado = true;
                caracteres[i] = caracter;
            }
        }

        if (!encontrado) {
            System.out.println("No esta la letra");
            contador++;
        }

        return new String(caracteres);
    }

    /**
     * Versión alternativa de buscarletra que utiliza una cadena resultante.
     * @param caracter La letra a buscar.
     * @param interrogante La palabra a adivinar.
     * @param oculta La representación oculta de la palabra.
     * @return La representación oculta actualizada.
     */
    public static String buscarletra2(char caracter, String interrogante, String oculta) {
        boolean encontrado = false;
        String nuevaOculta = "";

        for (int i = 0; i < interrogante.length(); i++) {
            if (caracter == interrogante.charAt(i)) {
                encontrado = true;
                nuevaOculta += caracter;
            } else {
                nuevaOculta += oculta.substring(i, i + 1);
            }
        }

        if (!encontrado) {
            System.out.println("No está la letra");
            contador++;
        }

        return nuevaOculta;
    }

    /**
     * Otra versión alternativa de buscarletra que utiliza charAt.
     * @param caracter La letra a buscar.
     * @param interrogante La palabra a adivinar.
     * @param oculta La representación oculta de la palabra.
     * @return La representación oculta actualizada.
     */
    public static String buscarletra3(char caracter, String interrogante, String oculta) {
        boolean encontrado = false;
        String nuevaOculta = "";

        for (int i = 0; i < interrogante.length(); i++) {
            if (caracter == interrogante.charAt(i)) {
                encontrado = true;
                nuevaOculta += caracter;
            } else {
                nuevaOculta += oculta.charAt(i);
            }
        }

        if (!encontrado) {
            System.out.println("No está la letra");
            contador++;
        }

        return nuevaOculta;
    }

    /**
     * Versión optimizada de buscarletra que utiliza indexOf.
     * @param caracter La letra a buscar.
     * @param interrogante La palabra a adivinar.
     * @param oculta La representación oculta de la palabra.
     * @return La representación oculta actualizada.
     */
    public static String buscarletra4(char caracter, String interrogante, String oculta) {
        char[] caracteres = oculta.toCharArray();
        int inicio = 0, i;
        boolean encontrado = false;

        do {
            i = interrogante.indexOf(caracter, inicio);
            if (i >= 0) {
                caracteres[i] = interrogante.charAt(i);
                inicio = i + 1;
                encontrado = true;
            }
        } while (i >= 0 && i < interrogante.length() - 1);

        if (!encontrado) {
            System.out.println("No está la letra");
            contador++;
        }

        return new String(caracteres);
    }

    /**
     * Busca una palabra completa en la palabra a adivinar.
     * @param palabra La palabra ingresada por el jugador.
     * @param interrogante La palabra a adivinar.
     * @return true si la palabra coincide, false en caso contrario.
     */
    public static boolean buscarPalabra(String palabra, String interrogante) {
        return palabra.equals(interrogante);
    }

    /**
     * Muestra el estado actual del ahorcado basado en el número de intentos fallidos.
     * @param contador El número de intentos fallidos.
     */
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

    /**
     * Limpia las tildes de una cadena de texto.
     * @param interrogante La cadena de texto a limpiar.
     * @return La cadena de texto sin tildes.
     */
    public static String limpiarTildes(String interrogante) {
        interrogante = interrogante.toLowerCase();
        interrogante = interrogante.replace('á', 'a');
        interrogante = interrogante.replace('é', 'e');
        interrogante = interrogante.replace('í', 'i');
        interrogante = interrogante.replace('ó', 'o');
        interrogante = interrogante.replace('ú', 'u');
        return interrogante;
    }
}