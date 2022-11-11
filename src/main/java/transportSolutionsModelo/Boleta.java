
package transportSolutionsModelo;

public class Boleta {
    private double total;
    private String fecha;
    private String correlativo;
    private String estado;
    private String tipo;
    private int idClienteNatural;
    private int idUsuario;
    private int idCaja;

    public Boleta() {
    }

    public Boleta(double total, String fecha, String correlativo, String estado, String tipo, int idClienteNatural, int idUsuario, int idCaja) {

        this.total = total;
        this.fecha = fecha;
        this.correlativo = correlativo;
        this.estado = estado;
        this.tipo = tipo;
        this.idClienteNatural = idClienteNatural;
        this.idUsuario = idUsuario;
        this.idCaja = idCaja;
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

    public int getIdClienteNatural() {
        return idClienteNatural;
    }

    public void setIdClienteNatural(int idClienteNatural) {
        this.idClienteNatural = idClienteNatural;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}
