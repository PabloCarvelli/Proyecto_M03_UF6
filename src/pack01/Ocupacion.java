// A entregar el viernes 23.
package pack01;

import java.time.LocalDate;

public class Ocupacion {

    Sanitario s;
    Puerta p;
    LocalDate fechaInicio;
    LocalDate fechaFin;

    public Ocupacion(Sanitario s, Puerta p, LocalDate fechaInicio, LocalDate fechaFin) {
        this.s = s;
        this.p = p;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public void setSanitario(Sanitario s) {
        this.s = s;
    }
    public Sanitario getSanitario() {
        return s;
    }

    public void setPuerta(Puerta p) {
        this.p = p;
    }
    public Puerta getPuerta() {
        return p;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
    public LocalDate getFechaFin() {
        return fechaFin;
    }

}
