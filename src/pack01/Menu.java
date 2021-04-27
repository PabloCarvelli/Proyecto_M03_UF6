package pack01;

import java.awt.*;
import java.awt.desktop.SystemSleepEvent;
import java.time.LocalDate;
import java.util.Scanner;

public class Menu {

    public Menu(){

    }

    public void menuOpcionesPuertas(){

        boolean respuesta = true;

        do{

            Scanner entradaUsuario = new Scanner(System.in);

            System.out.println("1. Dar de alta un numero de Puerta.");
            System.out.println("2. Modificar la informacion de una Puerta.");
            System.out.println("3. Eliminar un numero de Puerta.");
            System.out.println("4. Ver listado de puertas.");
            System.out.println("5. Buscar una pueta por su direccion.");
            System.out.println("6. Salir.");

            System.out.println("Introduzca el numero de su opcion.");

            switch (ControlDeEntradas.entradaOpcion(6)){
                case 1:
                    Puerta p = insertarPuerta();
                    AdministracionGeneral adG = new AdministracionGeneral();
                    System.out.println("Quiere guardar esta puerta en la base de datos?");
                    if(ControlDeEntradas.entradaBoolean()){
                        //adG.puertaInToBD(p);
                        System.out.println("Se ha guardado!");
                    }else{
                        System.out.println("No se ha guardado!");
                    }
                    break;

                case 2:
                    // menu de Modificacion.
                    break;

                case 3:
                    // menu Eliminacion;
                    break;

                case 4:
                    // menu listado de espacios.
                    break;

                case 5:
                    // menu busqueda de espacios.
                    break;

                case 6:
                    respuesta = false; // salir del menu.
                    break;
                default:
                    System.out.println("Opcion incorrecta!");
                    break;
            }
        }while(respuesta);


    }
    public Puerta insertarPuerta(){

        String codigo;
        String direccion;
        int numero;
        int piso;
        String propietario;
        LocalDate inicioCedido;
        LocalDate finalCedido;
        float metrosCuadrados;
        int numeroCamas;
        boolean bano;
        boolean comedor;
        boolean servicioComida;
        boolean internet;
        boolean exterior;
        boolean plantaBaja;
        boolean ocupado;

        System.out.println("Introduzca el codigo de puerta: ");
        codigo = ControlDeEntradas.entradaString();
        System.out.println("Introduzca la direccio de la puerta: ");
        direccion = ControlDeEntradas.entradaString();
        System.out.println("Introduzca el numero: ");
        numero = ControlDeEntradas.entradaoEnteroPositivo();
        System.out.println("Introduzca el numero de piso:");
        piso = ControlDeEntradas.entradaoEnteroPositivo();
        System.out.println("Introduzca el nombre del propietario:");  // reparar porque se salta este paso.
        propietario = ControlDeEntradas.entradaString();
        System.out.println("Ahora se le pedira la fecha del inicio del cedido:");
        inicioCedido = ControlDeEntradas.entradaFecha();
        System.out.println("Ahora se le pedira la fecha del final del cedido:");
        finalCedido = ControlDeEntradas.entradaFecha();
        System.out.println("Introduzca los metros cuadrados:");
        metrosCuadrados = ControlDeEntradas.entradaFlotantePositivo();
        System.out.println("Introduzca el numero de camas:");
        numeroCamas = ControlDeEntradas.entradaoEnteroPositivo();
        System.out.println("Dispone de baño?:");
        bano = ControlDeEntradas.entradaBoolean();
        System.out.println("Dispone de comedor?::");
        comedor = ControlDeEntradas.entradaBoolean();
        System.out.println("Dispone de servicio de comida?:");
        servicioComida = ControlDeEntradas.entradaBoolean();
        System.out.println("Introduzca un 1 si hay internet, 0 de lo contrario:");
        internet = ControlDeEntradas.entradaBoolean();
        System.out.println("Si es exterior, introduzca 1, de lo contrario, un 0:");
        exterior = ControlDeEntradas.entradaBoolean();
        System.out.println("Introduzca un 1 si es planta baja, de lo contrario un 0:");
        plantaBaja = ControlDeEntradas.entradaBoolean();

        ocupado = false;

        Puerta p = new Puerta(codigo, direccion, numero, piso, propietario, inicioCedido, finalCedido, metrosCuadrados, numeroCamas, bano, comedor, servicioComida, internet, exterior, plantaBaja, ocupado);

        System.out.println("Verifique que los datos esten correctos.");
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

        System.out.println("\n\nSon correctos estos datos?");
        boolean respuesta = ControlDeEntradas.entradaBoolean();

        while(!respuesta){
            System.out.println("Que doato desea corregir?");
            System.out.println("1. Codigo.");
            System.out.println("2. Direccion.");
            System.out.println("3. Numero.");
            System.out.println("4. Piso.");
            System.out.println("5. Propietario.");
            System.out.println("6. Fecfa inicio Cedido.");
            System.out.println("7. Fecha fin Cedido.");
            System.out.println("9. Numero de camas.");
            System.out.println("10. Baño.");
            System.out.println("11. Comedor.");
            System.out.println("12. Servicio de comidas.");
            System.out.println("13. Internet.");
            System.out.println("14. Exterior.");
            System.out.println("15. Planta baja.");

            System.out.println("Introduzca el numero de su opcion:");

            switch (ControlDeEntradas.entradaOpcion(15)){
                case 1:
                    System.out.println("Introduzca el codigo de puerta: ");
                    codigo = ControlDeEntradas.entradaString();
                    p.setCodigo(codigo);
                    break;
                case 2:
                    System.out.println("Introduzca la direccion:");
                    direccion = ControlDeEntradas.entradaString();
                    p.setDireccion(direccion);
                    break;
                case 3:
                    System.out.println("Introduzca el numero de puerta:");
                    numero = ControlDeEntradas.entradaoEnteroPositivo();
                    p.setNumero(numero);
                    break;
                case 4:
                    System.out.println("Introduzca el numero de piso:");
                    piso = ControlDeEntradas.entradaoEnteroPositivo();
                    p.setPiso(piso);
                    break;
                case 5:
                    System.out.println("Introduzca el nombre del propietario:");
                    propietario = ControlDeEntradas.entradaString();
                    p.setPropietario(propietario);
                    break;
                case 6:
                    System.out.println("Introduzca la fecha en que inicia el cedido:");
                    inicioCedido = ControlDeEntradas.entradaFecha();
                    p.setInicioCedido(inicioCedido);
                    break;
                case 7:
                    System.out.println("Introduzca la fecha del fin del cedido:");
                    finalCedido = ControlDeEntradas.entradaFecha();
                    p.setFinalCedido(finalCedido);
                    break;
                case 8:
                    System.out.println("Introduzca los metros cuadrados:");
                    metrosCuadrados = ControlDeEntradas.entradaFlotantePositivo();
                    p.setMetrosCuadrados(metrosCuadrados);
                    break;
                case 9:
                    System.out.println("Introduzca el numero de camas: ");
                    numeroCamas = ControlDeEntradas.entradaoEnteroPositivo();
                    p.setNumeroCamas(numeroCamas);
                    break;
                case 10:
                    System.out.println("Dispone de baño?:");
                    bano = ControlDeEntradas.entradaBoolean();
                    p.setBano(bano);
                    break;
                case 11:
                    System.out.println("Dispone de comedor:");
                    comedor = ControlDeEntradas.entradaBoolean();
                    p.setComedor(comedor);
                    break;
                case 12:
                    System.out.println("Introduzca un 1 si hay servicio de comida, un 0 si no lo hay:");
                    servicioComida = ControlDeEntradas.entradaBoolean();
                    p.setServicioComida(servicioComida);
                    break;
                case 13:
                    System.out.println("Dispone de servicio de internet?:");
                    internet = ControlDeEntradas.entradaBoolean();
                    p.setInternet(internet);
                    break;
                case 14:
                    System.out.println("Si es exterior, introduzca 1, de lo contrario, un 0:");
                    exterior = ControlDeEntradas.entradaBoolean();
                    p.setExterior(exterior);
                    break;
                case 15:
                    System.out.println("Introduzca un 1 si es planta baja, de lo contrario un 0:");
                    plantaBaja = ControlDeEntradas.entradaBoolean();
                    p.setPlantaBaja(plantaBaja);
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
            }

            System.out.println("Verifique que los datos esten correctos.");
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

            System.out.println("\n\nSon correctos estos datos?");
            respuesta = ControlDeEntradas.entradaBoolean();
        }

        return p;
    }

