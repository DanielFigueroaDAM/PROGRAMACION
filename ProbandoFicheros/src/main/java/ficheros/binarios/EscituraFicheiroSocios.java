package ficheros.binarios;

import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectOutputStream;

public class EscituraFicheiroSocios {
    public EscituraFicheiroSocios(String ruta, Socio[] socios){
        ObjectOutputStream fluxoSaida = null;
         try {
             fluxoSaida= new ObjectOutputStream(new java.io.FileOutputStream(ruta));
             for(Socio s: socios){
                 fluxoSaida.writeObject(s);
             }
         }catch (IOException e) {
             System.out.println("Erro de entrada/saida: " + e.getMessage());
         }finally {
             try {
                 if (fluxoSaida != null) {
                     fluxoSaida.close();
                 }
             } catch (IOException e) {
                 System.out.println("Erro de entrada/saida ao pechar: " + e.getMessage());
             }
         }
    }
}
