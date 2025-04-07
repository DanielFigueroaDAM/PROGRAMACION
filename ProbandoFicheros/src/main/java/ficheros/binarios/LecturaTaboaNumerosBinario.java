package ficheros.binarios;

import java.io.*;

public class LecturaTaboaNumerosBinario {

    public LecturaTaboaNumerosBinario (String rutaFicheiro) {
        ObjectInputStream fluxoEntrada = null;
        try {
            fluxoEntrada = new ObjectInputStream(new FileInputStream("numeros.dat"));
            int numero;
            while (true) {
                numero = fluxoEntrada.readInt();
                System.out.println(numero);
            }
        } catch (EOFException e) {
            // Fin do ficheiro alcanzado
        } catch (FileNotFoundException e) {
            System.out.println("Erro: Ficheiro non encontrado" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Erro de entrada/saida: " + e.getMessage());
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
