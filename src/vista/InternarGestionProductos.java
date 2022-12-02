package vista;

import conexion.Conexion;
import controlador.Ctrl_Productos;
import java.awt.Dimension;
import java.awt.HeadlessException;
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
import modelo.Productos;

/**
 *
 * @author yanni
 */
public class InternarGestionProductos extends javax.swing.JInternalFrame {

    private int Id_Productos;
    int ObtenerId_CategoriasCombo = 0;

    public InternarGestionProductos() {
        initComponents();
        this.setSize(new Dimension(900, 500));
        this.setTitle("ADMINISTRAR PRODUCTOS.");

        //cargar tablas
        this.cargartablaProductos();
        this.cargarCategoriasCombox();

        //imagen de fondo en Label
        ImageIcon wallpaper = new ImageIcon("src/images/fondoddd.jpg");
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
        jTable_Productos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnactualizar_productos = new javax.swing.JButton();
        btneliminar_productos = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cmbxIva_Producto = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnombre_pro = new javax.swing.JTextField();
        txtcantidad_pro = new javax.swing.JTextField();
        txtprecio_pro = new javax.swing.JTextField();
        txtdescripcion_pro = new javax.swing.JTextField();
        cmbxCategorias_Pro = new javax.swing.JComboBox<>();
        jLabelwallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("ÁREA DE CONTROL:PRODUCTOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(212, 245, 245));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_Productos.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jTable_Productos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_Productos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 840, 230));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 860, 250));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnactualizar_productos.setBackground(new java.awt.Color(0, 173, 20));
        btnactualizar_productos.setFont(new java.awt.Font("Lucida Handwriting", 1, 13)); // NOI18N
        btnactualizar_productos.setForeground(new java.awt.Color(255, 255, 255));
        btnactualizar_productos.setText("ACTUALIZAR");
        btnactualizar_productos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnactualizar_productos.setBorderPainted(false);
        btnactualizar_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizar_productosActionPerformed(evt);
            }
        });
        jPanel2.add(btnactualizar_productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 30));

        btneliminar_productos.setBackground(java.awt.Color.red);
        btneliminar_productos.setFont(new java.awt.Font("Lucida Handwriting", 1, 13)); // NOI18N
        btneliminar_productos.setForeground(new java.awt.Color(255, 255, 255));
        btneliminar_productos.setText("ELIMINAR");
        btneliminar_productos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btneliminar_productos.setBorderPainted(false);
        btneliminar_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminar_productosActionPerformed(evt);
            }
        });
        jPanel2.add(btneliminar_productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 85, 110, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, 130, 160));

        jPanel3.setBackground(new java.awt.Color(212, 245, 245));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbxIva_Producto.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        cmbxIva_Producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE IVA:", "SIN IVA", "IVA 12%", "IVA 14%" }));
        jPanel3.add(cmbxIva_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 230, -1));

        jLabel3.setFont(new java.awt.Font("Sitka Small", 3, 16)); // NOI18N
        jLabel3.setText("    CATEGORIA:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Sitka Small", 3, 16)); // NOI18N
        jLabel4.setText(" NOMBRE:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Sitka Small", 3, 16)); // NOI18N
        jLabel5.setText("CANTIDAD:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Sitka Small", 3, 16)); // NOI18N
        jLabel6.setText("       PRECIO:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 110, -1));

        jLabel7.setFont(new java.awt.Font("Sitka Small", 3, 16)); // NOI18N
        jLabel7.setText("DESCRIPCION:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Sitka Small", 3, 16)); // NOI18N
        jLabel8.setText("                 IVA:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 130, -1));

        txtnombre_pro.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jPanel3.add(txtnombre_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 8, 190, -1));

        txtcantidad_pro.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        txtcantidad_pro.setEnabled(false);
        jPanel3.add(txtcantidad_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 57, 70, -1));

        txtprecio_pro.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jPanel3.add(txtprecio_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 117, 70, -1));

        txtdescripcion_pro.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        txtdescripcion_pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescripcion_proActionPerformed(evt);
            }
        });
        jPanel3.add(txtdescripcion_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 8, 230, -1));

        cmbxCategorias_Pro.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        cmbxCategorias_Pro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE CATEGORIA:", "LAPTOPS", "CARGADOR", "AUDIFONOS", " " }));
        jPanel3.add(cmbxCategorias_Pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 230, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 690, 160));
        getContentPane().add(jLabelwallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnactualizar_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizar_productosActionPerformed
        //TODO add your handling code here:
        Productos productos = new Productos();
        Ctrl_Productos controlProductos = new Ctrl_Productos();
        String IVA = "";
        String Categoria = "";
        IVA = cmbxIva_Producto.getSelectedItem().toString().trim();
        Categoria = cmbxCategorias_Pro.getSelectedItem().toString().trim();

        //validacion de campos
        if (txtnombre_pro.getText().isEmpty() || txtcantidad_pro.getText().isEmpty() || txtprecio_pro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione Un Producto Por Favor.");
        } else {
            //consulta para saber si existe  
            if (IVA.equalsIgnoreCase("SELECCIONE IVA:")) {
                JOptionPane.showMessageDialog(null, "Seleccione Un Valor de Iva Por Favor.");
            } else {
                if (Categoria.equalsIgnoreCase("SELECCIONE CATEGORIA:")) {
                    JOptionPane.showMessageDialog(null, "Seleccione Una Categoria Por Favor.");
                } else {
                    try {

                        productos.setNombre_Productos(txtnombre_pro.getText().trim());
                        productos.setCantidad_Productos(Integer.parseInt(txtcantidad_pro.getText().trim()));
                        String PrecioTXT = "";
                        double Precio = 0.00;
                        PrecioTXT = txtprecio_pro.getText().trim();
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
                        productos.setDescripcion(txtdescripcion_pro.getText().trim());

                        //porcentaje Iva..
                        if (IVA.equalsIgnoreCase("SIN IVA")) {
                            productos.setImpuestoIva_Productos(0);
                        } else if (IVA.equalsIgnoreCase("IVA 12%")) {
                            productos.setImpuestoIva_Productos(12);
                        } else if (IVA.equalsIgnoreCase("IVA 14%")) {
                            productos.setImpuestoIva_Productos(14);
                        }
                        //Id_Categorias/metodo que carga el Id_Categorias..
                        this.Id_Categorias();
                        productos.setId_Categorias(ObtenerId_CategoriasCombo);

                        if (controlProductos.ActualizarProductos(productos, Id_Productos)) {
                            JOptionPane.showMessageDialog(null, "Producto Actualizado Exitosamente.");
                            this.cargarCategoriasCombox();
                            this.cargartablaProductos();
                            this.cmbxIva_Producto.setSelectedItem("SELECCIONE IVA:");
                            this.LimpiarPro();
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al Actualizar.");
                        }
                    } catch (HeadlessException | NumberFormatException e) {
                        System.out.println("Error en:" + e);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnactualizar_productosActionPerformed

    private void btneliminar_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminar_productosActionPerformed
        // TODO add your handling code here:
        Ctrl_Productos controlProductos = new Ctrl_Productos();
        if (Id_Productos == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un Producto Por Favor.");
        } else {
            if (!controlProductos.EliminarProductos(Id_Productos)) {
                JOptionPane.showMessageDialog(null, "Producto Eliminado Exitosamente.");
                this.cargartablaProductos();
                this.cargarCategoriasCombox();
                this.LimpiarPro();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar Producto.");
            }
        }
    }//GEN-LAST:event_btneliminar_productosActionPerformed

    private void txtdescripcion_proActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescripcion_proActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescripcion_proActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar_productos;
    private javax.swing.JButton btneliminar_productos;
    private javax.swing.JComboBox<String> cmbxCategorias_Pro;
    private javax.swing.JComboBox<String> cmbxIva_Producto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    public static javax.swing.JTable jTable_Productos;
    private javax.swing.JTextField txtcantidad_pro;
    private javax.swing.JTextField txtdescripcion_pro;
    private javax.swing.JTextField txtnombre_pro;
    private javax.swing.JTextField txtprecio_pro;
    // End of variables declaration//GEN-END:variables

    //metodo para limpiar campos de productos..
    private void LimpiarPro() {
        txtnombre_pro.setText("");
        txtcantidad_pro.setText("");
        txtprecio_pro.setText("");
        txtdescripcion_pro.setText("");
        cmbxIva_Producto.setSelectedItem("SELECCIONE IVA:");
        cmbxCategorias_Pro.setSelectedItem("SELECCIONE CATEGORIA:");
    }

    //metodo para cargar las categorias al combox....
    private void cargarCategoriasCombox() {
        Connection cn = Conexion.conectar();
        String sql = "select * from categorias_dadis";
        Statement st;
        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            cmbxCategorias_Pro.removeAllItems();
            cmbxCategorias_Pro.addItem("SELECCIONE UNA CATEGORIA:");
            while (rs.next()) {
                cmbxCategorias_Pro.addItem(rs.getString("Descripcion"));
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al Cargar Las Categorias.");
        }
    }

    //metodo para mostrar los productos registrados.
    String DescripcionCategorias = "";
    double precio = 0.00;
    int porcentajeiva = 0;
    double IVA = 0.00;

    private void cargartablaProductos() {
        Connection con = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select p.Id_Productos, p.Nombre_Productos, p.Cantidad_Productos, p.Precio_Productos, p.Descripcion, p.ImpuestoIva_Productos, c.Descripcion from productos_dadis As p, categorias_dadis As c where p.Id_Categorias = c.Id_Categorias";
        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            InternarGestionProductos.jTable_Productos = new JTable(model);
            InternarGestionProductos.jScrollPane1.setViewportView(InternarGestionProductos.jTable_Productos);
            //metodo para agregar datos a las tablas
            model.addColumn("N°");
            model.addColumn("Nombre");
            model.addColumn("Cantidad");
            model.addColumn("Precio");
            model.addColumn("Descripcion");
            model.addColumn("Iva");
            model.addColumn("Categorias");
       

            while (rs.next()) {
                Object fila[] = new Object[7];

                precio = rs.getDouble("Precio_Productos");
                porcentajeiva = rs.getInt("ImpuestoIVa_Productos");

                for (int i = 0; i < 7; i++) {
                    fila[i] = rs.getObject(i + 1);

                    if (i == 5) {
                        this.calcularIva(precio, porcentajeiva);
                        fila[i] = IVA;
                        rs.getObject(i + 1);
                    } else {
                        fila[i] = rs.getObject(i + 1);
                    }
                }

                model.addRow(fila);
            }
            con.close();

        } catch (SQLException e) {
            System.out.println("Error al Momento de Llenar La Tabla Productos." + e);
        }

        jTable_Productos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTable_Productos.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    Id_Productos = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosProductos(Id_Productos);
                }
            }

        });
    }

    //metodo para calcular el valor del iva
    private double calcularIva(double precio, int iva) {
        int p_Iva = iva;
        switch (p_Iva) {
            case 0:
                IVA = 0.0;
                break;
            case 12:
                IVA = precio * 0.12;
                break;
            case 14:
                IVA = precio * 0.14;
                break;
            default:
                break;
        }
        //redondear decimales
        IVA = (double) Math.round(IVA * 100) / 100;
        return IVA;
    }

