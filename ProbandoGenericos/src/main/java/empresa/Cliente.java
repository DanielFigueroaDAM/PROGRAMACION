package empresa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Cliente implements Comparable<Cliente>{
    String dni;
    String nome;
    LocalDate dataNacemento;

    public Cliente(String dni, String nome, String dataNacemento) {
        this.dni = dni;
        this.nome = nome;
        DateTimeFormatter formatoDatas = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dataNacemento=LocalDate.parse(dataNacemento, formatoDatas);
    }
    int edade(){
        return (int) dataNacemento.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public int compareTo(Cliente outro) {
        if(edade()>outro.edade()){
            return 1;
        }else if(edade()<outro.edade()){
            return -1;
        }else {
            return 0;
        }

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dni='" + dni + '\'' +
                ", nome='" + nome + '\'' +
                ", Data nacemento=" + dataNacemento.toString() +
                '}';
    }
//    @Override
//    public int compareTo(Cliente outro) {
//        return dni.compareTo(outro.dni);
//    }

}