    public void modificarPuerta(Puerta p){

        boolean respuesta;

        do{
            System.out.println("Que datos quiere modificar?");
            System.out.println("\n1. Codigo:" + p.getCodigo());
            System.out.println("2. Direccion:" + p.getDireccion());
            System.out.println("3. Numero:" + p.getNumero());
            System.out.println("4. Piso:" + p.getPiso());
            System.out.println("5. Propietario:" + p.getPropietario());
            System.out.println("6. Fecfa inicio Cedido:" + p.getInicioCedido());
            System.out.println("7. Fecha fin Cedido:" + p.getFinalCedido());
            System.out.println("8. Metros cuadrados: " + p.getMetrosCuadrados());
            System.out.println("9. Numero de camas:" + p.getNumeroCamas());
            System.out.println("10. Baño:" + p.getBano());
            System.out.println("11. Comedor:" + p.getComedor());
            System.out.println("12. Servicio de comidas:" + p.getServicioComida());
            System.out.println("13. Internet:" + p.getInternet());
            System.out.println("14. Exterior:" + p.getExterior());
            System.out.println("15. Planta baja:" + p.getPlantaBaja());
            System.out.println("\nMarque el numero de su opcion y presione Enter.");

            switch (ControlDeEntradas.entradaOpcion(15)){
                case 1:
                    System.out.println("Ingrese el codigo de la puerta:");
                    p.setCodigo(ControlDeEntradas.entradaString());
                    break;
                case 2:
                    System.out.println("Introduzca la direccion de la puerta:");
                    p.setDireccion(ControlDeEntradas.entradaString());
                    break;
                case 3:
                    System.out.println("Introduzca el numero de puerta:");
                    p.setNumero(ControlDeEntradas.entradaoEnteroPositivo());
                    break;
                case 4:
                    System.out.println("Introduzca el piso de la puerta:");
                    p.setPiso(ControlDeEntradas.entradaoEnteroPositivo());
                    break;
                case 5:
                    System.out.println("Introduzca el nombre del propietario:");
                    p.setPropietario(ControlDeEntradas.entradaString());
                    break;
                case 6:
                    System.out.println("Introduzca la fecha de inicio del cedido:");
                    p.setInicioCedido(ControlDeEntradas.entradaFecha());
                    break;
                case 7:
                    System.out.println("Introduzca la fecha del fin del cedido:");
                    p.setFinalCedido(ControlDeEntradas.entradaFecha());
                    break;
                case 8:
                    System.out.println("Introduzca los metros cuadrados:");
                    p.setMetrosCuadrados(ControlDeEntradas.entradaFlotantePositivo());
                    break;
                case 9:
                    System.out.println("Introduzca el numero de camas:");
                    p.setNumeroCamas(ControlDeEntradas.entradaoEnteroPositivo());
                    break;
                case 10:
                    System.out.println("Dispone de baño esta puerta?");
                    p.setBano(ControlDeEntradas.entradaBoolean());
                    break;
                case 11:
                    System.out.println("Dispone de comerdor esta puerta?");
                    p.setComedor(ControlDeEntradas.entradaBoolean());
                    break;
                case 12:
                    System.out.println("Dispone de servicio de comida esta puerta?");
                    p.setServicioComida(ControlDeEntradas.entradaBoolean());
                    break;
                case 13:
                    System.out.println("Dispone de servicio de internet?");
                    System.out.println("Marque 1 para Si, 2 para No");
                    p.setInternet(ControlDeEntradas.entradaBoolean());
                    break;
                case 14:
                    System.out.println("Exterior?");
                    p.setExterior(ControlDeEntradas.entradaBoolean());
                    break;
                case 15:
                    System.out.println("Esta en planata baja?");
                    System.out.println("Marque 1 para Si, 2 para No");
                    p.setPlantaBaja(ControlDeEntradas.entradaBoolean());
                    break;
                default:
                    System.out.println("Opcion incorrecta!");
                    break;
            }

            System.out.println("Revise estos datos:");
            System.out.println("\n1. Codigo:" + p.getCodigo());
            System.out.println("2. Direccion:" + p.getDireccion());
            System.out.println("3. Numero:" + p.getNumero());
            System.out.println("4. Piso:" + p.getPiso());
            System.out.println("5. Propietario:" + p.getPropietario());
            System.out.println("6. Fecfa inicio Cedido:" + p.getInicioCedido());
            System.out.println("7. Fecha fin Cedido:" + p.getFinalCedido());
            System.out.println("9. Numero de camas:" + p.getNumeroCamas());
            System.out.println("10. Baño:" + p.getBano());
            System.out.println("11. Comedor:" + p.getComedor());
            System.out.println("12. Servicio de comidas:" + p.getServicioComida());
            System.out.println("13. Internet:" + p.getInternet());
            System.out.println("14. Exterior:" + p.getExterior());
            System.out.println("15. Planta baja:" + p.getPlantaBaja());
            System.out.println("\nSon correctos estos datos?");
            respuesta = ControlDeEntradas.entradaBoolean();
        }while(respuesta);

    }

