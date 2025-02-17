package paracalendario;

public class AppCalendario {
    public static void main(String[] args) {
        Calendario c1 = new Calendario(28,2,2020);
        c1.mostrarCalendario();
        c1.incrementarDia();
        c1.mostrarCalendario();
        c1.incrementarMes();
        c1.mostrarCalendario();
        c1.incrementarAno();
        c1.mostrarCalendario();
        c1.incrementarDia();
        c1.mostrarCalendario();

    }
}
