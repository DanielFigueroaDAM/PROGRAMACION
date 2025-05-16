package ejercicio9;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static ArrayList<Temperatura> temperaturas = new ArrayList<>();
    public static void main(String[] args) {
        new LecturaTemperaturas();

        Scanner tec = new Scanner(System.in);
        Double temperatura;
        int eleccion;
        do{
            System.out.println("Escoja una opción:");
            System.out.println("1. Añadir temperatura");
            System.out.println("2. Mostrar temperaturas");
            System.out.println("3. Mostrar estadisticas del dia");
            System.out.println("4. Salir y guardar");
            eleccion = tec.nextInt();
            switch (eleccion){
                case 1:
                    System.out.println("Introduce la temperatura");
                    temperatura = tec.nextDouble();
                    //La hora se añade automaticamente y la fecha igual
                    Instant ahora = Instant.now();
                    temperaturas.add(new Temperatura(temperatura, ahora));
                    break;
                case 2:
                    System.out.println("Temperaturas del dia:");
                    for (Temperatura t : temperaturas) {
                        System.out.println(t);
                    }
                    break;
                case 3:
                    mediaDelDia(temperaturas);
                    System.out.println("La temperatura máxima del dia es: " + temperaturaMaximaDelDia(temperaturas));
                    temperaturaMinimaDelDia(temperaturas);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }while (eleccion != 4);
        // Guardar las temperaturas en un archivo
        new EscrituraTemperaturas(temperaturas);
    }
    private static Double temperaturaMaximaDelDia(ArrayList<Temperatura> temperaturas) {
        Double max = 0.0;
        // Solo las del dia de hoy
        for (Temperatura t : temperaturas) {
            if(siLaTemperaturaEsDeHoy(t)) {
                if (t.getTemperatura() > max) {
                    max = t.getTemperatura();
                }
            }
        }
        return max;
    }
    private static void temperaturaMinimaDelDia(ArrayList<Temperatura> temperaturas) {
        Double min = temperaturaMaximaDelDia(temperaturas);
        // Solo las del dia de hoy
        for (Temperatura t : temperaturas) {
            if(siLaTemperaturaEsDeHoy(t)) {
                if (t.getTemperatura() < min) {
                    min = t.getTemperatura();
                }
            }
        }
        System.out.println("La temperatura mínima del dia es: " + min);
    }

    private static void mediaDelDia(ArrayList<Temperatura> temperaturas) {
        Double suma = 0.0;
        int countTemp = 0;
        // Solo las del dia de hoy
        for (Temperatura t : temperaturas) {
            if(siLaTemperaturaEsDeHoy(t)) {
                suma += t.getTemperatura();
                countTemp++;
            }
        }
        Double media = suma / countTemp;
        System.out.println("La temperatura media del dia es: " + media);
    }

    private static boolean siLaTemperaturaEsDeHoy(Temperatura t) {
        // Comprobar si la fecha es de hoy
        Instant ahora = Instant.now();
        String fechaHoy = ahora.toString().substring(0, 10);
        String fechaTemperatura = t.getFecha().toString().substring(0, 10);
        if (fechaHoy.equals(fechaTemperatura)) {
            return true;
        }
        return false;
    }
    public static void agregarTemperatura(Temperatura t) {
        temperaturas.add(t);
    }
}
