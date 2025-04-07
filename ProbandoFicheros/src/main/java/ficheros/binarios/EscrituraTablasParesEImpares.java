package ficheros.binarios;

import java.io.*;

public class EscrituraTablasParesEImpares {

    // Constructor con el nombre corregido (sin 'r' extra en 'Escritura')
    public EscrituraTablasParesEImpares(int[] taboa) {
        ObjectOutputStream fluxoSaidaPares = null;
        ObjectOutputStream fluxoSaidaImpares = null;

        try {
            // Intenta abrir los flujos de salida
            fluxoSaidaPares = new ObjectOutputStream(new FileOutputStream("numerosPares.dat"));
            fluxoSaidaImpares = new ObjectOutputStream(new FileOutputStream("numerosImpares.dat"));

            if (taboa != null) {
                for (int numero : taboa) {
                    if (numero % 2 == 0) {
                        fluxoSaidaPares.writeInt(numero); // Escribe pares
                    } else {
                        fluxoSaidaImpares.writeInt(numero); // Escribe impares
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Erro: Ficheiro non encontrado" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Erro de entrada/saida: " + e.getMessage());
        } finally {
            // Cierra ambos flujos de manera segura
            cerrarFlujo(fluxoSaidaPares);
            cerrarFlujo(fluxoSaidaImpares);
        }
    }

    // Método auxiliar para cerrar flujos
    private void cerrarFlujo(ObjectOutputStream fluxo) {
        if (fluxo != null) {
            try {
                fluxo.close();
            } catch (IOException e) {
                System.out.println("Erro ao pechar o fluxo: " + e.getMessage());
            }
        }
    }
}