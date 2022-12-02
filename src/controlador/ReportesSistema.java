package controlador;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import conexion.Conexion;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author yannick Gonzalez
 */
public class ReportesSistema {

    /**
     * ***************************************************
     * metodo para crear los reportes de los clientes registrados en el
     * sistema......
    ****************************************************
     */
    public void ReportesClientes() {
        Document documento = new Document();
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reportes_Clientes.pdf"));
            Image clientesreport = Image.getInstance("src/images/clientesreport.png");
            clientesreport.scaleToFit(650, 1000);
            clientesreport.setAlignment(Chunk.ALIGN_CENTER);

            //formato de texto.....
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Reporte Generado Por Austin Gonzalez\nDADISCOMPU\n\n");
            parrafo.setFont(FontFactory.getFont("Georgia", 18, Font.BOLD, BaseColor.BLUE));
            parrafo.add("REPORTE DE CLIENTES REGISTRADOS.\n\n");

            documento.open();

            //agregamos los datos..
            documento.add(clientesreport);
            documento.add(parrafo);

            PdfPTable tablacli = new PdfPTable(5);
            tablacli.addCell("Codigo");
            tablacli.addCell("Cedula");
            tablacli.addCell("Nombres");
            tablacli.addCell("Telefono");
            tablacli.addCell("Direccion");

            try {

                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select Id_Clientes,Cedula_Clientes, concat(Nombres_Clientes, ' ', Apellidos_Clientes) as Nombres, Telefono_Clientes ,Direccion_Clientes from clientes_dadis ");
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    do {
                        tablacli.addCell(rs.getString(1));
                        tablacli.addCell(rs.getString(2));
                        tablacli.addCell(rs.getString(3));
                        tablacli.addCell(rs.getString(4));
                        tablacli.addCell(rs.getString(5));
                    } while (rs.next());
                    documento.add(tablacli);
                }
            } catch (SQLException e) {
                System.out.println("Error 1 en.." + e);
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte Creado con Exito");         
        } catch (DocumentException e) {
            System.out.println("Error 2 en......." + e);
        } catch (FileNotFoundException ex) {
            System.out.println("Error 3 en......." + ex);
            //Logger.getLogger(ReportesSistema.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.out.println("Error 4 en......." + ex);
            //Logger.getLogger(ReportesSistema.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     /**
     * ***************************************************
     * metodo para crear los reportes de los productos registrados en el
     * sistema......
    ****************************************************
     */
    public void ReportesProductos() {
        Document documento = new Document();
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream( ruta + "/Desktop/Reportes_Productos.pdf"));
            Image productosreport = Image.getInstance("src/images/tipos-de-computadoras-100000.png");
            productosreport.scaleToFit(650, 1000);
            productosreport.setAlignment(Chunk.ALIGN_CENTER);

            //formato de texto.....
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Reporte Generado Por Austin Gonzalez\nDADISCOMPU\n\n");
            parrafo.setFont(FontFactory.getFont("Georgia", 18, Font.BOLD, BaseColor.BLUE));
            parrafo.add("REPORTE DE PRODUCTOS REGISTRADOS.\n\n");

            documento.open();

            //agregamos los datos..
            documento.add(productosreport);
            documento.add(parrafo);

            float[] columnsWidths = {5, 10, 7, 5, 11, 4, 7,};
                    
            PdfPTable tablapro = new PdfPTable(columnsWidths);
            tablapro.addCell("Codigo");
            tablapro.addCell("Producto");
            tablapro.addCell("Cantidad");
            tablapro.addCell("Precio");
            tablapro.addCell("Descripcion");
            tablapro.addCell("Iva");
            tablapro.addCell("Categoria");

            try {

                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select p.Id_Productos, p.Nombre_Productos, p.Cantidad_Productos, p.Precio_Productos, p.Descripcion, " + " p.ImpuestoIva_Productos, c.Descripcion as categoria " + " from productos_dadis as p, categorias_dadis as c where p.Id_Categorias = c.Id_Categorias;");
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    do {
                        tablapro.addCell(rs.getString(1));
                        tablapro.addCell(rs.getString(2));
                        tablapro.addCell(rs.getString(3));
                        tablapro.addCell(rs.getString(4));
                        tablapro.addCell(rs.getString(5));
                        tablapro.addCell(rs.getString(6));
                        tablapro.addCell(rs.getString(7));
                        
                    } while (rs.next());
                    documento.add(tablapro);
                }
            } catch (SQLException e) {
                System.out.println("Error 5 en.." + e);
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte Creado con Exito");         
        } catch (DocumentException e) {
            System.out.println("Error 6 en......." + e);
        } catch (FileNotFoundException ex) {
            System.out.println("Error 7 en......." + ex);
            //Logger.getLogger(ReportesSistema.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.out.println("Error 8 en......." + ex);
            //Logger.getLogger(ReportesSistema.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     /**
     * ***************************************************
     * metodo para crear los reportes de las categorias registradas en el
     * sistema......
    ****************************************************
     */
     public void ReportesCategorias() {
        Document documento = new Document();
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reportes_Categorias.pdf"));
            Image categoriasreport = Image.getInstance("src/images/imagencategorias.png");
            categoriasreport.scaleToFit(650, 1000);
            categoriasreport.setAlignment(Chunk.ALIGN_CENTER);

            //formato de texto.....
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Reporte Generado Por Austin Gonzalez\nDADISCOMPU\n\n");
            parrafo.setFont(FontFactory.getFont("Georgia", 18, Font.BOLD, BaseColor.BLUE));
            parrafo.add("REPORTE DE CATEGORIAS.\n\n");

            documento.open();

            //agregamos los datos..
            documento.add(categoriasreport);
            documento.add(parrafo);

            PdfPTable tablacate = new PdfPTable(2);
            tablacate.addCell("Codigo");
            tablacate.addCell("Descripcion");
           
            try {

                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select * from categorias_dadis ");
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    do {
                        tablacate.addCell(rs.getString(1));
                        tablacate.addCell(rs.getString(2));
                        
                    } while (rs.next());
                    documento.add(tablacate);
                }
            } catch (SQLException e) {
                System.out.println("Error 9 en.." + e);
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte Creado con Exito");         
        } catch (DocumentException e) {
            System.out.println("Error 10 en......." + e);
        } catch (FileNotFoundException ex) {
            System.out.println("Error 11 en......." + ex);
            //Logger.getLogger(ReportesSistema.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.out.println("Error 12 en......." + ex);
            //Logger.getLogger(ReportesSistema.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        /**
     * ***************************************************
     * metodo para crear los reportes de las ventas hechas en el
     * sistema......
    ****************************************************
     */
    public void ReportesVentas() {
        Document documento = new Document();
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream( ruta + "/Desktop/Reportes_Ventas.pdf"));
            Image ventasreport = Image.getInstance("src/images/reporteventas.png");
            ventasreport.scaleToFit(650, 1000);
           ventasreport.setAlignment(Chunk.ALIGN_CENTER);

            //formato de texto.....
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Reporte Generado Por Austin Gonzalez\nDADISCOMPU\n\n");
            parrafo.setFont(FontFactory.getFont("Georgia", 18, Font.BOLD, BaseColor.BLUE));
            parrafo.add("REPORTE DE VENTAS REALIZADAS.\n\n");

            documento.open();

            //agregamos los datos..
            documento.add(ventasreport);
            documento.add(parrafo);

            float[] columnsWidths = {5, 10, 7, 7};
                    
            PdfPTable tablaventas = new PdfPTable(columnsWidths);
            tablaventas.addCell("Codigo");
            tablaventas.addCell("Cliente");
            tablaventas.addCell("Total a Pagar ");
            tablaventas.addCell("Fecha de Venta");

            try {

                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select cv.Id_Cabeceras_Ventas as Id, concat(c.Nombres_Clientes, ' ', c.Apellidos_Clientes) as clientes, " + "cv.Valor_Pagar as Total, cv.Fecha_Ventas as Fecha " + " from cabeceras_dadis as cv, clientes_dadis as c where cv.Id_Clientes = c.Id_Clientes;");
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    do {
                        tablaventas.addCell(rs.getString(1));
                        tablaventas.addCell(rs.getString(2));
                        tablaventas.addCell(rs.getString(3));
                        tablaventas.addCell(rs.getString(4));
                       
                    } while (rs.next());
                    documento.add(tablaventas);
                }
            } catch (SQLException e) {
                System.out.println("Error 13 en.." + e);
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte Creado con Exito");         
        } catch (DocumentException e) {
            System.out.println("Error 14 en......." + e);
        } catch (FileNotFoundException ex) {
            System.out.println("Error 15 en......." + ex);
            //Logger.getLogger(ReportesSistema.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.out.println("Error 16 en......." + ex);
            //Logger.getLogger(ReportesSistema.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
