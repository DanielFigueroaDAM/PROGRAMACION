package cuenta.corriente;

public class CuentaCorriente {
    public double saldo;
    public String nomeTitular;
    public String conta;
    public String nif;

    public CuentaCorriente(double saldo, String nomeTitular, String conta, String nif) {
        this.saldo = saldo;
        this.nomeTitular = nomeTitular;
        this.conta = conta;
        setNif(nif);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
            boolean comp=true;
            if(nif.length()>8 && Character.isLetter(nif.charAt(8))){
                for(int i=0; i<nif.length()-1;i++){
                    if(Character.isDigit(nif.charAt(i))){
                        if(i==7){
                            this.nif=nif;
                        }
                    }
                    else {
                        comp=false;
                        break;
                    }
                }
            }
    }
    public boolean sacarDinero(double dineroSacar){
        if(this.saldo>-100) {
            this.saldo = this.saldo - dineroSacar;
            return true;
        }
        return false;
    }
    public boolean meterDinero(double meterDinero){
        if(meterDinero<2000){
            this.saldo=this.saldo+meterDinero;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "saldo=" + saldo +
                ", nomeTitular='" + nomeTitular + '\'' +
                ", conta=" + conta +
                ", nif='" + nif + '\'' +
                '}';
    }
}
