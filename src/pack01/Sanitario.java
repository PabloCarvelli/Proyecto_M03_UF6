// A entregar el viernes 23.
package pack01;

import java.time.LocalDate;

public class Sanitario extends Persona{

    private String titulacion;
    private String direccionTrabajo;
    private int tiempoEstimadoNoches;
    private boolean aceptado;

    public Sanitario(String dni, String nombre, String apellido1, String apellido2, int edad, String titulacion, String direccionTrabajo, boolean aceptado) {
        super(dni, nombre, apellido1, apellido2, edad);
        this.titulacion = titulacion;
        this.direccionTrabajo = direccionTrabajo;
        this.tiempoEstimadoNoches = tiempoEstimadoNoches;
        this.aceptado = aceptado;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }
    public String getTitulacion() {
        return titulacion;
    }

    public void setDireccionTrabajo(String direccionTrabajo) {
        this.direccionTrabajo = direccionTrabajo;
    }
    public String getDireccionTrabajo() {
        return direccionTrabajo;
    }

    public void setAceptado(boolean aceptado){
        this.aceptado = aceptado;
    }
    public boolean getAceptado(){
        return aceptado;
    }

}
