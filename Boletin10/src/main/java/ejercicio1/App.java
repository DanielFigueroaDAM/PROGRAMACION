package ejercicio1;



public class App {
    public static void main(String[] args) {
        PlazasGaraxe p1 = new PlazasGaraxe("Calle 1", 20, 100, Inmueble.TipoServicio.ALQUILER, 1, PlazasGaraxe.Tipo.ADEGA);
        System.out.println(p1.mostrarInfo());
        LocalComercial l1 = new LocalComercial("Calle 2", 50, 200, Inmueble.TipoServicio.ALQUILER, LocalComercial.Tipo.SI_ACONDICIONADO);
        System.out.println(l1.mostrarInfo());
        Vivienda v1 = new Vivienda("Calle 3", 100, 300, Inmueble.TipoServicio.VENTA, 3, "Con jardin");
        System.out.println(v1.mostrarInfo());
        System.out.println(p1.importeGanancia());
    }

}
