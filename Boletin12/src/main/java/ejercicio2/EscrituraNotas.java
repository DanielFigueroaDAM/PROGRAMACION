package ejercicio2;
import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class EscrituraNotas {
    public EscrituraNotas(Notas[] notas) {
        BufferedWriter escritor = null;
        BufferedWriter escritorIds = null;
        try {
            // Escribir en el fichero por cada nota, un objeto de la clase Notas
            escritor = new BufferedWriter(new FileWriter("notas.txt"));
            // También guardaremos las ids en otro fichero separado
            escritorIds = new BufferedWriter(new FileWriter("ids.txt"));
            //primero conseguir la distancia de los arrays
            int count = 0;
            for (Notas nota : notas) {
                if (nota != null) {
                    count++;
                }
            }
            for(int i = 0; i < count; i++) {
                if (notas[i] != null) {
                    // Guardamos la id de la nota
                    escritorIds.write(notas[i].getIdDeNota() + "\n");
                    // Guardamos el objeto de la clase Notas
                    escritor.write(notas[i].getIdDeNota() + "," + notas[i].getPalabraClave() + "," + notas[i].getTexto() + "\n");
                }
            }
        } catch (IIOException e) {
            System.out.println("Error de entrada/salida: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (escritor != null) {
                    escritor.close();
                }
                if (escritorIds != null) {
                    escritorIds.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar los escritores: " + e.getMessage());
            }
        }
    }
}