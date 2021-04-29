package pack01;

public class MostrarObjetoPantalla {

    public static void muestraPuerta(Puerta p){
        System.out.println("Codigo: " + p.getCodigo());
        System.out.println("Direccion: " + p.getDireccion());
        System.out.println("Numero: " + p.getNumero());
        System.out.println("Piso: " + p.getPiso());
        System.out.println("Propietario: " + p.getPropietario());
        System.out.println("Fecfa inicio Cedido: " + p.getInicioCedido().toString());
        System.out.println("Fecha fin Cedido: " + p.getFinalCedido().toString());
        System.out.println("Metros cuadrados: " + p.getMetrosCuadrados());
        System.out.println("Numero de camas: " + p.getNumeroCamas());
        System.out.println("Baño: " + p.getBano());
        System.out.println("Comedor:" + p.getComedor());
        System.out.println("Servicio de comidas: " + p.getServicioComida());
        System.out.println("Internet: " + p.getInternet());
        System.out.println("Exterior: " + p.getExterior());
        System.out.println("Planta baja: " + p.getPlantaBaja());
    }
}
