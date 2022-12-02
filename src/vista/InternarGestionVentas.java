package vista;

import conexion.Conexion;
import controlador.Ctrl_RegistrarVentas;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.CabeceraVentas;

/**
 *
 * @author yanni
 */
public class InternarGestionVentas extends javax.swing.JInternalFrame {

    private int Id_Clientes;
    private int Id_Ventas;

    public InternarGestionVentas() {
        initComponents();
        this.setSize(new Dimension(900, 500));
        this.setTitle("ADMINISTRAR VENTAS.");

        //cargar tablas
        this.cargarTablaVentas();

        //imagen de fondo en Label
        ImageIcon wallpaper = new ImageIcon("src/images/fondo12344.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(900, 500, WIDTH));
        jLabelwallpaper.setIcon(icono);
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_RegistrosVentas = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtTotal_Venta = new javax.swing.JTextField();
        txtFecha_Venta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtClienteFacturaVenta = new javax.swing.JTextField();
        jLabelwallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ÁREA DE CONTROL:CLIENTES");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_RegistrosVentas.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jTable_RegistrosVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable_RegistrosVentas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 840, 260));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 860, 280));

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Sitka Small", 3, 16)); // NOI18N
        jLabel5.setText("CLIENTE:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 46, -1, -1));

        txtTotal_Venta.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        txtTotal_Venta.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTotal_Venta.setEnabled(false);
        jPanel3.add(txtTotal_Venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 68, 150, -1));

        txtFecha_Venta.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        txtFecha_Venta.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFecha_Venta.setEnabled(false);
        jPanel3.add(txtFecha_Venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 18, 150, -1));

        jLabel6.setFont(new java.awt.Font("Sitka Small", 3, 16)); // NOI18N
        jLabel6.setText("FECHA:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Sitka Small", 3, 16)); // NOI18N
        jLabel7.setText("TOTAL VENTA:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        txtClienteFacturaVenta.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        txtClienteFacturaVenta.setEnabled(false);
        jPanel3.add(txtClienteFacturaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 45, 300, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 780, 110));
        getContentPane().add(jLabelwallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelwallpaper;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_RegistrosVentas;
    private javax.swing.JTextField txtClienteFacturaVenta;
    private javax.swing.JTextField txtFecha_Venta;
    private javax.swing.JTextField txtTotal_Venta;
    // End of variables declaration//GEN-END:variables

    //metodo para limpiar campos de clientes..
    private void LimpiarVenta() {
        this.txtTotal_Venta.setText("");
        this.txtFecha_Venta.setText("");
        this.txtClienteFacturaVenta.setText("");
        Id_Clientes = 0;
    }

    //metodo para mostrar los clientes registrados.
    private void cargarTablaVentas() {
        Connection con = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select cv.Id_Cabeceras_Ventas as Id, concat(c.Nombres_Clientes, ' ', c.Apellidos_Clientes) as clientes, " + "cv.Valor_Pagar as Total, cv.Fecha_Ventas as Fecha " + " from cabeceras_dadis as cv, clientes_dadis as c where cv.Id_Clientes = c.Id_Clientes;";
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            InternarGestionVentas.jTable_RegistrosVentas = new JTable(model);
            InternarGestionVentas.jScrollPane1.setViewportView(InternarGestionVentas.jTable_RegistrosVentas);
            //metodo para agregar datos a las tablas
            model.addColumn("N°");
            model.addColumn("Cliente");
            model.addColumn("Total");
            model.addColumn("Fecha");
            while (rs.next()) {
                Object fila[] = new Object[4];
                for (int i = 0; i < 4; i++) {
                   fila[i] = rs.getObject(i + 1);  
                }
                model.addRow(fila);
            }
            con.close();

        } catch (SQLException e) {
            System.out.println("Error al Momento de Llenar La Tabla Ventas." + e);
        }

        jTable_RegistrosVentas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTable_RegistrosVentas.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    Id_Ventas = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosVentas(Id_Ventas);
                }
            }

        });
    }

//metodo que envia datos seleccionados de los clientes...
    private void EnviarDatosVentas(int Id_Ventas) {
        try {
            Connection con = Conexion.conectar();
            PreparedStatement pst = con.prepareStatement(
                    "select cv.Id_Cabeceras_Ventas, cv.Id_Clientes, concat(c.Nombres_Clientes, ' ', c.Apellidos_Clientes) as clientes," + "cv.Valor_Pagar, cv.Fecha_Ventas " + " from cabeceras_dadis as cv, clientes_dadis as c where cv.Id_Cabeceras_Ventas ='" + Id_Ventas + "' and cv.Id_Clientes = c.Id_Clientes;");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                txtClienteFacturaVenta.setText(rs.getString("clientes"));
                txtTotal_Venta.setText(rs.getString("Valor_Pagar"));
                txtFecha_Venta.setText(rs.getString("Fecha_Ventas"));
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al Seleccionar Cliente." + e);
        }
    }
}
