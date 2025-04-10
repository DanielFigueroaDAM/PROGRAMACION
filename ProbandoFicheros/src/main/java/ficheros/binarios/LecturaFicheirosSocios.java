package ficheros.binarios;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LecturaFicheirosSocios {
    public LecturaFicheirosSocios(String ruta){
        ObjectInputStream fluxoEntrada = null;
        try{
            fluxoEntrada = new ObjectInputStream(new FileInputStream("socios.dat"));
            while(true){
                Socio s =(Socio) fluxoEntrada.readObject();
                System.out.println(s.toString());
            }
        }catch (EOFException e) {
        System.out.println("Fin do ficheiro");
    } catch (IOException e) {
        System.out.println("Erro de entrada/saida: " + e.getMessage());
    } catch (ClassNotFoundException e)

    {
        System.out.println("Erro de entrada/saida: " + e.getMessage());
    }finally{
            if(fluxoEntrada!=null){
                try {
                    fluxoEntrada.close();
                } catch (IOException e) {
                    System.out.println("Erro de entrada/saida ao pechar: " + e.getMessage());
                }
            }
        }
    }
}
