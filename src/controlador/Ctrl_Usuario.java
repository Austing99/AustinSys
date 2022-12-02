package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author yanni
 */
public class Ctrl_Usuario {
    
    
    /************************************
     ***********************************
     * metodo para registrar usuarios
     * ********************************
     * *******************************
     */
    public boolean GuardarUsers(Usuario Objeto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into usuarios_dadis values(?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, Objeto.getNombres_Usuarios());
            consulta.setString(3, Objeto.getApellido_Usuarios());
            consulta.setString(4, Objeto.getUsers());
            consulta.setString(5, Objeto.getPass());
            consulta.setString(6, Objeto.getTelefono_Users());
            consulta.setString(7, Objeto.getRol());
           
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al Guardar Usuario." + e);
        }
        return respuesta;
    }

     /************************************
     ***********************************
     * metodo para evitar registros duplicados de  usuarios.
     * ********************************
     * *******************************
     */
    
    public boolean ExisteUsers(String Users) {
        boolean respuesta = false;
        String sql = "select Users from usuarios_dadis where Users = '" + Users + "'";
        Statement st;

        try {
            Connection cn = conexion.Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;

            }

        } catch (SQLException e) {
            System.out.println("Error al Consultar Usuario." + e);
        }
        return respuesta;
    }
    
    
    //metodo para iniciar sesion
    
    public boolean LoginUser(Usuario Objeto){
    
       boolean respuesta = false;
       
       Connection cn = Conexion.conectar();
       String sql = "select Users and Pass from usuarios_dadis where Users = '" + Objeto.getUsers() + "' and Pass = '" + Objeto.getPass() + "'";
       Statement st;
        try {
            
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                respuesta = true;
            }
            
        } catch (SQLException e) {
            System.out.println("Error Al Iniciar Sesion.");
            JOptionPane.showMessageDialog(null, "Error Al Iniciar Sesion");
        }
        return respuesta;
    }
    
     /************************************
     ***********************************
     * metodo para actualizar usuarios
     * ********************************
     * *******************************
     */
    public boolean ActualizarClientes(Usuario Objeto, int Id_Usuarios) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update usuarios_dadis set Nombres_Usuarios = ?, Apellidos_Usuarios = ?, Users = ?, Pass = ?, Telefono_Users = ?, Rol = ? where Id_Usuarios ='" + Id_Usuarios +"'");
            consulta.setString(1, Objeto.getNombres_Usuarios());
            consulta.setString(2, Objeto.getApellido_Usuarios());
            consulta.setString(3, Objeto.getUsers());
            consulta.setString(4, Objeto.getPass());
            consulta.setString(5, Objeto.getTelefono_Users());
            consulta.setString(6, Objeto.getRol());
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al Actualizar Usuario." + e);
        }
        return respuesta;
    }
    
     /************************************
     ***********************************
     * metodo para eliminar usuarios
     * ********************************
     * *******************************
     */
    public boolean EliminarUsuarios(int Id_Usuarios) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from usuarios_dadis where Id_Usuarios ='" + Id_Usuarios +"'");
            consulta.executeUpdate();
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al Eliminar Usuario." + e);
        }
        return respuesta;
    }
    
}