    public Sanitario insertarSanitario(){

        String dni;
        String nombre;
        String apellido1;
        String apellido2;
        int edad;
        String titulacion;
        String direccionTrabajo;
        boolean aceptado;

        System.out.println("Introduzca el DNI:");
        dni = ControlDeEntradas.entradaString();
        System.out.println("Introduzca el nombre:");
        nombre = ControlDeEntradas.entradaString();
        System.out.println("Itroduzca el primer apellido:");
        apellido1 = ControlDeEntradas.entradaString();
        System.out.println("Introduzca el Segundo apellido:");
        apellido2 = ControlDeEntradas.entradaString();
        System.out.println("Introduzca la edad:");
        edad = ControlDeEntradas.entradaoEnteroPositivo();
        System.out.println("Introduzca la titulacion:");
        titulacion = ControlDeEntradas.entradaString();
        System.out.println("Introduzca la direccion de trabajo:");
        direccionTrabajo = ControlDeEntradas.entradaString();
        System.out.println("Ha sido comprobado este Sanitario?");
        aceptado = ControlDeEntradas.entradaBoolean();

        Sanitario s = new Sanitario(dni, nombre, apellido1, apellido2, edad, titulacion, direccionTrabajo, aceptado);
        boolean respuesta = true;

        System.out.println("Revise estos datos:");

        System.out.println("DNI: " + s.getDni());
        System.out.println("Nombre: " + s.getNombre());
        System.out.println("Primer apellido: " + s.getApellido1());
        System.out.println("Segundo apellido: " + s.getApellido2());
        System.out.println("Edad: " + s.getEdad());
        System.out.println("Titulacion: " + s.getTitulacion());
        System.out.println("Direccion de trabajo: " + s.getDireccionTrabajo());
        System.out.println("Situacion de aceptado: " + s.getAceptado());

        System.out.println("Son correctos los datos introducidos?");

        while(ControlDeEntradas.entradaBoolean()){
            System.out.println("Que datos quiere corregir:");
            System.out.println("1. DNI.");
            System.out.println("2. Nombre.");
            System.out.println("3. Primer apellido.");
            System.out.println("4. Segundo apellido.");
            System.out.println("5. Edad.");
            System.out.println("6. Titulacion.");
            System.out.println("7. Direccion de trabajo.");
            System.out.println("8. Comprobacion de aceptado.");
            System.out.println("Introduzca el numero de su opcion.");
            System.out.println("En caso de ser varios, no se preocupe, se le volvera a preguntar, \nhagalos uno a uno:");

            switch (ControlDeEntradas.entradaOpcion(8)){
                case 1:
                    System.out.println("Introduzca el DNI:");
                    s.setDni(ControlDeEntradas.entradaString());
                    break;
                case 2:
                    System.out.println("Introduzca el nombre:");
                    s.setNombre(ControlDeEntradas.entradaString());
                    break;
                case 3:
                    System.out.println("Introduzca el primer apellido:");
                    s.setApellido1(ControlDeEntradas.entradaString());
                    break;
                case 4:
                    System.out.println("Introduzca el segundo apellido:");
                    s.setEdad(ControlDeEntradas.entradaoEnteroPositivo());
                    break;
                case 5:
                    System.out.println("Introduzca la edad:");
                    s.setEdad(ControlDeEntradas.entradaoEnteroPositivo());
                    break;
                case 6:
                    System.out.println("Introduzca la titulacion:");
                    s.setTitulacion(ControlDeEntradas.entradaString());
                    break;
                case 7:
                    System.out.println("Introduzca la direccion de trabajo:");
                    s.setDireccionTrabajo(ControlDeEntradas.entradaString());
                    break;
                case 8:
                    System.out.println("Este sanitario ha sido comprobado?");
                    s.setAceptado(ControlDeEntradas.entradaBoolean());
                    break;
                default:
                    System.out.println("Opcion incorrcta!");
                    break;
            }

            System.out.println("Revise estos datos:");

            System.out.println("DNI: " + s.getDni());
            System.out.println("Nombre: " + s.getNombre());
            System.out.println("Primer apellido: " + s.getApellido1());
            System.out.println("Segundo apellido: " + s.getApellido2());
            System.out.println("Edad: " + s.getEdad());
            System.out.println("Titulacion: " + s.getTitulacion());
            System.out.println("Direccion de trabajo: " + s.getDireccionTrabajo());
            System.out.println("Situacion de aceptado: " + s.getAceptado());

            System.out.println("Son correctos los datos introducidos?");
            //respuesta = ControlDeEntradas.entradaBoolean();

        }
        return s;
    }

