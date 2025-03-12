package ejercicio2;

public class Socios extends Miembros{


    private double cuota;

    public Socios(String dni, String nombre, String direccion, String provincia, String dataIngreso, double cuota) {
        super(dni, nombre, direccion, provincia, dataIngreso);
        setCuota(cuota);
    }

    @Override
    public String aCadea() {
        //todo los datos
        return  getDni() + " " + getNombre() + " " + getDireccion() + " " + getProvincia() + " " + getDataIngreso() + " " + cuota;
    }
    // la cuota no puede ser negativa
    public void setCuota(double cuota) {
        if (cuota >= 0){
            this.cuota = cuota;
        }
        else {
            System.out.println("La cuota no es valida");
        }
    }

    public double getCuota() {
        return cuota;
    }
}
