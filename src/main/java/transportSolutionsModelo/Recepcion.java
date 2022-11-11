
package transportSolutionsModelo;

public class Recepcion {
    
    private String fechaVenta;
    private String origen;
    private String destino;
    private String descripcion;
    private String estado;
    private String dniDestinatario;
    private String destinatario;
    private String correlativo;

    public Recepcion() {
    }

    public Recepcion(String fechaVenta, String origen, String destino, String descripcion, String estado, String dniDestinatario, String destinatario) {
        this.fechaVenta = fechaVenta;
        this.origen = origen;
        this.destino = destino;
        this.descripcion = descripcion;
        this.estado = estado;
        this.dniDestinatario = dniDestinatario;
        this.destinatario = destinatario;
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

    public String getDniDestinatario() {
        return dniDestinatario;
    }

    public void setDniDestinatario(String dniDestinatario) {
        this.dniDestinatario = dniDestinatario;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(String correlativo) {
        this.correlativo = correlativo;
    }
}
