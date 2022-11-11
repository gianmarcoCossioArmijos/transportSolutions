
package transportSolutionsModelo;

public class EstadoCaja {
    
    private String estado;
    private double montoCajaChica;
    private int idCaja;
    private int idTurno;
    private int idUsuario;

    public EstadoCaja() {
    }

    public EstadoCaja(int idUsuario, String estado, double montoCajaChica, int idCaja) {
        this.idUsuario = idUsuario;
        this.estado = estado;
        this.montoCajaChica = montoCajaChica;
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

    public double getMontoCajaChica() {
        return montoCajaChica;
    }

    public void setMontoCajaChica(double montoCajaChica) {
        this.montoCajaChica = montoCajaChica;
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
