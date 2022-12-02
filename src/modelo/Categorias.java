package modelo;

/**
 *
 * @author yanni
 */
public class Categorias {

    private int Id_Categorias;
    private String Descripcion;

    public Categorias() {
        this.Id_Categorias = 0;
        this.Descripcion = " ";

    }

    public Categorias(int Id_Categorias, String Descripcion) {
        this.Id_Categorias = Id_Categorias;
        this.Descripcion = Descripcion;

    }

    public int getId_Categorias() {
        return Id_Categorias;
    }

    public void setId_Categorias(int Id_Categorias) {
        this.Id_Categorias = Id_Categorias;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

}
