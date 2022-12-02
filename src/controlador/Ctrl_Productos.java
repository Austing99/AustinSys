package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Productos;

/**
 *
 * @author yanni
 */
public class Ctrl_Productos {

    /**
     * **********************************
     ***********************************
     * metodo para registrar productos ********************************
     * *******************************
     */
    public boolean Guardar(Productos Objeto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            
            PreparedStatement consulta = cn.prepareStatement("insert into productos_dadis values(?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, Objeto.getNombre_Productos());
            consulta.setInt(3, Objeto.getCantidad_Productos());
            consulta.setDouble(4, Objeto.getPrecio_Productos());
            consulta.setString(5, Objeto.getDescripcion());
            consulta.setInt(6, Objeto.getImpuestoIva_Productos());
            consulta.setInt(7, Objeto.getId_Categorias());
            
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al Guardar Productos." + e);
        }
        return respuesta;
    }

    /**
     * **********************************
     ***********************************
     * metodo para evitar registros duplicados de productos.
     * ******************************** *******************************
     */
    public boolean ExisteProductos(String productos) {
        boolean respuesta = false;
        String sql = "select Nombre_Productos from productos_dadis where Nombre_Productos = '" + productos + "'";
        Statement st;
        
        try {
            Connection cn = conexion.Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
                
            }
            
        } catch (SQLException e) {
            System.out.println("Error al Consultar Productos." + e);
        }
        return respuesta;
    }

    /**
     * **********************************
     ***********************************
     * metodo para actualizar productos ********************************
     * *******************************
     */
    public boolean ActualizarProductos(Productos Objeto, int Id_Productos) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            
            PreparedStatement consulta = cn.prepareStatement("update productos_dadis set Nombre_Productos = ?, Cantidad_Productos = ?, Precio_Productos = ?, Descripcion = ?, ImpuestoIva_Productos = ?, Id_Categorias = ? where Id_Productos ='" + Id_Productos + "'");
            consulta.setString(1, Objeto.getNombre_Productos());
            consulta.setInt(2, Objeto.getCantidad_Productos());
            consulta.setDouble(3, Objeto.getPrecio_Productos());
            consulta.setString(4, Objeto.getDescripcion());
            consulta.setInt(5, Objeto.getImpuestoIva_Productos());
            consulta.setInt(6, Objeto.getId_Categorias());
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al Actualizar Producto." + e);
        }
        return respuesta;
    }

    /**
     * **********************************
     ***********************************
     * metodo para eliminar productos ********************************
     * *******************************
     */
    public boolean EliminarProductos(int Id_Productos) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from productos_dadis where Id_Productos ='" + Id_Productos + "'");
            consulta.executeUpdate();
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al Eliminar Producto." + e);
        }
        return respuesta;
    }

    /**
     * **********************************
     ***********************************
     * metodo para actualizar stocks productos ********************************
     * *******************************
     */
    public boolean ActualizarStocksProductos(Productos Object, int Id_Productos) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "update productos_dadis set Cantidad_Productos =? where Id_Productos ='" + Id_Productos + "'");
            consulta.setInt(1, Object.getCantidad_Productos());
           
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al Actualizar Stock del Producto." + e);
        }
        return respuesta;
    }
    
}
