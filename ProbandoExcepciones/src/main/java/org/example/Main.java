package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a,b,c;
        a=0;
        b=0;
        try {
            c=a/b;
        }  catch (ArithmeticException erro){
            System.out.println("Ummm,parece que b é 0, intentao de novo");
            System.out.println(erro.getMessage());
        }
    }
}