
package transportSolutionsModelo;

public class Carga {
    
    private String fechaVenta;
    private String origen;
    private String destino;  
    private String dniDestinatario;
    private String destinatario;
    private String descripcion;
    private String estado;
    private String correlativo;

    public Carga() {
    }

    public Carga(String fechaVenta, String origen, String destino, String dniDestinatario, String destinatario, String descripcion, String estado, String correlativo) {
        this.fechaVenta = fechaVenta;
        this.origen = origen;
        this.destino = destino;
        this.dniDestinatario = dniDestinatario;
        this.destinatario = destinatario;
        this.descripcion = descripcion;
        this.estado = estado;
        this.correlativo = correlativo;
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
}
