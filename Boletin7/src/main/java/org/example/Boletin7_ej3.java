package org.example;

import java.util.Arrays;

public class Boletin7_ej3 {
    public static void main(String[] args) {
        int[] notas = new int[30];
        int media = 0, alta = 0, suspensos = 0, aprobados = 0;
        String[] nombres = {
                "Carlos", "María", "José", "Ana", "Luis",
                "Lucía", "Pedro", "Carmen", "Miguel", "Laura",
                "Francisco", "Elena", "Manuel", "Isabel", "Jorge",
                "Sofía", "Antonio", "Marta", "Raúl", "Paula",
                "David", "Sara", "Juan", "Clara", "Alejandro",
                "Julia", "Pablo", "Victoria", "Héctor", "Irene"
        };

        // Generar notas aleatorias y calcular estadísticas
        for (int i = 0; i < notas.length; i++) {
            notas[i] = (int) (Math.random() * 10);
            media += notas[i];
            if (notas[i] >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }
            if (notas[i] > alta) {
                alta = notas[i];
            }
        }

        // Calcular media
        media /= notas.length;

        // Crear arreglo de aprobados
        int[] aprobadosarr = new int[aprobados];
        int y = 0;
        for (int nota : notas) {
            if (nota >= 5) {
                aprobadosarr[y++] = nota;
            }
        }
        int[] suspensosarr = new int[suspensos];
        int k = 0;
        for (int nota : notas) {
            if (nota < 5) {
                suspensosarr[k++] = nota;
            }
        }

        // Ordenar aprobados
        Arrays.sort(aprobadosarr);
        Arrays.sort(suspensosarr);

        // Mostrar resultados
        System.out.println("Notas ordenadas: " +Arrays.toString(suspensosarr)+ Arrays.toString(aprobadosarr));
        System.out.println("El número de suspensos es " + suspensos);
        System.out.println("El número de aprobados es " + aprobados);
        System.out.println("La media es " + media);
        System.out.println("La nota más alta es " + alta);
    }
}

