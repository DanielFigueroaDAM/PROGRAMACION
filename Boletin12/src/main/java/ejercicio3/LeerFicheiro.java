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
            lector = new FileReader("/home/figue/PROGRAMACION/Boletin12/src/main/java/ejercicio3/"+nomeFicheiro);
            int caracter = lector.read();
            while (caracter != -1) {
                if(caracter !=(char)' '){
                    palabra += (char) caracter;
                }else{
                    listaPalabras[contador] = palabra;
                    contador++;
                    palabra = "";
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
    //Mostrar frecuencia de cada palabra
    public void mostrarFrecuencia() {
        // Escribir en un fichero la frecuencia de cada palabra
        FileWriter escritor = null;
        try{
            escritor = new FileWriter("/home/figue/PROGRAMACION/Boletin12/src/main/java/ejercicio3/Frecuencia.txt");
            for (int i = 0; i < listaPalabras.length; i++) {
                if (listaPalabras[i] != null) {
                    int contador = 0;
                    for (int j = 0; j < listaPalabras.length; j++) {
                        if (listaPalabras[i].equals(listaPalabras[j])) {
                            contador++;
                        }
                    }
                    escritor.write("La palabra " + listaPalabras[i] + " aparece " + contador + " veces\n");
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
}
