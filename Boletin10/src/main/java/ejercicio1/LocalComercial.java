package ejercicio1;

public class LocalComercial extends Inmueble{

    public enum Tipo{
        SI_ACONDICIONADO,NO_ACONDICIONADO
    }
    public Tipo tipo;

    public LocalComercial(String direccion, double extension, double prezo, TipoServicio tipoServicio, Tipo tipo) {
        super(direccion, extension, prezo, tipoServicio);
        this.tipo=tipo;
    }

    @Override
    public String mostrarInfo() {
        return "LocalComercial{" +
                "tipoServicio=" + getTipoServicio() +
                ", direccion='" + getDireccion() + '\'' +
                ", extension=" + getExtension() +
                ", prezo=" + getPrezo() +
                ", tipo=" + tipo +
                '}';
    }

    @Override
    public double importeGanancia() {
        double ganancia;
        if(TipoServicio.VENTA.equals(getTipoServicio())){
            ganancia = getPrezo() * 0.3;
        }else{
            ganancia=getPrezo();
        }
        return ganancia;
    }
}
