package ejercicio4;

import ejercicio1.Cliente;

import java.io.*;

import static ejercicio4.App.recuperarLongitud;
import static ejercicio4.App.recuperarTareas;

public class LecturaTarefas {
    public static int count = 0;
    // Implementación de lectura de tareas
    LecturaTarefas(){
        try (ObjectInputStream fluxoEntrada = new ObjectInputStream(new FileInputStream("tarefas.dat"))) {
            while (true) {
                Tarefa tarea = (Tarefa) fluxoEntrada.readObject();
                if (tarea != null) {
                    App.agregarTarea(tarea);  // Usar método existente
                }
            }
        } catch (EOFException e) {
            System.out.println("Todas las tareas fueron leídas");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
