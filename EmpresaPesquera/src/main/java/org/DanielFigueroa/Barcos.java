package org.example;

public abstract class Barcos {
    private double metrosEslora;
    private double toneladasDeCarga;
    private double calado;
    private double potencia;
    private double velocidade;
    private double consumoMedioHora;
    private String nome;
    private String matricula;
    private int numeroTripulantes;

    public Barcos(int numeroTripulantes, String matricula, String nome, double consumoMedioHora, double velocidade, double potencia, double calado, double toneladasDeCarga, double metrosEslora) {
        setNumeroTripulantes(numeroTripulantes);
        setMatricula(matricula);
        setNome(nome);
        setConsumoMedioHora(consumoMedioHora);
        setVelocidade(velocidade);
        setPotencia(potencia);
        setCalado(calado);
        setToneladasDeCarga(toneladasDeCarga);
        setMetrosEslora(metrosEslora);
    }

    public Barcos(double toneladasDeCarga, double consumoMedioHora, String nome, String matricula, int numeroTripulantes) {
        setToneladasDeCarga(toneladasDeCarga);
        setConsumoMedioHora(consumoMedioHora);
        setNome(nome);
        setMatricula(matricula);
        setNumeroTripulantes(numeroTripulantes);
    }

    public double getMetrosEslora() {
        return metrosEslora;
    }

    public void setMetrosEslora(double metrosEslora) {
        if(metrosEslora>0) {
            this.metrosEslora = metrosEslora;
        }else{
            System.out.println("No pueden ser negativos o 0 los metros de Eslora");
        }
    }

    public double getToneladasDeCarga() {
        return toneladasDeCarga;
    }

    public void setToneladasDeCarga(double toneladasDeCarga) {
        if(toneladasDeCarga>0) {
            this.toneladasDeCarga = toneladasDeCarga;
        }else{
            System.out.println("No pueden ser negativos o 0 las toneladas de carga");
        }

    }

    public double getCalado() {
        return calado;
    }

    public void setCalado(double calado) {
        if(calado>0) {
            this.calado = calado;
        }else{
            System.out.println("No pueden ser negativos o 0, o calado");
        }

    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        if(potencia>0) {
            this.potencia = potencia;
        }else{
            System.out.println("No pueden ser negativa la potencia");
        }

    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        if(velocidade>0) {
            this.velocidade = velocidade;
        }else{
            System.out.println("No pueden ser negativa la velocidad");
        }
    }

    public double getConsumoMedioHora() {
        return consumoMedioHora;
    }

    public void setConsumoMedioHora(double consumoMedioHora) {
        if(consumoMedioHora >0){
            this.consumoMedioHora = consumoMedioHora;
        }else {
            System.out.println("El consumo no puede ser negativo");
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(this.nome==null){
            this.nome = nome;
        }
        else{
            System.out.println("No se puede volver a modificar el nombre");
        }

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if(this.matricula==null){
            this.matricula = matricula;
        }
        else{
            System.out.println("No se puede volver a modificar la matricula");
        }
    }
    public int getNumeroTripulantes() {
        return numeroTripulantes;
    }

    public void setNumeroTripulantes(int numeroTripulantes) {
        if(numeroTripulantes>0) {
            this.numeroTripulantes = numeroTripulantes;
        }else{
            System.out.println("El numeroDeTripulantes no puede ser 0");
        }

    }

    public abstract String aCadea();
    public abstract float calculoCosteConsumo(int dias, float eurosFuel);
}
