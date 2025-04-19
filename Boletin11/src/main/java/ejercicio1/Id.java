package ejercicio1;

public class Id {
    private static  String id;
    private static String[] idArray = new String[10];
    // Ampliar el tamaño del array si es necesario
    public static void ampliarArray() {
        String[] nuevoArray = new String[idArray.length * 2];
        System.arraycopy(idArray, 0, nuevoArray, 0, idArray.length);
        idArray = nuevoArray;
    }
    private static void addId(String id) {
        if (idArray.length == 10) {
            ampliarArray();
        }
        for (int i = 0; i < idArray.length; i++) {
            if (idArray[i] == null) {
                idArray[i] = id;
                break;
            }
        }
    }
    public static void comprobarId(String id) throws LicenciaNonValida {
        for (int i = 0; i < idArray.length; i++) {
            if (idArray[i] != null && idArray[i].equals(id)) {
                throw new LicenciaNonValida("El ID ya existe.");
            }
        }
        addId(id);
    }



}
