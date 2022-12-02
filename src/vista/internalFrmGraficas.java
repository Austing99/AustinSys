package vista;

import java.awt.Dimension;
import javax.swing.JTextField;
import static vista.FrmMenu.jDesktopPane_menu;



/**
 *
 * @author yanni
 */
public class internalFrmGraficas extends javax.swing.JInternalFrame {

    public static String Fecha_Inicio = " ", Fecha_Final = " ";
    
    public internalFrmGraficas() {
        initComponents();
        this.setSize(new Dimension(450, 300));
        this.setTitle("HISTORIAL DE VENTAS REALIZADAS.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bntguardarproducto = new javax.swing.JButton();
        jDateChooser_FechaInicio = new com.toedter.calendar.JDateChooser();
        jDateChooser_FechaFinal = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Elephant", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SELECCIONE FECHA ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 310, -1));

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("FECHA INICIAL:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("FECHA FINAL:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        bntguardarproducto.setBackground(java.awt.Color.green);
        bntguardarproducto.setFont(new java.awt.Font("Baskerville Old Face", 3, 22)); // NOI18N
        bntguardarproducto.setForeground(java.awt.Color.blue);
        bntguardarproducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-buy-24.png"))); // NOI18N
        bntguardarproducto.setText("GRAFICAR");
        bntguardarproducto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bntguardarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntguardarproductoActionPerformed(evt);
            }
        });
        getContentPane().add(bntguardarproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 220, 50));

        jDateChooser_FechaInicio.setDateFormatString("yyyy/MM/dd");
        getContentPane().add(jDateChooser_FechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 58, 190, -1));

        jDateChooser_FechaFinal.setDateFormatString("yyyy/MM/dd");
        getContentPane().add(jDateChooser_FechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 125, 190, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/particulas-polvo-rayones-sobre-fondo-negro-usar-modo-superposicion-pantalla_371174-621.png"))); // NOI18N
        jLabel1.setText("TELEFONO:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntguardarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntguardarproductoActionPerformed
        // TODO add your handling code here:   
        Fecha_Inicio = ((JTextField) jDateChooser_FechaInicio.getDateEditor().getUiComponent()).getText();
        Fecha_Final = ((JTextField) jDateChooser_FechaFinal.getDateEditor().getUiComponent()).getText();
       
        Graficas graficas = new Graficas();
        jDesktopPane_menu.add(graficas);
        graficas.setVisible(true);
        
    }//GEN-LAST:event_bntguardarproductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntguardarproducto;
    private com.toedter.calendar.JDateChooser jDateChooser_FechaFinal;
    private com.toedter.calendar.JDateChooser jDateChooser_FechaInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

 

}
