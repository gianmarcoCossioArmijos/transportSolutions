
package transportSolutionsModelo;

public class EstadoVehiculo {
    
    private String estado;
    private int idVehiculo;

    public EstadoVehiculo() {
    }

    public EstadoVehiculo(String estado, int idVehiculo) {
        this.estado = estado;
        this.idVehiculo = idVehiculo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }
}
