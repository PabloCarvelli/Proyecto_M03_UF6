// A entregar el viernes 23.
package pack01;

import java.time.LocalDate;

public class Puerta {

    private String codigo;
    private String direccion;
    private int numero;
    private int piso;
    private String propietario;
    private LocalDate inicioCedido;
    private LocalDate finalCedido;
    private float metrosCuadrados;
    private int numeroCamas;
    private boolean bano;
    private boolean comedor;
    private boolean servicioComida;
    private boolean internet;
    private boolean exterior;
    private boolean plantaBaja;
    private boolean ocupado;

    public Puerta (){

    }

    public Puerta(String codigo, String direccion, int numero, int piso, String propietario, LocalDate inicioCedido, LocalDate finalCedido, float metrosCuadrados, int numeroCamas, boolean bano, boolean comedor, boolean servicioComida, boolean internet, boolean exterior, boolean plantaBaja, boolean ocupado) {

        this.codigo = codigo;
        this.direccion = direccion;
        this.numero = numero;
        this.piso = piso;
        this.propietario = propietario;
        this.inicioCedido = inicioCedido;
        this.finalCedido = finalCedido;
        this.metrosCuadrados = metrosCuadrados;
        this.numeroCamas = numeroCamas;
        this.bano = bano;
        this.comedor = comedor;
        this.servicioComida = servicioComida;
        this.internet = internet;
        this.exterior = exterior;
        this.plantaBaja = plantaBaja;
        this.ocupado = ocupado;

    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getCodigo() {
        return codigo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getDireccion() {
        return direccion;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }
    public int getPiso() {
        return piso;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    public String getPropietario() {
        return propietario;
    }

    public void setInicioCedido(LocalDate inicioCedido) {
        this.inicioCedido = inicioCedido;
    }
    public LocalDate getInicioCedido() {
        return inicioCedido;
    }

    public void setFinalCedido(LocalDate finalCedido) {
        this.finalCedido = finalCedido;
    }
    public LocalDate getFinalCedido() {
        return finalCedido;
    }

    public void setMetrosCuadrados(float metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }
    public float getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }
    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setBano(boolean bano) {
        this.bano = bano;
    }
    public boolean getBano() {
        return bano;
    }

    public void setComedor(boolean comedor) {
        this.comedor = comedor;
    }
    public boolean getComedor() {
        return comedor;
    }

    public void setServicioComida(boolean servicioComida) {
        this.servicioComida = servicioComida;
    }
    public boolean getServicioComida() {
        return servicioComida;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }
    public boolean getInternet() {
        return internet;
    }

    public void setExterior(boolean exterior) {
        this.exterior = exterior;
    }
    public boolean getExterior() {
        return exterior;
    }

    public void setPlantaBaja(boolean plantaBaja) {
        this.plantaBaja = plantaBaja;
    }
    public boolean getPlantaBaja() {
        return plantaBaja;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    public boolean getOcupado() {
        return ocupado;
    }

}
