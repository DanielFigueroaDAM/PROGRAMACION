package org.example;

/**
 * Calcular la superficie de un triángulo utilizando valores fijos de base y altura.
 * El programa toma la base y altura del triángulo, calcula el área y la muestra en pantalla.
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
public class Boletin2_ej1 {
    public static void main(String[] args) {
        // Declaración de variables para la base, la altura y el resultado
        int base, altura, resultado;

        // Inicialización de base y altura con valores fijos
        base = 4;
        altura = 3;

        // Cálculo del área del triángulo usando la fórmula: (base * altura) / 2
        resultado = (base * altura) / 2;

        // Imprime el área calculada en la consola
        System.out.println("El área del triángulo es " + resultado);
    }
}
