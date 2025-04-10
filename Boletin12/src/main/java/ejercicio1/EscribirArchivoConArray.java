package ejercicio1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscribirArchivoConArray {
    public EscribirArchivoConArray(Cliente[] lClientes){
        ObjectOutputStream fluxoSaida = null;
        try {
            fluxoSaida= new ObjectOutputStream(new FileOutputStream("clientes.dat"));
            if(lClientes != null) {
                for (Cliente client : lClientes) {
                    fluxoSaida.writeObject(client);
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Erro: Ficheiro non encontrado"+ e.getMessage());
        }catch (IOException e){
            System.out.println("Erro de entrada/saida: "+ e.getMessage());
        }finally {
            if (fluxoSaida != null) {
                try {
                    fluxoSaida.close();
                } catch (IOException e) {
                    System.out.println("Erro de entrada/saida ao pechar: " + e.getMessage());
                }
            }
        }

    }
}
