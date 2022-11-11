package transportSolutionsModelo;

public class DetalleBoleta {

    private String origen;
    private String destino;
    private String tipoCarga;
    private String descripcion;
    private double precio;
    private int idBoleta;

    public DetalleBoleta() {
    }

    public DetalleBoleta(String origen, String destino, String tipoCarga, String descripcion, double precio, int idBoleta) {
        this.origen = origen;
        this.destino = destino;
        this.tipoCarga = tipoCarga;
        this.descripcion = descripcion;
        this.precio = precio;
        this.idBoleta = idBoleta;
    }

    public int getIdBoleta() {
        return idBoleta;
    }

    public void setIdBoleta(int idBoleta) {
        this.idBoleta = idBoleta;
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
