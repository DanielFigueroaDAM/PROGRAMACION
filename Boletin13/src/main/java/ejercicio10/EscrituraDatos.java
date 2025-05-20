package ejercicio10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;

public class EscrituraDatos {
    public EscrituraDatos(Map <Clave, Producto> mapa, Map <Clave, Integer> mapa2) {
        ObjectOutputStream flujoSalida = null;
        ObjectOutputStream flujoSalida2 = null;
        try{
            flujoSalida = new ObjectOutputStream(new FileOutputStream("productos.dat"));
            flujoSalida2 = new ObjectOutputStream(new FileOutputStream("cantidades.dat"));
            // Escribir directamente la collección en el archivo sin recorrerlo
            if (mapa != null) {
                flujoSalida.writeObject(mapa);
            }
            if (mapa2 != null) {
                flujoSalida2.writeObject(mapa2);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (flujoSalida != null) {
                try {
                    flujoSalida.close();
                } catch (IOException e) {
                    System.out.println("Error de entrada/salida al cerrar: " + e.getMessage());
                }
            }
            if (flujoSalida2 != null) {
                try {
                    flujoSalida2.close();
                } catch (IOException e) {
                    System.out.println("Error de entrada/salida al cerrar: " + e.getMessage());
                }
            }
        }

    }

}
