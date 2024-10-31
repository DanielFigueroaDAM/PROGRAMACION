package org.example;

/**
 * Programa para verificar si dos números son "números amigos".
 * Dos números son amigos si la suma de los divisores propios de uno
 * (excluyéndolo) es igual al otro número, y viceversa.
 *
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
public class Boletin6_ej6 {
    public static void main(String[] args){
        int numero1 = 1184, numero2 = 1210;
        numerosamigos(numero1, numero2); // Llama a la función que comprueba si son números amigos
    }

    /**
     * Comprueba si dos números son amigos, es decir, si la suma de los divisores
     * propios de un número es igual al otro número y viceversa.
     *
     * @param a Primer número
     * @param b Segundo número
     */
    static void numerosamigos(int a, int b) {
        int suma1 = 0, suma2 = 0;

        // Calcula la suma de los divisores propios de 'a' (excluyendo 'a' mismo)
        for (int i = 1; i < a; i++) {
            int resto1 = a % i;
            if (resto1 == 0) { // Comprueba si 'i' es divisor de 'a'
                suma1 += i;   // Si es divisor, lo suma a 'suma1'
            }
        }

        // Calcula la suma de los divisores propios de 'b' (excluyendo 'b' mismo)
        for (int i = 1; i < b; i++) {
            int resto2 = b % i;
            if (resto2 == 0) { // Comprueba si 'i' es divisor de 'b'
                suma2 += i;   // Si es divisor, lo suma a 'suma2'
            }
        }

        // Verificación de condición de "números amigos":
        // Comprueba si 'suma1' es igual a 'b' y 'suma2' es igual a 'a'
        if (suma1 == b && suma2 == a) {
            // Si ambas condiciones son verdaderas, 'a' y 'b' son números amigos
            System.out.println("Son numeros amigos");
        } else {
            // Si alguna de las condiciones no se cumple, no son números amigos
            System.out.println("No son numeros amigos");
        }
    }
}
