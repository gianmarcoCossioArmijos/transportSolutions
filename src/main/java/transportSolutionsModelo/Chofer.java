
package transportSolutionsModelo;

public class Chofer {
    
    private String nombres;
    private String dni;
    private String telefono;
    private String correo;
    private String tipoLicencia;
    private String licencia;

    public Chofer() {
    }

    public Chofer(String nombres, String dni, String telefono, String correo, String tipoLicencia, String licencia) {
        this.nombres = nombres;
        this.dni = dni;
        this.telefono = telefono;
        this.correo = correo;
        this.tipoLicencia = tipoLicencia;
        this.licencia = licencia;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }
}
