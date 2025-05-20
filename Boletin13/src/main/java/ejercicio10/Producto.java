package ejercicio10;

import java.io.Serializable;

public record Producto (String nombre, String descripcion, Double precio) implements Serializable  {
    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public Double getPrecio() {
        return precio;
    }
}
