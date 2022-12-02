package vista;

import com.sun.javafx.font.FontConstants;
import conexion.Conexion;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author yanni
 */
public class Graficas extends javax.swing.JInternalFrame {

    ArrayList<Integer> listaCantidad = new ArrayList<>();
    ArrayList<String> listaFechas = new ArrayList<>();
    int CantidadResultados = 0;
    String[] vector_FechasVentas;
    int[] vector_StatusCantidad;

    public Graficas() {
        initComponents();
        this.setSize(new Dimension(600, 650));
        this.setTitle("HISTORIAL DE VENTAS REALIZADAS.");
        this.MContador();
        vector_FechasVentas = new String[CantidadResultados];
        vector_StatusCantidad = new int[CantidadResultados];
        this.AlmacenarDatos();
  
    }

    //metodo para determinar la cantidad de fechasd a graficar....
    private int MContador() {
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select Fecha_Ventas, count(Fecha_Ventas) as venta from cabeceras_dadis" + " where Fecha_Ventas BETWEEN '" + internalFrmGraficas.Fecha_Inicio + "' and '" + internalFrmGraficas.Fecha_Final + "' group by Fecha_Ventas;");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                CantidadResultados++;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al momento de Realizar conteo de fechas..." + e);
        }
        return CantidadResultados;
    }

    //metodo para almacenar los datos....
    private void AlmacenarDatos() {
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select Fecha_Ventas, count(Fecha_Ventas) as venta from cabeceras_dadis" + " where Fecha_Ventas BETWEEN '" + internalFrmGraficas.Fecha_Inicio + "' and '" + internalFrmGraficas.Fecha_Final + "' group by Fecha_Ventas;");
            ResultSet rs = pst.executeQuery();
            int contador = 0;
            while (rs.next()) {
                vector_FechasVentas[contador] = rs.getString("Fecha_Ventas");
                listaFechas.add(vector_FechasVentas[contador]);
                vector_StatusCantidad[contador] = rs.getInt("venta");
                listaCantidad.add(vector_StatusCantidad[contador]);
                
                contador++;
            }
            cn.close();
        } catch (Exception e) {
        }
    }

    //metodo para saber que dias se realizaron mas ventas.....
    private int MayoresVentas(ArrayList<Integer> listaCantidad) {
        int mayor = 0;
        for (int i = 0; i < listaCantidad.size(); i++){
            if (listaCantidad.get(i) > mayor) {
                mayor = listaCantidad.get(i);
            }
        }
        return mayor;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
/**
     * ****************************************
     * metodo que dibuja las graficas ***************************************
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int MayorVenta = MayoresVentas(listaCantidad);
        int Nuevo_Ingreso = 0;
        int parametro1 = 133;
        int parametroFecha = 118;
        int parametro3 = 100;
        for (int i = 0; i < listaCantidad.size(); i++) {
            Nuevo_Ingreso = listaCantidad.get(i) * 400 / MayorVenta;
            
            if (i == 0) {               
                g.setColor(new Color(255, 255, 255));//blanco
            } else if (i == 1) {
                g.setColor(new Color(0, 85, 0));//verde
            } else if (i == 2) {
                g.setColor(new Color(255, 0, 0));//rojo
            } else if (i == 3) {
                g.setColor(new Color(255, 127, 75));//naranja
            } else if (i == 4) {
                g.setColor(new Color(140, 0, 75));//morado
            } else if (i == 5) {
                g.setColor(new Color(0, 0, 255));//azul
            } else if (i == 6) {
                g.setColor(new Color(17, 251, 216));//celeste
            } else {
                g.setColor(new Color(0, 0, 0));//negro
            }
            g.fillRect(100, parametro3, Nuevo_Ingreso, 40);
            g.drawString(listaFechas.get(i), 10, parametroFecha);
            g.drawString("Cantidad: " + listaCantidad.get(i), 10, parametro1);
            parametro1 += 50;
            parametroFecha += 50;
            parametro3 += 50;      
        }
    }
}
