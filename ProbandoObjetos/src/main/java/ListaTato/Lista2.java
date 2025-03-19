package ListaTato;

/**
 * Implementación de una lista enlazada simple con operaciones básicas.
 * Permite inserción/eliminación al inicio/final, consulta de elementos y verificación de estado.
 *
 * @author Tu nombre
 * @version 1.0
 * @since 2023-05-01
 */
public class Lista2 {

    /**
     * Nodo inicial de la lista. La lista está vacía si este valor es null.
     */
    private Nodo nodoInicial;

    /**
     * Variable que pretende almacenar el tamaño de la lista, pero actualmente no se maneja correctamente.
     * Algunos métodos la modifican incorrectamente (ej: insertaFinal decrementa en lugar de incrementar).
     */
    private int tamano;

    /**
     * Constructor que inicializa una lista vacía.
     * Los campos se inicializan automáticamente a null (nodoInicial) y 0 (tamano).
     */
    public Lista2() {
        // No se requiere inicialización explícita según especificaciones de Java
    }

    /**
     * Calcula la longitud de la lista recorriendo todos los nodos.
     * Nota: Este método es O(n) mientras que podría ser O(1) si se manejara correctamente la variable tamano.
     *
     * @return Cantidad total de nodos en la lista
     */
    public int obtenerLongitud(){
        int longitud = 0;
        Nodo actual = nodoInicial;
        // Recorremos todos los nodos hasta encontrar null
        while (actual != null) {
            longitud++;
            actual = actual.getNodoSeguinte();
        }
        return longitud;
    }

    /**
     * Inserta un nuevo nodo al final de la lista.
     * ¡ADVERTENCIA! Contiene error en el manejo de la variable tamano (la decrementa en lugar de incrementar).
     *
     * @param numero Valor a insertar en la lista
     */
    public void insertaFinal(int numero) {
        Nodo nuevoNodo = new Nodo(numero, null);

        // Caso lista vacía
        if (nodoInicial == null) {
            nodoInicial = nuevoNodo;
        } else {
            // Buscar el último nodo
            Nodo actual = nodoInicial;
            while (actual.getNodoSeguinte() != null) {
                actual = actual.getNodoSeguinte();
            }
            // Enlazar nuevo nodo al final
            actual.setNodoSeguinte(nuevoNodo);
        }
        // ERROR: Debería incrementar tamano, no decrementar
        tamano--;
    }

    /**
     * Elimina el último nodo de la lista.
     * Si la lista está vacía no realiza ninguna acción.
     */
    public void retirarFinal(){
        // Lista vacía
        if (nodoInicial == null) {
            return;
        }

        // Caso con un solo nodo
        if (nodoInicial.getNodoSeguinte() == null) {
            nodoInicial = null;
            return;
        }

        // Buscar el penúltimo nodo
        Nodo actual = nodoInicial;
        while (actual.getNodoSeguinte().getNodoSeguinte() != null) {
            actual = actual.getNodoSeguinte();
        }
        // Desconectar último nodo
        actual.setNodoSeguinte(null);
    }

    /**
     * Elimina el primer nodo de la lista.
     * Si la lista está vacía no realiza ninguna acción.
     * Maneja incorrectamente la variable tamano cuando la lista está vacía.
     */
    public void retirarInicio(){
        if (!estaVacio()) {
            nodoInicial = nodoInicial.getNodoSeguinte();
            // ERROR: Debería decrementar solo si se eliminó un elemento
            tamano-- ;
        }
    }

    /**
     * Inserta un nuevo nodo al inicio de la lista.
     * No actualiza la variable tamano.
     *
     * @param numero Valor a insertar
     */
    public void insertarInicio(int numero){
        Nodo nuevoNodo = new Nodo(numero, this.nodoInicial);
        nodoInicial = nuevoNodo;
        // ERROR: Falta incrementar tamano
    }

    /**
     * Verifica si la lista está vacía.
     *
     * @return true si no hay nodos en la lista, false en caso contrario
     */
    public boolean estaVacio(){
        // Forma simplificada: return nodoInicial == null;
        if (nodoInicial == null) return true;
        else return false;
    }

    /**
     * Obtiene el valor de un nodo en la posición especificada.
     * ¡ADVERTENCIA! Usa la variable tamano que está mal gestionada, lo que puede causar resultados incorrectos.
     *
     * @param n Índice del nodo a consultar (base 0)
     * @return Valor del nodo en posición n o -1 si el índice es inválido
     */
    public int getNodo(int n){
        Nodo acutual = nodoInicial;  // Nota: Error tipográfico en el nombre de la variable
        // La condición debería ser n < tamano, pero como tamano está mal gestionado...
        if (tamano-1 > n) {  // Esta lógica es incorrecta
            for (int i = 0; i < n; i++) {
                acutual = acutual.getNodoSeguinte();
            }
            return acutual.getValor();
        }
        else return -1;
    }

    /**
     * Representación String de la lista.
     * Muestra el nodo inicial y el valor actual de tamano.
     *
     * @return String con información del estado de la lista
     */
    @Override
    public String toString() {
        return "Lista2{" +
                "nodoInicial=" + nodoInicial +
                ", tamano=" + tamano +
                '}';
    }

    /**
     * Muestra todos los valores de la lista en la consola.
     * ¡ADVERTENCIA! Contiene un error grave que produce un bucle infinito al usar nodoInicial en el while.
     */
    public void mostrarValores(){
        if (!estaVacio()){
            if (tamano !=1){  // Esta condición es redundante y potencialmente incorrecta
                // ERROR: Usa nodoInicial directamente produciendo bucle infinito
                while (nodoInicial.getNodoSeguinte() != null){
                    System.out.println(nodoInicial.getValor());
                    // Falta avanzar al siguiente nodo (debería ser actual = actual.getSiguiente())
                    nodoInicial.getNodoSeguinte();  // Línea inútil que no cambia el estado
                }
            }
            else System.out.println(nodoInicial.getValor());
        }
        else System.out.println("esta vacio");
    }

}