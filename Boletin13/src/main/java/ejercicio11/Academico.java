package ejercicio11;

import java.time.LocalDate;
import java.util.Locale;

public class Academico implements Comparable{
    private String nome;
    private int anoDeIngreso;

    public Academico(String nome, int anoDeIngreso) {
        this.nome = nome;
        this.anoDeIngreso = anoDeIngreso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeIngreso() {
        return anoDeIngreso;
    }

    public void setAnoDeIngreso(int anoDeIngreso) {
        this.anoDeIngreso = anoDeIngreso;
    }

    /** Orden natural: alfabético por nombre (ignorando mayúsculas/minúsculas). */
    @Override
    public int compareTo(Object o) {
        // Si el objeto que llega no es un Académico, no sabemos compararlo.
        if (!(o instanceof Academico)) {
            return 0;
        }
        Academico outro = (Academico) o;
        return this.nome.toLowerCase(Locale.ROOT)
                .compareTo(outro.nome.toLowerCase(Locale.ROOT));
    }


}
