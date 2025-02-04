/**
 * Clase para formatear un nombre capitalizando cada palabra y eliminando espacios.
 * Ejemplo: "paco gutUerrez" → "PacoGutuerrez"
 *
 * @author Daniel Figueroa
 * @version 1.0
 */
public class Boletin8_2_ej11 {
    public static void main(String[] args) {
        String nombre = "paco gutUerrez";
        System.out.println(formatearNombre(nombre));  // Output: "PacoGutuerrez"
    }

    /**
     * Formatea un nombre capitalizando la primera letra de cada palabra y eliminando espacios.
     *
     * @param nombre Nombre a formatear (puede contener espacios múltiples o mezcla de mayúsculas/minúsculas)
     * @return Nombre formateado sin espacios y con cada palabra capitalizada
     */
    public static String formatearNombre(String nombre) {
        String nombreFormateado = "";
        nombre = nombre.toLowerCase();  // Normaliza todo a minúsculas

        char[] arrayNombre = nombre.toCharArray();  // Convierte el String en array de caracteres

        for (int i = 0; i < arrayNombre.length; i++) {
            // Capitaliza si es el primer carácter o si el anterior es un espacio
            if (i == 0 || arrayNombre[i - 1] == ' ') {
                arrayNombre[i] = Character.toUpperCase(arrayNombre[i]);
            }
            nombreFormateado += arrayNombre[i];  // Construye el resultado carácter por carácter
        }

        nombreFormateado = nombreFormateado.replace(" ", "");  // Elimina todos los espacios
        return nombreFormateado;
    }
}
