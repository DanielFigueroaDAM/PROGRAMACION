package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Double [] temp = new Double[5];
        temp[0] = 2.3;
        temp[1] = 15.53;
        temp[2] = 22.43;
        temp[3] = -5.66;
        temp[4] = 15.777;

        ContedorElementos<Double> t= new ContedorElementos<>(temp);
        t.apilar(2.45);
        t.apilar(33.56);
        System.out.println(t.desapilar());
        System.out.println(t.desapilar());
        System.out.println(t.desapilar());
    }
}