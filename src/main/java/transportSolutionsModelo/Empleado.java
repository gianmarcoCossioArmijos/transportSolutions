
package transportSolutionsModelo;

public class Empleado {
    
    private String dni;
    private String nombres;
    private String correo;
    private String telefono;
    private String sistemaPensiones;
    private String entidadBancaria;
    private String cuentaBancaria;
    private double sueldo;
    private int idAreaTrabajo;
    private int idPuestoTrabajo;

    public Empleado() {
    }

    public Empleado(String dni, String nombres, String correo, String telefono,String sistemaPensiones, String entidadBancaria, String cuentaBancaria, double sueldo, int idAreaTrabajo, int idPuestoTrabajo) {
        this.dni = dni;
        this.nombres = nombres;
        this.correo = correo;
        this.telefono = telefono;
        this.sistemaPensiones = sistemaPensiones;
        this.entidadBancaria = entidadBancaria;
        this.cuentaBancaria = cuentaBancaria;
        this.sueldo = sueldo;
        this.idAreaTrabajo = idAreaTrabajo;
        this.idPuestoTrabajo = idPuestoTrabajo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSistemaPensiones() {
        return sistemaPensiones;
    }

    public void setSistemaPensiones(String sistemaPensiones) {
        this.sistemaPensiones = sistemaPensiones;
    }

    public String getEntidadBancaria() {
        return entidadBancaria;
    }

    public void setEntidadBancaria(String entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getIdAreaTrabajo() {
        return idAreaTrabajo;
    }

    public void setIdAreaTrabajo(int idAreaTrabajo) {
        this.idAreaTrabajo = idAreaTrabajo;
    }

    public int getIdPuestoTrabajo() {
        return idPuestoTrabajo;
    }

    public void setIdPuestoTrabajo(int idPuestoTrabajo) {
        this.idPuestoTrabajo = idPuestoTrabajo;
    }
}
