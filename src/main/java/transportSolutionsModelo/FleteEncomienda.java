
package transportSolutionsModelo;

public class FleteEncomienda {
    
    private String origen;
    private String destino;
    private String fechaSalida;
    private String fechaArribo;
    private String estado;
    private int idChofer;
    private int idVehiculo;

    public FleteEncomienda() {
    }

    public FleteEncomienda(String origen, String destino, String fechaSalida, String fechaArribo, String estado, int idChofer, int idVehiculo) {
        this.origen = origen;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.fechaArribo = fechaArribo;
        this.estado = estado;
        this.idChofer = idChofer;
        this.idVehiculo = idVehiculo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaArribo() {
        return fechaArribo;
    }

    public void setFechaArribo(String fechaArribo) {
        this.fechaArribo = fechaArribo;
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

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }
}
