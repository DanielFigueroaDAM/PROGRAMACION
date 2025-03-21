package org.example;

public class Auxiliares extends Barcos{
    private ConxeladorFrigorifico tenCamara=ConxeladorFrigorifico.CONXELADOR;
    private int compartimentoFuel;

    public Auxiliares(int numeroTripulantes, String matricula, String nome, double consumoMedioHora, double velocidade, double potencia, double calado, double toneladasDeCarga, double metrosEslora, int compartimentoFuel) {
        super(numeroTripulantes, matricula, nome, consumoMedioHora, velocidade, potencia, calado, toneladasDeCarga, metrosEslora);
        this.compartimentoFuel = compartimentoFuel;
    }

    public Auxiliares(double toneladasDeCarga, double consumoMedioHora, String nome, String matricula, int numeroTripulantes, int compartimentoFuel) {
        super(toneladasDeCarga, consumoMedioHora, nome, matricula, numeroTripulantes);
        this.compartimentoFuel = compartimentoFuel;
    }

    public int isCompartimentoFuel() {
        return compartimentoFuel;
    }

    public void setCompartimentoFuel(int compartimentoFuel) {
        this.compartimentoFuel = compartimentoFuel;
    }

    public ConxeladorFrigorifico getTenCamara() {
        return tenCamara;
    }

    @Override
    public String aCadea() {
        String s = "metrosEslora=" + getMetrosEslora() +
                ", toneladasDeCarga=" + getToneladasDeCarga() +
                ", calado=" + getCalado() +
                ", potencia=" + getPotencia() +
                ", velocidade=" + getVelocidade() +
                ", consumoMetroHora=" + getConsumoMedioHora()+
                ", nome='" + getNome() + '\'' +
                ", matricula='" + getMatricula() + '\'' +
                ", numeroTripulantes=" + getNumeroTripulantes();
        return "Auxiliares{" + s +
                "tenCamara=" + tenCamara +
                ", compartimentoFuel=" + compartimentoFuel +
                '}';
    }

    @Override
    public float calculoCosteConsumo(int dias, float eurosFuel) {
        return (float) (dias*(getConsumoMedioHora()*24));
    }
}
