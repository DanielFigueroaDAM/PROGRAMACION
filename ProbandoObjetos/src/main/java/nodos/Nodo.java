package nodos;

public class Nodo {
    private int valor;
    private Nodo puntoeroSiguiente;

    public Nodo(int valor, Nodo puntoeroSiguiente) {
        this.valor = valor;
        this.puntoeroSiguiente = puntoeroSiguiente;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getPuntoeroSiguiente() {
        return puntoeroSiguiente;
    }

    public void setPuntoeroSiguiente(Nodo puntoeroSiguiente) {
        this.puntoeroSiguiente = puntoeroSiguiente;
    }
}
