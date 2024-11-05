package org.example;

/**
 * Calcula la diferencia en minutos entre dos horarios dados en horas y minutos.
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */

public class Boletin6_ej5 {
    public static void main(String[] args) {
        // Horarios en horas y minutos
        int hora1 = 6, minuto1 = 2, hora2 = 3, minuto2 = 1;

        // Llama a la función diferenciaMin para calcular la diferencia en minutos entre los horarios
        int diferencia = diferenciaMin(hora1, minuto1, hora2, minuto2);

        // Muestra la diferencia en minutos
        System.out.println(diferencia + " minutos");
    }

    /**
     * Calcula la diferencia en minutos entre dos horarios dados en horas y minutos.
     *
     * @param hora1   Hora del primer horario.
     * @param minuto1 Minuto del primer horario.
     * @param hora2   Hora del segundo horario.
     * @param minuto2 Minuto del segundo horario.
     * @return La diferencia en minutos entre ambos horarios, calculada en valor absoluto para obtener
     * siempre un resultado positivo.
     */
    static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2) {
        // Convierte el primer horario a minutos
        int totalMinutos1 = hora1 * 60 + minuto1;

        // Convierte el segundo horario a minutos
        int totalMinutos2 = hora2 * 60 + minuto2;

        // Calcula y retorna la diferencia en minutos entre ambos horarios.
        // La diferencia se calcula en valor absoluto para asegurar que siempre sea positiva.
        // Comprobamos cuál de los dos horarios es mayor
        if (totalMinutos2 <= totalMinutos1) { // Si el segundo horario es igual o anterior al primero
            return totalMinutos1 - totalMinutos2; // Restamos para obtener una diferencia positiva
        } else { // Si el segundo horario es posterior al primero
            return totalMinutos2 - totalMinutos1; // Restamos en el orden inverso para mantener la diferencia positiva
        }
    }
}