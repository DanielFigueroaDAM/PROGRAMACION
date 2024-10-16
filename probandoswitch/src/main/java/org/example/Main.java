import java.util.Scanner;
/**
 * Muestra la calificacion escrita de cada alumno introduciendo la nota
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
public class Main {
    public static void main(String[] args) {
        //
        Scanner teclado=new Scanner (System.in);
        int nota;
        System.out.println("Dime la nota del alumno"); //Pedimos las notas de un alumno
        nota=teclado.nextInt();//Usamos el escaner para que el usuario pueda escribir las notas de los alumnos
        switch (nota) {
            case 0,1,2,3,4: //El primer case para las notas suspendidas.
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