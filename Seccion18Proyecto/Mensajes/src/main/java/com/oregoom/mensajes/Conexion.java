
package com.oregoom.mensajes;
import java.sql.*;
/**
 *
 * @author juand_jus2zd
 */
public class Conexion {
    //Final para que no sea modificable
    private static final String URL = "jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC";
    private static final String USR = "root";
    private static final String PASS = "root";
    
    public static Connection getConexion() throws SQLException, ClassNotFoundException{
        
        //Tenemos que agregar una configuracion para el driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USR, PASS);
        
    }
    
    
    //Sobrecarga de metod
    public static void cerrar(ResultSet rs) throws SQLException{
        rs.close();
    }
    
    public static void cerrar(PreparedStatement ps) throws SQLException{
        ps.close();
    }
    
    public static void cerrar(Connection conn) throws SQLException{
        conn.close();
    }
    
   
}
