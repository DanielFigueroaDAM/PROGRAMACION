package ejercicio4;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static Tarefa listaTareas[] = new Tarefa[10];
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int opcion = 0;
        do{

            System.out.println("1.Agregar nueva tarea");
            System.out.println("2.Listar tareas");
            System.out.println("3.Modificar tarea");
            System.out.println("4.Eliminar tarea");
            System.out.println("0.Salir");
            opcion = tec.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Escribe el nombre de la tarea");
                    String nombre = tec.next();
                    tec.nextLine();  // <- limpia el '\n' tras next()

                    System.out.println("Escribe la descripcion de la tarea");
                    String descripcion = tec.nextLine();

                    System.out.println("Escribe la duracion de la tarea en horas");
                    int duracion = tec.nextInt();
                    tec.nextLine();  // <- limpia el '\n' tras nextInt()

                    System.out.println("Escribe la fecha de fin (yyyy/MM/dd):");
                    String fechaFinStr = tec.nextLine();

                    LocalDate fechaFinDate = null;
                    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                    try {
                        fechaFinDate = LocalDate.parse(fechaFinStr, fmt);
                    } catch (DateTimeParseException e) {
                        System.out.println("Formato de fecha incorrecto. Debe ser, por ejemplo, 2025/05/29");
                        // aquí podrías volver a pedir la fecha o salir del case
                        break;
                    }
                    Tarefa tarea = new Tarefa(nombre, descripcion, duracion, fechaFinDate);
                    agregarTarea(tarea);
                    System.out.println("\nTarea creada:");
                    System.out.printf(
                            "Nombre: %s%nDescripción: %s%nDuración: %d h%nFecha fin: %s%n",
                            nombre, descripcion, duracion, fechaFinDate
                    );
                    break;
                case 2:
                    listarTareas();
                    break;
                case 3:
                    boolean comp=modificarTarea();
                    String mensaje = (comp)? "Tarea modificada correctamente":"No se ha podido modificar la tarea";
                    System.out.println(mensaje);
                    break;
                case 4:
                    System.out.println("Escribe el numero de la tarea que quieres eliminar");
                    int numeroTarea = tec.nextInt();
                    eliminarTarea(numeroTarea);
                    System.out.println("Tarea eliminada correctamente");
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }while (opcion!=0);
        new EscrituraTarefas(listaTareas);
        tec.close();
    }

    public static boolean modificarTarea() {
        Scanner tec = new Scanner(System.in);
        int salida = 0, salida2 = 0;
        do {
            listarTareas();
            System.out.println("Escribe el numero de la tarea que quieres modificar");
            int numeroTarea = tec.nextInt();
            if (numeroTarea < 0 || numeroTarea >= listaTareas.length || listaTareas[numeroTarea] == null) {
                System.out.println("Índice inválido");
                continue;
            }
            do {
                System.out.println("1.Modificar nombre");
                System.out.println("2.Modificar descripcion");
                System.out.println("3.Modificar duracion");
                System.out.println("4.Modificar fecha de fin");
                System.out.println("5.Modificar estado");
                System.out.println("0.Cancelar");
                salida = tec.nextInt();
                switch (salida) {
                    case 1:
                        System.out.println("Escribe el nuevo nombre de la tarea");
                        String nuevoNombre = tec.next();
                        listaTareas[numeroTarea].setTitulo(nuevoNombre);
                        break;
                    case 2:
                        System.out.println("Escribe la nueva descripcion de la tarea");
                        String nuevaDescripcion = tec.next();
                        listaTareas[numeroTarea].setDescripcion(nuevaDescripcion);
                        break;
                    case 3:
                        System.out.println("Escribe la nueva duración");
                        int nuevaDuracion = tec.nextInt();
                        listaTareas[numeroTarea].setDuracionHoras(nuevaDuracion);
                        break;
                    case 4:
                        System.out.println("Escribe la nueva fecha de fin (yyyy/MM/dd):");
                        String nuevaFechaFinStr = tec.next();
                        LocalDate nuevaFechaFinDate = null;
                        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                        try {
                            nuevaFechaFinDate = LocalDate.parse(nuevaFechaFinStr, fmt);
                        } catch (DateTimeParseException e) {
                            System.out.println("Formato de fecha incorrecto. Debe ser, por ejemplo, 2025/05/29");
                            break;
                        }
                        listaTareas[numeroTarea].setFechaDeFin(nuevaFechaFinDate);
                        break;
                    case 5:
                        System.out.println("Escribe el nuevo estado (true/false):");
                        boolean nuevoEstado = false;
                        while (true) {  // Validar entrada booleana
                            try {
                                nuevoEstado = tec.nextBoolean();
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Error: Ingresa 'true' o 'false'");
                                tec.next();  // Limpiar entrada incorrecta
                            }
                        }
                        listaTareas[numeroTarea].setCompletada(nuevoEstado);
                        break;
                    case 0:
                        System.out.println("Modificaciones terminadas");
                    default:
                        System.out.println("Opcion invalida");
                        break;
                }
            }while (salida != 0) ;
                System.out.println("Quieres modificar otra tarea? (1/0)");
                salida2 = tec.nextInt();
        } while (salida2 != 0);
        new EscrituraTarefas(listaTareas);
        return true;
    }
    public static void eliminarTarea(int numeroTarea){
        if (numeroTarea < 0 || numeroTarea >= listaTareas.length || listaTareas[numeroTarea] == null) {
            System.out.println("Índice inválido");
            return;
        }
        // Mover elementos hacia la izquierda
        for (int i = numeroTarea; i < listaTareas.length - 1; i++) {
            listaTareas[i] = listaTareas[i + 1];
        }
        listaTareas = Arrays.copyOf(listaTareas, listaTareas.length - 1);  // Reducir tamaño
        System.out.println("Tarea eliminada correctamente");
        System.out.println("El array se ha compactado para eliminar la tarea");
        System.out.println("Tareas restantes:");
        listarTareas();
        new EscrituraTarefas(listaTareas);
    }
    public static void agregarTarea(Tarefa tarea){
        boolean agregado = false;
        for (int i = 0; i < listaTareas.length; i++) {
            if (listaTareas[i] == null) {
                listaTareas[i] = tarea;
                agregado = true;
                break;
            }
        }
        if(!agregado){
            //Ampliar el array de tareas usando copy
            //primero creamos un nuevo array con el doble de tamaño
            Tarefa[] nuevoArray = new Tarefa[listaTareas.length * 2];
            //Copiamos los elementos de la lista actual al nuevo array
            System.arraycopy(listaTareas, 0, nuevoArray, 0, listaTareas.length);
            //Añadimos la nueva tarea al nuevo array
            nuevoArray[listaTareas.length] = tarea;
            //Actualizamos la lista de tareas
            listaTareas = nuevoArray;
            System.out.println("El array se ha ampliado para agregar la tarea");
        }
        System.out.println("Tarea agregada correctamente");
        new EscrituraTarefas(listaTareas);

    }
    public static void listarTareas() {
        for (int i = 0; i < listaTareas.length; i++) {
            if (listaTareas[i] != null) {  // Mostrar solo tareas no nulas
                System.out.println(i + ". " + listaTareas[i].toString());
            }
        }
    }
    public static void recuperarTareas(Tarefa tarea) {  // Recibe una sola tarea
        agregarTarea(tarea);  // Llama al método existente
    }
    public static void recuperarLongitud(int longitud){
        Tarefa listaTareas2[] = new Tarefa[longitud];
        listaTareas = listaTareas2;
    }

}