package org.example;


public class taboahorario {
    public static void main(String[] args) {
        String[][] horario;
        horario = new String[][]{
                {"BD", "BD", "PROG", "ING", "COD"},
                {"BD", "BD", "PROG", "ING", "LM"},
                {"BD", "BD", "PROG", "SI", "LM"},
                {"BD", "SOST", "LM", "SI", "SI"},
                {"Recreo", "Recreo", "Recreo", "Recreo", "Recreo"},
                {"PROG", "SI", "LM", "PROG", "SI"},
                {"PROG", "SI", "COD", "PROG", "IPE"},
                {"PROG", "IPE", "COD", "PROG", "IPE"}
        };
        int hora=12,punterodias=0,punterohoras=0;
        String dia="martes";
        switch (hora) {
            case 8:
                punterohoras = 0;
                break;
            case 9:
                punterohoras = 1;
                break;
            case 10:
                punterohoras = 2;
                break;
            case 11:
                punterohoras = 3;
                break;
            case 12:
                punterohoras = 4;
                break;
            case 13:
                punterohoras = 5;
                break;
            case 14:
                punterohoras = 6;
                break;
            case 15:
                punterohoras = 7;
                break;
            default:
                System.out.println("no es valido");

        }
        switch (dia) {
            case "lunes":
                punterodias = 0;
                break;
            case "martes":
                punterodias = 1;
                break;
            case "miercoles":
                punterodias = 2;
                break;
            case "jueves":
                punterodias = 3;
                break;
            case "viernes":
                punterodias = 4;
                break;
            default:
                System.out.println("no es valido");

        }
        System.out.println("Ese dia a esa hora tendrías "+horario[punterohoras][punterodias]);
        String asignatura = "ING";
        int cantidad=horasAsign(horario,asignatura);
        System.out.println(cantidad);

        }
    static int horasAsign(String[][] lista, String Asign){
        int j=0,contador=0;
        for(int i=0;i< lista.length;i++){
            for(;j<lista[0].length;j++){
                if(Asign.equals(lista[i][j])){
                    contador++;
                }
            }
            j=0;
        }
        return contador;
        }
    }

