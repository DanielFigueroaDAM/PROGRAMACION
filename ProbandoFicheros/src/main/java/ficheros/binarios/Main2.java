package ficheros.binarios;

import org.example.MediaFicheiro;

public class Main2 {
    public static void main(String[] args) {
        Socio []  lista = new Socio[5];
        s[0] = new Socio("12345678A", "Pepe");
        s[1] = new Socio("12345678B", "Juan");
        s[2] = new Socio("12345678C", "Ana");
        s[3] = new Socio("12345678D", "Luis");
        s[4] = new Socio("12345678E", "Maria");
        new EscituraFicheiroSocios("socios.dat", lista);
        new LecturaFicheirosSocios("socios.dat");
    }
}
