package ejercicio1;

public class Persoa {
    private String nome;
    private String direccion;
    private String dni;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        // Array con las letras válidas del DNI
        char[] letrasDNI = {
                'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
                'C', 'K', 'E'
        };

        // Obtener letra del DNI y los números por separado
        char letra = dni.charAt(8);
        String dniNumericoStr = dni.substring(0, 8);

        try {
            int dniNumeros = Integer.parseInt(dniNumericoStr);

            if (dniNumeros > 0 && dniNumeros <= 99999999) {
                char letraValida = letrasDNI[dniNumeros % 23];

                if (letra == letraValida) {
                    this.dni = dniNumericoStr + letra;
                    this.direccion = direccion; // Se asigna si DNI es válido
                } else {
                    System.out.println("La letra del DNI no es válida.");
                }
            } else {
                System.out.println("El número del DNI no es válido.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Formato de DNI no válido. Debe contener 8 números seguidos de una letra.");
        }
    }
}
