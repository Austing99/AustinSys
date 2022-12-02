package modelo;

/**
 *
 * @author yanni
 */
public class Clientes {

    //atributos de clientes
    private int Id_Clientes = 0;
    private String Cedula_Clientes = "";
    private String Nombres_Clientes = "";
    private String Apellidos_Clientes = "";
    private String Telefono_Clientes = "";
    private String Direccion_Clientes = "";

    //metodo constructor
    public Clientes() {
        this.Id_Clientes = 0;
        this.Cedula_Clientes = "";
        this.Nombres_Clientes = "";
        this.Apellidos_Clientes = "";
        this.Telefono_Clientes = "";
        this.Direccion_Clientes = "";

    }

    // constructor sobrecargado...
    public Clientes(int Id_Clientes, String Cedula_Clientes, String Nombres_Clientes, String Apellidos_Clientes, String Telefono_Clientes, String Direccion_Clientes) {
        this.Id_Clientes = Id_Clientes;
        this.Cedula_Clientes = Cedula_Clientes;
        this.Nombres_Clientes = Nombres_Clientes;
        this.Apellidos_Clientes = Apellidos_Clientes;
        this.Telefono_Clientes = Telefono_Clientes;
        this.Direccion_Clientes = Direccion_Clientes;

    }

    //metodos getter and setter...
    public int getId_Clientes() {
        return Id_Clientes;
    }

    public void setId_Clientes(int Id_Clientes) {
        this.Id_Clientes = Id_Clientes;
    }

    public String getCedula_Clientes() {
        return Cedula_Clientes;
    }

    public void setCedula_Clientes(String Cedula_Clientes) {
        this.Cedula_Clientes = Cedula_Clientes;
    }

    public String getNombres_Clientes() {
        return Nombres_Clientes;
    }

    public void setNombres_Clientes(String Nombres_Clientes) {
        this.Nombres_Clientes = Nombres_Clientes;
    }

    public String getApellidos_Clientes() {
        return Apellidos_Clientes;
    }

    public void setApellidos_Clientes(String Apellidos_Clientes) {
        this.Apellidos_Clientes = Apellidos_Clientes;
    }

    public String getTelefono_Clientes() {
        return Telefono_Clientes;
    }

    public void setTelefono_Clientes(String Telefono_Clientes) {
        this.Telefono_Clientes = Telefono_Clientes;
    }

    public String getDireccion_Clientes() {
        return Direccion_Clientes;
    }

    public void setDireccion_Clientes(String Direccion_Clientes) {
        this.Direccion_Clientes = Direccion_Clientes;
    }

}
