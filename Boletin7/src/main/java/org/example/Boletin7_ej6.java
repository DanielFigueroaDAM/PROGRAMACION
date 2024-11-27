
package org.example;

public class Boletin7_ej6 {
        public static void main(String[] args) {
            int[] numeros = new int[90];
            for (int i = 0, valor = 0; i < numeros.length; i++, valor += 10) {
                numeros[i] = valor;
                System.out.print(numeros[i]+"-");
            }
            System.out.println("\n");
            int[] indice=array(numeros,600);
            System.out.println("\n"+indice);

        }
        static int[] array(int[] lista, int numero){
            int mitad = lista.length / 2;
            int j=0, y=0;
            int[] lista2 = new int[mitad];
                if(numero> mitad){
                    for(int i = mitad; i < lista.length-1; i++){
                        j++;
                        lista2[j] = lista[i];
                    }
                    return array(lista2,numero);

                }
                else if(numero<mitad){
                    for(int i = 0; i < mitad; i++){
                        y++;
                        lista2[y] = lista[i];
                    }
                    return array(lista2,numero);

                }
                else if(numero==mitad){
                    System.out.println(mitad);
                }
                    return new int[]{-1};

        }
}
