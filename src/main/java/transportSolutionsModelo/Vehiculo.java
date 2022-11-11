
package transportSolutionsModelo;

public class Vehiculo {
    
    private String marca;
    private String modelo;
    private String tipo;
    private String serieMotor;
    private String placa;
    private String año;
    private String estadoPropiedad;
    private String propietario;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String tipo, String serieMotor, String placa, String año, String estadoPropiedad, String propietario) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.serieMotor = serieMotor;
        this.placa = placa;
        this.año = año;
        this.estadoPropiedad = estadoPropiedad;
        this.propietario = propietario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSerieMotor() {
        return serieMotor;
    }

    public void setSerieMotor(String serieMotor) {
        this.serieMotor = serieMotor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getEstadoPropiedad() {
        return estadoPropiedad;
    }

    public void setEstadoPropiedad(String estadoPropiedad) {
        this.estadoPropiedad = estadoPropiedad;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
}
