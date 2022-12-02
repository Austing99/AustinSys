package vista;

import controlador.ReportesSistema;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Locale;
import javax.swing.JDesktopPane;

/**
 *
 * @author yanni
 */
public class FrmMenu extends javax.swing.JFrame {

    public static JDesktopPane jDesktopPane_menu;

    public FrmMenu() {
        initComponents();
        this.setSize(new Dimension(1200, 700));
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("DADISCOMPU");

        this.setLayout(null);
        jDesktopPane_menu = new JDesktopPane();

        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.jDesktopPane_menu.setBounds(0, 0, ancho, (alto - 110));
        this.add(jDesktopPane_menu);
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/LogoDadis.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu_nuevousuario = new javax.swing.JMenuItem();
        jMenugestionarusuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenunuevoproducto = new javax.swing.JMenuItem();
        jMenugestionarproducto = new javax.swing.JMenuItem();
        jMenuactualizarstocks = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenunuevocliente = new javax.swing.JMenuItem();
        jMenugestionarclientes = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenunuevacategoria = new javax.swing.JMenuItem();
        jMenugestionarcategorias = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenunuevaventa = new javax.swing.JMenuItem();
        jMenugestionarventas = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenureportesproductos = new javax.swing.JMenuItem();
        jMenureportesclientes = new javax.swing.JMenuItem();
        jMenureportesventas = new javax.swing.JMenuItem();
        jMenureportescategorias = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuhistorial = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenucerrar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario.png"))); // NOI18N
        jMenu1.setText("Usuarios");
        jMenu1.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenu_nuevousuario.setFont(new java.awt.Font("Cambria Math", 3, 14)); // NOI18N
        jMenu_nuevousuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-insurance-agent-24.png"))); // NOI18N
        jMenu_nuevousuario.setText("Nuevo Usuario");
        jMenu_nuevousuario.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu_nuevousuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_nuevousuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenu_nuevousuario);

