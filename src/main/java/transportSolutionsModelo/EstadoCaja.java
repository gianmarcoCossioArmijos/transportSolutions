
package transportSolutionsModelo;

public class EstadoCaja {
    
    private String estado;
    private double montoApertura;
    private double montoCierre;
    private String fecha;
    private int idCaja;
    private int idTurno;
    private int idUsuario;

    public EstadoCaja() {
    }

    public EstadoCaja(int idUsuario, String estado, double montoApertura, double montoCierre, String fecha, int idCaja) {
        this.idUsuario = idUsuario;
        this.estado = estado;
        this.montoApertura = montoApertura;
        this.montoCierre = montoCierre;
        this.fecha = fecha;
        this.idCaja = idCaja;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getMontoApertura() {
        return montoApertura;
    }

    public void setMontoApertura(double montoApertura) {
        this.montoApertura = montoApertura;
    }

    public double getMontoCierre() {
        return montoCierre;
    }

    public void setMontoCierre(double montoCierre) {
        this.montoCierre = montoCierre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdCaja() {
        return idCaja;
    }

    public void setIdCaja(int idCaja) {
        this.idCaja = idCaja;
    }

    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }
}
