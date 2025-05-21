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

    @Override
    public int compareTo(Object o) {
        // Ordenar por nome alfabéticamente
        if (o instanceof Academico) {
            Academico outro = (Academico) o;
            return this.nome.toLowerCase(Locale.ROOT).compareTo(outro.nome.toLowerCase(Locale.ROOT));
        }
        // Si o objeto no es un Academico, no se puede comparar
        return 0;
    }
}
