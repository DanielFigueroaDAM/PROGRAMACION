package ejercicio2;

import java.util.Scanner;

public class App {
    public static Notas[] notas = new Notas[10];

    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("Elige lo que quieres hacer:");
            System.out.println("1. Crear una nota");
            System.out.println("2. Listar notas");
            System.out.println("3. Buscar notas por palabra clave");
            opcion = tec.nextInt();
            tec.nextLine(); // Consumir el carácter de nueva línea
            switch (opcion) {
                case 1:
                    System.out.println("Introduce la palabra clave:");
                    String palabraClave = tec.next();
                    tec.nextLine(); // Consumir el carácter de nueva línea
                    System.out.println("Introduce el texto de la nota:");
                    String texto = tec.nextLine();
                    crearNota(palabraClave, texto);
                    new EscrituraNotas(notas);
                    break;
                case 2:
                    Notasable.listaNotas(notas);
                    break;
                case 3:
                    System.out.println("Introduce la palabra clave para buscar:");
                    String palabraC = tec.nextLine();
                    buscarNotaPorPalabraClave(palabraC);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }while (opcion != 0);

    }
    public static void crearNota(String palabraClave, String texto) {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == null) {
                notas[i] = new Notas(palabraClave, texto);
                System.out.println("Nota creada con ID: " + notas[i].getIdDeNota());
                return;
            }
        }
        // Si no hay espacio, se puede ampliar el array
        Notas[] nuevoArray = new Notas[notas.length + 5];
        for (int i = 0; i < notas.length; i++) {
            nuevoArray[i] = notas[i];
        }
        notas = nuevoArray;
        notas[notas.length - 5] = new Notas(palabraClave, texto);
        System.out.println("Nota creada con ID: " + notas[notas.length - 5].getIdDeNota() + "... y se ha ampliado el espacio.");
    }
    public static void buscarNotaPorPalabraClave(String palabraClave) {
        boolean hayResultados = false;
        for (Notas nota : notas) {
            if (nota != null && nota.getPalabraClave().equalsIgnoreCase(palabraClave)) {
                System.out.println("Nota encontrada: ID: " + nota.getIdDeNota() + ", Texto: " + nota.getTexto());
                hayResultados = true;
            }
        }
        if (!hayResultados) {
            System.out.println("No se encontraron notas con la palabra clave: " + palabraClave);
        }
    }
}
