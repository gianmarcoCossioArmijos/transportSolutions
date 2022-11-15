
package transportSolutionsModelo;

public class Factura extends ClienteRuc {
    
    private double total;
    private String fecha;
    private String correlativo;
    private String estado;
    private String tipo;
    private int idClienteRuc;
    private int idUsuario;
    private int idCaja;
    private int idEstadoCaja;

    public Factura() {
    }

    public Factura(double total, String fecha, String correlativo, String estado, String tipo, int idClienteRuc, int idUsuario, int idCaja, int idEstadoCaja) {
        
        this.idCaja = idCaja;
        this.total = total;
        this.fecha = fecha;
        this.correlativo = correlativo;
        this.estado = estado;
        this.tipo = tipo;
        this.idClienteRuc = idClienteRuc;
        this.idUsuario = idUsuario;
        this.idEstadoCaja = idEstadoCaja;
    }

    public int getIdCaja() {
        return idCaja;
    }

    public void setIdCaja(int idCaja) {
        this.idCaja = idCaja;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(String correlativo) {
        this.correlativo = correlativo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIdClienteRuc() {
        return idClienteRuc;
    }

    public void setIdClienteRuc(int idClienteRuc) {
        this.idClienteRuc = idClienteRuc;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdEstadoCaja() {
        return idEstadoCaja;
    }

    public void setIdEstadoCaja(int idEstadoCaja) {
        this.idEstadoCaja = idEstadoCaja;
    }
}
