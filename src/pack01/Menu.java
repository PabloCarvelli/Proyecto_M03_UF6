package pack01;

import java.awt.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Menu {

    public Menu(){

    }

    public void menuOpcionesPuertas(){

        boolean respuesta = true;
        int opcion;

        while(respuesta){

            Scanner entradaUsuario = new Scanner(System.in);

            System.out.println("1. Dar de alta un numero de Puerta.");
            System.out.println("2. Modificar la informacion de una Puerta.");
            System.out.println("3. Eliminar un numero de Puerta.");
            System.out.println("4. Ver listado de puertas.");
            System.out.println("5. Buscar una pueta por su direccion.");
            System.out.println("6. Salir.");

            System.out.println("Introduzca el numero de su opcion.");
            opcion = entradaUsuario.nextInt();

            switch (opcion){
                case 1:
                    Puerta p = insertarPuerta();
                    AdministracionGeneral adG = new AdministracionGeneral();
                    adG.altaPuerta(p);
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

            }
        }


    }
    public Puerta insertarPuerta(){
        int anio;
        int mes;
        int dia;
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

        Scanner entradaUsuario = new Scanner(System.in);

        System.out.println("Introduzca el codigo de puerta: ");
        codigo = entradaUsuario.nextLine();
        System.out.println("Introduzca la direccio de la puerta: ");
        direccion = entradaUsuario.nextLine();
        System.out.println("Introduzca el numero: ");
        numero = entradaUsuario.nextInt();
        System.out.println("Introduzca el numero de piso:");
        piso = entradaUsuario.nextInt();
        System.out.println("Introduzca el nombre del propietario:");
        propietario = entradaUsuario.nextLine();
        System.out.println("Introduzca el año de la fecha en que inicia el cedido:");
        anio = entradaUsuario.nextInt();
        System.out.println("Introduzca el numero del mes:");
        mes = entradaUsuario.nextInt();
        System.out.println("Introduzca el numero de dia:");
        dia = entradaUsuario.nextInt();
        inicioCedido = LocalDate.of(anio, mes, dia);
        System.out.println("Introduzca el año del fin del cedido:");
        anio = entradaUsuario.nextInt();
        System.out.println("Ahora, introduzca el numero del mes:");
        mes = entradaUsuario.nextInt();
        System.out.println("Introduzca el numero del dia:");
        dia = entradaUsuario.nextInt();
        finalCedido = LocalDate.of(anio, mes, dia);
        System.out.println("Introduzca los metros cuadrados:");
        metrosCuadrados = entradaUsuario.nextFloat();
        System.out.println("Introduzca el numero de camas:");
        numeroCamas = entradaUsuario.nextInt();
        System.out.println("Marque 1 si en la puerta hay baño propio, 0 si no lo hay:");
        if(entradaUsuario.nextInt() == 1){
            bano = true;
        }else{
            bano = false;
        }
        System.out.println("Marque un 1 si hay comedor, 0 si no lo hay:");
        if(entradaUsuario.nextInt() == 1){
            comedor = true;
        }else{
            comedor = false;
        }
        System.out.println("Introduzca un 1 si hay servicio de comida, un 0 si no lo hay:");
        if(entradaUsuario.nextInt() == 1){
            servicioComida = true;
        }else{
            servicioComida = false;
        }
        System.out.println("Introduzca un 1 si hay internet, 0 de lo contrario:");
        if(entradaUsuario.nextInt() == 1){
            internet = true;
        }else{
            internet = false;
        }
        System.out.println("Si es exterior, introduzca 1, de lo contrario, un 0:");
        if(entradaUsuario.nextInt() == 1){
            exterior = true;
        }else{
            exterior = false;
        }
        System.out.println("Introduzca un 1 si es planta baja, de lo contrario un 0:");
        if(entradaUsuario.nextInt() == 1){
            plantaBaja = true;
        }else{
            plantaBaja = false;
        }

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
        System.out.println("Si: introduzca un 1, No: introduzca un 0:");
        int respuesta = entradaUsuario.nextInt();

        if(respuesta == 0){

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

            int opc;

            System.out.println("Introduzca el numero de su opcion:");
            opc = entradaUsuario.nextInt();

            switch (opc){
                case 1:
                    System.out.println("Introduzca el codigo de puerta: ");
                    codigo = entradaUsuario.nextLine();
                    p.setCodigo(codigo);
                    break;
                case 2:
                    System.out.println("Introduzca la direccion:");
                    direccion = entradaUsuario.nextLine();
                    p.setDireccion(direccion);
                    break;
                case 3:
                    System.out.println("Introduzca el numero de puerta:");
                    numero = entradaUsuario.nextInt();
                    p.setNumero(numero);
                    break;
                case 4:
                    System.out.println("Introduzca el numero de piso:");
                    piso = entradaUsuario.nextInt();
                    p.setPiso(piso);
                    break;
                case 5:
                    System.out.println("Introduzca el nombre del propietario:");
                    propietario = entradaUsuario.nextLine();
                    p.setPropietario(propietario);
                case 6:
                    System.out.println("Introduzca el año de la fecha en que inicia el cedido:");
                    anio = entradaUsuario.nextInt();
                    System.out.println("Introduzca el numero del mes:");
                    mes = entradaUsuario.nextInt();
                    System.out.println("Introduzca el numero de dia:");
                    dia = entradaUsuario.nextInt();
                    inicioCedido = LocalDate.of(anio, mes, dia);
                    p.setInicioCedido(inicioCedido);
                case 7:
                    System.out.println("Introduzca el año del fin del cedido:");
                    anio = entradaUsuario.nextInt();
                    System.out.println("Ahora, introduzca el numero del mes:");
                    mes = entradaUsuario.nextInt();
                    System.out.println("Introduzca el numero del dia:");
                    dia = entradaUsuario.nextInt();
                    finalCedido = LocalDate.of(anio, mes, dia);
                    p.setFinalCedido(finalCedido);
                case 8:
                    System.out.println("Introduzca los metros cuadrados:");
                    metrosCuadrados = entradaUsuario.nextFloat();
                    p.setMetrosCuadrados(metrosCuadrados);
                    break;
                case 9:
                    System.out.println("Introduzca el numero de camas: ");
                    numeroCamas = entradaUsuario.nextInt();
                    p.setNumeroCamas(numeroCamas);
                    break;
                case 10:
                    System.out.println("Marque 1 si en la puerta hay baño propio, 0 si no lo hay:");
                    if(entradaUsuario.nextInt() == 1){
                        bano = true;
                    }else{
                        bano = false;
                    }
                    p.setBano(bano);
                case 11:
                    System.out.println("Marque un 1 si hay comedor, 0 si no lo hay:");
                    if(entradaUsuario.nextInt() == 1){
                        comedor = true;
                    }else{
                        comedor = false;
                    }
                    p.setComedor(comedor);
                case 12:
                    System.out.println("Introduzca un 1 si hay servicio de comida, un 0 si no lo hay:");
                    if(entradaUsuario.nextInt() == 1){
                        servicioComida = true;
                    }else{
                        servicioComida = false;
                    }
                    p.setServicioComida(servicioComida);
                case 13:
                    System.out.println("Introduzca un 1 si hay internet, 0 de lo contrario:");
                    if(entradaUsuario.nextInt() == 1){
                        internet = true;
                    }else{
                        internet = false;
                    }
                    p.setInternet(internet);
                case 14:
                    System.out.println("Si es exterior, introduzca 1, de lo contrario, un 0:");
                    if(entradaUsuario.nextInt() == 1){
                        exterior = true;
                    }else{
                        exterior = false;
                    }
                    p.setExterior(exterior);
                case 15:
                    System.out.println("Introduzca un 1 si es planta baja, de lo contrario un 0:");
                    if(entradaUsuario.nextInt() == 1){
                        plantaBaja = true;
                    }else{
                        plantaBaja = false;
                    }
                    p.setPlantaBaja(plantaBaja);
                default:
                    System.out.println("Opcion incorrecta.");
            }
        }
        entradaUsuario.close();
        return p;
    }

    public Sanitario insertarSanitario(){

        String dni;
        String nombre;
        String apellido1;
        String apellido2;
        int edad;
        String titulacion;
        String direccionTrabajo;
        int tiempoEstimadoNoches;
        LocalDate fechaIn;
        LocalDate fechaOut;
        boolean aceptado;

        Scanner entradaUsuario = new Scanner(System.in);

        System.out.println("Introduzca el DNI:");
        dni = entradaUsuario.nextLine();
        System.out.println("Introduzca el nombre:");
        nombre = entradaUsuario.nextLine();
        System.out.println("Itroduzca el primer apellido:");
        apellido1 = entradaUsuario.nextLine();
        System.out.println("Introduzca el Segundo apellido:");
        apellido2 = entradaUsuario.nextLine();
        System.out.println("Introduzca la edad:");
        edad = entradaUsuario.nextInt();
        System.out.println("Introduzca la titulacion:");
        titulacion = entradaUsuario.nextLine();
        System.out.println("Introduzca la direccion de trabajo:");
        direccionTrabajo = entradaUsuario.nextLine();
        System.out.println("Ha sido comprobado este Sanitario?");
        System.out.println("1. Si, 2. No.");
        System.out.println("Introduzca el numero de su opcion.");

        if(entradaUsuario.nextInt() == 1){
            aceptado = true;
        }else{
            aceptado = false;
        }


        Sanitario s = new Sanitario(dni, nombre, apellido1, apellido2, edad, titulacion, direccionTrabajo, aceptado);
        boolean respuesta = true;

        System.out.println("Revise estos datos:");

        System.out.println("DNI: " + s.getDni());
        System.out.println("Nombre: " + s.getNombre());
        System.out.println("Primer Apellido: " + s.getApellido1());
        System.out.println("Segundo apellido: " + s.getApellido2());
        System.out.println("Edad: " + s.getEdad());
        System.out.println("Titulacion: " + s.getTitulacion());
        System.out.println("Direccion de trabajo: " + s.getDireccionTrabajo());
        System.out.println("Situacion de aceptado: " + s.getAceptado());

        System.out.println("Son correctos los datos introducidos?");
        System.out.println("1. Si, 2. No.");

        int resp;

        resp = entradaUsuario.nextInt();

        if(resp == 1){
            respuesta = false;
        }else{
            respuesta = true;
        }

        while(respuesta){
            System.out.println("Que datos quiere corregir:");
        }
        return s;
    }

    public Trabajador insertarTrabajador(){

        String dni;
        String nombre;
        String apellido1;
        String apellido2;
        int edad;

        Scanner entradaUsuario = new Scanner(System.in);

        System.out.println("Introduzca el DNI:");
        dni = entradaUsuario.nextLine();
        System.out.println("Introduzca el nombre:");
        nombre = entradaUsuario.nextLine();
        System.out.println("Itroduzca el primer apellido:");
        apellido1 = entradaUsuario.nextLine();
        System.out.println("Introduzca el Segundo apellido:");
        apellido2 = entradaUsuario.nextLine();
        System.out.println("Introduzca la edad:");
        edad = entradaUsuario.nextInt();


        Trabajador t = new Trabajador(dni, nombre, apellido1, apellido2, edad);
        System.out.println("Revise estos datos:");
        System.out.println("\nDNI: " + t.getDni());
        System.out.println("Nombre: " + t.getNombre());
        System.out.println("Primer apellido: " + t.getApellido1());
        System.out.println("Segundo apellido: " + t.getApellido2());
        System.out.println("Edad: " + t.getEdad());

        System.out.println("Son estos datos correctos?");
        System.out.println("1. Si, 2. No.");
        System.out.println("Introduzca el numero de su opcion para indicar su respuesta:");

        int resp = entradaUsuario.nextInt();
        boolean respuesta;

        if(resp == 1){
            respuesta = false;
        }else{
            respuesta = true;
        }

        while(respuesta){
            System.out.println("Que datos quiere corregir?");
            System.out.println("\n1. DNI.");
            System.out.println("2. Nombre.");
            System.out.println("3. Primer apellido.");
            System.out.println("4. Segundo apelldo.");
            System.out.println("5. Edad.");

            int opc = entradaUsuario.nextInt();

            switch (opc){
                case 1:
                    System.out.println("Introduzca el DNI:");
                    dni = entradaUsuario.nextLine();
                    t.setDni(dni);
                    break;
                case 2:
                    System.out.println("Introduzca el nombre:");
                    nombre = entradaUsuario.nextLine();
                    t.setNombre(nombre);
                    break;
                case 3:
                    System.out.println("Introduzca el primer apellido:");
                    apellido1 = entradaUsuario.nextLine();
                    t.setApellido1(apellido1);
                    break;
                case 4:
                    System.out.println("Introduzca el segundo apellido:");
                    apellido2 = entradaUsuario.nextLine();
                    t.setApellido2(apellido2);
                    break;
                case 5:
                    System.out.println("Introduzca la edad:");
                    edad = entradaUsuario.nextInt();
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
            System.out.println("1. Si, 2. No.");
            System.out.println("Intoduzca el numero de su opcion para indicar su respuesta:");
            if(resp == 1){
                respuesta = false;
            }else{
                respuesta = true;
            }
        }
        return t;
    }
}
