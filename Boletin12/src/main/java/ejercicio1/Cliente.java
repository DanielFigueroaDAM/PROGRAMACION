package ejercicio1;

import java.io.Serializable;

public class Cliente implements Serializable {
    private String id;
    private String nome;
    private String telefono;

    public Cliente(String nome, String telefono) {
        this.nome = nome;
        this.telefono = telefono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
