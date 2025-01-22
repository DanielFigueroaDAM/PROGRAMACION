package org.example;

public class ProbandoObjeto {
    public double precio;
    public String Nombre;
    public int cantidad;

    public ProbandoObjeto(double precio, String nombre, int cantidad) {
        this.precio = precio;
        Nombre = nombre;
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
