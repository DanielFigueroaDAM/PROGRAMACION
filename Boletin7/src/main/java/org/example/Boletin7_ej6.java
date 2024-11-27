
package org.example;

public class Boletin7_ej6 {
        public static void main(String[] args) {
            int[] numeros = new int[90];
            for (int i = 0, valor = 0; i < numeros.length; i++, valor += 10) {
                numeros[i] = valor;
                System.out.print(numeros[i]+"-");
            }
            System.out.println("\n");
            int indice=array(numeros,600);
            System.out.println("\n"+indice);

        }
        static int array(int[] lista, int numero){
            int mitad = lista.length / 2;
            int j=0;
            int[] lista2 = new int[mitad];
                if(numero> mitad){
                    for(int i = mitad; i < lista.length-1; i++){
                        j++;
                        lista[i] = lista2[j];
                    }
                    return array(lista2,numero);

                }
                else if(numero<mitad){
                    for(int i = 0; i < mitad-1; i++){
                        j++;
                        lista[i] = lista2[j];
                    }
                    return array(lista2,numero);

                }
                else if(numero==mitad){
                    return -2;
                }
                else {
                    return -1;
                }


        }
}
