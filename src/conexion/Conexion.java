package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author yanni
 */
public class Conexion {
    
    //conexion local 
    public static Connection conectar(){
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dadiscompu01", "root", "");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la Conexion Local" + e);
        }
        return null;
    }
}
