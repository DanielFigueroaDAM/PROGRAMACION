package ejercicio1;

public class App {
    public static void main(String[] args) {
        Persoa p = new Persoa();
        try {
            p.setDni("12458678Z");
            System.out.println("DNI válido: " + p.getDni());
        } catch (DniNonValido e) {
            System.err.println("Error al asignar DNI: " + e.getMessage());
            // Aquí podrías pedir de nuevo el DNI al usuario…
        }
    }
}
