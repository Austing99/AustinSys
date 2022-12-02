package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Categorias;

/**
 *
 * @author yanni
 */
public class Ctrl_Categorias {

    /************************************
     ***********************************
     * metodo para registrar categorias
     * ********************************
     * *******************************
     */
    public boolean Guardar(Categorias Objeto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into categorias_dadis values(?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, Objeto.getDescripcion());
           
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al Guardar Categorias." + e);
        }
        return respuesta;
    }

     /************************************
     ***********************************
     * metodo para evitar registros duplicados de  categorias.
     * ********************************
     * *******************************
     */
    
    public boolean ExisteCategorias(String categorias) {
        boolean respuesta = false;
        String sql = "select Descripcion from categorias_dadis where Descripcion = '" + categorias + "'";
        Statement st;

        try {
            Connection cn = conexion.Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;

            }

        } catch (SQLException e) {
            System.out.println("Error al Consultar Categorias." + e);
        }
        return respuesta;
    }

       /************************************
     ***********************************
     * metodo para actualizar categorias
     * ********************************
     * *******************************
     */
    public boolean ActualizarCategorias(Categorias Objeto, int Id_Categorias) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update categorias_dadis set Descripcion =? where Id_Categorias ='" + Id_Categorias +"'");
            consulta.setString(1, Objeto.getDescripcion());
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al Actualizar Categorias." + e);
        }
        return respuesta;
    }
    
     /************************************
     ***********************************
     * metodo para eliminar categorias
     * ********************************
     * *******************************
     */
    public boolean EliminarCategorias(int Id_Categorias) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement(
                    "delete from categorias_dadis where Id_Categorias ='" + Id_Categorias +"'");
            consulta.executeUpdate();
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al Eliminar Categorias." + e);
        }
        return respuesta;
    }
}
