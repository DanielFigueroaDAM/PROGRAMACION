import static java.util.Arrays.binarySearch;

/**
 * Elimina duplicados de un arreglo y genera un nuevo arreglo con solo los elementos únicos.
 *
 * Funcionalidades:
 * - Recorre un arreglo original para identificar números únicos.
 * - Crea un nuevo arreglo con solo los valores únicos.
 * - Imprime el arreglo resultante.
 *
 * @version 1.0
 * @autor Daniel Figueroa Vidal
 */
public class Boletin7_ej9 {
    public static void main(String[] args) {
        // Declaración e inicialización del arreglo original
        int[] numeros = {10, 20, 20, 40, 40, 50, 60};

        // Llama a la función eliminarDuplicados para obtener un nuevo arreglo sin duplicados
        int[] resultado = eliminarDuplicados(numeros);

        // Imprime el arreglo resultante
        System.out.println("Arreglo sin duplicados:");
        for (int numero : resultado) {
            System.out.println(numero);
        }
    }

    /**
     * Elimina los valores duplicados de un arreglo dado.
     *
     * @param lista Arreglo original de enteros.
     * @return Un nuevo arreglo con solo los valores únicos.
     */
    static int[] eliminarDuplicados(int[] lista) {
        int[] temporal = new int[lista.length]; // Arreglo temporal para almacenar únicos
        int contador = 0; // Contador para el número de elementos únicos

        // Recorre el arreglo original para identificar valores únicos
        for (int i = 0; i < lista.length; i++) {
            // Verifica si el número ya está en el arreglo temporal
            if (!existeEnArreglo(temporal, contador, lista[i])) {
                temporal[contador] = lista[i]; // Agrega el número único al arreglo temporal
                contador++;
            }
        }

        // Crea un nuevo arreglo con el tamaño exacto de elementos únicos
        int[] resultado = new int[contador];
        for (int i = 0; i < contador; i++) {
            resultado[i] = temporal[i];
        }

        return resultado; // Retorna el arreglo con valores únicos
    }

    /**
     * Verifica si un número ya existe en un arreglo.
     *
     * @param arreglo Arreglo donde buscar el número.
     * @param tamaño  Tamaño del arreglo a considerar.
     * @param numero  Número a verificar.
     * @return `true` si el número ya existe, `false` en caso contrario.
     */
    static boolean existeEnArreglo(int[] arreglo, int tamaño, int numero) {
        // Recorre el arreglo hasta el tamaño dado para buscar el número
        for (int i = 0; i < tamaño; i++) {
            if (arreglo[i] == numero) {
                return true; // El número ya existe en el arreglo
            }
        }
        return false; // El número no existe en el arreglo
    }
}






    /*
    static int[] array1(int[] lista){
        int restante=0;
        int[] list = new int[lista.length];
        for(int i = 0; i < lista.length; i++){
            list[i] = lista[i];
        }
        for(int i=0;i<lista.length;i++){
            for (int j=i+1;j<list.length;j++) {
                if (list[j] == lista[i]) {
                    restante++;
                }
            }
        }
        int finalSize = lista.length - restante;
        int[] result = new int[finalSize];

        int index = 0;
        for(int i=0;i<lista.length;i++){
            boolean duplicador = false;
            for (int j=i+1;j<list.length;j++) {
                if (list[j] == lista[i]) {
                    duplicador = true;
                    break;
                }
                result[i]=list[i];
            }
            if (!duplicador) {
                result[index] = lista[i];
                index++;
            }
        }
        return result;
    }
}
*/