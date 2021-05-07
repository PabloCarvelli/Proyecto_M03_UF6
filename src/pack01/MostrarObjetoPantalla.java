package pack01;

public class MostrarObjetoPantalla {

    public static void muestraPuerta(Puerta p){
        System.out.println("1. Codigo: " + p.getCodigo());
        System.out.println("2. Direccion: " + p.getDireccion());
        System.out.println("3. Numero: " + p.getNumero());
        System.out.println("4. Piso: " + p.getPiso());
        System.out.println("5. Propietario: " + p.getPropietario());
        System.out.println("6. Fecfa inicio Cedido: " + p.getInicioCedido().toString());
        System.out.println("7. Fecha fin Cedido: " + p.getFinalCedido().toString());
        System.out.println("8. Metros cuadrados: " + p.getMetrosCuadrados());
        System.out.println("9. Numero de camas: " + p.getNumeroCamas());
        System.out.println("10. Baño: " + p.getBano());
        System.out.println("11. Comedor:" + p.getComedor());
        System.out.println("12. Servicio de comidas: " + p.getServicioComida());
        System.out.println("13. Internet: " + p.getInternet());
        System.out.println("14. Exterior: " + p.getExterior());
        System.out.println("15. Planta baja: " + p.getPlantaBaja());
    }

    public static void muestraSanitario(Sanitario s){
        System.out.println("1. DNI: " + s.getDni());
        System.out.println("2. Nombre: " + s.getNombre());
        System.out.println("3. Primer apellido: " + s.getApellido1());
        System.out.println("4. Segundo apellido: " + s.getApellido2());
        System.out.println("5. Edad: " + s.getEdad());
        System.out.println("6. Titulacion: " + s.getTitulacion());
        System.out.println("7. Direccion de trabajo: " + s.getDireccionTrabajo());
        System.out.println("8. Situacion de aceptado: " + s.getAceptado());
    }

    public static void muestraTrabajador(Trabajador t){
        System.out.println("\n1. DNI: " + t.getDni());
        System.out.println("2. Nombre: " + t.getNombre());
        System.out.println("3. Primer apellido: " + t.getApellido1());
        System.out.println("4. Segundo apellido: " + t.getApellido2());
        System.out.println("5. Edad: " + t.getEdad());
    }

    public static void muestraOcupacion(Ocupacion o){
        System.out.println("1. " + o.getSanitario().getNombre());
        System.out.println("2. " + o.getPuerta().getDireccion());
        System.out.println("3. " + o.getFechaInicio());
        System.out.println("4. " + o.getFechaFin());
    }

    public static void muertaUsuario(Usuario u){
        System.out.println("1. Nombre de usuario: " + u.nombreUsuario);
    }
}
