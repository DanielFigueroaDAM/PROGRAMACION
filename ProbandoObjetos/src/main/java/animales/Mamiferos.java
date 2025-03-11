package animales;

public abstract class Mamiferos extends Animal {
    public Mamiferos(String nome, int idade) {
        super(nome, idade);
    }
    public void mamar(){
        System.out.println("%s esta mamando".formatted(getNome()));
    }
    public abstract String parir();
}
