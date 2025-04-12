package ejercicio2;

public interface Notasable {
    static void listaNotas(Notas[] notas) {
        for (Notas nota : notas) {
            if (nota != null) {
                System.out.println("ID: " + nota.getIdDeNota() + ", Palabra clave: " + nota.getPalabraClave() + ", Texto: " + nota.getTexto());
            }
        }
    }
}
