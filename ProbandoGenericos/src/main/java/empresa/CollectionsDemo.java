package empresa;

/*
 * CollectionsDemo.java
 *
 * Demostración práctica de los métodos utilitarios de java.util.Collections
 * -----------------------------------------------------------------------
 * Cada bloque ejecuta una operación estática diferente y muestra el efecto
 * sobre la colección implicada.
 *
 * 1. sort               → ordena (natural o Comparator)
 * 2. reverse            → invierte el orden actual
 * 3. shuffle            → mezcla aleatoriamente
 * 4. binarySearch       → busca en lista ORDENADA
 * 5. unmodifiableList   → vista inmutable (lanza UnsupportedOperationException
 *                         en operaciones que alteren la estructura)
 * 6. synchronizedList   → vista envoltorio thread‑safe (usa el objeto como
 *                         monitor). Requiere sincronizarse externamente para
 *                         iteraciones compuestas.
 * 7. emptyList /        → fábricas rápidas para una lista vacía o singleton
 *    singletonList        (pre‑Java 9)
 */

import java.util.*;

public class CollectionsDemo {

    /**
     * Helper genérico para imprimir una colección con etiqueta.
     */
    private static <T> void print(String label, Collection<T> c) {
        System.out.println(label + " → " + c);
    }

    public static void main(String[] args) {
        /* ------------------------------------------------------------ */
        /* 1. sort                                                      */
        /* ------------------------------------------------------------ */
        List<String> names = new ArrayList<>(List.of("Ada", "Grace", "Linus", "Barbara"));
        print("Original", names);

        Collections.sort(names);                         // Orden natural (alfabético)
        print("Sorted (natural)", names);

        Collections.sort(names, Comparator.reverseOrder()); // Comparator explícito
        print("Sorted (reverse)", names);

        /* ------------------------------------------------------------ */
        /* 2. reverse                                                   */
        /* ------------------------------------------------------------ */
        Collections.reverse(names);
        print("Reversed", names);

        /* ------------------------------------------------------------ */
        /* 3. shuffle                                                   */
        /* ------------------------------------------------------------ */
        Collections.shuffle(names);                       // Mezcla aleatoria (Fisher‑Yates)
        print("Shuffled", names);

        /* ------------------------------------------------------------ */
        /* 4. binarySearch                                              */
        /* ------------------------------------------------------------ */
        Collections.sort(names);                         // Debe estar ordenada
        int idx = Collections.binarySearch(names, "Grace");
        System.out.println("\"Grace\" found at index " + idx);

        /* ------------------------------------------------------------ */
        /* 5. unmodifiableList                                          */
        /* ------------------------------------------------------------ */
        List<String> immutable = Collections.unmodifiableList(names);
        System.out.println("immutable instanceof List? " + (immutable instanceof List));
        try {
            immutable.add("New");                       // Lanza excepción
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify immutable list: " + e);
        }

        /* ------------------------------------------------------------ */
        /* 6. synchronizedList                                          */
        /* ------------------------------------------------------------ */
        List<String> threadSafe = Collections.synchronizedList(new ArrayList<>(names));
        // Para operaciones compuestas (iterate + modify) se usa el monitor interno
        synchronized (threadSafe) {
            threadSafe.add("Alan");
        }
        print("Synchronized list", threadSafe);

        /* ------------------------------------------------------------ */
        /* 7. emptyList & singletonList                                 */
        /* ------------------------------------------------------------ */
        List<Integer> empty = Collections.emptyList();
        List<String> single = Collections.singletonList("OnlyOne");
        print("emptyList()", empty);
        print("singletonList()", single);
        /*  ------------------------------------------------------------ */
        /* 8. replaceAll                                                 */
        /* ------------------------------------------------------------ */
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        print("Original", list);
        Collections.replaceAll(list, 3, 99); // Reemplaza todas las ocurrencias de 3 por 99
        print("Replaced", list);

        /* ------------------------------------------------------------ */
        /* 9. swap                                                   */
        /* ------------------------------------------------------------ */
        List<String> list2 = new ArrayList<>(List.of("A", "B", "C", "D", "E"));
        print("Original", list2);
        Collections.swap(list2, 1, 3); // Intercambia los elementos en las posiciones 1 y 3
        print("Swapped", list2);
        /* ------------------------------------------------------------ */
        /* 10. copy & copyOf                                          */
        /* ------------------------------------------------------------ */
        List<String> source = new ArrayList<>(List.of("A", "B", "C", "D", "E"));
        List<String> destination = new ArrayList<>(List.of("1", "2", "3", "4", "5"));
        print("Source", source);
        print("Destination", destination);
        Collections.copy(destination, source); // Copia los elementos de source a destination
        print("After copy", destination);
        List<String> copyOfSource = List.copyOf(source); // Crea una copia inmutable de source
        print("Copy of source", copyOfSource);
        /* ------------------------------------------------------------ */
        /* 11. frequency                                            */
        /* ------------------------------------------------------------ */
        List<String> list3 = new ArrayList<>(List.of("A", "B", "C", "A", "B", "A"));
        print("List with duplicates", list3);
        int frequency = Collections.frequency(list3, "A"); // Cuenta las ocurrencias de "A"
        System.out.println("Frequency of 'A': " + frequency);
        /*
           En recuency no se puede comparar objetos excepto que sean del mismo tipo
           y que su equals() esté implementado correctamente. Ej:
              public boolean equals(Object o) {
                  Cliente c = (Cliente) o;
                    return this.id == c.id;

              }
         */
        /* ------------------------------------------------------------ */
        /* 12. max & min                                          */
        /* ------------------------------------------------------------ */
        List<Integer> list4 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        print("List of integers", list4);
        int max = Collections.max(list4); // Encuentra el máximo
        int min = Collections.min(list4); // Encuentra el mínimo
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        /*
           En max y min no se puede comparar objetos excepto que sean del mismo tipo
           y que su compareTo() esté implementado correctamente. Ej:
              public int compareTo(Cliente c) {
                  return this.id - c.id;
              }
         */
        /* ------------------------------------------------------------ */



    }
}
