package ejercicio1;



public abstract class Inmueble {
    public enum TipoServicio{
        VENTA,ALQUILER
    }
    private TipoServicio tipoServicio;
    private String direccion;
    private double extension;
    private double prezo;

    public Inmueble(String direccion, double extension, double prezo,TipoServicio tipoServicio) {
        this.tipoServicio=tipoServicio;
        this.direccion = direccion;
        this.extension = extension;
        this.prezo = prezo;
    }
    public abstract String mostrarInfo();

    public abstract double importeGanancia();

    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(TipoServicio tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getExtension() {
        return extension;
    }

    public void setExtension(double extension) {
        this.extension = extension;
    }

    public double getPrezo() {
        return prezo;
    }

    public void setPrezo(double prezo) {
        this.prezo = prezo;
    }
}
