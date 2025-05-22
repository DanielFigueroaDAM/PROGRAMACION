package ejercicio2;

import ejercicio1.Cancion;

import java.io.FileReader;
import java.io.IOException;

public class LecturaDeInformacion {
    public static void MostrarInformacion(String nomeFicheiro){
        String texto = "";
        FileReader lector = null;
        StringBuilder palabra = new StringBuilder();
        boolean compA = false,compC=false;
        StringBuilder nombreCancion = null;
        StringBuilder nombreAutor = null;
        try{
            lector = new FileReader(nomeFicheiro);
            int caracter = lector.read();
            while (caracter != -1) {
                if(caracter!='-' && caracter != '\n'){
                    palabra.append((char)caracter);
                }
                else if(caracter == '-') {
                    nombreAutor = palabra;
                    compA = true;
                    palabra= new StringBuilder("");

                }else {
                    nombreCancion=palabra;
                    compC = true;
                    palabra= new StringBuilder("");
                }
                if(compA && compC){
                    System.out.println("La cancion es "+nombreCancion + " y su autor es "+ nombreAutor);
                    compC = false;
                    compA= false;
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
    public static void buscarCancionPorTitulo(String nomeCancion, String nomeFicheiro){
        String texto = "";
        FileReader lector = null;
        StringBuilder palabra = new StringBuilder();
        boolean compA = false,compC=false;
        StringBuilder nombreCancion = null;
        StringBuilder nombreAutor = null;
        try{
            lector = new FileReader(nomeFicheiro);
            int caracter = lector.read();
            while (caracter != -1) {
                if(caracter!='-' && caracter != '\n'){
                    palabra.append((char)caracter);
                }
                else if(caracter == '-') {
                    nombreAutor = palabra;
                    compA = true;
                    palabra= new StringBuilder("");

                }else {
                    nombreCancion=palabra;
                    compC = true;
                    palabra= new StringBuilder("");
                }
                if(compA && compC){
                    StringBuilder NombreCancion2 = new StringBuilder(nomeCancion);
                    if(nombreCancion.compareTo(NombreCancion2) == 0){
                        System.out.println("Cancion encontrada");
                        System.out.println("Tu cancion es "+nomeCancion +" y su autor es"+nombreAutor);
                    }
                    compC = false;
                    compA= false;
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
}
