package vista;

import controlador.Ctrl_Clientes;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import modelo.Clientes;

/**
 *
 * @author yanni
 */
public class InternalFrmClientes extends javax.swing.JInternalFrame {

    public InternalFrmClientes() {
        initComponents();
        this.setSize(new Dimension(400, 300));
        this.setTitle("NUEVOS CLIENTES.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCedula_Cliente = new javax.swing.JTextField();
        txtNombre_Cliente = new javax.swing.JTextField();
        txtApellido_Cliente = new javax.swing.JTextField();
        bntguardarproducto = new javax.swing.JButton();
        txtTelefono_Cliente = new javax.swing.JTextField();
        txtDireccion_Cliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Elephant", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NUEVO  CLIENTE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 250, -1));

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" CEDULA:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NOMBRE:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("APELLIDOS:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DIRECCION:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" TELEFONO:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        txtCedula_Cliente.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        getContentPane().add(txtCedula_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 210, 25));

        txtNombre_Cliente.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        getContentPane().add(txtNombre_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 210, 25));

        txtApellido_Cliente.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        getContentPane().add(txtApellido_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 210, 25));

        bntguardarproducto.setBackground(java.awt.Color.yellow);
        bntguardarproducto.setFont(new java.awt.Font("Baskerville Old Face", 3, 18)); // NOI18N
        bntguardarproducto.setForeground(java.awt.Color.blue);
        bntguardarproducto.setText("GUARDAR");
        bntguardarproducto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bntguardarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntguardarproductoActionPerformed(evt);
            }
        });
        getContentPane().add(bntguardarproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 170, 30));

        txtTelefono_Cliente.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        getContentPane().add(txtTelefono_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 210, 25));

        txtDireccion_Cliente.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        getContentPane().add(txtDireccion_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 210, 25));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/particulas-polvo-rayones-sobre-fondo-negro-usar-modo-superposicion-pantalla_371174-621.png"))); // NOI18N
        jLabel1.setText("TELEFONO:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntguardarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntguardarproductoActionPerformed
        // TODO add your handling code here:     
        Clientes clientes = new Clientes();
        Ctrl_Clientes controlclientes = new Ctrl_Clientes();
        if (!txtCedula_Cliente.getText().isEmpty() && !txtNombre_Cliente.getText().isEmpty() && !txtApellido_Cliente.getText().isEmpty() && !txtTelefono_Cliente.getText().isEmpty() && !txtDireccion_Cliente.getText().isEmpty()) {
            //JOptionPane.showMessageDialog(null, "Cliente Registrado Exitosamente.");
            if (!controlclientes.ExisteClientes(txtCedula_Cliente.getText().trim())) {

                clientes.setCedula_Clientes(txtCedula_Cliente.getText().trim());
                clientes.setNombres_Clientes(txtNombre_Cliente.getText().trim());
                clientes.setApellidos_Clientes(txtApellido_Cliente.getText().trim());
                clientes.setTelefono_Clientes(txtTelefono_Cliente.getText().trim());
                clientes.setDireccion_Clientes(txtDireccion_Cliente.getText().trim());
                
                if (controlclientes.Guardar(clientes)) {
                    JOptionPane.showMessageDialog(null, "Registro Guardado Exitosamente.");
                    txtCedula_Cliente.setBackground(Color.blue);
                    txtNombre_Cliente.setBackground(Color.blue);
                    txtApellido_Cliente.setBackground(Color.blue);
                    txtTelefono_Cliente.setBackground(Color.blue);
                    txtDireccion_Cliente.setBackground(Color.blue);   
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Guardar.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El Cliente Ya Existe.");
                txtCedula_Cliente.setBackground(Color.white);
                txtNombre_Cliente.setBackground(Color.white);
                txtApellido_Cliente.setBackground(Color.white);
                txtTelefono_Cliente.setBackground(Color.white);
                txtDireccion_Cliente.setBackground(Color.white);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Llene Todos Los Campos Por Favor.");
            txtCedula_Cliente.setBackground(Color.red);
            txtNombre_Cliente.setBackground(Color.red);
            txtApellido_Cliente.setBackground(Color.red);
            txtTelefono_Cliente.setBackground(Color.red);
            txtDireccion_Cliente.setBackground(Color.red);
        }
    //llamada al metodo limpiar campos
    this.LimpiarCamposCli();

    }//GEN-LAST:event_bntguardarproductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntguardarproducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtApellido_Cliente;
    private javax.swing.JTextField txtCedula_Cliente;
    private javax.swing.JTextField txtDireccion_Cliente;
    private javax.swing.JTextField txtNombre_Cliente;
    private javax.swing.JTextField txtTelefono_Cliente;
    // End of variables declaration//GEN-END:variables

    //metodo para limpiar campos de registros productos 
    private void LimpiarCamposCli() {
        txtCedula_Cliente.setText("");
        txtNombre_Cliente.setText("");
        txtApellido_Cliente.setText("");
        txtTelefono_Cliente.setText("");
        txtDireccion_Cliente.setText("");
    }

}
