package ejercicio2;

public class App {
    public static void main(String[] args) {
        Voluntarios voluntario = new Voluntarios("53818040H", "Pepe", "Calle Falsa 123", "Pontevedra", "01/01/2021", 25, "Estudiante", 20);
        Socios socio = new Socios("53818040H", "Juan", "Calle Falsa 321", "A Coruña", "01/01/2021", 300);
        Asalariados asalariado = new Asalariados("53818040H", "Pedro", "Calle Falsa 132", "Lugo", "01/01/2021", "Informatico", 1000,13,2);
        System.out.println(voluntario.aCadea());
        System.out.println(socio.aCadea());
        System.out.println(asalariado.aCadea());
        System.out.println(voluntario.calcularGastos());
        System.out.println(asalariado.calcularGastos());
        Gastos asociacion [] = new Gastos[2];
        asociacion[0]=voluntario;
        asociacion[1]=asalariado;
        double resta =0;
        for(Gastos mem:asociacion){
            resta = resta +mem.calcularGastos();
        }
        System.out.println(resta);

    }
}
