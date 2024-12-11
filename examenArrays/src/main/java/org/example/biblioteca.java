import java.util.Scanner;
/**
 * Programa de gestión de una agenda semanal.
 *
 * Funcionalidades:
 * - Mostrar la lista una libros de libros.
 * - Borrar y añadir libros a esa lista.
 * - Finalizar el programa.
 *
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */

public class biblioteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bibliotecaL = new String[20];
        int inicial;
        //Creamos un bucle para que el programa se repita hasta que el usuario eliga la 4 opcion.
        do {
            System.out.println("Dime cual de las 4 opciones quieres hacer"); //Mostramos por pantalla el menú.
            System.out.println("1. Visualiza los Libro");
            System.out.println("2. Añade un libro");
            System.out.println("3. Borra un libro");
            System.out.println("4. Salir");
            inicial = scanner.nextInt();
            //Con cada elección del usuario se entrará en cada funcion(Podría ser un switch).
            if (inicial == 1) {
                visualizaLibros(bibliotecaL);
            } else if (inicial == 2) {
                boolean engadido=engadirLibro(bibliotecaL);
            } else if (inicial == 3) {
                boolean borrado=eliminarLibro(bibliotecaL);
            } else if(inicial == 4){
                System.out.println("Adiós");
            }else{
                System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (inicial != 4);

    }
    /**
     * Visualiza los libros de la biblioteca.
     */
    public static void visualizaLibros(String biblioteca[]) {
        //Bucle para que se visualize todos los libros de la biblioteca
        for (int i = 0; i < biblioteca.length; i++) {
            if(biblioteca[i]==null){
                System.out.print(i+".Baleiro ");
            }
            else{
                System.out.print(i+"."+biblioteca[i]+" ");
            }
        }
        System.out.println(" ");
        System.out.println("-----------------------------------------------------------------------");
    }
    /**
     * Añadir libro a la biblioteca y retornar un booleano.
     */
     public static boolean engadirLibro(String biblioteca[]){
         Scanner scanner = new Scanner(System.in);
         System.out.println("El nombre del nuevo libro");
         String titulo = scanner.next();
         int localizacionL = 0;
         //Este bucle recorre el array hasta encontrar una posicon vacia.
         for (int i = 0; i < biblioteca.length; i++) {
             if(biblioteca[i]==null){
                 localizacionL=i;
                 break;
             }
         }
         //Esta condición es para que salga de la funcion y no retorne el false.
         if(biblioteca[localizacionL]==null){
             biblioteca[localizacionL]=titulo;
             return true;
         }
         return false;


     }
    /**
     * Borrar un libro de la biblioteca y retornar un booleano.
     */
    public static boolean eliminarLibro(String biblioteca[]){
        Scanner scanner = new Scanner(System.in);
        //Permitir al usuario que eliga la posición del libro a borrar.
        System.out.println("Dime la posición en donde quieres eliminar un libro(del 0 al 19)");
        int localizacionL = scanner.nextInt();
        if(biblioteca[localizacionL]!=null){
            biblioteca[localizacionL]=null;
            return true;
        }
        return false;

    }

}
