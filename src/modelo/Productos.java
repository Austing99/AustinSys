package modelo;

/**
 *
 * @author yanni
 */
public class Productos {

    //atributos de los productos
    int Id_Productos = 0;
    String Nombre_Productos = "";
    int Cantidad_Productos = 0;
    double Precio_Productos = 0.00;
    String Descripcion = "";
    int ImpuestoIva_Productos = 0;
    int Id_Categorias = 0;

    //constructor
    public Productos() {

        this.Id_Productos = 0;
        this.Nombre_Productos = "";
        this.Cantidad_Productos = 0;
        this.Precio_Productos = 0;
        this.Descripcion = "";
        this.ImpuestoIva_Productos = 0;
        this.Id_Categorias = 0;

    }

    //constructor sobrecargado
    public Productos(int Id_Productos, String Nombre_Producto, int Cantidad_Productos, double Precio_Productos, String Descripcion, int ImpuestoIva_Productos, int Id_Categorias) {
        this.Id_Productos = Id_Productos;
        this.Nombre_Productos = Nombre_Producto;
        this.Cantidad_Productos = Cantidad_Productos;
        this.Precio_Productos = Precio_Productos;
        this.Descripcion = Descripcion;
        this.ImpuestoIva_Productos = ImpuestoIva_Productos;
        this.Id_Categorias = Id_Categorias;

    }

    //metodos getter and setter
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

    public int getCantidad_Productos() {
        return Cantidad_Productos;
    }

    public void setCantidad_Productos(int Cantidad_Productos) {
        this.Cantidad_Productos = Cantidad_Productos;
    }

    public double getPrecio_Productos() {
        return Precio_Productos;
    }

    public void setPrecio_Productos(double Precio_Productos) {
        this.Precio_Productos = Precio_Productos;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getImpuestoIva_Productos() {
        return ImpuestoIva_Productos;
    }

    public void setImpuestoIva_Productos(int ImpuestoIva_Productos) {
        this.ImpuestoIva_Productos = ImpuestoIva_Productos;
    }

    public int getId_Categorias() {
        return Id_Categorias;
    }

    public void setId_Categorias(int Id_Categorias) {
        this.Id_Categorias = Id_Categorias;
    }

}
