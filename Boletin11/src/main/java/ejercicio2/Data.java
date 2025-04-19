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

    public void setDia(int dia) throws DataIncorrecta {
        if (dia < 1 || dia > 31) {
            // lanzo manualmente la excepción con un mensaje
            throw new DataIncorrecta("Día fuera de rango: " + dia);
        }
        if(this.mes == 2 && dia > 29 && eBisiesto()) {
            throw new DataIncorrecta("Febrero solo tiene 29 días como máximo.");
        }else  if(this.mes == 2 && dia > 28) {
            throw new DataIncorrecta("Febrero solo tiene 28 días como máximo.");
        }
        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            throw new DataIncorrecta("El mes " + mes + " solo tiene 30 días.");
        }
        // si pasa la validación, guardo el valor
        this.dia = dia;
    }


    public int getMes() {
        return mes;
    }

    public void setMes (int mes) throws DataIncorrecta{
        if (mes < 1 || mes > 12) {
            // lanzo manualmente la excepción con un mensaje
            throw new DataIncorrecta("Mes fuera de rango: " + mes);
        }
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        // el años tiene que ser superior a 1970 y inferior a 2999
        if (ano < 1970 || ano > 2999) {
            // lanzo manualmente la excepción con un mensaje
            throw new DataIncorrecta("Año fuera de rango: " + ano);
        }
        this.ano = ano;
    }
    public void incrementarDia() {
        dia++;
        if (mes == 2 && eBisiesto() && dia > 29) {
            dia = 1; mes++;
        } else if (mes == 2 && dia > 28) {
            dia = 1; mes++;
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            dia = 1; mes++;
        } else if (dia > 31) {
            dia = 1; mes++;
        }
        // corrección: gestión de año
        if (mes > 12) {
            mes = 1;
            ano++;
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
