package org.example;

public class Boletin8_2_ej11 {
    public static void main(String[] args) {
        String  nombre = "paco gutierrez";
        System.out.println(formatearNombre(nombre));
    }
    public static String formatearNombre(String nombre){
        String nombreFormateado = "";
        //pasar nombre a array de caracteres
        char[] arrayNombre = nombre.toCharArray();
        //recorrer array
        for(int i=0;i<arrayNombre.length;i++){
            //si es la primera letra o la letra anterior es un espacio
            if(i==0 || arrayNombre[i-1]==' '){
                //pasar a mayuscula
                arrayNombre[i]=Character.toUpperCase(arrayNombre[i]);
            }
            //añadir letra al nombre formateado
            nombreFormateado=nombreFormateado+arrayNombre[i];
        }
        nombreFormateado=nombreFormateado.replace(" ","");
        return nombreFormateado;

    }
}
