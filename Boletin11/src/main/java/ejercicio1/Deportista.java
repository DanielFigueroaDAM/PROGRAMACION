package ejercicio1;

import java.time.LocalDate;
//importar clase statica Id

public class Deportista {
    public String deporte;
    public String Clube;
    public String licencia;

    public Deportista(String deporte, String clube, String licencia) {
        this.deporte = deporte;
        this.Clube = clube;
        setLicencia(licencia);
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getClube() {
        return Clube;
    }

    public void setClube(String clube) {
        Clube = clube;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) throws  LicenciaNonValida {
        // aaaa ddd nnnnnn
        if (licencia.length()!=13){
            throw new LicenciaNonValida("Formato de licencia no válido. Debe ser 13 caracteres.");
        }
        if(!licencia.substring(0,4).equals(LocalDate.now().getYear()+"")){
            throw new LicenciaNonValida("Formato de licencia no válido. El año tiene que ser el actual.");
        }
        if(!licencia.substring(4,7).equals(this.deporte.substring(0,3))){
            throw new LicenciaNonValida("");
        }
        //
        Id.comprobarId(licencia.substring(7,13));

        this.licencia = licencia;
    }
}