    public Trabajador insertarTrabajador(){

        String dni;
        String nombre;
        String apellido1;
        String apellido2;
        int edad;
        Boolean respuesta;

        System.out.println("Introduzca el DNI:");
        dni = ControlDeEntradas.entradaString();
        System.out.println("Introduzca el nombre:");
        nombre = ControlDeEntradas.entradaString();
        System.out.println("Itroduzca el primer apellido:");
        apellido1 = ControlDeEntradas.entradaString();
        System.out.println("Introduzca el Segundo apellido:");
        apellido2 = ControlDeEntradas.entradaString();
        System.out.println("Introduzca la edad:");
        edad = ControlDeEntradas.entradaoEnteroPositivo();

        Trabajador t = new Trabajador(dni, nombre, apellido1, apellido2, edad);

        System.out.println("Revise estos datos:");
        System.out.println("\nDNI: " + t.getDni());
        System.out.println("Nombre: " + t.getNombre());
        System.out.println("Primer apellido: " + t.getApellido1());
        System.out.println("Segundo apellido: " + t.getApellido2());
        System.out.println("Edad: " + t.getEdad());

        System.out.println("Son estos datos correctos?");

        respuesta = ControlDeEntradas.entradaBoolean();

        while(!respuesta){
            System.out.println("Que datos quiere corregir?");
            System.out.println("\n1. DNI.");
            System.out.println("2. Nombre.");
            System.out.println("3. Primer apellido.");
            System.out.println("4. Segundo apelldo.");
            System.out.println("5. Edad.");

            // int opc = ControlDeEntradas.entradaOpcion(5);

            switch (ControlDeEntradas.entradaOpcion(5)){
                case 1:
                    System.out.println("Introduzca el DNI:");
                    dni = ControlDeEntradas.entradaString();
                    t.setDni(dni);
                    break;
                case 2:
                    System.out.println("Introduzca el nombre:");
                    nombre = ControlDeEntradas.entradaString();
                    t.setNombre(nombre);
                    break;
                case 3:
                    System.out.println("Introduzca el primer apellido:");
                    apellido1 = ControlDeEntradas.entradaString();
                    t.setApellido1(apellido1);
                    break;
                case 4:
                    System.out.println("Introduzca el segundo apellido:");
                    apellido2 = ControlDeEntradas.entradaString();
                    t.setApellido2(apellido2);
                    break;
                case 5:
                    System.out.println("Introduzca la edad:");
                    edad = ControlDeEntradas.entradaoEnteroPositivo();
                    t.setEdad(edad);
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
                    respuesta = true;
            }
            System.out.println("Revise los datos: ");
            System.out.println("\nDNI: " + t.getDni());
            System.out.println("Nombre: " + t.getNombre());
            System.out.println("Primer apellido: " + t.getApellido1());
            System.out.println("Segundo apellido: " + t.getApellido2());
            System.out.println("Edad: " + t.getEdad());
            System.out.println("Son estos datos correctos?");
            respuesta = ControlDeEntradas.entradaBoolean();
        }
        return t;
    }
}
