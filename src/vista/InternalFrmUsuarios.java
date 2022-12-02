package vista;

import controlador.Ctrl_Usuario;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author yanni
 */
public class InternalFrmUsuarios extends javax.swing.JInternalFrame {

    public InternalFrmUsuarios() {
        initComponents();
        this.setSize(new Dimension(400, 300));
        this.setTitle("USUARIO NUEVO.");
        
        txtpass_Usuario.setVisible(true);
        txtpass_Visible_Usuario.setVisible(false );
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
        txtNombre_Usuario = new javax.swing.JTextField();
        txtApellido_Usuario = new javax.swing.JTextField();
        txtUser_Usuario = new javax.swing.JTextField();
        bntguardarnuevousuario = new javax.swing.JButton();
        txtTelefono_Usuario = new javax.swing.JTextField();
        txtpass_Usuario = new javax.swing.JPasswordField();
        chbxver_Pass = new javax.swing.JCheckBox();
        txtpass_Visible_Usuario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cmbxRol_Usuario = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Elephant", 1, 22)); // NOI18N
        jLabel2.setText("NUEVO  USUARIO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 1, 250, -1));

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.blue);
        jLabel3.setText(" NOMBRES:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 35, 110, -1));

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.blue);
        jLabel4.setText("   APELLIDOS:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 150, -1));

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.blue);
        jLabel5.setText("    USUARIO:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 95, 120, -1));

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.blue);
        jLabel6.setText("   TELEFONO:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 130, -1));

        jLabel8.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        jLabel8.setForeground(java.awt.Color.blue);
        jLabel8.setText("ROL:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 165, -1, -1));

        txtNombre_Usuario.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        getContentPane().add(txtNombre_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 35, 200, 25));

        txtApellido_Usuario.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        getContentPane().add(txtApellido_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 65, 200, 25));

        txtUser_Usuario.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        getContentPane().add(txtUser_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 95, 200, 25));

        bntguardarnuevousuario.setBackground(java.awt.Color.green);
        bntguardarnuevousuario.setFont(new java.awt.Font("Cambria Math", 3, 20)); // NOI18N
        bntguardarnuevousuario.setForeground(new java.awt.Color(255, 255, 255));
        bntguardarnuevousuario.setText("GUARDAR");
        bntguardarnuevousuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bntguardarnuevousuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntguardarnuevousuarioActionPerformed(evt);
            }
        });
        getContentPane().add(bntguardarnuevousuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 235, 170, 30));

        txtTelefono_Usuario.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        getContentPane().add(txtTelefono_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 200, 25));
        getContentPane().add(txtpass_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 200, 25));

        chbxver_Pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbxver_PassMouseClicked(evt);
            }
        });
        getContentPane().add(chbxver_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 131, 19, 23));
        getContentPane().add(txtpass_Visible_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 200, 25));

        jLabel9.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        jLabel9.setForeground(java.awt.Color.blue);
        jLabel9.setText("CONTRASEÑA:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

        cmbxRol_Usuario.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        cmbxRol_Usuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE ROL:", "ADMINISTRADOR", "ASISTENTE" }));
        getContentPane().add(cmbxRol_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 164, 200, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondogris012.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntguardarnuevousuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntguardarnuevousuarioActionPerformed
        // TODO add your handling code here:     
        String rol = cmbxRol_Usuario.getSelectedItem().toString().trim();      
        if (txtNombre_Usuario.getText().isEmpty() || txtApellido_Usuario.getText().isEmpty() || txtUser_Usuario.getText().isEmpty() || txtpass_Usuario.getText().isEmpty() || txtTelefono_Usuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete su Registro Por Favor. ");
        } else {
            //validamos si el usuario ya esta registrado..
            Usuario usuario = new Usuario();
            Ctrl_Usuario controlusuario = new Ctrl_Usuario();
            if (!controlusuario.ExisteUsers(txtUser_Usuario.getText().trim())) {
                //enviamos los datos del usuario
                usuario.setNombres_Usuarios(txtNombre_Usuario.getText().trim());
                usuario.setApellido_Usuarios(txtApellido_Usuario.getText().trim());
                usuario.setUsers(txtUser_Usuario.getText().trim());
                usuario.setPass(txtpass_Usuario.getText().trim());
                usuario.setTelefono_Users(txtTelefono_Usuario.getText().trim());
                 if (rol.equalsIgnoreCase("SELECCIONE ROL:")) {
                    JOptionPane.showMessageDialog(null, "Seleccione Un Rol Por Favor.");
                }else{
                      if (rol.equalsIgnoreCase("ADMINISTRADOR")) {
                                usuario.setRol("ADMINISTRADOR");
                            } else if (rol.equalsIgnoreCase("ASISTENTE")) {
                                usuario.setRol("ASISTENTE");
                            }
                if (controlusuario.GuardarUsers(usuario)) {
                    JOptionPane.showMessageDialog(null, "Usuario Registrado con Exito. ");
                    this.cmbxRol_Usuario.setSelectedItem("SELECCIONE ROL:");
                    LimpiarCamposUsers();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Registrar Usuario. ");
                }
                 } 
            } else {
                JOptionPane.showMessageDialog(null, "El Usuario Ya Esta Registrado, Ingrese Usuario Diferente. ");
            }
        }
             LimpiarCamposUsers();
    }//GEN-LAST:event_bntguardarnuevousuarioActionPerformed

    private void chbxver_PassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbxver_PassMouseClicked
        // TODO add your handling code here:
        if (chbxver_Pass.isSelected()==true) {
            String pass = "";
            char [] passIngresado = txtpass_Usuario.getPassword();
            for (int i = 0; i < passIngresado.length; i++) {
                pass += passIngresado[i];
            }
            txtpass_Visible_Usuario.setText(pass);
            txtpass_Usuario.setVisible(false);
            txtpass_Visible_Usuario.setVisible(true);         
        } else {
            String passwordIngreado = txtpass_Visible_Usuario.getText().trim();
            txtpass_Usuario.setText(passwordIngreado);
            txtpass_Usuario.setVisible(true);
            txtpass_Visible_Usuario.setVisible(false);
        }
    }//GEN-LAST:event_chbxver_PassMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntguardarnuevousuario;
    private javax.swing.JCheckBox chbxver_Pass;
    private javax.swing.JComboBox<String> cmbxRol_Usuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtApellido_Usuario;
    private javax.swing.JTextField txtNombre_Usuario;
    private javax.swing.JTextField txtTelefono_Usuario;
    private javax.swing.JTextField txtUser_Usuario;
    private javax.swing.JPasswordField txtpass_Usuario;
    private javax.swing.JTextField txtpass_Visible_Usuario;
    // End of variables declaration//GEN-END:variables

    //metodo para limpiar campos de registros de usuarios..
    private void LimpiarCamposUsers() {
        txtNombre_Usuario.setText("");
        txtApellido_Usuario.setText("");
        txtUser_Usuario.setText("");
        txtpass_Usuario.setText("");
        txtTelefono_Usuario.setText("");
        cmbxRol_Usuario.setSelectedItem("SELECCIONE ROL:");
    }

}
