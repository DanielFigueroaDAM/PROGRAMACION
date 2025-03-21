package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Auxiliares a1 = new Auxiliares(5,5,"paco","paca",3,5);
        System.out.println(a1.aCadea());
        Extractores e1=new Extractores(2, "matricula", "nome", 2, 2, 2, 2, 2, 2, "tipoArte", true, false);
        System.out.println(e1.aCadea());
        e1.setMatricula("fede");
        System.out.println(e1.calculoCosteConsumo(4,5));
        a1.setMatricula("pac");
        Campaña.calidadeBarco(5,a1);
    }
}