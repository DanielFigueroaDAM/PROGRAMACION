package nodos;

public class Lista2 {
    private Nodo nodoInicial;
    private int tamanho;

    public Lista2() {
        this.nodoInicial = null;
        tamanho = 0;
    }

    public Lista2(Nodo nodoInicial) {
        this.nodoInicial = nodoInicial;
        tamanho = 1;
    }

    public boolean estaValeira() {
        return nodoInicial == null;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void engadirUltimo(int valor) {
        if (estaValeira()) {
            Nodo novoNodo = new Nodo(valor, null);
            nodoInicial = novoNodo;
            tamanho++;
        } else {
            Nodo aux = nodoInicial;
            while (aux.getPuntoeroSiguiente() != null) {
                aux = aux.getPuntoeroSiguiente();
            }
            Nodo novoNodo = new Nodo(valor, null);
            aux.setPuntoeroSiguiente(novoNodo);
            tamanho++;
        }
    }

    public void engadirPrimeiro(int valor) {
        if (estaValeira()) {
            Nodo novoNodo = new Nodo(valor, null);
            nodoInicial = novoNodo;
            tamanho++;
        } else {
            Nodo novoNodo = new Nodo(valor, nodoInicial);
            nodoInicial = novoNodo;
            tamanho++;
        }
    }

    public void engadirPosicion(int valor, int posicion) {
        if (posicion < 0 || posicion > tamanho) {
            System.out.println("Posición incorrecta");
        } else if (posicion == 0) {
            engadirPrimeiro(valor);
        } else if (posicion == tamanho) {
            engadirUltimo(valor);
        } else {
            Nodo aux = nodoInicial;
            for (int i = 0; i < posicion - 1; i++) {
                aux = aux.getPuntoeroSiguiente();
            }
            Nodo novoNodo = new Nodo(valor, aux.getPuntoeroSiguiente());
            aux.setPuntoeroSiguiente(novoNodo);
            tamanho++;
        }
    }

    public void eliminarElemento(int posicion) {
        if (posicion < 0 || posicion >= tamanho) {
            System.out.println("Posición incorrecta");
        } else if (posicion == 0) {
            nodoInicial = nodoInicial.getPuntoeroSiguiente();
            tamanho--;
        } else {
            Nodo aux = nodoInicial;
            for (int i = 0; i < posicion - 1; i++) {
                aux = aux.getPuntoeroSiguiente();
            }
            aux.setPuntoeroSiguiente(aux.getPuntoeroSiguiente().getPuntoeroSiguiente());
            tamanho--;
        }
    }
}