package ejercicio4_conArrayList;

import ejercicio4.Tarefa;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EscrituraTarefasConArrayList {
    // Implementación de escritura de tareas
    public EscrituraTarefasConArrayList(ArrayList <Tarefa> tareas){
        ObjectOutputStream fluxoSaida = null;
        try {
            fluxoSaida= new ObjectOutputStream(new FileOutputStream("tarefasArrayList.dat"));
            for(Tarefa tarea : tareas) {
                if (tarea != null) {
                    fluxoSaida.writeObject(tarea);
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
