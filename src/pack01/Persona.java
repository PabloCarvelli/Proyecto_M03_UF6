// A entregar el viernes 23.
package pack01;
//import java.time.*;

public class Persona {

    private String dni;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;

    public Persona(){

    }

    public Persona(String dni, String nombre, String apellido1, String apellido2, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    public String getApellido1() {
        return apellido1;
    }

    public void setApellido2(String apellido1) {
        this.apellido1 = apellido2;
    }
    public String getApellido2() {
        return apellido2;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }

}
