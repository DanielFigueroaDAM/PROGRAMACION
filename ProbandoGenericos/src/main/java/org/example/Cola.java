package org.example;

public interface Cola<T> {
    void encolar(T novo);
    T desencolar();

}
