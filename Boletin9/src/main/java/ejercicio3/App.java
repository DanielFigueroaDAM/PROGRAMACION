package ejercicio3;

public class App {
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        coche1.acelerar(50);
        System.out.println("Velocidad: " + coche1.getVelocidade());
        coche1.frenar(20);
        System.out.println("Velocidad: " + coche1.getVelocidade());
    }
}