//metodo que envia datos seleccionados de los productos...
    private void EnviarDatosProductos(int Id_Productos) {
        try {
            Connection con = Conexion.conectar();
            PreparedStatement pst = con.prepareStatement(
                    "select * from productos_dadis where Id_Productos = '" + Id_Productos + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txtnombre_pro.setText(rs.getString("Nombre_Productos"));
                txtcantidad_pro.setText(rs.getString("Cantidad_Productos"));
                txtprecio_pro.setText(rs.getString("Precio_Productos"));
                txtdescripcion_pro.setText(rs.getString("Descripcion"));
                int IVA = rs.getInt("ImpuestoIva_Productos");
                switch (IVA) {
                    case 0:
                        cmbxIva_Producto.setSelectedItem("SIN IVA");
                        break;
                    case 12:
                        cmbxIva_Producto.setSelectedItem("IVA 12%");
                        break;
                    case 14:
                        cmbxIva_Producto.setSelectedItem("IVA 14%");
                        break;
                    default:
                        cmbxIva_Producto.setSelectedItem("SELECCIONE IVA:");
                        break;
                }
                int idCate = rs.getInt("Id_Categorias");
                cmbxCategorias_Pro.setSelectedItem(relacionarCategorias(idCate));
            }
            con.close();

        } catch (SQLException e) {
            System.out.println("Error al Seleccionar Producto." + e);
        }
    }

    //metodo para relacionar categorias..
    private String relacionarCategorias(int Id_Categorias) {

        String sql = "select Descripcion from categorias_dadis where Id_Categorias = '" + Id_Categorias + "'";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                DescripcionCategorias = rs.getString("Descripcion");
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al Obtener Id de Categorias.");
        }
        return DescripcionCategorias;
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
