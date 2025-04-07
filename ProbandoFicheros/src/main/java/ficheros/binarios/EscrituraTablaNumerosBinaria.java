package ficheros.binarios;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscrituraTablaNumerosBinaria {
    EscrituraTablaNumerosBinaria(int [] taboa){
        ObjectOutputStream fluxoSaida = null;
        try {
            fluxoSaida= new ObjectOutputStream(new FileOutputStream("numeros.dat"));
            if(taboa != null) {
                for (int numero : taboa) {
                    fluxoSaida.writeInt(numero);
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
