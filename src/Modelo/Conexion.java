
package Modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    String url = "jdbc:postgresql://localhost:5432/registros";
    String usuario= "postgres";
    String password ="12345";
    Connection conexion=null;
        
    public Connection getConnection()
    {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url,usuario,password);
            java.sql.Statement st = conexion.createStatement();
    
        } catch  (Exception e) {
            System.out.println("Error de conexion "+e);
        }
        return conexion;
    }
}
