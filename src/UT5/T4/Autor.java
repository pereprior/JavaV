package UT5.T4;

/*
 * @author Pere Prior
 */

public class Autor {

    private String nombre;
    private char genero;
    private String email;

    public Autor(String nombre, char genero, String email) {

        this.nombre = nombre;

        switch (genero) {

            case 'm':
            case 'f':
            case 'n':
                this.genero = genero;
                break;

            default:
                System.out.println("El genero no se inicializo correctamente");
                break;
        }

        this.email = email;

    }

    public String getEmail() {

        return email;

    }

    public void setEmail(String email) {

        this.email = email;

    }

    public char getGenero() {

        return genero;

    }

    public String getNombre() {

        return nombre;

    }

    public String toString() {

        return nombre + " (" + genero + ") " + email;

    }
}
