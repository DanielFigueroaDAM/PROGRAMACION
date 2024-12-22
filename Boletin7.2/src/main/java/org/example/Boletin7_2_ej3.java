package org.example;

import java.util.Scanner;

public class Boletin7_2_ej3 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int local;
        String[][] menu = {
                { "Sopa", "Ensalada", "Gazpacho", "Pasta", "Crema de verduras", "Arroz", "Verduras salteadas", "Consomé" }, // Primeros platos
                { "Pollo asado", "Pescado al horno", "Filete de ternera", "Lasaña", "Hamburguesa", "Estofado", "Paella", "Tortilla" }, // Segundos platos
                { "Helado", "Tarta de queso", "Flan", "Fruta", "Natillas", "Brownie", "Mousse de chocolate", "Yogur" } // Postres
        };
        String [] pedido;
        pedido = new String[3];
        do{
            System.out.println("1.Mostrar menú");
            System.out.println("2.Hacer pedido");
            System.out.println("3.Salir");
            local=tec.nextInt();
            switch (local){
                case 1:
                    mostrarMenu(menu);
                    break;
                case 2:
                    hacerPedido(menu,pedido);
                    for(int i=0; i<pedido.length;i++){
                        System.out.println(pedido[i]);
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("NO VALIDO");

            }
        }while (local !=3);

    }
    public static void mostrarMenu(String[][] menu){
        int numero=0;
        for(int i = 0; i< menu.length; i++){
            for (int j = 0; j< menu[0].length; j++){
                System.out.print(numero+"."+menu[i][j]+" ");
                numero++;
            }
            System.out.println();
            numero=0;
        }
    }
    public static void hacerPedido(String[][] menu,String[] pedido) {
            Scanner tec = new Scanner(System.in);
            boolean comp1=false,comp2=false,comp3=false;
            int primerP=0,segundoP=0,postre = 0;
        do {
            if(!comp1) {
                System.out.println("Dime el primer plato(Del 1 al 8)");
                primerP = tec.nextInt();
                if(primerP>8 || primerP<0){
                    System.out.println("No es valido");
                }
                else {
                    comp1=true;
                }
            }
            if(!comp2) {
                System.out.println("Dime el segundo plato(Del 1 al 8)");
                segundoP = tec.nextInt();
                if(segundoP>8 || segundoP<0){
                    System.out.println("No es valido");
                }
                else {
                    comp2=true;
                }
            }
            if(!comp3) {
                System.out.println("Dime el postre(Del 1 al 8)");
                postre = tec.nextInt();
                if(postre>8 || postre<0){
                    System.out.println("No es valido");
                }
                else {
                    comp3=true;
                }
            }
        }while (!comp1 || !comp2 || !comp3);
        pedido[0]=menu[0][primerP];
        pedido[1]=menu[1][segundoP];
        pedido[2]=menu[2][postre];
    }

}
