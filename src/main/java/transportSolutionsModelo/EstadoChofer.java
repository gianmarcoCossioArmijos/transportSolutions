
package transportSolutionsModelo;

public class EstadoChofer {
    
    private String estado;
    private int idChofer;

    public EstadoChofer() {
    }

    public EstadoChofer(String estado, int idChofer) {
        this.estado = estado;
        this.idChofer = idChofer;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdChofer() {
        return idChofer;
    }

    public void setIdChofer(int idChofer) {
        this.idChofer = idChofer;
    }
}
