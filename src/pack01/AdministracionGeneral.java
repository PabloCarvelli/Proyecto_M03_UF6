package pack01;

import java.sql.*;
import java.time.LocalDate;

public class AdministracionGeneral {

    Connection conexion;
    Statement sentencia;
    PreparedStatement sentencia2;
    ResultSet resul;

    public AdministracionGeneral(){

    }

    public void altaPuerta(Puerta p){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/BDBiblio","root","18060702pablo");
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

    public void altaSanitario(Sanitario s){

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