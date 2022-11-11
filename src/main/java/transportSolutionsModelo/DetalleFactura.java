
package transportSolutionsModelo;

public class DetalleFactura {
    
    private String origen;
    private String destino;
    private String tipoCarga;
    private String descripcion;
    private double precio;
    private int idFactura;

    public DetalleFactura() {
    }

    public DetalleFactura(String origen, String destino, String tipoCarga, String descripcion, double precio, int idFactura) {
        this.origen = origen;
        this.destino = destino;
        this.tipoCarga = tipoCarga;
        this.descripcion = descripcion;
        this.precio = precio;
        this.idFactura = idFactura;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
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

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