        jMenugestionarusuario.setFont(new java.awt.Font("Cambria Math", 3, 14)); // NOI18N
        jMenugestionarusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-configuraciones-de-imac-24.png"))); // NOI18N
        jMenugestionarusuario.setText(" Gestionar Usuarios");
        jMenugestionarusuario.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenugestionarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenugestionarusuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenugestionarusuario);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-caja-llena-24.png"))); // NOI18N
        jMenu2.setText("Productos");
        jMenu2.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenunuevoproducto.setFont(new java.awt.Font("Cambria Math", 3, 14)); // NOI18N
        jMenunuevoproducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-despliegue-24.png"))); // NOI18N
        jMenunuevoproducto.setText("Nuevo Producto");
        jMenunuevoproducto.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenunuevoproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenunuevoproductoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenunuevoproducto);

        jMenugestionarproducto.setFont(new java.awt.Font("Cambria Math", 3, 14)); // NOI18N
        jMenugestionarproducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-product-24.png"))); // NOI18N
        jMenugestionarproducto.setText("Gestionar Productos");
        jMenugestionarproducto.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenugestionarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenugestionarproductoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenugestionarproducto);

        jMenuactualizarstocks.setFont(new java.awt.Font("Cambria Math", 3, 14)); // NOI18N
        jMenuactualizarstocks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-inventory-24.png"))); // NOI18N
        jMenuactualizarstocks.setText("Actualizar Stock");
        jMenuactualizarstocks.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuactualizarstocks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuactualizarstocksActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuactualizarstocks);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-multitud-24 (1).png"))); // NOI18N
        jMenu3.setText("Clientes");
        jMenu3.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(180, 30));

        jMenunuevocliente.setFont(new java.awt.Font("Cambria Math", 3, 14)); // NOI18N
        jMenunuevocliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nuevo-cliente.png"))); // NOI18N
        jMenunuevocliente.setText("Nuevo Cliente");
        jMenunuevocliente.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenunuevocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenunuevoclienteActionPerformed(evt);
            }
        });
        jMenu3.add(jMenunuevocliente);

        jMenugestionarclientes.setFont(new java.awt.Font("Cambria Math", 3, 14)); // NOI18N
        jMenugestionarclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-service-24.png"))); // NOI18N
        jMenugestionarclientes.setText("Gestionar Cliente");
        jMenugestionarclientes.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenugestionarclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenugestionarclientesActionPerformed(evt);
            }
        });
        jMenu3.add(jMenugestionarclientes);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/categorias.png"))); // NOI18N
        jMenu4.setText("Categorias");
        jMenu4.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenunuevacategoria.setFont(new java.awt.Font("Cambria Math", 3, 14)); // NOI18N
        jMenunuevacategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nuevo.png"))); // NOI18N
        jMenunuevacategoria.setText("Nueva Categoria");
        jMenunuevacategoria.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenunuevacategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenunuevacategoriaActionPerformed(evt);
            }
        });
        jMenu4.add(jMenunuevacategoria);

        jMenugestionarcategorias.setFont(new java.awt.Font("Cambria Math", 3, 14)); // NOI18N
        jMenugestionarcategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/configuraciones.png"))); // NOI18N
        jMenugestionarcategorias.setText("Gestionar Categorias");
        jMenugestionarcategorias.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenugestionarcategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenugestionarcategoriasActionPerformed(evt);
            }
        });
        jMenu4.add(jMenugestionarcategorias);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/factura dadis.png"))); // NOI18N
        jMenu5.setText("Factura");
        jMenu5.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenunuevaventa.setFont(new java.awt.Font("Cambria Math", 3, 14)); // NOI18N
        jMenunuevaventa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/anadir.png"))); // NOI18N
        jMenunuevaventa.setText("Nueva Venta");
        jMenunuevaventa.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenunuevaventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenunuevaventaActionPerformed(evt);
            }
        });
        jMenu5.add(jMenunuevaventa);

        jMenugestionarventas.setFont(new java.awt.Font("Cambria Math", 3, 14)); // NOI18N
        jMenugestionarventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/caja.png"))); // NOI18N
        jMenugestionarventas.setText("Gestionar Ventas");
        jMenugestionarventas.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenugestionarventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenugestionarventasActionPerformed(evt);
            }
        });
        jMenu5.add(jMenugestionarventas);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-report-24.png"))); // NOI18N
        jMenu6.setText("Reportes");
        jMenu6.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenureportesproductos.setFont(new java.awt.Font("Cambria Math", 3, 14)); // NOI18N
        jMenureportesproductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-report-24 (3).png"))); // NOI18N
        jMenureportesproductos.setText("Reportes Productos");
        jMenureportesproductos.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenureportesproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenureportesproductosActionPerformed(evt);
            }
        });
        jMenu6.add(jMenureportesproductos);

        jMenureportesclientes.setFont(new java.awt.Font("Cambria Math", 3, 14)); // NOI18N
        jMenureportesclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-report-24 (2).png"))); // NOI18N
        jMenureportesclientes.setText("Reportes Clientes");
        jMenureportesclientes.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenureportesclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenureportesclientesActionPerformed(evt);
            }
        });
        jMenu6.add(jMenureportesclientes);

        jMenureportesventas.setFont(new java.awt.Font("Cambria Math", 3, 14)); // NOI18N
        jMenureportesventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-stock-24.png"))); // NOI18N
        jMenureportesventas.setText("Reportes Ventas");
        jMenureportesventas.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenureportesventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenureportesventasActionPerformed(evt);
            }
        });
        jMenu6.add(jMenureportesventas);

        jMenureportescategorias.setFont(new java.awt.Font("Cambria Math", 3, 14)); // NOI18N
        jMenureportescategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reportes.png"))); // NOI18N
        jMenureportescategorias.setText("Reportes Categorias");
        jMenureportescategorias.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenureportescategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenureportescategoriasActionPerformed(evt);
            }
        });
        jMenu6.add(jMenureportescategorias);

        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/historial1.png"))); // NOI18N
        jMenu7.setText("Historial");
        jMenu7.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jMenu7.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuhistorial.setFont(new java.awt.Font("Cambria Math", 3, 14)); // NOI18N
        jMenuhistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-report-24 (1).png"))); // NOI18N
        jMenuhistorial.setText("Ver Historial");
        jMenuhistorial.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuhistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuhistorialActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuhistorial);

        jMenuBar1.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar-sesion.png"))); // NOI18N
        jMenu8.setText("Cerrar Sesion");
        jMenu8.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jMenu8.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenucerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-salida-24.png"))); // NOI18N
        jMenucerrar.setText("Cerrar Sesion");
        jMenucerrar.setFont(new java.awt.Font("Cambria Math", 3, 14)); // NOI18N
        jMenucerrar.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenucerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenucerrarMouseClicked(evt);
            }
        });
        jMenu8.add(jMenucerrar);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuactualizarstocksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuactualizarstocksActionPerformed
        // TODO add your handling code here:
        InterActualizarStock interActualizarStock = new InterActualizarStock();
        jDesktopPane_menu.add(interActualizarStock);
        interActualizarStock.setVisible(true);
    }//GEN-LAST:event_jMenuactualizarstocksActionPerformed

    private void jMenugestionarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenugestionarusuarioActionPerformed
        // TODO add your handling code here:
        InternarGestionUsuarios internarGestionUsuarios = new InternarGestionUsuarios();
        jDesktopPane_menu.add(internarGestionUsuarios);
        internarGestionUsuarios.setVisible(true);
    }//GEN-LAST:event_jMenugestionarusuarioActionPerformed

    private void jMenunuevacategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenunuevacategoriaActionPerformed
        // TODO add your handling code here:
        InternalFrmCategorias internalFrmCategorias = new InternalFrmCategorias();
        jDesktopPane_menu.add(internalFrmCategorias);
        internalFrmCategorias.setVisible(true);
    }//GEN-LAST:event_jMenunuevacategoriaActionPerformed

    private void jMenugestionarcategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenugestionarcategoriasActionPerformed
        // TODO add your handling code here:
        InternarGestionCategorias internarGestionCategorias = new InternarGestionCategorias();
        jDesktopPane_menu.add(internarGestionCategorias);
        internarGestionCategorias.setVisible(true);
    }//GEN-LAST:event_jMenugestionarcategoriasActionPerformed

    private void jMenunuevoproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenunuevoproductoActionPerformed
        // TODO add your handling code here:
        InternalFrmProductos internalFrmProductos = new InternalFrmProductos();
        jDesktopPane_menu.add(internalFrmProductos);
        internalFrmProductos.setVisible(true);
    }//GEN-LAST:event_jMenunuevoproductoActionPerformed

    private void jMenugestionarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenugestionarproductoActionPerformed
        // TODO add your handling code here:
        InternarGestionProductos internarGestionProductos = new InternarGestionProductos();
        jDesktopPane_menu.add(internarGestionProductos);
        internarGestionProductos.setVisible(true);
    }//GEN-LAST:event_jMenugestionarproductoActionPerformed

    private void jMenunuevoclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenunuevoclienteActionPerformed
        // TODO add your handling code here:
        InternalFrmClientes internalFrmClientes = new InternalFrmClientes();
        jDesktopPane_menu.add(internalFrmClientes);
        internalFrmClientes.setVisible(true);
    }//GEN-LAST:event_jMenunuevoclienteActionPerformed

    private void jMenucerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenucerrarMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenucerrarMouseClicked

    private void jMenugestionarclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenugestionarclientesActionPerformed
        // TODO add your handling code here:
        InternarGestionClientes internarGestionClientes = new InternarGestionClientes();
        jDesktopPane_menu.add(internarGestionClientes);
        internarGestionClientes.setVisible(true);
    }//GEN-LAST:event_jMenugestionarclientesActionPerformed

    private void jMenu_nuevousuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_nuevousuarioActionPerformed
        // TODO add your handling code here:
        InternalFrmUsuarios internalFrmUsuarios = new InternalFrmUsuarios();
        jDesktopPane_menu.add(internalFrmUsuarios);
        internalFrmUsuarios.setVisible(true);
    }//GEN-LAST:event_jMenu_nuevousuarioActionPerformed

    private void jMenunuevaventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenunuevaventaActionPerformed
        // TODO add your handling code here:
        InterFactura interFactura = new InterFactura();
        jDesktopPane_menu.add(interFactura);
        interFactura.setVisible(true);
    }//GEN-LAST:event_jMenunuevaventaActionPerformed

    private void jMenugestionarventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenugestionarventasActionPerformed
        // TODO add your handling code here:
        InternarGestionVentas internarGestionVentas = new InternarGestionVentas();
        jDesktopPane_menu.add(internarGestionVentas);
        internarGestionVentas.setVisible(true);
    }//GEN-LAST:event_jMenugestionarventasActionPerformed

    private void jMenureportesclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenureportesclientesActionPerformed
        // TODO add your handling code here:
        ReportesSistema reportecli = new ReportesSistema();
        reportecli.ReportesClientes();
    }//GEN-LAST:event_jMenureportesclientesActionPerformed

    private void jMenureportesproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenureportesproductosActionPerformed
        // TODO add your handling code here:
        ReportesSistema reportespro = new ReportesSistema();
        reportespro.ReportesProductos();
    }//GEN-LAST:event_jMenureportesproductosActionPerformed

    private void jMenureportescategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenureportescategoriasActionPerformed
        // TODO add your handling code here:
        ReportesSistema reportescate = new ReportesSistema();
        reportescate.ReportesCategorias();
    }//GEN-LAST:event_jMenureportescategoriasActionPerformed

    private void jMenureportesventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenureportesventasActionPerformed
        // TODO add your handling code here:
        ReportesSistema reportesventas = new ReportesSistema();
        reportesventas.ReportesVentas();
    }//GEN-LAST:event_jMenureportesventasActionPerformed

    private void jMenuhistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuhistorialActionPerformed
        // TODO add your handling code here:
        internalFrmGraficas interFrmGraficas = new internalFrmGraficas();
        jDesktopPane_menu.add(interFrmGraficas);
        interFrmGraficas.setVisible(true);
    }//GEN-LAST:event_jMenuhistorialActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenu_nuevousuario;
    private javax.swing.JMenuItem jMenuactualizarstocks;
    private javax.swing.JMenu jMenucerrar;
    private javax.swing.JMenuItem jMenugestionarcategorias;
    private javax.swing.JMenuItem jMenugestionarclientes;
    private javax.swing.JMenuItem jMenugestionarproducto;
    private javax.swing.JMenuItem jMenugestionarusuario;
    private javax.swing.JMenuItem jMenugestionarventas;
    private javax.swing.JMenuItem jMenuhistorial;
    private javax.swing.JMenuItem jMenunuevacategoria;
    private javax.swing.JMenuItem jMenunuevaventa;
    private javax.swing.JMenuItem jMenunuevocliente;
    private javax.swing.JMenuItem jMenunuevoproducto;
    private javax.swing.JMenuItem jMenureportescategorias;
    private javax.swing.JMenuItem jMenureportesclientes;
    private javax.swing.JMenuItem jMenureportesproductos;
    private javax.swing.JMenuItem jMenureportesventas;
    // End of variables declaration//GEN-END:variables
}
