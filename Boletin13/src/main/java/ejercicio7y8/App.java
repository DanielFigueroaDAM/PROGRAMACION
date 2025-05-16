package ejercicio7y8;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<Integer> conjunto1 = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6,9));
        Set<Integer> conjunto2 = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6, 8, 12));
        Set <?> nuevoConjunto = union(conjunto1,conjunto2);
        System.out.println("Unión de conjuntos: " + nuevoConjunto);
        Set <?> nuevoConjunto2 = interseccion(conjunto1,conjunto2);
        System.out.println("Interseccion: "+nuevoConjunto2);

    }
    public static <E> Set <E> union(Set<E> conxunto1, Set<E> conxunto2){
        Set<E> nuevaLista = new HashSet<E>();
        nuevaLista.addAll(conxunto1);
        nuevaLista.addAll(conxunto2);
        return nuevaLista;

    }

    /**
     * Se encarga de devolver una colleccion con los elementos que comparten las dos colleciones que se le pasa
     * @param conxunto1
     * @param conxunto2
     * @return
     * @param <E>
     */
    public static <E> Set <E> interseccion(Set<E> conxunto1, Set<E> conxunto2){
        Set<E> aux= new HashSet<>(conxunto1);
        aux.retainAll(conxunto2);

        return aux;

    }

}
