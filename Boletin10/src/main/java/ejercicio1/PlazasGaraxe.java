package ejercicio1;

public class PlazasGaraxe extends Inmueble{
    enum Tipo{
        ADEGA,TRASTERO
    }

    public int numeroPlaza;
    public Tipo tipo;

    public PlazasGaraxe(String direccion, double extension, double prezo, TipoServicio tipoServicio, int numeroPlaza, Tipo tipo) {
        super(direccion, extension, prezo, tipoServicio);
        this.numeroPlaza=numeroPlaza;
        this.tipo=tipo;
    }


    @Override
    public String mostrarInfo() {
        return "PlazasGaraxe{" +
                "numeroPlaza=" + numeroPlaza +
                ", tipoServicio=" + getTipoServicio() +
                ", direccion='" + getDireccion() + '\'' +
                ", extension=" + getExtension() +
                ", prezo=" + getPrezo() +
                ", tipo=" + tipo +
                '}';
    }

    public int getNumeroPlaza() {
        return numeroPlaza;
    }

    public void setNumeroPlaza(int numeroPlaza) {
        this.numeroPlaza = numeroPlaza;
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
