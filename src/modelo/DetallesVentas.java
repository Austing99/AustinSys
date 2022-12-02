package modelo;

/**
 *
 * @author yanni
 */
public class DetallesVentas {

    //atributos de clientes
    private int Id_Detalles_Ventas;
    private int Id_Cabeceras_Ventas;
    private int Id_Productos;
    //esta Esta demas......
    private String Nombre_Productos;
    private int Cantidad_Ventas;
    private double Precio_Unitario;
    private double Subtotal;
    private double Descuento;
    private double Iva;
    private double Total_Pagar;
 

      //metodo constructor
    public DetallesVentas() {

        this.Id_Detalles_Ventas = 0;
        this.Id_Cabeceras_Ventas = 0;
        this.Id_Productos = 0;
        this.Nombre_Productos = "";
        this.Cantidad_Ventas = 0;
        this.Precio_Unitario = 0.00;
        this.Subtotal = 0.00;
        this.Descuento = 0.00;
        this.Iva = 0.00;
        this.Total_Pagar = 0.00;
     
    }

     // constructor sobrecargado...
    public DetallesVentas(int Id_Detalles_Ventas, int Id_Cabeceras_Ventas, int Id_Productos, String Nombre_Productos, int Cantidad_Ventas, double Precio_Unitario, double Subtotal, double Descuento, double Iva, double Total_Pagar) {
        this.Id_Detalles_Ventas = Id_Detalles_Ventas;
        this.Id_Cabeceras_Ventas = Id_Cabeceras_Ventas;
        this.Id_Productos = Id_Productos;
        this.Nombre_Productos = Nombre_Productos;
        this.Cantidad_Ventas = Cantidad_Ventas;
        this.Precio_Unitario = Precio_Unitario;
        this.Subtotal = Subtotal;
        this.Descuento = Descuento;
        this.Iva = Iva;
        this.Total_Pagar = Total_Pagar;
       
    }

     //metodos getter and setter...
    public int getId_Detalles_Ventas() {
        return Id_Detalles_Ventas;
    }

    public void setId_Detalles_Ventas(int Id_Detalles_Ventas) {
        this.Id_Detalles_Ventas = Id_Detalles_Ventas;
    }

    public int getId_Cabeceras_Ventas() {
        return Id_Cabeceras_Ventas;
    }

    public void setId__abeceras_Ventas(int Id_Cabeceras_Ventas) {
        this.Id_Cabeceras_Ventas = Id_Cabeceras_Ventas;
    }

    public int getId_Productos() {
        return Id_Productos;
    }

    public void setId_Productos(int Id_Productos) {
        this.Id_Productos = Id_Productos;
    }

    public String getNombre_Productos() {
        return Nombre_Productos;
    }

    public void setNombre_Productos(String Nombre_Productos) {
        this.Nombre_Productos = Nombre_Productos;
    }

    public int getCantidad_Ventas() {
        return Cantidad_Ventas;
    }

    public void setCantidad_Ventas(int Cantidad_Ventas) {
        this.Cantidad_Ventas = Cantidad_Ventas;
    }

    public double getPrecio_Unitario() {
        return Precio_Unitario;
    }

    public void setPrecio_Unitario(double Precio_Unitario) {
        this.Precio_Unitario = Precio_Unitario;
    }

    public double getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(double Subtotal) {
        this.Subtotal = Subtotal;
    }

    public double getDescuento() {
        return Descuento;
    }

    public void setDescuento(double Descuento) {
        this.Descuento = Descuento;
    }

    public double getIva() {
        return Iva;
    }

    public void setIva(double Iva) {
        this.Iva = Iva;
    }

    public double getTotal_Pagar() {
        return Total_Pagar;
    }

    public void setTotal_Pagar(double Total_Pagar) {
        this.Total_Pagar = Total_Pagar;
    }
    
     //metodos to String...
    @Override
    public String toString() {
        return "DetallesVentas{" + "Id_Detalles_Ventas=" + Id_Detalles_Ventas + ", Id_Cabeceras_Ventas=" + Id_Cabeceras_Ventas + ", Id_Productos=" + Id_Productos + ", Nombre_Productos=" + Nombre_Productos + ", Cantidad_Ventas=" + Cantidad_Ventas + ", Precio_Unitario=" + Precio_Unitario + ", Subtotal=" + Subtotal + ", Descuento=" + Descuento + ", Iva=" + Iva + ", Total_Pagar=" + Total_Pagar + '}';
    }

}
