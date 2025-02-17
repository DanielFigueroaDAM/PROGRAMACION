package ejercicio2;

public class AppConsumo {
    public static void main(String[] args) {
        Consumo consumo1 = new Consumo();
        consumo1.setKms(50);
        consumo1.setPGasolina(1.57f);
        Consumo consumo2 = new Consumo(100, 50, 120, 1);
        consumo2.consumoMedio1();
        consumo1.consumoMedio1();
    }
}
