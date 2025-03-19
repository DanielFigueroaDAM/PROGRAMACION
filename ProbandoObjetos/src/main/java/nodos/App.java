package nodos;

public class App {
    public static void main(String[] args) {
        Nodo nodo1 = new Nodo(7, null);
        Nodo nodo2 = new Nodo(2, nodo1);
        Nodo nodo3 = new Nodo(8, nodo2);
        Nodo nodo4 = new Nodo(4, nodo3);
        Nodo nodo5 = new Nodo(5, nodo4);
        Nodo nodo6 = new Nodo(6, nodo5);
        Nodo nodo7 = new Nodo(7, nodo6);
        Lista2 lista = new Lista2(nodo6);


    }
}
