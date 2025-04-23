package ejercicio4;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class LecturaTarefas {
    // Implementación de lectura de tareas
    LecturaTarefas(){
        ObjectInputStream fluxoEntrada = null;
        try {
            fluxoEntrada = new ObjectInputStream(new FileInputStream("tarefas.dat"));
            Tarefa[] tarea = (Tarefa[]) fluxoEntrada.readObject();
            if(tarea != null) {
                listaTareas = tarea;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fluxoEntrada != null) {
                try {
                    fluxoEntrada.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
