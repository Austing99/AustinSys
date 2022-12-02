package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.CabeceraVentas;
import modelo.DetallesVentas;

/**
 *
 * @author yanni
 */
public class Ctrl_RegistrarVentas {
    
    //ultimoid de la cabecera
    public static int IdCabeceraRegistrada;
    java.math.BigDecimal IdColVar;
    
      /************************************
     ***********************************
     * metodo para cabeceras de ventas
     * ********************************
     * *******************************
     */
    public boolean Guardar(CabeceraVentas Objeto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into cabeceras_dadis values(?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            consulta.setInt(1, 0);
            consulta.setInt(2, Objeto.getId_Clientes());
            consulta.setDouble(3, Objeto.getValor_Pagar());
            consulta.setString(4, Objeto.getFecha_Ventas());
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            ResultSet rs = consulta.getGeneratedKeys();
            while (rs.next()) {
                IdColVar = rs.getBigDecimal(1);
                IdCabeceraRegistrada = IdColVar.intValue();
                
            }
            
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al Guardar Cabeceras Ventas." + e);
        }
        return respuesta;
    }
    
    
     /************************************
     ***********************************
     * metodo para rregistrar detalles de la venta
     * ********************************
     * *******************************
     */
    public boolean Guardar(DetallesVentas Objeto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into detalles_dadis values(?,?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setInt(2, IdCabeceraRegistrada);
            consulta.setInt(3, Objeto.getId_Productos());
            consulta.setInt(4, Objeto.getCantidad_Ventas());
            consulta.setDouble(5, Objeto.getPrecio_Unitario());
            consulta.setDouble(6, Objeto.getSubtotal());
            consulta.setDouble(7, Objeto.getDescuento());
            consulta.setDouble(8, Objeto.getIva());
            consulta.setDouble(9, Objeto.getTotal_Pagar());       
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al Guardar Clientes." + e);
        }
        return respuesta;
    }
}
