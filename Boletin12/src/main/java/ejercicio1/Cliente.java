package ejercicio1;

import java.io.Serializable;

public class Cliente implements Serializable {
    private String id;
    private String nome;
    private String telefono;

    public Cliente(String nome, String telefono) {
        this.nome = nome;
        setTelefono(telefono);
        this.id = new Id().getId(this);
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
        if (telefono.matches("[0-9]{3}[0-9]{3}[0-9]{3}")) {
            this.telefono = telefono;
        } else {
            System.out.println("Sintax error");
        }

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }

}
