package animales;

public abstract class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public void comer(){
        System.out.println("El %s que tiene %d está comiendo".formatted(nome,idade));
    }
    public void durmir(){
        System.out.println("El %s que tiene %d está comiendo".formatted(nome,idade));
    }
    public abstract void desprazar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
