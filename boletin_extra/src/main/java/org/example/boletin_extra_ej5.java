import java.util.Scanner;

/**
 * Calcular el sueldo final de un trabajador dados los siguientes paramentros.
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */

public class boletin_extra_ej5 {
    public static void main(String []args) {
        Scanner teclado = new Scanner(System.in);
        double sbruto, tventas, km, desplazamiento, sliquido, sfijo = 1300;
        System.out.println("Cuento es el importe de ventas");
        tventas=teclado.nextDouble();
        tventas=tventas*0.05;
        System.out.println("Cuento es la cantidad de kilometros");
        km=teclado.nextDouble();
        km=km*2;
        System.out.println("Cuento es la cantidad de dias desplazados");
        desplazamiento=teclado.nextDouble();
        desplazamiento=desplazamiento*36;
        sbruto=desplazamiento+km+tventas+sfijo;
        System.out.println("El sueldo bruto es "+ sbruto);
        sliquido=sbruto-(sbruto*0.18);
        sliquido=sliquido-36;
        System.out.println("El sueldo liquido es "+ sliquido);
    }
}