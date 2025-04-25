package ejercicio4_conArrayList;

import ejercicio4.EscrituraTarefas;
import ejercicio4.Tarefa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static ArrayList<Tarefa> tareas = new ArrayList<>();

    public static void main(String[] args) {
        new LecturaTarefasConArrayList();
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
                    Tarefa tarea = new ejercicio4.Tarefa(nombre, descripcion, duracion, fechaFinDate);
                    tareas.add(tarea);
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
                    String nombreTarea = tec.next();
                    Tarefa tareaEncontrada = null;
                    for (Tarefa t : tareas){
                        if (t.getTitulo().equalsIgnoreCase(nombreTarea)) {
                            System.out.println("Tarea encontrada: " + t.toString());
                            tareaEncontrada = t;
                            break;
                        }
                    }
                    eliminarTarea(tareaEncontrada);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }while (opcion!=0);
        new EscrituraTarefasConArrayList(tareas);
        tec.close();
    }

    public static boolean modificarTarea() {
        Scanner tec = new Scanner(System.in);
        int salida = 0, salida2 = 0;
        do {
            listarTareas();
            System.out.println("Escribe el nombre de la tarea que quieres modificar");
            String nombreTarea = tec.next();
            Tarefa tareaEncontrada = null;
            for (Tarefa t : tareas){
                if (t.getTitulo().equalsIgnoreCase(nombreTarea)) {
                    System.out.println("Tarea encontrada: " + t.toString());
                    tareaEncontrada = t;
                    break;
                }
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
                        tareaEncontrada.setTitulo(nuevoNombre);
                        break;
                    case 2:
                        System.out.println("Escribe la nueva descripcion de la tarea");
                        String nuevaDescripcion = tec.next();
                        tareaEncontrada.setDescripcion(nuevaDescripcion);
                        break;
                    case 3:
                        System.out.println("Escribe la nueva duración");
                        int nuevaDuracion = tec.nextInt();
                        tareaEncontrada.setDuracionHoras(nuevaDuracion);
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
                        tareaEncontrada.setFechaDeFin(nuevaFechaFinDate);
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
                        tareaEncontrada.setCompletada(nuevoEstado);
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

        return true;
    }
    public static void eliminarTarea(Tarefa tarea) {
        if (!tareas.contains(tarea)) {
            System.out.println("Tarea no encontrada, seguramente se llama de otra manera");
            return;
        }else {
             // Reducir tamaño
            tareas.remove(tarea);
            System.out.println("Tarea eliminada correctamente");
            System.out.println("El array se ha compactado para eliminar la tarea");
            System.out.println("Tareas restantes:");
            listarTareas();
        }
    }
    public static void agregarTarea(Tarefa tarea){
        tareas.add(tarea);

    }
    public static void listarTareas() {
        for(Tarefa t: tareas){
            System.out.println(t.toString());
        }
    }
    public static void recuperarTareas(ejercicio4.Tarefa tarea) {  // Recibe una sola tarea
        agregarTarea(tarea);  // Llama al método existente
    }

}