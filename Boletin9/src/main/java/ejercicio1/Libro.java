package ejercicio1;

public class Libro {
    public String titulo;
    public String autor;
    public int ano;
    public short numPaginas;
    public float valoracion;
    // Constructor por defecto
    public Libro() {
        this.titulo = "Sin título";
        this.autor = "Anónimo";
        this.ano = 0;
        this.numPaginas = 0;
        this.valoracion = 0;
    }
    // Constructor con parámetros
    public Libro(String titulo, String autor, int ano, short numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.numPaginas = numPaginas;
    }

    public void mostrarString() {
        System.out.println( "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ano=" + ano +
                ", numPaginas=" + numPaginas +
                ", valoracion=" + valoracion +
                '}');
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public short getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(short numPaginas) {
        this.numPaginas = numPaginas;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }
}
