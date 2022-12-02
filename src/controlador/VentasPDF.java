package controlador;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import conexion.Conexion;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import vista.InterFactura;

/**
 *
 * @author yanni
 */
public class VentasPDF {

    private String CedulaCliente;
    private String NombresCliente;
    private String CelularCliente;
    private String DireccionCliente;

    private String FechaActual = "";
    private String NombreVentaPDf = "";

    /*
   metodo para obtener datos del cliente......
     */
    public void DatosCLientes(int Id_Clientes) {
        Connection cn = Conexion.conectar();
        String sql = "select * from clientes_dadis where Id_Clientes = '" + Id_Clientes + "'";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                CedulaCliente = rs.getString("Cedula_Clientes");
                NombresCliente = rs.getString("Nombres_Clientes") + " " + rs.getString("Apellidos_Clientes");
                CelularCliente = rs.getString("Telefono_Clientes");
                DireccionCliente = rs.getString("Direccion_Clientes");
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al Obtener Datos de los Clientes Registrados Para la Factura.." + e);
        }
    }

    /*
   metodo para generar la factura por pdf....
     */
    public void FacturaPDF() {
        try {
            //poner la fecha actual....
            Date date = new Date();
            FechaActual = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(date);
            //cambiar formato de fecha de / a _...
            String NuevaFecha = "";
            for (int i = 0; i < FechaActual.length(); i++) {
                if (FechaActual.charAt(i) == '/') {
                    NuevaFecha = FechaActual.replace("/", "_");
                }
            }

            NombreVentaPDf = "Venta_" + NombresCliente + "_" + NuevaFecha + ".pdf";

            FileOutputStream archivo;
            File file = new File("src/pdf/" + NombreVentaPDf);
            archivo = new FileOutputStream(file);

            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();

            Image img = Image.getInstance("src/images/DADIS.png");
            Paragraph Fecha = new Paragraph();
            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 13, Font.BOLD, BaseColor.BLUE);
            Fecha.add(Chunk.NEWLINE);///Se agrega nueva linea......
            Fecha.add("Factura:" + "\nFecha:" + FechaActual + "\n\n");

            //encabezado....
            PdfPTable Encabezado = new PdfPTable(4);
            Encabezado.setWidthPercentage(100);
            Encabezado.getDefaultCell().setBorder(0);///quitar el borde la tabla...

            /*tamaño de las celdas */
            float[] ColumnaEncabezado = new float[]{70f, 6f, 120f, 100f};
            Encabezado.setWidths(ColumnaEncabezado);
            Encabezado.setHorizontalAlignment(Element.ALIGN_RIGHT);

            //agregamos celdas....
            Encabezado.addCell(img);

            String ruc = "1550232068001";
            String Nombre = "DADISCOMPU";
            String Telefono = "0963704534";
            String Direccion = "PORTOVIEJO-MANABI-ECUADOR";

            Encabezado.addCell("");//CELDA VACIA......
            Encabezado.addCell("Ruc: " + ruc + "\nEmpresa: " + Nombre + "\nTelefono: " + Telefono + "\nDireccion: " + Direccion);
            Encabezado.addCell(Fecha);
            doc.add(Encabezado);

            /*
           CONTENIDO DEL CUERPO DEL PDF
             */
            Paragraph Cliente = new Paragraph();
            Cliente.add(Chunk.NEWLINE);//nueva lineaaaa
            Cliente.add("DATOS DEL CLIENTE: " + "\n\n");
            doc.add(Cliente);

            //datos del cliente
            PdfPTable tablaCliente = new PdfPTable(4);
            tablaCliente.setWidthPercentage(100);
            tablaCliente.getDefaultCell().setBorder(0);///quitar el borde la tabla...

            //tamaño de las celdas....
            float[] ColumnaCliente = new float[]{30f, 60f, 30f, 30f};
            tablaCliente.setWidths(ColumnaCliente);
            tablaCliente.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell cliente1 = new PdfPCell(new Phrase("C.I/RUC:", negrita));
            PdfPCell cliente2 = new PdfPCell(new Phrase("NOMBRES:", negrita));
            PdfPCell cliente3 = new PdfPCell(new Phrase("TELEFONO:", negrita));
            PdfPCell cliente4 = new PdfPCell(new Phrase("DIRECCION:", negrita));

            //quitamos los bordes....
            cliente1.setBorder(0);
            cliente2.setBorder(0);
            cliente3.setBorder(0);
            cliente4.setBorder(0);

            //agregamos celdas a la tabla....
            tablaCliente.addCell(cliente1);
            tablaCliente.addCell(cliente2);
            tablaCliente.addCell(cliente3);
            tablaCliente.addCell(cliente4);
            tablaCliente.addCell(CedulaCliente);
            tablaCliente.addCell(NombresCliente);
            tablaCliente.addCell(CelularCliente);
            tablaCliente.addCell(DireccionCliente);

            //agregamos al documento
            doc.add(tablaCliente);

            ////espacio en blanco
            Paragraph espacio = new Paragraph();
            espacio.add(Chunk.NEWLINE);
            espacio.add("");
            espacio.setAlignment(Element.ALIGN_CENTER);
            doc.add(espacio);

            ///agregar los productos.......
            PdfPTable TablaProductos = new PdfPTable(6);
            TablaProductos.setWidthPercentage(100);
            TablaProductos.getDefaultCell().setBorder(5);//quitamos los bordes.....

            ///tamaños de las celdas....
            float ColumnaProductos[] = new float[]{45f, 20f, 15f, 20f, 10f, 20f};
            TablaProductos.setWidths(ColumnaProductos);
            TablaProductos.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell Productos1 = new PdfPCell(new Phrase("PRODUCTOS:", negrita));
            PdfPCell Productos2 = new PdfPCell(new Phrase("CANTIDAD:", negrita));
            PdfPCell Productos3 = new PdfPCell(new Phrase("PRECIO U:", negrita));
            PdfPCell Productos4 = new PdfPCell(new Phrase("SUBTOTAL:", negrita));
            PdfPCell Productos5 = new PdfPCell(new Phrase("IVA:", negrita));
            PdfPCell Productos6 = new PdfPCell(new Phrase("TOTAL:", negrita));

            //QUITAMOS LOS BORDES...
            Productos1.setBorder(5);
            Productos2.setBorder(5);
            Productos3.setBorder(5);
            Productos4.setBorder(5);
            Productos5.setBorder(5);
            Productos6.setBorder(5);

            //AGREGAMOS COLOR AL FONDO DE LAS COLUMNAS DE PRODUCTOS.....
            Productos1.setBackgroundColor(BaseColor.GRAY);
            Productos2.setBackgroundColor(BaseColor.GRAY);
            Productos3.setBackgroundColor(BaseColor.GRAY);
            Productos4.setBackgroundColor(BaseColor.GRAY);
            Productos5.setBackgroundColor(BaseColor.GRAY);
            Productos6.setBackgroundColor(BaseColor.GRAY);

            //agregamos las celdas a la tabla...
            TablaProductos.addCell(Productos1);
            TablaProductos.addCell(Productos2);
            TablaProductos.addCell(Productos3);
            TablaProductos.addCell(Productos4);
            TablaProductos.addCell(Productos5);
            TablaProductos.addCell(Productos6);

            for (int i = 0; i < InterFactura.jTable_Nueva_Venta.getRowCount(); i++) {
                String Producto = InterFactura.jTable_Nueva_Venta.getValueAt(i, 1).toString();
                String Cantidad = InterFactura.jTable_Nueva_Venta.getValueAt(i, 2).toString();
                String Precio = InterFactura.jTable_Nueva_Venta.getValueAt(i, 3).toString();
                String Subtotal = InterFactura.jTable_Nueva_Venta.getValueAt(i, 4).toString();
                String Iva = InterFactura.jTable_Nueva_Venta.getValueAt(i, 5).toString();
                String Total = InterFactura.jTable_Nueva_Venta.getValueAt(i, 6).toString();

                TablaProductos.addCell(Producto);
                TablaProductos.addCell(Cantidad);
                TablaProductos.addCell(Precio);
                TablaProductos.addCell(Subtotal);
                TablaProductos.addCell(Iva);
                TablaProductos.addCell(Total);
            }

            //agregamos al documento....
            doc.add(TablaProductos);

            
            //el valor total a pagar....
            Paragraph Info = new Paragraph();
            Info.add(Chunk.NEWLINE);
            Info.add("SUBTOTAL: " + InterFactura.txtSubtotal.getText() + "\n");
            Info.add("IVA: " + InterFactura.txtIva_Venta.getText() + "\n");
            Info.add("TOTAL A PAGAR: " + InterFactura.txtTotal_Pagar_Venta.getText() + "\n\n\n");
            Info.add("EFECTIVO : " + InterFactura.txtEfectivo.getText() + "\n");
            Info.add("CAMBIO : " + InterFactura.txtVuelto_Venta.getText());
            Info.setAlignment(Element.ALIGN_RIGHT);
            doc.add(Info);

            //cancelacion y firma....
            Paragraph Firma = new Paragraph();
            Firma.add(Chunk.NEWLINE);
            Firma.add("                               " + "\n\n");
            Firma.add("                               " + "\n\n");
            Firma.add("                               " + "\n\n");
            Firma.add("CANCELACION Y FIRMA DEL CLIENTE.\n\n");
            Firma.add("_ _ _ _ _ _ _ _ _ _ _ _ _ _");
            Firma.setAlignment(Element.ALIGN_CENTER);
            doc.add(Firma);

            //mensaje de agradecimiento....
            Paragraph mensaje = new Paragraph();
            mensaje.add(Chunk.NEWLINE);
            mensaje.add("*****GRACIAS POR SU COMPRA.*****");
            mensaje.setAlignment(Element.ALIGN_CENTER);
            doc.add(mensaje);

            //CERRAMOS EL DOCUMENTO...
            doc.close();
            archivo.close();

            //abrimos el documento generado automaticamente...
            Desktop.getDesktop().open(file);
        } catch (DocumentException | IOException e) {
            System.out.println("Error en: " + e);
        }

    }

}
