import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        int nota;
        System.out.println("Dime la nota del alumno");
        nota=teclado.nextInt();
        switch (nota) {
            case 0,1,2,3,4:
                System.out.println("Suspenso");
                break;
            case 5:
                System.out.println("suficiente");
                break;
            case 6:
                System.out.println("Ben");
                break;
            case 7,8:
                System.out.println("Notable");
                break;
            case 9,10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("nota invalida");
                break;
        }
teclado.close();
    }
}