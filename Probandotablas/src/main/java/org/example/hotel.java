package org.example;

import java.util.List;
import java.util.Scanner;

public class hotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Declaración de array 2d
        int local = 0, inicial=0;
        String[][] arrayHotel = new String[3][6];
        do {
            System.out.println("Dime cual de las 4 opciones quieres hacer");
            System.out.println("1.Registrar usuario");
            System.out.println("2.Vaciar habitacion");
            System.out.println("3.Mostrar habitaciones");
            System.out.println("4.Salir");
            inicial = scanner.nextInt();
            if (inicial == 1) {
                asignar(arrayHotel,local);
            }
            if (inicial == 2) {
                vaciar(arrayHotel,local);
            }
            if(inicial==3) {
                mostrar(arrayHotel);
            }
        }while (inicial!=4);
    }
    public static void asignar(String arrayHotel[][],int local){
        Scanner scanner = new Scanner(System.in);
        do {
                System.out.println("Dime el nombre del usuario a registrar");
                String nombre = scanner.next();
                System.out.println("Dime la habitación que hay que registrar (letra(mayuscula))");
                String localizacionL = scanner.next();
                System.out.println("Ahora el numero");
                int localizacionN = scanner.nextInt();
                switch (localizacionL) {
                    case "A" -> local = 0;
                    case "B" -> local = 1;
                    case "C" -> local = 2;
                    default -> {
                        System.out.println("No es valido");
                        continue;
                    }
                }

                if (arrayHotel[local][localizacionN] != null) {
                    System.out.println("Está ocupada esa habitacion");
                } else {
                    arrayHotel[local][localizacionN] = nombre;
                    break;
                }
            } while (true);
    }
    public static void vaciar(String arrayHotel[][],int local){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Dime la habitación que quieres vaciar (letra(mayuscula))");
            String localizacionL = scanner.next();
            System.out.println("Ahora el numero");
            int localizacionN = scanner.nextInt();
            if (arrayHotel[local][localizacionN] == null) {
                System.out.println("Está vacia esa habitacion");
            } else {
                arrayHotel[local][localizacionN] = null;
                break;
            }
        } while (true);

    }
    public static void mostrar(String arrayHotel[][]){
        for (int i = 0; i < arrayHotel.length; i++) {
            char fila = (char) ('A' + i);
            for (int j = 0; j < arrayHotel[i].length; j++) {
                if (arrayHotel[i][j] == null) {
                    System.out.println("Habitación " + fila + j + " está vacía.");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < arrayHotel.length; i++) {
            char fila = (char) ('A' + i);
            for (int j = 0; j < arrayHotel[i].length; j++) {
                if (arrayHotel[i][j] != null) { // Mostrar solo habitaciones ocupadas
                    System.out.println("Habitación " + fila + j + " está ocupada por " + arrayHotel[i][j] + ".");
                }
            }
        }
    }

}
