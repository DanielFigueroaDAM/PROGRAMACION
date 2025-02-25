package ejercicio3;

public class Coche {
    private int velocidade;
    public Coche() {
        this.velocidade = 0;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void acelerar(int valor) {
        this.velocidade += valor;
    }
    public void frenar(int menos) {
        this.velocidade -= menos;
    }
}
