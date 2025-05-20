package ejercicio10;

public class Controler {
    public static boolean recibirExisteLaClave(Clave clave) {
        return Model.existeLaClave(clave);
    }
    public static Producto recibirDatosProducto(String nombre, String descripcion, Double precio) {
        Producto p = new Producto(nombre, descripcion, precio);
        Clave clave= new Clave(Clave.crearClave());
        Model.agregarProducto(clave, p);
        return p;
    }
    public static boolean recibirBorrarProducto(String clave){
        Clave clave1= new Clave(clave);
        if (Model.existeLaClave(clave1)){
            Model.borrarProducto(clave1);
            return true;
        }
        return false;
    }
    public static String recibirMostrarProductos() {
        return Model.mostrarProductos();
    }
    public static Producto recibirProducto(Clave clave) {
        return Model.getProducto(clave);
    }
    public static boolean recuperarDatos() {
        Model.recuperarDatos();
        return true;
    }
    public static boolean recibirAñadirCantidad(String clave, int cantidad) {
        Clave clave1= new Clave(clave);
        if (Model.existeLaClave(clave1)){
            return Model.añadirCantidad(clave1, cantidad);
        }
        return false;
    }



}
