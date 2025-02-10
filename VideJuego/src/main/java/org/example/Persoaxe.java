package org.example;

public class Persoaxe {
    private String nome;
    private int vida;
    private int resistencia;
    private int forza;
    private int velocidade;
    private int experiencia;
    private String apariencia;
    private String[] habilidades;
    private String[] equipamento;

    public Persoaxe() {
        nome = "Invitado";
        vida = 3;
        resistencia = 3;
        forza = 3;
        velocidade = 3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(this.nome.length()<20){
            this.nome = nome;
        }
        else {
            System.out.println("El nombre no puede esceder de 20 caracteres");
        }
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if (vida >= 0 && vida <= 5) {
            this.vida = vida;
        } else {
            System.out.println("La vida debe estar entre 0 y 5.");
        }
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        if (resistencia >= 0 && resistencia <= 10) { // Ejemplo de restricción
            this.resistencia = resistencia;
        } else {
            System.out.println("La resistencia debe estar entre 0 y 10.");
        }
    }

    public int getForza() {
        return forza;
    }

    public void setForza(int forza) {
        if (forza >= 0 && forza <= 10) { // Ejemplo de restricción
            this.forza = forza;
        } else {
            System.out.println("La fuerza debe estar entre 0 y 10.");
        }
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        if (velocidade >= 0 && velocidade <= 10) { // Ejemplo de restricción
            this.velocidade = velocidade;
        } else {
            System.out.println("La velocidad debe estar entre 0 y 10.");
        }
    }

    public String getApariencia() {
        return apariencia;
    }

    public void setApariencia(String apariencia) {
        this.apariencia = apariencia;
    }

    public String[] getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String[] habilidades) {
        this.habilidades = habilidades;
    }

    public String[] getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String[] equipamento) {
        this.equipamento = equipamento;
    }
}

