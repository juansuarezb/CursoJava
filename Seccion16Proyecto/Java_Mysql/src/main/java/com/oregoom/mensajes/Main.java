/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.oregoom.mensajes;
import java.sql.*;
/**
 *
 * @author juand_jus2zd
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        listarRegistros();
        //insertarRegistros("Hola desde java", "Juan Suarez");
        actualizarRegistros("Nuevo mensaje desde java", "java", 3);
        listarRegistros();
    }
    
    static void listarRegistros() throws SQLException{
        //Utilizamos la clase DriverManager para manajera la conexion
        Connection conectar = DriverManager.getConnection(
                "jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC", "root", "root");                                                        
        //dentro del metodo getConnection() colocamos el url de nuestra BD, el usuario, la contrasena 
        //el servidor se encuentra de manera local
        //Nombre de la BD
        //Zona horaria
        System.out.println("Conexion exitosa");
        
        String sql = "SELECT * FROM mensajes"; //no es necesario indicar que es la BD mensajes_db
        PreparedStatement ps = conectar.prepareStatement(sql);
        //ResultSet me va a regresar el resultado de la consulta
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            int id = rs.getInt("id_mensaje");
            String mensaje = rs.getString("mensaje");
            String autor = rs.getString("autor_mensaje");
            String fecha = rs.getString("fecha_creacion");
            
            //Formateamos la informacion
            System.out.printf("%d %s %s %s \n", id, mensaje, autor, fecha);
            // %d para int, %s para string
        }
        
        rs.close();
        ps.close();
        conectar.close();
    }
    
    static void insertarRegistros(String mensaje, String autor) throws SQLException{
        //Utilizamos la clase DriverManager para manajera la conexion
        Connection conectar = DriverManager.getConnection(
                "jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC", "root", "root");                                                        
        //dentro del metodo getConnection() colocamos el url de nuestra BD, el usuario, la contrasena 
        //el servidor se encuentra de manera local
        //Nombre de la BD
        //Zona horaria
        System.out.println("Conexion exitosa");
        
        String sql = "INSERT INTO mensajes (mensaje, autor_mensaje,fecha_creacion) "
                + "VALUES (?,?, CURRENT_TIME())";
        PreparedStatement ps = conectar.prepareStatement(sql);
        //No necesitamos un resultado, queremos realizar una actualizacion
        ps.setString(1, mensaje);
        ps.setString(2, autor);
        ps.executeUpdate();
        
        ps.close();
        conectar.close();
    }
        
     static void actualizarRegistros(String mensaje, String autor, int id) throws SQLException{
        //Utilizamos la clase DriverManager para manajera la conexion
        Connection conectar = DriverManager.getConnection(
                "jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC", "root", "root");                                                        
        //dentro del metodo getConnection() colocamos el url de nuestra BD, el usuario, la contrasena 
        //el servidor se encuentra de manera local
        //Nombre de la BD
        //Zona horaria
        System.out.println("Conexion exitosa");
        
        String sql = "UPDATE mensajes \n" +
        "SET mensaje= ?, autor_mensaje=? WHERE id_mensaje = ?";
        PreparedStatement ps = conectar.prepareStatement(sql);
        //No necesitamos un resultado, queremos realizar una actualizacion
        ps.setString(1, mensaje);
        ps.setString(2, autor);
        ps.setInt(3, id);
        ps.executeUpdate();
        
        ps.close();
        conectar.close();
    }
    
 static void eliminarRegistros(int id) throws SQLException{
        //Utilizamos la clase DriverManager para manajera la conexion
        Connection conectar = DriverManager.getConnection(
                "jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC", "root", "root");                                                        
        //dentro del metodo getConnection() colocamos el url de nuestra BD, el usuario, la contrasena 
        //el servidor se encuentra de manera local
        //Nombre de la BD
        //Zona horaria
        System.out.println("Conexion exitosa");
        
        String sql = "DELETE FROM db.mensajes WHERE id_mensaje = ?";
        PreparedStatement ps = conectar.prepareStatement(sql);
        //No necesitamos un resultado, queremos realizar una actualizacion
        ps.setInt(1, id);
        ps.executeUpdate();   
        ps.close();
        conectar.close();
    }     
     
}
