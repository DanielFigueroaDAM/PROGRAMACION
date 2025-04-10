package ficheros.binarios;

import java.io.Serializable;

public class Socio implements Serializable {
    String dni;
    String nome;
    public Socio (String dni, String nome) {
        this.dni = dni;
        this.nome = nome;
    }
    public String toString() {
        return "Socio{" +
                "dni='" + dni + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
