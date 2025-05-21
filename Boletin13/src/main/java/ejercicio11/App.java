package ejercicio11;

import java.time.LocalDate;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Map <Character, Academico> academicos = new TreeMap<>();
        Scanner tec = new Scanner(System.in);
        char letra;
        for ( int i = 0; i < 5; i++) {
            System.out.println("Introduce la letra del academico");
            letra = tec.next().charAt(0);
            System.out.println("Introduce el nombre del academico");
            String nombre = tec.next();
            //Introducir el año en el que se ha creado el academico automaticamente
            int anio = LocalDate.now().getYear();
            Academico academico = new Academico(nombre, anio);
            boolean comp = nuevoAcademico(academicos, academico, letra);
            if (comp) {
                System.out.println("El academico se ha añadido correctamente");
            } else {
                System.out.println("El academico ya existe");
                i--;
            }
        }
        System.out.println("¿Quieres ver la lista de academicos ordenada por Letra? (s/n)");
        String respuesta = tec.next();
        if (respuesta.equalsIgnoreCase("s")) {
            porOrdeDeLetra(academicos);
        } else {
            System.out.println("Saliendo...");
        }
        System.out.println("¿Quieres ver la lista de academicos ordenada por Nombre? (s/n)");
        respuesta = tec.next();
        if (respuesta.equalsIgnoreCase("s")) {
            porOrdeDeNombre(academicos);
        } else {
            System.out.println("Saliendo...");
        }


    }
    public static boolean nuevoAcademico (Map<Character,Academico> academia, Academico novo, Character letra) {
        if (academia.containsKey(letra)) {
            return false;
        } else {
            academia.put(letra, novo);
            return true;
        }
    }
    /**
     * Muestra la lista de académicos ordenada por nombres
     * @param academia
     */
    public static void porOrdeDeNombre(Map<Character, Academico> academia) {
        System.out.println("------ LISTADO DE ACADÉMICOS ------");
        // Usando la clase Collections para ordenar por nombre
        // Pasar lista map a una lista que pueda usar Collections, solo pasar los academicos
        List<Academico> listaAcademicos = new ArrayList<>(academia.values());
        Collections.sort(listaAcademicos);
        // Mostrar la lista ordenada
        listaAcademicos.forEach(acad ->
                System.out.printf("%-15s | %d%n",
                        acad.getNome(),
                        acad.getAnoDeIngreso()));


    }


    /**
     * Muestra la lista de académicos ordenada por letra
     * @param academia
     */
    public static void porOrdeDeLetra(Map<Character, Academico> academia) {
        System.out.println("------ LISTADO DE ACADÉMICOS ------");
        academia.forEach((letra, acad) ->
                System.out.printf("%c  |  %-15s | %d%n",
                        letra,
                        acad.getNome(),
                        acad.getAnoDeIngreso()));
    }
}
