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
            for (Notas nota : notas) {
                if (nota != null) {
                    escritor.write(nota.toString());
                    escritorIds.write(String.valueOf(nota.getIdDeNota()));
                    escritor.newLine(); // Salto de línea para que sea un objeto por línea
                    escritorIds.newLine(); // Salto de línea para que sea un objeto por línea

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