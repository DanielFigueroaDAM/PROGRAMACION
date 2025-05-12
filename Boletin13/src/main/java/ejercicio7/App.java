package ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<Integer> conjunto1 = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6));
        Set<Integer> conjunto2 = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6, 8, 12));
        Set <?> nuevoConjunto = union(conjunto1,conjunto2);
        System.out.println("Unión de conjuntos: " + nuevoConjunto);


    }
    public static <E> Set <E> union(Set<E> conxunto1, Set<E> conxunto2){
        Set<E> nuevaLista = new HashSet<E>();
        nuevaLista.addAll(conxunto1);
        nuevaLista.addAll(conxunto2);
        return nuevaLista;

    }
}
