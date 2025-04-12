package ejercicio2;

public class Notas {
    private int idDeNota;
    private String palabraClave;
    private String texto;

    public Notas(String palabraClave, String texto) {
        this.palabraClave = palabraClave;
        this.texto = texto;
        this.idDeNota = Id.generearId(palabraClave);
    }

    public int getIdDeNota() {
        return idDeNota;
    }

    public void setIdDeNota(int idDeNota) {
        this.idDeNota = idDeNota;
    }

    public String getPalabraClave() {
        return palabraClave;
    }

    public void setPalabraClave(String palabraClave) {
        this.palabraClave = palabraClave;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "idDeNota=" + idDeNota +
                ", palabraClave='" + palabraClave + '\'' +
                ", texto='" + texto;
    }
}
