
package transportSolutionsModelo;

public class Flete {
   
    private String fechaVenta;
    private String origen;
    private String destino;
    private String documentoCliente;
    private String cliente;
    private String descripcion;
    private String estado;
    private String correlativo;
    private int idVehiculo;
    private int idChofer;

    public Flete() {
    }

    public Flete(String fechaVenta, String origen, String destino, String documentoCliente, String cliente, String descripcion, String estado, String correlativo, int idVehiculo, int idChofer) {
        this.fechaVenta = fechaVenta;
        this.origen = origen;
        this.destino = destino;
        this.documentoCliente = documentoCliente;
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.estado = estado;
        this.correlativo = correlativo;
        this.idVehiculo = idVehiculo;
        this.idChofer = idChofer;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
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

    public String getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(String documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(String correlativo) {
        this.correlativo = correlativo;
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
