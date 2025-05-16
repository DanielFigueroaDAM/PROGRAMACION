package ejercicio9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EscrituraTemperaturas {
    // Implementación de escritura de tareas
    public EscrituraTemperaturas(ArrayList<Temperatura> temp){
        ObjectOutputStream fluxoSaida = null;
        try {
            fluxoSaida = new ObjectOutputStream(new FileOutputStream("temperatur.dat"));
            if (temp != null) {
                for (Temperatura temper : temp) {
                    if (temper != null) {
                        fluxoSaida.writeObject(temper);
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

