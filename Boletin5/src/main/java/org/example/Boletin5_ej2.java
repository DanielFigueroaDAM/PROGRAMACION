package org.example;

/**
 * Muestra la suma y el producto de todos los numeros que están entre el 10 y el 90.
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */

public class Boletin5_ej2 {
    public static void main(String []args){
        double suma=10, producto=10; //Usamos double porque el resultado del producto es mas grande del que acepta un long.
        for(int i=11;i<=90;i++){ //En este bucle sumaremos y multiplicaremos los numeros.
            suma=suma+i;
            producto=producto*i;
        }
        System.out.println("La suma es "+suma);
        System.out.println("La multiplicacion es "+producto);
    }
}
