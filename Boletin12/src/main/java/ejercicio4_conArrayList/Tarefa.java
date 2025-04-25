package ejercicio4_conArrayList;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tarefa implements Serializable {
    private String titulo;
    private String descripcion;
    private boolean completada;
    private int duracionHoras;
    private LocalDate fechaDeFin;
    private LocalDate fechaDeCreacion;

    public Tarefa(String titulo, String descripcion, int duracionHoras, LocalDate fechaDeFin) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.duracionHoras = duracionHoras;
        this.completada = false;
        this.fechaDeFin = fechaDeFin;
        this.fechaDeCreacion = LocalDate.now();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        //tiene que ser un número positivo
        if (duracionHoras > 0) {
            this.duracionHoras = duracionHoras;
        } else {
            throw new IllegalArgumentException("La duración de la tarea debe ser un número positivo");
        }
    }

    public LocalDate getFechaDeFin() {
        return fechaDeFin;
    }

    public void setFechaDeFin(LocalDate fechaDeFin) {
        this.fechaDeFin = fechaDeFin;
    }

    public LocalDate getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFinStr = (fechaDeFin != null)
                ? fechaDeFin.format(fmt)
                : "No especificada";
        String fechaCreacionStr = fechaDeCreacion.format(fmt);

        return String.format(
                "Detalles de la Tarea:%n" +
                        "-----------------------%n" +
                        "Título        : %s%n" +
                        "Descripción   : %s%n" +
                        "Completada    : %s%n" +
                        "Duración (h)  : %d%n" +
                        "Fecha de Fin  : %s%n" +
                        "Fecha Creación: %s%n",
                titulo,
                descripcion,
                (completada ? "Sí" : "No"),
                duracionHoras,
                fechaFinStr,
                fechaCreacionStr
        );
    }
}
