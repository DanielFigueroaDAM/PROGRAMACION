package ejercicio4;

import ejercicio1.Cliente;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import static ejercicio4.App.recuperarLongitud;
import static ejercicio4.App.recuperarTareas;

public class LecturaTarefas {
    public static int count = 0;
    // Implementación de lectura de tareas
    LecturaTarefas(){
        ObjectInputStream fluxoEntrada = null;
        try {
            fluxoEntrada = new ObjectInputStream(new FileInputStream("tarefas.dat"));
            Tarefa tarea;
            while (true) {
                tarea = (Tarefa) fluxoEntrada.readObject();
                if(tarea != null) {
                    recuperarTareas(tarea);
                    count++;
                }
            }
        } catch ( FileNotFoundException e) {
            System.out.println("Fichero no encontrado: " + e.getMessage());
        }catch (IOException e) {
            System.out.println("Error de entrada/salida: " + e.getMessage());
        } finally {
            if (fluxoEntrada != null) {
                try {
                    fluxoEntrada.close();
                } catch (Exception e) {
                    System.out.println("Error al cerrar el fichero: " + e.getMessage());

                }
            }
        }
    }
}
