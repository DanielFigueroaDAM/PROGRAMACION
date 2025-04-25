package ejercicio4_conArrayList;

import ejercicio4.Tarefa;

import java.io.*;
import java.util.ArrayList;

public class LecturaTarefasConArrayList {
    // Implementación de lectura de tareas
    public LecturaTarefasConArrayList() {
        // Aquí se implementaría la lógica para leer las tareas desde el archivo
        // y mostrarlas en la consola.
        // Por ejemplo, podrías usar un ObjectInputStream para leer los objetos
        // de tipo Tarefa desde el archivo "tarefasArrayList.dat".
        ObjectInputStream fluxoEntrada = null;
        try {
            fluxoEntrada= new ObjectInputStream(new FileInputStream("tarefasArrayList.dat"));
            while (true) {
                Tarefa tarefa = (Tarefa) fluxoEntrada.readObject();
                if (tarefa != null) {
                    System.out.println(tarefa);
                    App.agregarTarea(tarefa);
                }
            }




        }catch (FileNotFoundException e){
            System.out.println("Fichero no encontrado: "+ e.getMessage());
        }catch (IOException e){
            System.out.println("Error de entrada/salida: "+ e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error de clase no encontrada: "+ e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            if (fluxoEntrada != null) {
                try {
                    fluxoEntrada.close();
                } catch (IOException e) {
                    System.out.println("Error de entrada/salida al cerrar: "+ e.getMessage());
                }
            }
        }
    }
}
