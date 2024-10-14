import java.util.Scanner;

public class boletin_extra_ej2 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Dime los grados celsius ");
        double gradosc = teclado.nextDouble();
        double gradosk=gradosc +273;
        double gradosf=((9/5)*gradosc)+32;
        System.out.println("Los grados kelvin"+gradosk);
        System.out.println("Los grados fahrenhait"+gradosf+"f");

    }
}
