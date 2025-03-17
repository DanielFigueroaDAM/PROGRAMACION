package nodos;



public class Lista2 {

    private Nodo nodoInicial;

    private int tamanho;

    public Lista2(){

        this.nodoInicial=null;

        tamanho=0;

    }

    public Lista2(Nodo nodoInicial){

        this.nodoInicial=nodoInicial;

        tamanho=1;

    }

    public boolean estaValeira(){

        if(nodoInicial == null){


            return false;


            return true;

        }


        return true;


        return false;

    }





    /**


     * Devolve o tamaño da lista


     * @return


     */

    public int getTamanho(){




        return tamanho;

    }





    /**


     * Engade un nodo ao principio da lista


     * @param valor


     */

    public void engadirUltimo(int valor){


        Nodo nuevoNodo= new Nodo(valor,null);


        tamanho++;


        if()


            if (estaValeira()){ //Se a lista está valeira


                Nodo novoNodo = new Nodo(valor, null); //Creamos un novo nodo


                nodoInicial = novoNodo;//O nodo inicial será o novo nodo


                tamanho++; //Incrementamos o tamaño


            }


            else{


                Nodo aux = nodoInicial; //Creamos un nodo auxiliar que apunta ao nodo inicial


                while(aux.getPuntoeroSiguiente() != null){ //Mentres o nodo seguinte non sexa nulo


                    aux = aux.getPuntoeroSiguiente(); //O nodo auxiliar apunta ao nodo seguinte


                }


                Nodo novoNodo = new Nodo(valor, null); //Creamos un novo nodo


                aux.setPuntoeroSiguiente(novoNodo); //O nodo auxiliar apunta ao novo nodo


                tamanho++;


            }


    }


    public void engadirPrimeiro(int valor){


        if (estaValeira()){ //Se a lista está valeira


            Nodo novoNodo = new Nodo(valor, null); //Creamos un novo nodo


            nodoInicial = novoNodo;//O nodo inicial será o novo nodo


            tamanho++; //Incrementamos o tamaño


        }


        else{


            Nodo novoNodo = new Nodo(valor, nodoInicial); //Creamos un novo nodo que apunta ao nodo inicial


            nodoInicial = novoNodo; //O nodo inicial será o novo nodo


            tamanho++; //Incrementamos o tamaño


        }


    }





    /**


     * Engade un nodo nunha posición determinada


     * @param valor


     * @param posicion


     */


    public void engadirPosicion(int valor, int posicion){


        if (posicion < 0 || posicion > tamanho){ //Se a posición é menor que 0 ou maior que o tamaño


            System.out.println("Posición incorrecta");


        }


        else if (posicion == 0){ //Se a posición é 0


            engadirPrimeiro(valor); //Engadimos o nodo ao principio


        }


        else if (posicion == tamanho){ //Se a posición é igual ao tamaño


            engadirUltimo(valor); //Engadimos o nodo ao final


        }


        else{


            Nodo aux = nodoInicial; //Creamos un nodo auxiliar que apunta ao nodo inicial


            for (int i = 0; i < posicion-1; i++){ //Mentres i sexa menor que a posición -1


                aux = aux.getPuntoeroSiguiente();  //O nodo auxiliar apunta ao nodo seguinte


            }


            Nodo novoNodo = new Nodo(valor, aux.getPuntoeroSiguiente()); //Creamos un novo nodo que apunta ao nodo seguinte do nodo auxiliar


            aux.setPuntoeroSiguiente(novoNodo); //O nodo auxiliar apunta ao novo nodo


            tamanho++; //Incrementamos o tamaño


        }


    }


    public void eliminarElemento(int posicion){


        if (posicion < 0 || posicion >= tamanho){ //Se a posición é menor que 0 ou maior ou igual que o tamaño


            System.out.println("Posición incorrecta");


        }


        else if (posicion == 0){ //Se a posición é 0


            nodoInicial = nodoInicial.getPuntoeroSiguiente(); //O nodo inicial será o nodo seguinte


            tamanho--; //Decrementamos o tamaño


        }


        else{


            Nodo aux = nodoInicial; //Creamos un nodo auxiliar que apunta ao nodo inicial


            for (int i = 0; i < posicion-1; i++){ //Mentres i sexa menor que a posición -1


                aux = aux.getPuntoeroSiguiente(); //O nodo auxiliar apunta ao nodo seguinte


            }


            aux.setPuntoeroSiguiente(aux.getPuntoeroSiguiente().getPuntoeroSiguiente()); //O nodo auxiliar apunta ao nodo seguinte do nodo seguinte


            tamanho--; //Decrementamos o tamaño


        }

    }

}