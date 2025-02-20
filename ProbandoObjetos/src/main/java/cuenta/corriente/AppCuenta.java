package cuenta.corriente;

public class AppCuenta {
    public static void main(String[] args) {
        CuentaCorriente c1 = new CuentaCorriente(0,"Daniel Figueroa Vidal","ES1234","12345678H");
        System.out.println(c1.toString());
    }
}
