
package transportSolutionsModelo;

public class Usuario {
    
    private int idUsuario;
    private String dni;
    private String nombres;
    private String contraseña;
    private String correo;
    private int idtipoUsuario;

    public Usuario() {
    }

    public Usuario(int idUsuario, String dni, String nombres, String contraseña, String correo, int idtipoUsuario) {
        this.idUsuario = idUsuario;
        this.dni = dni;
        this.nombres = nombres;
        this.contraseña = contraseña;
        this.correo = correo;
        this.idtipoUsuario = idtipoUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getIdtipoUsuario() {
        return idtipoUsuario;
    }

    public void setIdtipoUsuario(int idtipoUsuario) {
        this.idtipoUsuario = idtipoUsuario;
    }

    
}
