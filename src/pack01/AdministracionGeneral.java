package pack01;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AdministracionGeneral {

    private static final String URL = "jdbc:mysql://localhost:3306/BDGestion";
    private static final String USER = "root";
    private static final String PASSWORD = "18060702pablo"; // colocar la contraseña aqui!

    private Connection conexion;
    private Statement sentencia;
    private PreparedStatement sentencia2;
    private ResultSet resul;

    public AdministracionGeneral(){

    }

    public Usuario recuperarUsuario(String nombreUsuario){

        String consultaSQL = "SELECT * FROM Usuarios WHERE nombreUsuario = \"" + nombreUsuario + "\"";
        Usuario u = new Usuario();

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(URL,USER,PASSWORD);
            Statement sentencia = conexion.createStatement();
            ResultSet resul = sentencia.executeQuery(consultaSQL);

            while(resul.next()){
                u.setNombreUsuario(resul.getString("nombreUsuario"));
                u.setPassword(resul.getString("contrasena"));

                System.out.println("-----------------------------------------------\n");
            }//fin del while
            //cerramos resulSet
            resul.close();
            //cerramos Statement
            sentencia.close();
            //cerramos conexión
            conexion.close();
        } catch  (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch(SQLException e){
            e.printStackTrace();
        }
        return u;
    }

    public void mostrarTodasLasPuertas(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(URL,USER,PASSWORD);
            Statement sentencia = conexion.createStatement();
            ResultSet resul = sentencia.executeQuery("SELECT * FROM Puerta");

            while(resul.next()){
                System.out.println("Codigo: "+resul.getString("codigo"));
                System.out.println("Direccion: "+resul.getString("direccion"));
                System.out.println("Numero: "+resul.getInt("numero"));
                System.out.println("Piso: "+resul.getInt("piso"));
                System.out.println("Propietario: "+resul.getString("propietario"));
                System.out.println("Fecha de inicio del cedido: "+resul.getString("inicioCedido"));
                System.out.println("Fecha de final del cedido: "+resul.getString("finalCedido"));
                System.out.println("Metros cuadrados: "+resul.getInt("metrosCuadrados"));
                System.out.println("Numero de camas: "+resul.getInt("numeroCamas"));
                System.out.println("Baño: "+resul.getBoolean("bano"));
                System.out.println("Comedor: "+resul.getBoolean("comedor"));
                System.out.println("Servicio de comida: "+resul.getBoolean("servicioComida"));
                System.out.println("Internet: " + resul.getBoolean("internet"));
                System.out.println("Exterior: "+resul.getBoolean("exterior"));
                System.out.println("Planta baja: "+resul.getBoolean("plantaBaja"));
                System.out.println("Ocupado: "+ resul.getBoolean("ocupado"));
                System.out.println("-----------------------------------------------\n");
            }//fin del while
            //cerramos resulSet
            resul.close();
            //cerramos Statement
            sentencia.close();
            //cerramos conexión
            conexion.close();
        } catch  (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    public Puerta recuperarPuerta(String codigo){

        String consultaSQL = "SELECT * FROM Puerta WHERE codigo = \"" + codigo + "\"";
        Puerta p = new Puerta();

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(URL,USER,PASSWORD);
            Statement sentencia = conexion.createStatement();
            ResultSet resul = sentencia.executeQuery(consultaSQL);

            while(resul.next()){
                p.setCodigo(resul.getString("codigo"));
                p.setDireccion(resul.getString("direccion"));
                p.setNumero(resul.getInt("numero"));
                p.setPiso(resul.getInt("piso"));
                p.setPropietario(resul.getString("propietario"));
                p.setInicioCedido(new java.sql.Date(resul.getDate("inicioCedido").getTime()).toLocalDate());
                p.setFinalCedido(new java.sql.Date(resul.getDate("finalCedido").getTime()).toLocalDate());
                p.setMetrosCuadrados(resul.getInt("metrosCuadrados"));
                p.setNumeroCamas(resul.getInt("numeroCamas"));
                p.setBano(resul.getBoolean("bano"));
                p.setComedor(resul.getBoolean("comedor"));
                p.setServicioComida(resul.getBoolean("servicioComida"));
                p.setInternet(resul.getBoolean("internet"));
                p.setExterior(resul.getBoolean("exterior"));
                p.setPlantaBaja(resul.getBoolean("plantaBaja"));
                p.setOcupado(resul.getBoolean("ocupado"));
                System.out.println("-----------------------------------------------\n");
            }//fin del while
            //cerramos resulSet
            resul.close();
            //cerramos Statement
            sentencia.close();
            //cerramos conexión
            conexion.close();
        } catch  (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch(SQLException e){
            e.printStackTrace();
        }
        return p;
    }

    public void puertaInToBD(Puerta p){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL,USER,PASSWORD);
            sentencia2 = conexion.prepareStatement("INSERT INTO Puerta VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            sentencia2.setString(1, p.getCodigo());
            sentencia2.setString(2, p.getDireccion());
            sentencia2.setInt(3,p.getNumero());
            sentencia2.setInt(4, p.getPiso());
            sentencia2.setString(5, p.getPropietario());
            sentencia2.setString(6, p.getInicioCedido().toString());
            sentencia2.setString(7, p.getFinalCedido().toString());
            sentencia2.setFloat(8,p.getMetrosCuadrados());
            sentencia2.setInt(9, p.getNumeroCamas());
            sentencia2.setBoolean(10, p.getBano());
            sentencia2.setBoolean(11, p.getComedor());
            sentencia2.setBoolean(12, p.getServicioComida());
            sentencia2.setBoolean(13, p.getInternet());
            sentencia2.setBoolean(14, p.getExterior());
            sentencia2.setBoolean(15, p.getPlantaBaja());
            sentencia2.setBoolean(16, p.getOcupado());

            sentencia2.executeUpdate();

            sentencia2.close();
            conexion.close();
        }
        catch  (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch(SQLException e) {
            e.printStackTrace();
        }

    }

    public void borrarPuertaBD(String codigo){

        String consultaSQL = "DELETE FROM Puerta WHERE codigo = ?";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(URL,USER,PASSWORD);
            sentencia2 = conexion.prepareStatement(consultaSQL);
            sentencia2.setString(1, codigo);
            sentencia2.executeUpdate();

            sentencia2.close();
            conexion.close();
        } catch  (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void modificacionPuerta(String columna, String campo, String codigo){
        String consultaSQL = "UPDATE Puerta SET " + columna + " = " + campo +  " ? WHERE " + codigo + " = ?";

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(URL,USER,PASSWORD);
            sentencia2 = conexion.prepareStatement(consultaSQL);
            sentencia2.setString(1, campo);
            sentencia2.setString(2, codigo);

            System.out.println(consultaSQL);
            //sentencia2.executeUpdate();

            sentencia2.close();
            conexion.close();
        } catch  (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch(SQLException e){
            e.printStackTrace();
        }


    }

    public void borrarSanitarioBD(String dni){
        String consultaSQL = "DELETE FROM sanitario WHERE dni = ?";

        try{
            System.out.println(consultaSQL);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(URL,USER,PASSWORD);
            sentencia2 = conexion.prepareStatement(consultaSQL);
            sentencia2.setString(1, dni);
            sentencia2.executeUpdate();

            sentencia2.close();
            conexion.close();
        } catch  (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void sanitarioInToBD(Sanitario s){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL,USER,PASSWORD);
            sentencia2 = conexion.prepareStatement("INSERT INTO Sanitario VALUES (?,?,?,?,?,?,?,?)");

            sentencia2.setString(1, s.getDni());
            sentencia2.setString(2, s.getNombre());
            sentencia2.setString(3, s.getApellido1());
            sentencia2.setString(4, s.getApellido2());
            sentencia2.setInt(5, s.getEdad());
            sentencia2.setString(6, s.getTitulacion());
            sentencia2.setString(7, s.getDireccionTrabajo());
            sentencia2.setBoolean(8, s.getAceptado());

            sentencia2.executeUpdate();

            sentencia2.close();
            conexion.close();
        }
        catch  (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public void mostrarTodosLosSanitarios(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(URL,USER,PASSWORD);
            Statement sentencia = conexion.createStatement();
            ResultSet resul = sentencia.executeQuery("SELECT * FROM Sanitario");

            while(resul.next()){
                System.out.println("DNI: "+resul.getString("dni"));
                System.out.println("Nombre: "+resul.getString("nombre"));
                System.out.println("Numero: "+resul.getString("apellido1"));
                System.out.println("Primer apellido: "+resul.getString("apellido2"));
                System.out.println("Segundo apellido: "+resul.getInt("edad"));
                System.out.println("Titulacion: "+resul.getString("titulacion"));
                System.out.println("Direccion de trabajo: "+resul.getString("direccionTrabajo"));
                System.out.println("Situacion de aceptado: "+resul.getBoolean("aceptado"));
                System.out.println("-----------------------------------------------\n");
            }//fin del while
            //cerramos resulSet
            resul.close();
            //cerramos Statement
            sentencia.close();
            //cerramos conexión
            conexion.close();
        } catch  (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    public Sanitario recuperarSanitario(String dni){

        String consultaSQL = "SELECT * FROM Puerta WHERE codigo = \"" + dni + "\"";
        Sanitario s = new Sanitario();

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(URL,USER,PASSWORD);
            Statement sentencia = conexion.createStatement();
            ResultSet resul = sentencia.executeQuery(consultaSQL);

            while(resul.next()){
                s.setDni(resul.getString("dni"));
                s.setNombre(resul.getString("nombre"));
                s.setApellido1(resul.getString("apellido1"));
                s.setApellido2(resul.getString("apellido2"));
                s.setEdad(resul.getInt("edad"));
                s.setTitulacion(resul.getString("titulacion"));
                s.setDireccionTrabajo(resul.getString("direccionTrabajo"));
                s.setAceptado(resul.getBoolean("aceptado"));
                System.out.println("-----------------------------------------------\n");
            }//fin del while
            //cerramos resulSet
            resul.close();
            //cerramos Statement
            sentencia.close();
            //cerramos conexión
            conexion.close();
        } catch  (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch(SQLException e){
            e.printStackTrace();
        }
        return s;
    }

    public void trabajadorInToDB(Trabajador t){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL,USER,PASSWORD);
            sentencia2 = conexion.prepareStatement("INSERT INTO Trabajador VALUES (?,?,?,?,?)");

            sentencia2.setString(1, t.getDni());
            sentencia2.setString(2, t.getNombre());
            sentencia2.setString(3, t.getApellido1());
            sentencia2.setString(4, t.getApellido2());
            sentencia2.setInt(5, t.getEdad());

            sentencia2.executeUpdate();

            sentencia2.close();
            conexion.close();
        }
        catch  (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public void borrarTrabajadorBD(String dni){
        String consultaSQL = "DELETE FROM sanitario WHERE dni = ?";

        try{
            System.out.println(consultaSQL);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(URL,USER,PASSWORD);
            sentencia2 = conexion.prepareStatement(consultaSQL);
            sentencia2.setString(1, dni);
            sentencia2.executeUpdate();

            sentencia2.close();
            conexion.close();
        } catch  (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }


    public void modificacionTrabajador(Trabajador t){
        boolean respuesta = true;
        String dni;
        String nombre;
        String apellido1;
        String apellido2;
        String consultaSQL;
        int edad;
        do{
            System.out.println("Que datos desea modoficar=");
            MostrarObjetoPantalla.muestraTrabajador(t);

            switch (ControlDeEntradas.entradaOpcion(5)){

                case 1:
                    System.out.println("Introduzca el nuevo DNI:");
                    dni = ControlDeEntradas.entradaString();
                    consultaSQL = "UPDATE Trabajador SET dni = " + "\"" + dni + "\"" + " WHERE dni = " + "\"" + dni + "\"";

                    try{
                        System.out.println(consultaSQL);
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection conexion = DriverManager.getConnection(URL,USER,PASSWORD);
                        Statement sentencia = conexion.createStatement();

                        System.out.println(consultaSQL);
                        sentencia.executeUpdate(consultaSQL);

                        sentencia.close();
                        conexion.close();
                    } catch  (ClassNotFoundException cn) {
                        cn.printStackTrace();
                    } catch(SQLException e){
                        e.printStackTrace();
                    }
                    break;

                case 2:
                    System.out.println("Introduzca el nuevo nombre: ");
                    nombre = ControlDeEntradas.entradaString();
                    consultaSQL = "UPDATE Trabajador SET nombre = " + "\n" + nombre + "\n" + " WHERE dni = " + "\"" + t.getDni() + "\"";

                    try{
                        System.out.println(consultaSQL);
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection conexion = DriverManager.getConnection(URL,USER,PASSWORD);
                        Statement sentencia = conexion.createStatement();

                        System.out.println(consultaSQL);
                        sentencia.executeUpdate(consultaSQL);

                        sentencia.close();
                        conexion.close();
                    } catch  (ClassNotFoundException cn) {
                        cn.printStackTrace();
                    } catch(SQLException e){
                        e.printStackTrace();
                    }
                    break;

                case 3:
                    System.out.println("Introduzca el nuevo primer apellido: ");
                    apellido1 = ControlDeEntradas.entradaString();
                    consultaSQL = "UPDATE Trabajador SET apellido1 = " + "\n" + apellido1 + "\n" + " WHERE dni = " + "\"" + t.getDni() + "\"";

                    try{
                        System.out.println(consultaSQL);
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection conexion = DriverManager.getConnection(URL,USER,PASSWORD);
                        Statement sentencia = conexion.createStatement();

                        System.out.println(consultaSQL);
                        sentencia.executeUpdate(consultaSQL);

                        sentencia.close();
                        conexion.close();
                    } catch  (ClassNotFoundException cn) {
                        cn.printStackTrace();
                    } catch(SQLException e){
                        e.printStackTrace();
                    }
                    break;

                case 4:
                    System.out.println("Introduzca el nuevo primer apellido: ");
                    apellido2 = ControlDeEntradas.entradaString();
                    consultaSQL = "UPDATE Trabajador SET apellido2 = " + "\n" + apellido2 + "\n" + " WHERE dni = " + "\"" + t.getDni() + "\"";

                    try{
                        System.out.println(consultaSQL);
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection conexion = DriverManager.getConnection(URL,USER,PASSWORD);
                        Statement sentencia = conexion.createStatement();

                        System.out.println(consultaSQL);
                        sentencia.executeUpdate(consultaSQL);

                        sentencia.close();
                        conexion.close();
                    } catch  (ClassNotFoundException cn) {
                        cn.printStackTrace();
                    } catch(SQLException e){
                        e.printStackTrace();
                    }
                    break;

                case 5:
                    System.out.println("Introduzca el nuevo primer apellido: ");
                    edad = ControlDeEntradas.entradaoEnteroPositivo();
                    consultaSQL = "UPDATE Trabajador SET apellido1 = " + edad + " WHERE dni = " + "\"" + t.getDni() + "\"";

                    try{
                        System.out.println(consultaSQL);
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection conexion = DriverManager.getConnection(URL,USER,PASSWORD);
                        Statement sentencia = conexion.createStatement();

                        System.out.println(consultaSQL);
                        sentencia.executeUpdate(consultaSQL);

                        sentencia.close();
                        conexion.close();
                    } catch  (ClassNotFoundException cn) {
                        cn.printStackTrace();
                    } catch(SQLException e){
                        e.printStackTrace();
                    }
                    break;
            }
        }while(!respuesta);

    }

    public Trabajador recuperarTrabajador(String dni){

        String consultaSQL = "SELECT * FROM Puerta WHERE codigo = \"" + dni + "\"";
        Trabajador t = new Trabajador();

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(URL,USER,PASSWORD);
            Statement sentencia = conexion.createStatement();
            ResultSet resul = sentencia.executeQuery(consultaSQL);

            while(resul.next()){
                t.setDni(resul.getString("dni"));
                t.setNombre(resul.getString("nombre"));
                t.setApellido1(resul.getString("apellido1"));
                t.setApellido2(resul.getString("apellido2"));
                t.setEdad(resul.getInt("edad"));
                System.out.println("-----------------------------------------------\n");
            }//fin del while
            //cerramos resulSet
            resul.close();
            //cerramos Statement
            sentencia.close();
            //cerramos conexión
            conexion.close();
        } catch  (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch(SQLException e){
            e.printStackTrace();
        }
        return t;
    }

    public void mostrarTodosLosTrabajadores(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(URL,USER,PASSWORD);
            Statement sentencia = conexion.createStatement();
            ResultSet resul = sentencia.executeQuery("SELECT * FROM Trabajador");

            while(resul.next()){
                System.out.println("DNI: "+resul.getString("dni"));
                System.out.println("Nombre: "+resul.getString("nombre"));
                System.out.println("Numero: "+resul.getString("apellido1"));
                System.out.println("Primer apellido: "+resul.getString("apellido2"));
                System.out.println("Segundo apellido: "+resul.getInt("edad"));
                System.out.println("-----------------------------------------------\n");
            }//fin del while
            //cerramos resulSet
            resul.close();
            //cerramos Statement
            sentencia.close();
            //cerramos conexión
            conexion.close();
        } catch  (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}