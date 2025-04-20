package ejercicio3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce o nome do ficheiro");
        String nomeFicheiro = tec.nextLine();
        LeerFicheiro f1 = new LeerFicheiro(nomeFicheiro);
        f1.mostrarPalabras();
        f1.mostrarFrecuencia();

    }
}
