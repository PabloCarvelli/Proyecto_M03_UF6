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

    public void setS(Sanitario s) {
        this.s = s;
    }
    public Sanitario getS() {
        return s;
    }

    public void setP(Puerta p) {
        this.p = p;
    }
    public Puerta getP() {
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
