package ejercicio2;

public class Asalariados extends Miembros implements Gastos{
    //O cálculo realízase da seguinte forma, o gasto dos empregados é o soldo bruto máis un 15% (seguridade social)
    @Override
    public double calcularGastos() {
        //negativo
        return - (salario +(salario*0.15));
    }

    public String puesto;
    private double salario;
    private double irpf;
    private double seguridadSocial;

    public Asalariados(String dni, String nombre, String direccion, String provincia, String dataIngreso, String puesto, double salario, double irpf, double seguridadSocial) {
        super(dni, nombre, direccion, provincia, dataIngreso);
        this.puesto = puesto;
        setSalario(salario);
        setIrpf(irpf);
        setSeguridadSocial(seguridadSocial);
    }

    @Override
    public String aCadea() {
        return getDni() + " " + getNombre() + " " + getDireccion() + " " + getProvincia() + " " + getDataIngreso() + " " + puesto + " " + salario + " " + irpf + " " + seguridadSocial;
    }
    // los datos de irpf y seguridad social no pueden ser negativos ni mayores de 100
    public void setIrpf(double irpf) {
        if (irpf >= 0 && irpf <= 100){
            this.irpf = irpf;
        }
        else {
            System.out.println("El irpf no es valido");
        }
    }

    public void setSeguridadSocial(double seguridadSocial) {
        if (seguridadSocial >= 0 && seguridadSocial <= 100){
            this.seguridadSocial = seguridadSocial;
        }
        else {
            System.out.println("La seguridad social no es valida");
        }
    }
    // el salario no puede ser negativo ni mayor de 999999
    public void setSalario(double salario) {
        if (salario >= 0 && salario <= 999999){
            this.salario = salario;
        }
        else {
            System.out.println("El salario no es valido");
        }
    }



}
