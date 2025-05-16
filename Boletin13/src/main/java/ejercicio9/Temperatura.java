package ejercicio9;

import java.io.Serializable;
import java.time.Instant;

public class Temperatura implements Serializable {
    public Double temperatura;
    public Instant fecha;

    public Temperatura(Double temperatura, Instant fecha) {
        this.temperatura = temperatura;
        this.fecha = fecha;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public Instant getFecha() {
        return fecha;
    }

    public void setFecha(Instant fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Temperatura{" +
                "temperatura=" + temperatura +
                ", fecha=" + fecha +
                '}';
    }
}
