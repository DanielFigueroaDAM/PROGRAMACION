package ejercicio2;

public class Voluntarios extends Miembros implements Gastos{
    @Override
    public double calcularGastos() {
        return -3;
    }

    public int edad;
    public String ocupacion;
    private int horas;

    public Voluntarios(String dni, String nombre, String direccion, String provincia, String dataIngreso, int edad, String ocupacion, int horas) {
        super(dni, nombre, direccion, provincia, dataIngreso);
        this.edad = edad;
        this.ocupacion = ocupacion;
        setHoras(horas);
    }

    @Override
    public String aCadea() {
        return getDni() + " " + getNombre() + " " + getDireccion() + " " + getProvincia() + " " + getDataIngreso() + " " + edad + " " + ocupacion + " " + horas;
    }

    public void setHoras(int horas) {
        //las horas no pueden ser negativas y no pueden ser mas de 40
        if (horas >= 0 && horas <= 40){
            this.horas = horas;
        }
        else {
            System.out.println("Las horas no son validas");
        }
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public int getEdad() {
        return edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public int getHoras() {
        return horas;
    }
}
