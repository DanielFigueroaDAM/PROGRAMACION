package ejercicio1;

import java.util.Scanner;

public class  App {
    public static Cliente listaClientes[]=new Cliente[10];
    public static void main(String[] args) {
        // Primero recuperar tamaño de la lista
        new LeerArchivoClientes();
        ampliarArray();
        new LeerArchivoClientes();
        Scanner tec = new Scanner(System.in);
        int comp;
        do {
            System.out.println("1.Engadir cliente");
            System.out.println("2.Modificar datos");
            System.out.println("3.Dar de baixa os clientes");
            System.out.println("4.Lista os clientes");
            System.out.println("0.Salir");
            comp = tec.nextInt();
            switch (comp){
                case 1:
                    System.out.println("Dime el nombre del cliente");
                    String nome = tec.next();
                    System.out.println("Dime su numero de telefono");
                    String telefono=tec.next();
                    engadirCliente(nome,telefono);
                    new EscribirArchivoConArray(listaClientes);
                    break;
                case 2:
                    System.out.println("Que cliente");
                    mostrarListaCliente();
                    int client=tec.nextInt();
                    System.out.println("1.Cambiar nombre");
                    System.out.println("2.Cambiar telefono");
                    int elec=tec.nextInt();
                    System.out.println("Dime la modificacion si eliges telefono(000-000-000) y si eliges nombre (nombre): ");
                    String cambio = tec.next();
                    modificacion(elec,cambio,client);
                    new EscribirArchivoConArray(listaClientes);
                    break;
                case 3:
                    System.out.println("Que cliente quieres dar de baja");
                    mostrarListaCliente();
                    int cl= tec.nextInt();
                    borrarCliente(cl);
                    new EscribirArchivoConArray(listaClientes);
                    break;
                case 4:
                    mostrarListaCliente();
                    break;

                case 0:
                    System.out.println("adios,me despido de ti y me voy");
                    break;
                default:
                    System.out.println("Error, no elegiste una opcion correcta");
            }

        } while (comp != 0);
    }
    public static void engadirCliente(String nombre, String telefono) {
        for (int i = 0; i < listaClientes.length; i++) {
            if (listaClientes[i] == null) { // Encuentra un espacio vacío en la lista
                listaClientes[i] = new Cliente(nombre, telefono); // Crea un nuevo cliente
                System.out.println("Cliente añadido correctamente.");
                return;
            }
        }
        // Si no hay espacio, aumenta el tamaño del array
        Cliente[] nuevaLista = new Cliente[listaClientes.length + 5];
        for (int i = 0; i < listaClientes.length; i++) {
            nuevaLista[i] = listaClientes[i]; // Copia los elementos existentes
        }
        listaClientes = nuevaLista; // Reemplaza el array original
        listaClientes[listaClientes.length - 5] = new Cliente(nombre, telefono); // Añade el nuevo cliente
        System.out.println("El array se ha ampliado y el cliente ha sido añadido correctamente.");
    }
    public static void modificacion(int eleccion, String cambio, int cliente) {
        if (eleccion == 1) {
            //cambiar nombre
            listaClientes[cliente].setNome(cambio);
            System.out.println("Nombre cambiado correctamente");

        } else if (eleccion == 2) {
            //cambiar telefono
            if (cambio.matches("[0-9]{3}-[0-9]{3}-[0-9]{3}")) {
                listaClientes[cliente].setTelefono(cambio);
                System.out.println("Telefono cambiado correctamente");
            } else {
                System.out.println("Sintax error");
            }
        }
    }
        public static void mostrarListaCliente () {
            for (int i = 0; i < listaClientes.length; i++) {
                if (listaClientes[i] != null) {
                    System.out.println(i + ". " + listaClientes[i].getNome() + " " + listaClientes[i].getTelefono()+" "+ listaClientes[i].getId());
                }
            }

        }
        public static void borrarCliente (int cliente){
            listaClientes[cliente] = null;
            System.out.println("Cliente borrado correctamente");

        }
        public static void recuperarListaClientes(Cliente cliente) {
            for (int i = 0; i < listaClientes.length; i++) {
                if (listaClientes[i] == null) {
                    listaClientes[i] = cliente;
                    break;
                }
            }
        }
        public static void ampliarArray(){
            // Si no hay espacio, aumenta el tamaño del array
            Cliente[] nuevaLista = new Cliente[LeerArchivoClientes.contador];
            listaClientes = nuevaLista;
        }
}
