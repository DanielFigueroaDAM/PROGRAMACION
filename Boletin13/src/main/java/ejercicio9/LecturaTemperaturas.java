package ejercicio9;

import java.io.*;

public class LecturaTemperaturas {
    // Implementación de lectura de tareas
    public LecturaTemperaturas() {
        ObjectInputStream fluxoEntrada = null;
        try {
            fluxoEntrada= new ObjectInputStream(new FileInputStream("temperatur.dat"));
            while (true) {
                Temperatura tempr = (Temperatura) fluxoEntrada.readObject();
                if (tempr != null) {
                    System.out.println(tempr);
                    App.agregarTemperatura(tempr);
                }
            }

        }catch (FileNotFoundException e){
            System.out.println("Fichero no encontrado: "+ e.getMessage());
        }
        catch (EOFException e) {
            System.out.println("Fin del archivo alcanzado.");
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
                    System.out.println("Error de entrada/salida al cerrar: " + e.getMessage());
                }
            } else {
                System.out.println("El flujo de entrada no se inicializó correctamente.");
            }
        }
    }
}
