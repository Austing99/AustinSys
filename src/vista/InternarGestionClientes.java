package vista;

import conexion.Conexion;
import controlador.Ctrl_Clientes;
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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Clientes;

/**
 *
 * @author yanni
 */
public class InternarGestionClientes extends javax.swing.JInternalFrame {

    private int Id_Clientes;

    public InternarGestionClientes() {
        initComponents();
        this.setSize(new Dimension(900, 500));
        this.setTitle("ADMINISTRAR CLIENTES.");

        //cargar tablas
        this.cargartablaClientes();

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
        jTable_Clientes = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnactualizar_clientes = new javax.swing.JButton();
        btneliminar_clientes = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtcedula_cli = new javax.swing.JTextField();
        txtnombre_cli = new javax.swing.JTextField();
        txtapellido_cli = new javax.swing.JTextField();
        txtdireccion_cli = new javax.swing.JTextField();
        txttelefono_cli = new javax.swing.JTextField();
        jLabelwallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ÁREA DE CONTROL:CLIENTES");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jPanel1.setBackground(java.awt.Color.blue);
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_Clientes.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jTable_Clientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_Clientes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 840, 260));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 860, 280));

        jPanel2.setBackground(java.awt.Color.yellow);
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnactualizar_clientes.setBackground(java.awt.Color.cyan);
        btnactualizar_clientes.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        btnactualizar_clientes.setText("ACTUALIZAR");
        btnactualizar_clientes.setBorder(new javax.swing.border.LineBorder(java.awt.Color.red, 1, true));
        btnactualizar_clientes.setBorderPainted(false);
        btnactualizar_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizar_clientesActionPerformed(evt);
            }
        });
        jPanel2.add(btnactualizar_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 30));

        btneliminar_clientes.setBackground(java.awt.Color.pink);
        btneliminar_clientes.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        btneliminar_clientes.setText("ELIMINAR");
        btneliminar_clientes.setBorder(new javax.swing.border.LineBorder(java.awt.Color.red, 1, true));
        btneliminar_clientes.setBorderPainted(false);
        btneliminar_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminar_clientesActionPerformed(evt);
            }
        });
        jPanel2.add(btneliminar_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 71, 110, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, 130, 130));

        jPanel3.setBackground(java.awt.Color.red);
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Sitka Small", 3, 16)); // NOI18N
        jLabel4.setText("CEDULA:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Sitka Small", 3, 16)); // NOI18N
        jLabel5.setText("NOMBRES:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 55, -1, -1));

        jLabel6.setFont(new java.awt.Font("Sitka Small", 3, 16)); // NOI18N
        jLabel6.setText("APELLIDOS:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 110, -1));

        jLabel7.setFont(new java.awt.Font("Sitka Small", 3, 16)); // NOI18N
        jLabel7.setText("TELEFONO:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Sitka Small", 3, 16)); // NOI18N
        jLabel8.setText("     DIRECCION:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 55, 130, -1));

        txtcedula_cli.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jPanel3.add(txtcedula_cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 8, 190, -1));

        txtnombre_cli.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jPanel3.add(txtnombre_cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 52, 190, -1));

        txtapellido_cli.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jPanel3.add(txtapellido_cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 97, 190, -1));

        txtdireccion_cli.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        txtdireccion_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccion_cliActionPerformed(evt);
            }
        });
        jPanel3.add(txtdireccion_cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 52, 230, -1));

        txttelefono_cli.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        txttelefono_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefono_cliActionPerformed(evt);
            }
        });
        jPanel3.add(txttelefono_cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 8, 230, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 690, 130));
        getContentPane().add(jLabelwallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnactualizar_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizar_clientesActionPerformed
        //TODO add your handling code here:
        if (txtcedula_cli.getText().isEmpty() && txtnombre_cli.getText().isEmpty() && txtapellido_cli.getText().isEmpty() && txttelefono_cli.getText().isEmpty() && txtdireccion_cli.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione Cliente Por Favor.");
        } else {
            Clientes clientes = new Clientes();
            Ctrl_Clientes controlclientes = new Ctrl_Clientes();

            clientes.setCedula_Clientes(txtcedula_cli.getText().trim());
            clientes.setNombres_Clientes(txtnombre_cli.getText().trim());
            clientes.setApellidos_Clientes(txtapellido_cli.getText().trim());
            clientes.setTelefono_Clientes(txttelefono_cli.getText().trim());
            clientes.setDireccion_Clientes(txtdireccion_cli.getText().trim());

            if (controlclientes.ActualizarClientes(clientes, Id_Clientes)) {
                JOptionPane.showMessageDialog(null, "Datos Del Cliente Actualizado Exitosamente.");
                this.cargartablaClientes();
                this.LimpiarClie();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Actualizar Cliente.");
            }
        }
    }//GEN-LAST:event_btnactualizar_clientesActionPerformed

    private void btneliminar_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminar_clientesActionPerformed
        // TODO add your handling code here:
        Ctrl_Clientes controlclientes = new Ctrl_Clientes();
        if (Id_Clientes==0) {
            JOptionPane.showMessageDialog(null, "Seleccione Un Cliente Por Favor.");
        } else {
            if (!controlclientes.EliminarClientes(Id_Clientes)) {
                JOptionPane.showMessageDialog(null, "Datos Del Cliente Eliminado Exitosamente.");
                this.cargartablaClientes();
                this.LimpiarClie();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar Cliente.");
                this.LimpiarClie();
            }    
        }
    }//GEN-LAST:event_btneliminar_clientesActionPerformed

    private void txtdireccion_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccion_cliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccion_cliActionPerformed

    private void txttelefono_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefono_cliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefono_cliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar_clientes;
    private javax.swing.JButton btneliminar_clientes;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelwallpaper;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_Clientes;
    private javax.swing.JTextField txtapellido_cli;
    private javax.swing.JTextField txtcedula_cli;
    private javax.swing.JTextField txtdireccion_cli;
    private javax.swing.JTextField txtnombre_cli;
    private javax.swing.JTextField txttelefono_cli;
    // End of variables declaration//GEN-END:variables

    //metodo para limpiar campos de clientes..
    private void LimpiarClie() {
        txtcedula_cli.setText("");
        txtnombre_cli.setText("");
        txtapellido_cli.setText("");
        txttelefono_cli.setText("");
        txtdireccion_cli.setText("");
    }

    //metodo para mostrar los clientes registrados.
    private void cargartablaClientes() {
        Connection con = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select * from clientes_dadis";
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            InternarGestionClientes.jTable_Clientes = new JTable(model);
            InternarGestionClientes.jScrollPane1.setViewportView(InternarGestionClientes.jTable_Clientes);
            //metodo para agregar datos a las tablas
            model.addColumn("N°");
            model.addColumn("Cedula");
            model.addColumn("Nombres");
            model.addColumn("Apellidos");
            model.addColumn("Telefono");
            model.addColumn("Direccion");
            while (rs.next()) {

                Object fila[] = new Object[6];
                for (int i = 0; i < 6; i++) {
                    fila[i] = rs.getObject(i + 1);
                }

                model.addRow(fila);
            }
            con.close();

        } catch (SQLException e) {
            System.out.println("Error al Momento de Llenar La Tabla Clientes." + e);
        }

        jTable_Clientes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTable_Clientes.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    Id_Clientes = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosClientes(Id_Clientes);
                }
            }

        });
    }

//metodo que envia datos seleccionados de los clientes...
    private void EnviarDatosClientes(int Id_Clientes) {
        try {
            Connection con = Conexion.conectar();
            PreparedStatement pst = con.prepareStatement(
                    "select * from clientes_dadis where Id_Clientes = '" + Id_Clientes + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txtcedula_cli.setText(rs.getString("Cedula_Clientes"));
                txtnombre_cli.setText(rs.getString("Nombres_Clientes"));
                txtapellido_cli.setText(rs.getString("Apellidos_Clientes"));
                txttelefono_cli.setText(rs.getString("Telefono_Clientes"));
                txtdireccion_cli.setText(rs.getString("Direccion_Clientes"));
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al Seleccionar Cliente." + e);
        }
    }
}
