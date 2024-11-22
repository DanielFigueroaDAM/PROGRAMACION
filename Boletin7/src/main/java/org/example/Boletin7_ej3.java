package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Boletin7_ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        System.out.println("-----------------------------------------");
        // Generar notas aleatorias y calcular estadísticas
        for (int i = 0; i < notas.length; i++) {
            notas[i] = (int) (Math.random() * 11);
            media += notas[i];
            if (notas[i] >= 5) {
                aprobados++;
                System.out.println(nombres[i]+" "+notas[i]);
            } else {
                suspensos++;
            }
            if (notas[i] > alta) {
                alta = notas[i];
            }
        }
        System.out.println("-----------------------------------------");
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
        String alumno;
        System.out.print("Dime el nombre del alumno ");
        alumno= sc.next();
        boolean comp=true;
        for(int i=0;i<nombres.length;i++){
            if(alumno.equals(nombres[i])){
                System.out.println("La nota de "+nombres[i]+" es "+notas[i]);
                comp=false;
            }
            if(i==nombres.length-1 && comp==true){
                System.out.println("El nombre no está en la lista");
            }
        }

        sc.close();
    }
}

