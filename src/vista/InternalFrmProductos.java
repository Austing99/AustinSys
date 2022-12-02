package vista;

import conexion.Conexion;
import controlador.Ctrl_Productos;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Productos;

/**
 *
 * @author yanni
 */
public class InternalFrmProductos extends javax.swing.JInternalFrame {

    int ObtenerId_CategoriasCombo = 0;

    public InternalFrmProductos() {
        initComponents();
        this.setSize(new Dimension(400, 300));
        this.setTitle("NUEVOS PRODUCTOS.");

        this.cargarcomboxCategorias();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre_Producto = new javax.swing.JTextField();
        txtCantidad_Producto = new javax.swing.JTextField();
        txtPrecio_Producto = new javax.swing.JTextField();
        txtDescripcion_Producto = new javax.swing.JTextField();
        cmbxIva_Producto = new javax.swing.JComboBox<>();
        cmbxCategorias_Pro = new javax.swing.JComboBox<>();
        bntguardarproducto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Bodoni MT Black", 1, 23)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NUEVO  PRODUCTO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 1, 270, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOMBRE:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 35, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CANTIDAD:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PRECIO:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 95, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("IVA:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 165, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CATEGORIAS:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DESCRIPCION:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        txtNombre_Producto.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        getContentPane().add(txtNombre_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 200, 25));

