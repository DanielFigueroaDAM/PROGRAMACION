package ListaTato;

/**
 * Representa un nodo en una lista enlazada simple.
 * Almacena un valor entero y una referencia al siguiente nodo en la secuencia.
 *
 * @author Tu nombre
 * @version 1.0
 * @since 2023-05-01
 */
public class Nodo {
    /**
     * Valor numérico almacenado en el nodo.
     */
    private int valor;

    /**
     * Referencia al siguiente nodo en la lista enlazada.
     * Será null si este es el último nodo de la secuencia.
     */
    private Nodo nodoSeguinte;  // Observación: Posible error tipográfico (debería ser "Siguiente")

    /**
     * Constructor que crea un nuevo nodo con valores inicializados.
     *
     * @param valor Valor numérico a almacenar en el nodo
     * @param nSeguinte Referencia al nodo siguiente en la lista.
     *                   Puede ser null si es el último nodo
     */
    public Nodo(int valor, Nodo nSeguinte) {
        this.valor = valor;
        this.nodoSeguinte = nSeguinte;
    }

    /**
     * Obtiene el valor almacenado en el nodo.
     *
     * @return El valor entero contenido en el nodo
     */
    public int getValor() {
        return valor;
    }

    /**
     * Establece un nuevo valor para el nodo.
     *
     * @param valor Nuevo valor entero a almacenar
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * Obtiene la referencia al siguiente nodo en la lista.
     *
     * @return El nodo siguiente en la secuencia, o null si es el último
     */
    public Nodo getNodoSeguinte() {
        return nodoSeguinte;
    }

    /**
     * Establece la referencia al siguiente nodo en la lista.
     * Permite modificar la estructura de la lista enlazada.
     *
     * @param nodoSeguinte Nuevo nodo siguiente para este nodo.
     *                      Puede ser null para indicar fin de lista
     */
    public void setNodoSeguinte(Nodo nodoSeguinte) {
        this.nodoSeguinte = nodoSeguinte;
    }
}