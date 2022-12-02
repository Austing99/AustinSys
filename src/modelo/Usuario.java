package modelo;

/**
 *
 * @author yanni
 */
public class Usuario {
    //atributos

    private int Id_Usuarios;
    private String Nombres_Usuarios;
    private String Apellido_Usuarios;
    private String Users;
    private String Pass;
    private String Telefono_Users;
    private String Rol;

    //constructores
    public Usuario() {
        this.Id_Usuarios = 0;
        this.Nombres_Usuarios = "";
        this.Apellido_Usuarios = "";
        this.Users = "";
        this.Pass = "";
        this.Telefono_Users = "";
        this.Rol = "";

    }

    //metodos getter and setter
    public int getId_Usuarios() {
        return Id_Usuarios;
    }

    public void setId_Usuarios(int Id_Usuarios) {
        this.Id_Usuarios = Id_Usuarios;
    }

    public String getNombres_Usuarios() {
        return Nombres_Usuarios;
    }

    public void setNombres_Usuarios(String Nombres_Usuarios) {
        this.Nombres_Usuarios = Nombres_Usuarios;
    }

    public String getApellido_Usuarios() {
        return Apellido_Usuarios;
    }

    public void setApellido_Usuarios(String Apellido_Usuarios) {
        this.Apellido_Usuarios = Apellido_Usuarios;
    }

    public String getUsers() {
        return Users;
    }

    public void setUsers(String Users) {
        this.Users = Users;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public String getTelefono_Users() {
        return Telefono_Users;
    }

    public void setTelefono_Users(String Telefono_Users) {
        this.Telefono_Users = Telefono_Users;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }
}
