package ejercicio1;

import java.io.*;

import static ejercicio1.Id.recuperarListaID;
import static ejercicio1.App.recuperarListaClientes;


public class LeerArchivoClientes {
    public static int contador = 0;
    public LeerArchivoClientes () {
        ObjectInputStream fluxoEntrada = null;
        try {
            fluxoEntrada = new ObjectInputStream(new FileInputStream("clientes.dat"));
            Cliente cliente;
            while (true) {
                cliente = (Cliente) fluxoEntrada.readObject();
                if (cliente != null) {
                    recuperarListaID(cliente.getId());
                    recuperarListaClientes(cliente);
                    contador++;

                }
            }

        } catch (EOFException e) {
            // Fin do ficheiro alcanzado
        } catch (FileNotFoundException e) {
            System.out.println("Erro: Ficheiro non encontrado" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Erro de entrada/saida: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (fluxoEntrada != null) {
                try {
                    fluxoEntrada.close();
                } catch (IOException e) {
                    System.out.println("Erro de entrada/saida ao pechar: " + e.getMessage());
                }
            }
        }
    }
}
