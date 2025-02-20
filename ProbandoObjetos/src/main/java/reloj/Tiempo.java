package reloj;

public class Tiempo {
    private int hora;
    private int minutos;
    private int segundos;
    enum FormatoHora{DOCE, VINTECATRO};
    private FormatoHora formato;

    public Tiempo(int hora, int minutos, int segundos, String formato) {
        setFormato(formato);
        setHora(hora);
        setMinutos(minutos);
        setSegundos(segundos);
    }
    public void setFormato(String formato){
        if(formato.toUpperCase().equals("DOCE") || formato.toUpperCase().equals("VINTECATRO"){
            this.formato=FormatoHora.valueOf(formato);
        }
        else{
            if(formato.equals("12")){
                this.formato=FormatoHora.DOCE;
            }
            else{
                this.formato=FormatoHora.VINTECATRO;
            }
        }

    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        } else {
            System.out.println("Hora inválida. Debe estar entre 0 y 23.");
        }
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos < 60) {
            this.minutos = minutos;
        } else {
            System.out.println("Minutos inválidos. Deben estar entre 0 y 59.");
        }
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos < 60) {
            this.segundos = segundos;
        } else {
            System.out.println("Segundos inválidos. Deben estar entre 0 y 59.");
        }
    }

    @Override
    public String toString() {
        String cadeaHora;
        if(formato==FormatoHora.VINTECATRO){
            cadeaHora= "Tiempo{" +
                    "hora=" + hora +
                    ", minutos=" + minutos +
                    ", segundos=" + segundos +
                    ", formato=" + formato +
                    '}';
        }
        else {
            if(hora>11){
                cadeaHora= "Tiempo{" +
                        "hora=" + (hora-12) +
                        ", minutos=" + minutos +
                        ", segundos=" + segundos +
                        ", formato=" + formato + "PM"+
                        '}';
            }
            else{
                cadeaHora= "Tiempo{" +
                        "hora=" + (hora-12) +
                        ", minutos=" + minutos +
                        ", segundos=" + segundos +
                        ", formato=" + formato + "AM"+
                        '}';
            }
        }
        return cadeaHora;
    }
}
