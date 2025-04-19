package ejercicio1;

public class App {
    public static void main(String[] args) {
        Persoa p = new Persoa();
        try {
            p.setDni("12458678S");
            System.out.println("DNI válido: " + p.getDni());
            Deportista d = new Deportista("natación", "Club de Natación", "2025nat000102");
            Deportista d2 = new Deportista("natación", "Club de Natación", "2025nat000102");
        } catch (DniNonValido e) {
            System.err.println("Error al asignar DNI: " + e.getMessage());
            // Aquí podrías pedir de nuevo el DNI al usuario…
        } catch (LicenciaNonValida r) {
            System.err.println("Error al asignar licencia: " + r.getMessage());
            // Aquí podrías pedir de nuevo la licencia al usuario…
        }
    }
}
