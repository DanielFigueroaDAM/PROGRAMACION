package paracalendario;

public class Calendario {
    private int dia;
    private int mes;
    private int ano;
    private boolean comp=false;
    private boolean bisiesto=false;

    public Calendario(int dia, int mes, int ano) {
        setAno(ano);
        setMes(mes);
        setDia(dia);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if(this.mes==4 || this.mes==6 || this.mes==9 || this.mes==11){
            if(dia>=1 && dia<=30){
                this.dia=dia;
                comp=true;
            }
        }
        else if(this.mes==2){
            eBisiesto();
            if(bisiesto==false) {
                if (dia >= 1 && dia <= 28) {
                    this.dia = dia;
                    comp = true;
                }
            }
            else {
                if (dia >= 1 && dia <= 29) {
                    this.dia = dia;
                    comp = true;
                }
            }
        }
        else{
            if(dia>=1 && dia<=31){
                this.dia=dia;
                comp=true;
            }
            else{
                this.dia=1;
                System.out.println("No es valido");
            }
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if(mes>=1 && mes<=12){
            this.mes=mes;
            comp=true;
        }
        else {
            this.mes=1;
            System.out.println("No es valido");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano>=0) {
            this.ano = ano;
            comp=true;
        }
        else {
            System.out.println("El año tiene que ser mayor o igual a 0");
        }
    }
    public void mostrarCalendario(){
        if(comp==true) {
            System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
        }
    }
    public void incrementarDia(){
        boolean cambioAño=false;
        this.dia++;
        if(this.mes==4 || this.mes==6 || this.mes==9 || this.mes==11){
            if(dia>30){
                this.dia=1;
                this.mes++;
            }
        }
        else if(this.mes==2){
            eBisiesto();
            if(bisiesto==false) {
                if (dia > 28) {
                    this.dia = 1;
                    this.mes++;
                }
            }
            else{
                if (dia > 29) {
                    this.dia = 1;
                    this.mes++;
                }
            }
        }
        else {
            if(dia>31){
                this.dia=1;
                this.mes++;
                cambioAño=true;
            }
        }
        if(this.mes==13 && cambioAño==true){
            this.mes=1;
            this.ano++;
        }

    }
    public void incrementarMes(){
        if(mes<12){
            this.mes++;
        }
        else{
            this.mes=1;
        }
    }
    public void incrementarAno(){
        this.ano++;
    }
    private void eBisiesto(){
        if((ano% 4 ==0 && ano % 100 !=0)||(ano%400==0)){
            bisiesto=true;
        }
        else bisiesto=false;
    }

}
