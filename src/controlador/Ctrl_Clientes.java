package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Clientes;

/**
 *
 * @author yanni
 */
public class Ctrl_Clientes {
    
     /************************************
     ***********************************
     * metodo para registrar clientes
     * ********************************
     * *******************************
     */
    public boolean Guardar(Clientes Objeto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into clientes_dadis values(?,?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, Objeto.getCedula_Clientes());
            consulta.setString(3, Objeto.getNombres_Clientes());
            consulta.setString(4, Objeto.getApellidos_Clientes());
            consulta.setString(5, Objeto.getTelefono_Clientes());
            consulta.setString(6, Objeto.getDireccion_Clientes());
            
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al Guardar Clientes." + e);
        }
        return respuesta;
    }

     /************************************
     ***********************************
     * metodo para evitar registros duplicados de  clientes.
     * ********************************
     * *******************************
     */
    
    public boolean ExisteClientes(String cedula) {
        boolean respuesta = false;
        String sql = "select Cedula_Clientes from clientes_dadis where Cedula_Clientes = '" + cedula + "'";
        Statement st;

        try {
            Connection cn = conexion.Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;

            }

        } catch (SQLException e) {
            System.out.println("Error al Consultar Clientes." + e);
        }
        return respuesta;
    }
    
     /************************************
     ***********************************
     * metodo para actualizar clientes
     * ********************************
     * *******************************
     */
    public boolean ActualizarClientes(Clientes Objeto, int Id_Clientes) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update clientes_dadis set Cedula_Clientes = ?, Nombres_Clientes = ?, Apellidos_Clientes = ?, Telefono_Clientes = ?, Direccion_Clientes = ? where Id_Clientes ='" + Id_Clientes +"'");
            consulta.setString(1, Objeto.getCedula_Clientes());
            consulta.setString(2, Objeto.getNombres_Clientes());
            consulta.setString(3, Objeto.getApellidos_Clientes());
            consulta.setString(4, Objeto.getTelefono_Clientes());
            consulta.setString(5, Objeto.getDireccion_Clientes());
           
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al Actualizar Cliente." + e);
        }
        return respuesta;
    }
    
     /************************************
     ***********************************
     * metodo para eliminar clientes
     * ********************************
     * *******************************
     */
    public boolean EliminarClientes(int Id_Clientes) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from clientes_dadis where Id_Clientes ='" + Id_Clientes +"'");
            consulta.executeUpdate();
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al Eliminar Cliente." + e);
        }
        return respuesta;
    }
}