        txtCantidad_Producto.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        getContentPane().add(txtCantidad_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 50, 25));

        txtPrecio_Producto.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        getContentPane().add(txtPrecio_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 95, 50, 25));

        txtDescripcion_Producto.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        getContentPane().add(txtDescripcion_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 200, 25));

        cmbxIva_Producto.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        cmbxIva_Producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE IVA:", "SIN IVA", "IVA 12%", "IVA 14%" }));
        getContentPane().add(cmbxIva_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 165, 200, -1));

        cmbxCategorias_Pro.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        cmbxCategorias_Pro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE CATEGORIA:", "LAPTOPS", "CARGADOR", "AUDIFONOS", " " }));
        getContentPane().add(cmbxCategorias_Pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 200, -1));

        bntguardarproducto.setBackground(java.awt.Color.yellow);
        bntguardarproducto.setFont(new java.awt.Font("Baskerville Old Face", 3, 18)); // NOI18N
        bntguardarproducto.setText("GUARDAR");
        bntguardarproducto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bntguardarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntguardarproductoActionPerformed(evt);
            }
        });
        getContentPane().add(bntguardarproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 235, 170, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/f9999.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntguardarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntguardarproductoActionPerformed
        // TODO add your handling code here:     
        Productos productos = new Productos();
        Ctrl_Productos controlProductos = new Ctrl_Productos();
        String Iva = "";
        String Categoria = "";
        Iva = cmbxIva_Producto.getSelectedItem().toString().trim();
        Categoria = cmbxCategorias_Pro.getSelectedItem().toString().trim();

        //validacion de campos
        if (txtNombre_Producto.getText().equals("") || txtCantidad_Producto.getText().equals("") || txtPrecio_Producto.getText().equals("") || txtDescripcion_Producto.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Llene todos los Campos Requeridos.");
            txtNombre_Producto.setBackground(Color.red);
            txtCantidad_Producto.setBackground(Color.red);
            txtPrecio_Producto.setBackground(Color.red);
            txtDescripcion_Producto.setBackground(Color.red);

        } else {
            //consulta para saber si existe   
            if (!controlProductos.ExisteProductos(txtNombre_Producto.getText().trim())) {
                if (Iva.equalsIgnoreCase("SELECCIONE IVA:")) {
                    JOptionPane.showMessageDialog(null, "Seleccione Un Valor de Iva Por Favor.");
                } else {
                    if (Categoria.equalsIgnoreCase("SELECCIONE CATEGORIA:")) {
                        JOptionPane.showMessageDialog(null, "Seleccione Una Categoria Por Favor.");
                    } else {
                        try {

                            productos.setNombre_Productos(txtNombre_Producto.getText().trim());
                            productos.setCantidad_Productos(Integer.parseInt(txtCantidad_Producto.getText().trim()));
                            String PrecioTXT = "";
                            double Precio = 0.00;
                            PrecioTXT = txtPrecio_Producto.getText().trim();
                            boolean aux = false;

                            /*
                            si el usuario ingresa coma(,) como punto decimal 
                            le transformaremos a punto(.)....
                             */
                            for (int i = 0; i < PrecioTXT.length(); i++) {
                                if (PrecioTXT.charAt(i) == (',')) {
                                    String NuevoPrecio = PrecioTXT.replace(",", ".");
                                    Precio = Double.parseDouble(NuevoPrecio);
                                    aux = true;
                                }
                            }

                            //evaluamos la condicion...
                            if (aux == true) {
                                productos.setPrecio_Productos(Precio);
                            } else {
                                Precio = Double.parseDouble(PrecioTXT);
                                productos.setPrecio_Productos(Precio);
                            }
                            productos.setDescripcion(txtDescripcion_Producto.getText().trim());

                            //porcentaje Iva..
                            if (Iva.equalsIgnoreCase("SIN IVA")) {
                                productos.setImpuestoIva_Productos(0);
                            } else if (Iva.equalsIgnoreCase("IVA 12%")) {
                                productos.setImpuestoIva_Productos(12);
                            } else if (Iva.equalsIgnoreCase("IVA 14 %")) {
                                productos.setImpuestoIva_Productos(14);
                            }
                            //Id_Categorias/metodo que carga el Id_Categorias..
                            this.Id_Categorias();
                            productos.setId_Categorias(ObtenerId_CategoriasCombo);

                            if (controlProductos.Guardar(productos)) {
                                JOptionPane.showMessageDialog(null, "Producto Guardado.");
                                txtNombre_Producto.setBackground(Color.BLUE);
                                txtCantidad_Producto.setBackground(Color.BLUE);
                                txtPrecio_Producto.setBackground(Color.BLUE);
                                txtDescripcion_Producto.setBackground(Color.BLUE);

                                this.cargarcomboxCategorias();
                                this.cmbxIva_Producto.setSelectedItem("SELECCIONE IVA:");
                                this.LimpiarCamposPro();
                            } else {
                                JOptionPane.showMessageDialog(null, "Error al Guardar.");
                            }
                        } catch (HeadlessException | NumberFormatException e) {
                            System.out.println("Error en:" + e);
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "El Producto Ya Esta Registrado.");
                txtNombre_Producto.setBackground(Color.white);
                txtCantidad_Producto.setBackground(Color.white);
                txtPrecio_Producto.setBackground(Color.white);
                txtDescripcion_Producto.setBackground(Color.white);
                this.cargarcomboxCategorias();
                this.cmbxIva_Producto.setSelectedItem("SELECCIONE IVA:");
            }
            this.LimpiarCamposPro();
        }


    }//GEN-LAST:event_bntguardarproductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntguardarproducto;
    private javax.swing.JComboBox<String> cmbxCategorias_Pro;
    private javax.swing.JComboBox<String> cmbxIva_Producto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtCantidad_Producto;
    private javax.swing.JTextField txtDescripcion_Producto;
    private javax.swing.JTextField txtNombre_Producto;
    private javax.swing.JTextField txtPrecio_Producto;
    // End of variables declaration//GEN-END:variables

    //metodo para limpiar campos de registros productos 
    private void LimpiarCamposPro() {
        txtNombre_Producto.setText("");
        txtCantidad_Producto.setText("");
        txtPrecio_Producto.setText("");
        txtDescripcion_Producto.setText("");
    }

    /*
    METODO PARA CARGAR LAS CATEGORIAS A SELECCIONAR EN LOS NUEVOS PRODUCTOS
     */
    private void cargarcomboxCategorias() {

        Connection cn = Conexion.conectar();
        String sql = "select * from categorias_dadis";
        Statement st;
        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            cmbxCategorias_Pro.removeAllItems();
            cmbxCategorias_Pro.addItem("SELECCIONE CATEGORIA:");
            while (rs.next()) {
                cmbxCategorias_Pro.addItem(rs.getString("Descripcion"));
            }
            cn.close();

        } catch (SQLException e) {
        }
    }

    /*
    METODO PARA OBTENER ID CATEGORIAS
     */
    private int Id_Categorias() {

        String sql = "select * from categorias_dadis where Descripcion = '" + this.cmbxCategorias_Pro.getSelectedItem() + "'";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                ObtenerId_CategoriasCombo = rs.getInt("Id_Categorias");

            }
        } catch (SQLException e) {
            System.out.println("Error al Obtener Id Categorias. ");
        }
        return ObtenerId_CategoriasCombo;
    }
}
