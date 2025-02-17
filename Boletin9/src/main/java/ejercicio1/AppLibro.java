package ejercicio1;

public class AppLibro {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        Libro libro2 = new Libro("El Quijote", "Cervantes", 1605, (short) 2000);
        libro1.mostrarString();
        libro2.mostrarString();
    }
}
