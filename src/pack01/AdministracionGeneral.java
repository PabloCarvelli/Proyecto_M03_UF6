package pack01;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class AdministracionGeneral {

    private static final String URL = "jdbc:mysql://localhost:3306/BDBiblio";
    private static final String USER = "root";
    private static final String PASSWORD = "18060702pablo";

    private Connection conexion;
    private Statement sentencia;
    private PreparedStatement sentencia2;
    private ResultSet resul;

    public AdministracionGeneral(){

    }

    public void mostrarTodasLasPuertas(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(URL,USER,PASSWORD);
            Statement sentencia = conexion.createStatement();
            ResultSet resul = sentencia.executeQuery("SELECT * FROM puertas");

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

        String consultaSQL = "SELECT * FROM puertas WHERE codigo = \"" + codigo + "\"";
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
            sentencia2 = conexion.prepareStatement("INSERT INTO Socios VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

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

    public void sanitarioInToBD(Sanitario s){

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

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/BDBiblio","root","18060702pablo");
            sentencia2 = conexion.prepareStatement("INSERT INTO Socios VALUES (?,?,?,?,?)");

            sentencia2.setString(1, s.getDni());
            sentencia2.setString(2, s.getNombre());
            sentencia2.setString(3, s.getApellido1());
            sentencia2.setString(4, s.getApellido2());
            sentencia2.setInt(5, s.getEdad());
            sentencia2.setString(6, s.getTitulacion());
            sentencia2.setString(7, s.getDireccionTrabajo());

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
}