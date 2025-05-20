package ejercicio10;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Controler.recuperarDatos();
        Scanner tec = new Scanner(System.in);
        String nombre, descripcion;
        Double precio;
        int opcion;
        do {
            System.out.println("Introduce la opcion deseada");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Borrar producto");
            System.out.println("4. Añadir cantidad a un producto");
            System.out.println("5. Salir");
            opcion = tec.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el nombre del producto");
                    nombre = tec.next();
                    tec.nextLine(); // Limpia el buffer
                    System.out.println("Introduce la descripcion del producto");
                    descripcion = tec.nextLine();

                    System.out.println("Introduce el precio del producto");
                    while (!tec.hasNextDouble()) { // Valida que la entrada sea un número
                        System.out.println("Por favor, introduce un número válido para el precio:");
                        tec.next(); // Descarta la entrada no válida
                    }
                    precio = tec.nextDouble();
                    tec.nextLine(); // Limpia el buffer
                    Controler.recibirDatosProducto(nombre, descripcion, precio);
                    break;
                case 2:
                    System.out.println(Controler.recibirMostrarProductos());
                    break;
                case 3:
                    System.out.println("Introduce la clave del producto a borrar");
                    String clave = tec.next();
                    Controler.recibirBorrarProducto(clave);
                    break;
                case 4:
                    System.out.println(Controler.recibirMostrarProductos());
                    System.out.println("Introduce la clave del producto a añadir cantidad");
                    String claveCantidad = tec.next();
                    if (!Controler.recibirExisteLaClave(new Clave(claveCantidad))) {
                        System.out.println("La clave no existe");
                        break;
                    }
                    System.out.println("Introduce la cantidad a añadir");
                    while (!tec.hasNextInt()) { // Valida que la entrada sea un número
                        System.out.println("Por favor, introduce un número válido para la cantidad:");
                        tec.next(); // Descarta la entrada no válida
                    }
                    int cantidad = tec.nextInt();
                    Controler.recibirAñadirCantidad(claveCantidad, cantidad);
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        }while ( opcion != 5);
    }
}
