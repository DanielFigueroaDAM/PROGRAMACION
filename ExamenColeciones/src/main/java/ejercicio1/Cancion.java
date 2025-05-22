package ejercicio1;

public class Cancion {
    private String nombre;
    private String aurtista;

    public Cancion(String nombre, String aurtista) {
        this.nombre = nombre;
        this.aurtista = aurtista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return aurtista;
    }

    public void setAurtista(String aurtista) {
        this.aurtista = aurtista;
    }
}
