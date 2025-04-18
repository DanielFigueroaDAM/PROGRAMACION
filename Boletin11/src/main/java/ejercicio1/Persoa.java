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

    /**
     * Lanza DniNonValido si el formato o la letra son incorrectos.
     */
    public void setDni(String dni) throws DniNonValido {
        // Comprueba primero longitud y patrón general
        if (dni == null || !dni.matches("\\d{8}[A-Z]")) {
            throw new DniNonValido(
                    "Formato de DNI no válido. Debe ser 8 dígitos seguidos de una letra mayúscula.");
        }

        // Letras válidas
        char[] letrasDNI = {
                'T','R','W','A','G','M','Y','F','P','D',
                'X','B','N','J','Z','S','Q','V','H','L',
                'C','K','E'
        };

        // Separa número y letra
        int numero;
        try {
            numero = Integer.parseInt(dni.substring(0, 8));
        } catch (NumberFormatException e) {
            // Aunque con el regex no debería ocurrir, lo cubrimos
            throw new DniNonValido("Los primeros 8 caracteres deben ser dígitos: " + dni);
        }
        char letra = dni.charAt(8);

        // Rango válido
        if (numero <= 0 || numero > 99_999_999) {
            throw new DniNonValido("Número fuera de rango: " + numero);
        }

        // Cálculo de la letra correcta
        char letraCorrecta = letrasDNI[numero % 23];
        if (letra != letraCorrecta) {
            throw new DniNonValido(
                    "Letra incorrecta: para " + numero + " debería ser '" + letraCorrecta + "'");
        }

        // Si todo OK, asigna
        this.dni = dni;
    }
}
