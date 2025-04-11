package ejercicio1;

public class Id {
    private static int contador = 0;
    private static String id = "0000";
    private static String [] idClientes = new String[10];

    public String  getId(Cliente cliente) {
        contador++;
        id = contador +""+ cliente.getNome().charAt(0);
        do {
            id= id + contador;
        }while (comprobarSiExisteID(id));
        añadirAArray(id);
        return id;
    }
    public void añadirAArray(String id) {
        //apliar array si es necesario
        for (int i = 0; i < idClientes.length; i++) {
            if (idClientes[i] == null) {
                idClientes[i] = id;
                return;
            }
        }
        String[] nuevoArray = new String[idClientes.length + 5];
        for (int i = 0; i < idClientes.length; i++) {
            nuevoArray[i] = idClientes[i];
        }
        idClientes = nuevoArray;
        idClientes[idClientes.length - 5] = id;
    }


    public boolean comprobarSiExisteID(String id) {
        for (int i = 0; i < idClientes.length; i++) {
            if (idClientes[i] != null && idClientes[i].equals(id)) {
                return true;
            }
        }
        return false;
    }

    public static void recuperarListaID(String id) {
        for(int i = 0; i < idClientes.length; i++) {
            if(idClientes[i]==null) {
                idClientes[i] = id;
                break;
            }
        }
    }
}

