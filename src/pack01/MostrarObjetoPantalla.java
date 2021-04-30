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

    public static void muestraSanitario(Sanitario s){
        System.out.println("DNI: " + s.getDni());
        System.out.println("Nombre: " + s.getNombre());
        System.out.println("Primer apellido: " + s.getApellido1());
        System.out.println("Segundo apellido: " + s.getApellido2());
        System.out.println("Edad: " + s.getEdad());
        System.out.println("Titulacion: " + s.getTitulacion());
        System.out.println("Direccion de trabajo: " + s.getDireccionTrabajo());
        System.out.println("Situacion de aceptado: " + s.getAceptado());
    }

    public static void muestraTrabajador(Trabajador t){
        System.out.println("\nDNI: " + t.getDni());
        System.out.println("Nombre: " + t.getNombre());
        System.out.println("Primer apellido: " + t.getApellido1());
        System.out.println("Segundo apellido: " + t.getApellido2());
        System.out.println("Edad: " + t.getEdad());
    }
}
