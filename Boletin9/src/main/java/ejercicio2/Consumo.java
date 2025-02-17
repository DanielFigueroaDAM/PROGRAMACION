package ejercicio2;

public class Consumo {
    public float kmRecorridos;
    public float litrosConsumidos;
    public float velocidadMedia;
    public float precioGasolina;
    // Constructor sen parametros
    public Consumo() {
        this.kmRecorridos = 0;
        this.litrosConsumidos = 0;
        this.velocidadMedia = 0;
        this.precioGasolina = 0;
    }
    // Constructor con parametros
    public Consumo(float kmRecorridos, float litrosConsumidos, float velocidadMedia, float precioGasolina) {
        this.kmRecorridos = kmRecorridos;
        this.litrosConsumidos = litrosConsumidos;
        this.velocidadMedia = velocidadMedia;
        this.precioGasolina = precioGasolina;
    }
    public void setTiempo(float tiempo) {
        this.velocidadMedia = this.kmRecorridos / tiempo;
    }
    public void consumoMedio1() {
        System.out.println("Consumo medio: " + this.litrosConsumidos / this.kmRecorridos * 100 + " litros/100km");
    }
    public void consumoMedioEuros() {
        System.out.println("Consumo medio: " + this.litrosConsumidos / this.kmRecorridos * 100 * this.precioGasolina + " euros/100km");
    }
    public void setKms(float kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }
    public void setLitros(float litrosConsumidos) {
        this.litrosConsumidos = litrosConsumidos;
    }
    public void setVMedia(float velocidadMedia) {
        this.velocidadMedia = velocidadMedia;
    }
    public void setPGasolina(float precioGasolina) {
        this.precioGasolina = precioGasolina;
    }

}
