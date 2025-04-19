package ejercicio1;

public class LicenciaNonValida extends RuntimeException {
    public LicenciaNonValida(String message) {
        super(message);
    }
}
