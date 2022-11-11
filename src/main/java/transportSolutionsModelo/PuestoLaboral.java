package transportSolutionsModelo;

public class PuestoLaboral {

    private String descripcion;
    private int idAereaTrabajo;

    public PuestoLaboral() {
    }

    public PuestoLaboral(String descripcion, int idAereaTrabajo) {
        this.descripcion = descripcion;
        this.idAereaTrabajo = idAereaTrabajo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdAereaTrabajo() {
        return idAereaTrabajo;
    }

    public void setIdAereaTrabajo(int idAereaTrabajo) {
        this.idAereaTrabajo = idAereaTrabajo;
    }
}
