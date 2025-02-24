package lista;
/*
-Constructor con táboa con 0 elementos con int
-Obter número de elementos
-Insertar número o final da lista
-Insertarnúmero o principio da lista
-Insertar número en un lugar da lista especificado por un indice
-Obter un elemento especificado por un índice
 -Buscar un número na lista, devoltando o índice do primeiro lugar onde se encontre.
 Devoltará -1 si non o encontra
 -Mostra elementos da lista por consolo.
 */

import java.util.Arrays;

public class Lista {
    private int[] lista;

    public Lista() {
        this.lista=new int[0];
    }
    public int numeroElementos(){
        return lista.length;
    }
    public void numeroAlFinal(int n){
        lista= Arrays.copyOf(lista,lista.length+1);
        lista[lista.length-1]=n;
        //System.arraycopy(lista,0,novaLista,0,lista.lenght)
    }
    public void numeroAlPrincipio(){
        lista= Arrays.copyOf(lista,lista.length+1);
        System.arraycopy(lista,0,lista,1,lista.length-1);
        lista[0]=n;
    }
    public void borrarUltimoElemento(){
        if(lista.length>0){
            lista=Arrays.copyOf(lista,lista.length-1);
        }
        else{
            System.out.println("no se saca nada");
        }

    }
}
