package ejercicio4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscrituraTarefas {
    // Implementación de escritura de tareas
    EscrituraTarefas(Tarefa[] tarea){
        ObjectOutputStream fluxoSaida = null;
        try {
            fluxoSaida= new ObjectOutputStream(new FileOutputStream("tarefas.dat"));
            if(tarea != null) {
                for (Tarefa tarefa : tarea) {
                    if (tarefa != null) {
                        fluxoSaida.writeObject(tarefa);
                    }
                }
            }
        }catch (FileNotFoundException e){
            System.out.println("Fichero no encontrado: "+ e.getMessage());
        }catch (IOException e){
            System.out.println("Error de entrada/salida: "+ e.getMessage());
        }finally {
            if (fluxoSaida != null) {
                try {
                    fluxoSaida.close();
                } catch (IOException e) {
                    System.out.println("Error de entrada/salida al cerrar: "+ e.getMessage());
                }
            }
        }

    }
}
