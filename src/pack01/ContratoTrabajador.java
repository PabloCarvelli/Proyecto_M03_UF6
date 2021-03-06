package pack01;
import java.time.LocalDate;

public class ContratoTrabajador {
    String codigo;
    Trabajador trabajador;
    String puesto;
    LocalDate fechaAlta;
    LocalDate fechaBaja;
    float salario;

    public ContratoTrabajador(String codigo, Trabajador trabajador, String puesto, LocalDate fechaAlta, LocalDate fechaBaja, float salario){
        this.codigo = codigo;
        this.trabajador = trabajador;
        this.puesto = puesto;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
        this.salario = salario;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public String getCodigo(){
        return codigo;
    }

    public void setTrabajador(Trabajador trabajador){
        this.trabajador = trabajador;
    }
    public Trabajador getTrabajador(){
        return trabajador;
    }

    public void setPuesto(String puesto){
        this.puesto = puesto;
    }
    public String getPuesto(){
        return puesto;
    }

    public void setFechaAlta(LocalDate fechaAlta){
        this.fechaAlta = fechaAlta;
    }
    public LocalDate getFechaAlta(){
        return fechaAlta;
    }

    public void setFechaBaja(LocalDate fechaBaja){
        this.fechaBaja = fechaBaja;
    }
    public LocalDate getFechaBaja(){
        return fechaBaja;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }
    public float getSalario(){
        return salario;
    }
}
