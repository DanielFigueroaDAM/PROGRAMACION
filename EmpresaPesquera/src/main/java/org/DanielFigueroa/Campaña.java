package org.example;

public interface Campaña {
    static void calidadeBarco(float cargaTonelada,Barcos barco){
        System.out.println("El barco "+barco.getNome() + " tiene un valor de "+ cargaTonelada+"euro tonelada");
    }
}
