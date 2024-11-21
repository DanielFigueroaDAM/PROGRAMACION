package org.example;

public class ordenar_array {
        public static void main(String[] args) {
            int[] numeros = new int[90];
            for (int i = 0, valor = 0; i < numeros.length; i++, valor += 10) {
                numeros[i] = valor;
                System.out.print(numeros[i]+"-");
            }
            System.out.println("\n");
            int indice=array(numeros,657);
            System.out.println("\n"+indice);

        }
    static int array(int[] lista, int numero){
            int mitad=lista.length/2;
            if(numero>lista[mitad]){
                for(int i=mitad;i<lista.length;i++){
                    System.out.print(lista[i]+"-");
                }

                for(int i=mitad;i<lista.length;i++){
                    if(numero==lista[i]){
                        return i;
                    }
                    if(numero<lista[i]){
                        break;
                    }

                }

            }
            else if(numero<=lista[mitad]){
                for(int i=mitad;i>=0;i--){
                    System.out.print(lista[i]+"-");
                }

                for(int i=mitad;i>=0;i--){
                    if(numero==lista[i]){
                        return i;
                    }
                }


            }
            return -1;
    }


}
