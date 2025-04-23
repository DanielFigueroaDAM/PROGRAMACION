package ejercicio3;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LeerFicheiro {
    public String [] listaPalabras = new String[100];
    public LeerFicheiro(String nomeFicheiro) {
        // vamos a meter cada palabra separada por un espacio en un array
        String texto = "";
        FileReader lector = null;
        int contador = 0;
        String palabra = "";
        try{
            lector = new FileReader("/home/dam/PROGRAMACION/Boletin12/src/main/java/ejercicio3/"+nomeFicheiro);
            int caracter = lector.read();
            while (caracter != -1) {
                // separar por espacios e ignorar puntos y comas
                if(caracter !=(char)' ' && caracter != (char)'.' && caracter != (char)',' && caracter != (char)';' && caracter != (char)':' && caracter != (char)'\n' && caracter != (char)'\r' && caracter != (char)'\t'){
                    palabra += (char) caracter;
                }else{
                    // sólo añadimos si realmente hay algo en 'palabra'
                    if (!palabra.isEmpty()) {
                        listaPalabras[contador++] = palabra.toLowerCase();
                        palabra = "";
                        if (contador == listaPalabras.length - 1) {
                            ampliarArray();
                        }
                    }
                    // si palabra estaba vacía, simplemente seguimos (no incrementamos contador)


                }
                caracter = lector.read();
            }
        }catch (IOException e){
            System.out.println("Error de entrada/salida: " + e.getMessage());
        } finally {
            if (lector != null) {
                try {
                    lector.close();
                } catch (IOException e) {
                    System.out.println("Error de entrada/salida al cerrar: " + e.getMessage());
                }
            }
        }
    }
    public void mostrarPalabras() {
        for (int i = 0; i < listaPalabras.length; i++) {
            if (listaPalabras[i] != null) {
                System.out.println(listaPalabras[i]);
            }
        }
    }
    public String[] palabrasUnicas= new String[20];
    //Mostrar frecuencia de cada palabra
    public void mostrarFrecuencia() {
        // Escribir en un fichero la frecuencia de cada palabra
        FileWriter escritor = null;
        try{
            escritor = new FileWriter("/home/dam/PROGRAMACION/Boletin12/src/main/java/ejercicio3/Frecuencia.txt");
            for (int i = 0; i < listaPalabras.length; i++) {
                if (listaPalabras[i] != null) {

                    int contador = 0;
                    for (int j = 0; j < listaPalabras.length; j++) {
                        if (listaPalabras[i].equals(listaPalabras[j])) {
                            contador++;
                        }

                    }
                    if(comprobarPalabra(listaPalabras[i])){
                        escritor.write("La palabra " + listaPalabras[i] + " aparece " + contador + " veces\n");
                    }

                }

            }

        }catch (IOException e){
            System.out.println("Error de entrada/salida: " + e.getMessage());
        } finally {
            if (escritor != null) {
                try {
                    escritor.close();
                } catch (IOException e) {
                    System.out.println("Error de entrada/salida al cerrar: " + e.getMessage());
                }
            }

        }
    }
    private void ampliarArray() {
        String[] nuevoArray = new String[listaPalabras.length * 2];
        for (int i = 0; i < listaPalabras.length; i++) {
            nuevoArray[i] = listaPalabras[i];
        }
        listaPalabras = nuevoArray;
    }

    private boolean comprobarPalabra(String palabra) {
        boolean comp = false;
        // Verificar si la palabra ya existe
        for (int i = 0; i < palabrasUnicas.length; i++) {
            if (palabra.equals(palabrasUnicas[i])) {
                comp = true;
                break;
            }
        }
        if (!comp) {
            boolean added = false;
            // Buscar espacio null para añadir
            for (int i = 0; i < palabrasUnicas.length; i++) {
                if (palabrasUnicas[i] == null) {
                    palabrasUnicas[i] = palabra;
                    added = true;
                    break;
                }
            }
            if (!added) {
                // Ampliar el array y añadir la palabra
                String[] nuevoArray = new String[palabrasUnicas.length * 2];
                System.arraycopy(palabrasUnicas, 0, nuevoArray, 0, palabrasUnicas.length);
                nuevoArray[palabrasUnicas.length] = palabra; // Añadir en la posición correcta
                palabrasUnicas = nuevoArray; // Actualizar la referencia de la variable de instancia
            }
            return true;
        }
        return false;
    }
}
