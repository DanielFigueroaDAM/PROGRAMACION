package ejercicio10;

import java.io.Serializable;
import java.util.Objects;

public class Clave implements Serializable {
    private String id;

    public Clave(String id) {
        setId(id);
    }
    private void setId(String id) {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("La clave no puede ser nula o vacía");
        }

        this.id = id;
    }
    public String getId() {
        return id;
    }
    public static String crearClave() {
        //Crear clave en formato ABCD-1234
        StringBuilder clave = new StringBuilder();
        for ( int i = 0; i < 4; i++) {
            char letra = (char) ('A' + Math.random() * 26);
            clave.append(letra);
        }
        clave.append("-");
        for (int i = 0; i < 4; i++) {
            int numero = (int) (Math.random() * 10);
            clave.append(numero);
        }
        return clave.toString();
    }
    @Override
    public String toString() {
        return "Clave{" +
                "id='" + id + '\'' +
                '}';
    }
    private static final long serialVersionUID = 303323466479763447L;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Clave clave = (Clave) o;
        return Objects.equals(id, clave.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
