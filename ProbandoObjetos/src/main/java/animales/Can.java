package animales;

public class Can extends Animal{
    private String raza;


    public Can(String nome, int idade, String raza) {
        super(nome, idade);
        this.raza = raza;
    }

    public void desprazar() {
        System.out.println("El perro %s de la edad %d (que es un %s) está caminando  a cuatro patas".formatted(getNome(),getIdade(),this.raza));
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
