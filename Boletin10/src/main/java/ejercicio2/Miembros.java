package ejercicio2;

public abstract class Miembros {
    private String dni;
    private String nombre;
    private String direccion;
    private String provincia;
    private String dataIngreso;
    private double caja=0;

    //constructor con atributos filtrados

    public Miembros(String dni, String nombre, String direccion, String provincia, String dataIngreso) {
        this.setDni(dni);
        this.setNombre(nombre);
        this.setDireccion(direccion);
        this.setProvincia(provincia);
        this.setDataIngreso(dataIngreso);
    }
    public abstract String aCadea();

    public String getDni() {
        return dni;
    }
    public void modificarCaja(double cantidad){
        caja+=cantidad;
    }

    public void setDni(String dni) {
        //castear el dni a int excluyendo la letra con el substring
        char letraValida = 0;
        char letra=dni.charAt(8);
        dni = dni.substring(0, 8);
        int dninumeros = Integer.parseInt(dni);
        if(dninumeros>0 && dninumeros<=99999999){
            int letrap = dninumeros % 23;
        // Hacemos el calculo para descubrir el numero necesario para hacer la conversion.
            switch (letrap) {
                case 0 -> letraValida = 'T';
                case 1 -> letraValida = 'R';
                case 2 -> letraValida = 'W';
                case 3 -> letraValida = 'A';
                case 4 -> letraValida = 'G';
                case 5 -> letraValida = 'M';
                case 6 -> letraValida = 'Y';
                case 7 -> letraValida = 'F';
                case 8 -> letraValida = 'P';
                case 9 -> letraValida = 'D';
                case 10 -> letraValida = 'X';
                case 11 -> letraValida = 'B';
                case 12 -> letraValida = 'N';
                case 13 -> letraValida = 'J';
                case 14 -> letraValida = 'Z';
                case 15 -> letraValida = 'S';
                case 16 -> letraValida = 'Q';
                case 17 -> letraValida = 'V';
                case 18 -> letraValida = 'H';
                case 19 -> letraValida = 'L';
                case 20 -> letraValida = 'C';
                case 21 -> letraValida = 'K';
                case 22 -> letraValida = 'E';
                default -> System.out.println("no es valido");
            }
            if (letra==letraValida){
                this.dni=dni+letra;
            }
            else {
                System.out.println("La letra no es valida");
            }

        }
        else {
            System.out.println("Su numero no es valido");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDataIngreso() {
        return dataIngreso;
    }

    public void setDataIngreso(String dataIngreso) {
        //formato de fecha dd/mm/aaaa
        if (dataIngreso.matches("\\d{2}/\\d{2}/\\d{4}")){
            this.dataIngreso = dataIngreso;
        }
        else {
            System.out.println("La fecha no es valida");
        }
    }
}
