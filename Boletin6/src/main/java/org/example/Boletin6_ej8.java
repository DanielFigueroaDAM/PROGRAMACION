package org.example;

/**
 * Calcula el resultado de elevar una base a un exponente de forma recursiva.
 * Este método utiliza la definición matemática de potencia donde cualquier número
 * elevado a 0 es igual a 1, y para cualquier exponente mayor a 0, multiplica la base
 * por el resultado de la base elevada a (exponente - 1).
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
public class Boletin6_ej8 {
    public static void main(String[] args) {
        int exp = exponenteRecursivo(2, 2); // Calcula 2 elevado a la potencia de 2
        System.out.println("El exponente es: " + exp); // Muestra el resultado
    }

    /**
     * Calcula el resultado de elevar una base a un exponente dado de forma recursiva.
     * Si el exponente es 0, retorna 1. Para exponentes mayores que 0, multiplica
     * la base por el resultado de la misma base elevada al (exponente - 1).
     *
     * @param base El número base que se elevará
     * @param exponente El exponente al cual se eleva la base
     * @return El resultado de base^exponente
     */
    static int exponenteRecursivo(int base, int exponente) {
        int resultado;

        // Caso base: si el exponente es 0, el resultado es 1
        if (exponente == 0) {
            resultado = 1;
        }
        // Caso recursivo: multiplica la base por el resultado de exponente - 1
        else {
            resultado = base * exponenteRecursivo(base, exponente - 1);
        }

        // Retorna el resultado final de la potencia
        return resultado;
    }
}

