package ejercicio2;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        setAno(ano);
        setMes(mes);
        setDia(dia);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public void incrementarDia() {
        dia++;
        if (dia > 30) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                ano++;
            }
        }
    }
    public void incrementarMes() {
        mes++;
        if (mes > 12) {
            mes = 1;
            ano++;
        }
    }
    public void incrementarAno() {
        ano++;
    }
    public boolean dataIgual(Data d) {
        return (this.dia == d.dia && this.mes == d.mes && this.ano == d.ano);
    }
    public void mostrarData() {
        System.out.println("Data: " + dia + "/" + mes + "/" + ano);
    }
    public boolean eBisiesto() {
        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

}
