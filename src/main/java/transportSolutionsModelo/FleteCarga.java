
package transportSolutionsModelo;

public class FleteCarga {
    
    private String origen;
    private String destino;
    private String fechaSalida;
    private String fechaArribo;
    private String estado;
    private int idVehiculo;
    private int idChofer;

    public FleteCarga() {
    }

    public FleteCarga(String origen, String destino, String fechaSalida, String fechaArribo, String estado, int idVehiculo, int idChofer) {
        this.origen = origen;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.fechaArribo = fechaArribo;
        this.estado = estado;
        this.idVehiculo = idVehiculo;
        this.idChofer = idChofer;
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

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public int getIdChofer() {
        return idChofer;
    }

    public void setIdChofer(int idChofer) {
        this.idChofer = idChofer;
    }

    
}
