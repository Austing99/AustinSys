package modelo;

/**
 *
 * @author yanni
 */
public class CabeceraVentas {

    //atributos de clientes
    private int Id_Cabeceras_Ventas;
    private int Id_Clientes;
    private double Valor_Pagar;
    private String Fecha_Ventas;

    //metodo constructor
    public CabeceraVentas() {

        this.Id_Cabeceras_Ventas = 0;
        this.Id_Clientes = 0;
        this.Valor_Pagar = 0.00;
        this.Fecha_Ventas = "";

    }

    // constructor sobrecargado...
    public CabeceraVentas(int Id_Cabeceras_Ventas, int Id_Clientes, double Valor_Pagar, String Fecha_Ventas) {
        this.Id_Cabeceras_Ventas = Id_Cabeceras_Ventas;
        this.Id_Clientes = Id_Clientes;
        this.Valor_Pagar = Valor_Pagar;
        this.Fecha_Ventas = Fecha_Ventas;
    }

    //metodos getter and setter...
    public int getId_Cabeceras_Ventas() {
        return Id_Cabeceras_Ventas;
    }

    public void setId_Cabeceras_Ventas(int Id_Cabeceras_Ventas) {
        this.Id_Cabeceras_Ventas = Id_Cabeceras_Ventas;
    }

    public int getId_Clientes() {
        return Id_Clientes;
    }

    public void setId_Clientes(int Id_Clientes) {
        this.Id_Clientes = Id_Clientes;
    }

    public double getValor_Pagar() {
        return Valor_Pagar;
    }

    public void setValor_Pagar(double Valor_Pagar) {
        this.Valor_Pagar = Valor_Pagar;
    }

    public String getFecha_Ventas() {
        return Fecha_Ventas;
    }

    public void setFecha_Ventas(String Fecha_Ventas) {
        this.Fecha_Ventas = Fecha_Ventas;
    }

   

    //metodos to String...
    @Override
    public String toString() {
        return "CabeceraVentas{" + "Id_Cabeceras_Ventas=" + Id_Cabeceras_Ventas + ", Id_Clientes=" + Id_Clientes + ", Valor_Pagar=" + Valor_Pagar + ", Fecha_Ventas=" + Fecha_Ventas +  +'}';
    }

}
