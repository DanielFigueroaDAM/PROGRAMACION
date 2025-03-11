package animales;

public class Canguro extends Mamiferos implements Son{
    public Canguro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String parir() {
        return "Cria";
    }

    @Override
    public void desprazar() {
        System.out.println("El Canguro %s se delplaza saltando".formatted(getNome()));
    }

    @Override
    public void voz() {
        System.out.println("Gruñe");
    }
}
