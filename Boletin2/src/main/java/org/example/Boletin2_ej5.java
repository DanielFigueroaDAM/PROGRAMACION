package org.example;
/**
 * Convertir una cantidad de millas n&aacute;uticas a metros.
 * El programa solicita una cantidad en millas n&aacute;uticas, realiza la conversi&oacute;n a metros y muestra el resultado.
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
import java.util.Scanner;

public class Boletin2_ej5 {
    public static void main(String[] args) {
        // Creación del objeto Scanner para leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);

        // Declaración de variables para las millas náuticas, el valor en metros y el resultado de la conversión
        double millas, metros = 1852, resultado;

        // Solicita al usuario la cantidad de millas náuticas
        System.out.println("Dime la cantidad de millas ");
        millas = teclado.nextDouble();

        // Realiza la conversión de millas náuticas a metros
        resultado = millas * metros;

        // Muestra el resultado de la conversión en pantalla
        System.out.println("El cambio da " + resultado);

        // Cierra el objeto Scanner para liberar recursos
        teclado.close();
    }
}
