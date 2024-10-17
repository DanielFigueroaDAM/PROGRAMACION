package org.example;

import java.util.Scanner;




public class switchconyield {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Teclea o mes (1-12)");
        int mes = tec.nextInt();
        int dias = switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                yield 31;
            }
            case 2 -> {
                yield 28;
            }
            case 4, 6, 9, 11 -> {
                yield 30;
            }
            default -> {
                yield -1;
            }
        };
        if(dias==-1){
            System.out.println("Error: valor incorreecto");
        }
        else {
            System.out.println(dias);
        }
        tec.close();

    }
}



































