package ejercicio2;

public class Id {
    private static int contador = 0;
    public static int[] idNotas = new int[10];
    public static int generearId(String palabra){
        contador++;
        int id = contador + palabra.charAt(0);
        do {
            id = id + contador;
        }while (comprobarSiExisteID(id));
        añadirAArray(id);
        return id;
    }
    private static void añadirAArray(int id) {
        //apliar array si es necesario
        for (int i = 0; i < idNotas.length; i++) {
            if (idNotas[i] == 0) {
                idNotas[i] = id;
                return;
            }
        }
        int[] nuevoArray = new int[idNotas.length + 5];
        for (int i = 0; i < idNotas.length; i++) {
            nuevoArray[i] = idNotas[i];
        }
        idNotas = nuevoArray;
        idNotas[idNotas.length - 5] = id;
    }
    private static boolean comprobarSiExisteID(int id) {
        for (int i = 0; i < idNotas.length; i++) {
            if (idNotas[i] != 0 && idNotas[i] == id) {
                return true;
            }
        }
        return false;
    }
}
