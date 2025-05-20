package ejercicio10;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Model {
    private static Map<Clave, Producto> listaProductos=  new HashMap<>();
    private static Map<Clave,Integer> listaCantidades = new HashMap<>();
    public static boolean existeLaClave(Clave clave) {
        return listaProductos.containsKey(clave);
    }
    public static boolean agregarProducto(Clave clave, Producto producto) {
        if (clave == null || producto == null) {
            throw new IllegalArgumentException("La clave o el producto no pueden ser nulos");
        }
        if (listaProductos.containsKey(clave)) {
            int cantidad = listaCantidades.get(clave);
            listaCantidades.put(clave, cantidad + 1);
        } else {
            listaProductos.put(clave, producto);
            listaCantidades.put(clave, 1); // Inicializa la cantidad en 0
        }
        new EscrituraDatos(listaProductos, listaCantidades);
        return true;
    }
    public static boolean borrarProducto(Clave clave) {
        if (clave == null) {
            throw new IllegalArgumentException("La clave no puede ser nula");
        }
        listaProductos.remove(clave);
        listaCantidades.remove(clave);
        new EscrituraDatos(listaProductos, listaCantidades);
        return true;
    }
    public static String mostrarProductos() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Clave, Producto> entry : listaProductos.entrySet()) {
            Clave clave = entry.getKey();
            Producto producto = entry.getValue();
            // Obtener la cantidad de productos de la lista de cantidades
            Integer cantidad;
            if (listaCantidades.containsKey(clave)) {
                cantidad = listaCantidades.get(clave);
            } else {
                cantidad = 0; // Si no existe la clave en la lista de cantidades, asignar 0
            }
            sb.append("Clave: ").append(clave)
              .append(", Producto: ").append(producto)
              .append(", Cantidad: ").append(cantidad)
              .append("\n");
        }
        return sb.toString();
    }
    @Override
    public String toString() {
        //devolver productos con su cantidad y su clave
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Clave, Producto> entry : listaProductos.entrySet()) {
            sb.append("Clave: ").append(entry.getKey()).append(", Producto: ").append(entry.getValue()).append(", Cantidad: ").append(listaCantidades.get(entry.getKey())).append("\n");
        }
        return sb.toString();
    }


    public static Producto getProducto(Clave clave) {
        return listaProductos.get(clave);
    }
    public static void recuperarDatos() {
        try {
            File fileProductos = new File("productos.dat");
            File fileCantidades = new File("cantidades.dat");

            if (fileProductos.exists()) {
                ObjectInputStream flujoSalida = new ObjectInputStream(new FileInputStream(fileProductos));
                listaProductos = (Map<Clave, Producto>) flujoSalida.readObject();
                flujoSalida.close();
            } else {
                listaProductos = new HashMap<>();
            }

            if (fileCantidades.exists()) {
                ObjectInputStream flujoSalida2 = new ObjectInputStream(new FileInputStream(fileCantidades));
                listaCantidades = (Map<Clave, Integer>) flujoSalida2.readObject();
                flujoSalida2.close();
            } else {
                listaCantidades = new HashMap<>();
            }
        } catch (IOException | ClassNotFoundException e) {
            listaProductos = new HashMap<>();
            listaCantidades = new HashMap<>();
        }
    }
    public static boolean añadirCantidad(Clave clave, int cantidad) {
        if (clave == null) {
            throw new IllegalArgumentException("La clave no puede ser nula");
        }
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor que 0");
        }
        if (listaCantidades.containsKey(clave)) {
            int cantidadActual = listaCantidades.get(clave);
            listaCantidades.put(clave, cantidadActual + cantidad);
        } else {
            throw new IllegalArgumentException("La clave no existe en la lista de cantidades");
        }
        new EscrituraDatos(listaProductos, listaCantidades);
        return true;
    }

}
