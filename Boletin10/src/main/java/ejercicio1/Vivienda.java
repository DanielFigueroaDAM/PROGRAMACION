package ejercicio1;

public class Vivienda extends Inmueble{
    private int numeroHabitaciones;
    public String observaciones;

    public Vivienda(String direccion, double extension, double prezo, TipoServicio tipoServicio, int numeroHabitaciones, String observaciones) {
        super(direccion, extension, prezo, tipoServicio);
        this.numeroHabitaciones = numeroHabitaciones;
        this.observaciones = observaciones;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String mostrarInfo() {
        return "Vivienda{" +
                "numeroHabitaciones=" + numeroHabitaciones +
                ", observaciones='" + observaciones + '\'' +
                ", tipoServicio=" + getTipoServicio() +
                ", direccion='" + getDireccion() + '\'' +
                ", extension=" + getExtension() +
                ", prezo=" + getPrezo() +
                '}';
    }
    @Override
    public double importeGanancia() {
        double ganancia;
        if(TipoServicio.VENTA.equals(getTipoServicio())){
            ganancia = getPrezo() * 0.2;
        }else{
            ganancia=getPrezo();
        }
        return ganancia;
    }
}
