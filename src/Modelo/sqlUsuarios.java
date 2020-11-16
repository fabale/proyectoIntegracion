package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class sqlUsuarios extends Conexion{
    
    public boolean registrar(Usuario usr) {
        
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        String sql = "INSERT INTO Usuario (Nombre, Apellido, Telefono, TipoDocumento, Documento, Id) VALUES (?,?,?,?,?,?)";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getNombre());
            ps.setString(2, usr.getApellido());
            ps.setInt(3, usr.getTel());
            ps.setString(4, usr.getTip_dc());
            ps.setInt(5, usr.getDoc());
            ps.setInt(6, usr.getId());
            ps.execute();
            
            return true;
            
            } catch (SQLException ex) {
            Logger.getLogger(sqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
