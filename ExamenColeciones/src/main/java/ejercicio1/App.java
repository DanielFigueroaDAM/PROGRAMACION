package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Cancion> listaCanciones = new ArrayList<>();
        Scanner tec = new Scanner(System.in);
        int eleccion;
        do {
            System.out.println("1.Añadir canciones");
            System.out.println("2.Eliminar canciones");
            System.out.println("3.Buscar cancion por titulo");
            System.out.println("4.Mostrar lista de canciones");
            System.out.println("5.Salir");
            eleccion = tec.nextInt();
            switch (eleccion) {
                case 1:
                    System.out.println("Dime el nombre de la cancion");
                    String nCancion = tec.next();
                    System.out.println("Dime el nombre del artista");
                    String nArtista = tec.next();
                    Cancion aux = new Cancion(nCancion, nArtista);
                    listaCanciones.add(aux);
                    break;
                case 2:
                    mostrarCanciones(listaCanciones);
                    System.out.println("Dime el numero de la cancion que quieres borrar");
                    int n = tec.nextInt();
                    int pos = listaCanciones.indexOf(n);
                    //Si la cancion no se encuentra mandar mensaje de error
                    if(pos == -1) {
                        System.out.println("No se pudo borrar");
                    }else {
                        Cancion borrada = listaCanciones.remove(n);
                        System.out.println("La cancion borrada es" + borrada.getNombre());
                    }
                    break;
                case 3:
                    System.out.println("Dime el nombre de la cancion que quieres buscar");
                    String busquedaCancion = tec.next();
                    int posicion = busquedaCancion(listaCanciones,busquedaCancion);
                    if(posicion == -1){
                        System.out.println("Cancion no encontrada");
                    } else if(posicion == -2){
                        System.out.println("La cancion está duplicada");
                    }else{
                        System.out.println("La cancion que buscas es: "+listaCanciones.get(posicion).getNombre()+" y su autor es "+listaCanciones.get(posicion).getArtista());
                    }
                    break;
                case 4:
                    mostrarCanciones(listaCanciones);
                    break;
                case 5:
                    System.out.println("Saliste");
                    break;
                default:
                    System.out.println("Acción no válida");
            }

        }while (eleccion!=5);
    }

    private static int busquedaCancion(ArrayList<Cancion> lista, String cancionABuscar) {
        int count=0, posicion=0;
        for(Cancion c: lista){
            if(c.getNombre().equals(cancionABuscar)){
                posicion = lista.indexOf(c);
                count++;
            }
        }
        if (count>1){
            return -2;
        }
        return posicion;

    }
    public static void mostrarCanciones(ArrayList<Cancion> listaCanciones){
        for(int i=0;i<listaCanciones.size();i++){
            System.out.println(i+"."+listaCanciones.get(i).getNombre()+" Artista: "+listaCanciones.get(i).getArtista());
        }
    }
}
