package org.example;

public class Extractores extends Barcos{
    public String tipoArte;
    public boolean frigorifico;
    public boolean conxelador;

    public Extractores(int numeroTripulantes, String matricula, String nome, double consumoMedioHora, double velocidade, double potencia, double calado, double toneladasDeCarga, double metrosEslora, String tipoArte, boolean frigorifico, boolean conxelador) {
        super(numeroTripulantes, matricula, nome, consumoMedioHora, velocidade, potencia, calado, toneladasDeCarga, metrosEslora);
        this.tipoArte = tipoArte;
        setFrigorificoConxelador(frigorifico,conxelador);
    }



    public void setTipoArte(String tipoArte) {
        this.tipoArte = tipoArte;
    }

    public void setFrigorificoConxelador(boolean frigorifico,boolean conxelador) {
        if(frigorifico == true || conxelador ==true) {
            this.frigorifico = frigorifico;
            this.conxelador = conxelador;
        }else{
            System.out.println("Obligatoriamente tiene que tener un frigorifico o un conxelador");
        }
    }

    public String getTipoArte() {
        return tipoArte;
    }

    public boolean isFrigorifico() {
        return frigorifico;
    }

    public boolean isConxelador() {
        return conxelador;
    }

    public Extractores(double toneladasDeCarga, double consumoMetroDia, String nome, String matricula, int numeroTripulantes, String tipoArte, boolean frigorifico, boolean conxelador) {
        super(toneladasDeCarga, consumoMetroDia, nome, matricula, numeroTripulantes);
        this.tipoArte = tipoArte;
        this.frigorifico = frigorifico;
        this.conxelador = conxelador;
    }

    @Override
    public String aCadea() {
        String s = "metrosEslora=" + getMetrosEslora() +
                ", toneladasDeCarga=" + getToneladasDeCarga() +
                ", calado=" + getCalado() +
                ", potencia=" + getPotencia() +
                ", velocidade=" + getVelocidade() +
                ", consumoMedioHora=" + getConsumoMedioHora()+
                ", nome='" + getNome() + '\'' +
                ", matricula='" + getMatricula() + '\'' +
                ", numeroTripulantes=" + getNumeroTripulantes();
        return "Extractores{" + s +
                "tipoArte='" + tipoArte + '\'' +
                ", frigorifico=" + frigorifico +
                ", conxelador=" + conxelador +
                '}';
    }
    @Override
    public float calculoCosteConsumo(int dias, float eurosFuel) {
        return (float) (dias*(getConsumoMedioHora()*24));
    }
}
