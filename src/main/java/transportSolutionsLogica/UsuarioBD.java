package transportSolutionsLogica;

import transportSolutionsConexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsModelo.Usuario;

public class UsuarioBD {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql = null;

    public boolean registrarUsuario(Usuario u) {

        sql = "INSERT INTO usuario(dni,nombres,contraseña,correo,idTipoUsuario) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, u.getDni());
            pst.setString(2, u.getNombres());
            pst.setString(3, u.getContraseña());
            pst.setString(4, u.getCorreo());
            pst.setInt(5, u.getIdtipoUsuario());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (SQLException e) {
            JOptionPane op = new JOptionPane("Error al registrar usuario");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public String buscarTipoUsuario(String descripcion) {

        sql = "SELECT idTipoUsuario FROM tipoUsuario WHERE descripcion='" + descripcion + "'";
        String tipo = null;
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                tipo = rs.getString("idTipoUsuario");
            }
            return tipo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al buscar tipo de usuario");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public String buscarUsuarioDni(String dni) {

        sql = "SELECT idUsuario FROM usuario WHERE dni='" + dni + "'";
        String id = null;
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                id = rs.getString("idUsuario");
            }
        return id;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al buscar tipo de usuario");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public boolean modificarUsuario(Usuario u) {

        sql = "UPDATE usuario SET nombres=?,contraseña=?,correo=?,idTipoUsuario=? WHERE dni=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            
            pst.setString(1, u.getNombres());
            pst.setString(2, u.getContraseña());
            pst.setString(3, u.getCorreo());
            pst.setInt(4, u.getIdtipoUsuario());
            pst.setString(5, u.getDni());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al modificar usuario");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public DefaultTableModel reportarUsuario() {

        DefaultTableModel modelo;
        String[] titulos = {"ID", "DNI", "NOMBRES", "CORREO", "TIPO USUARIO"};
        String[] registros = new String[5];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idUsuario,dni,nombres,correo,idTipoUsuario FROM usuario";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idUsuario");
                registros[1] = rs.getString("dni");
                registros[2] = rs.getString("nombres");
                registros[3] = rs.getString("correo");
                registros[4] = rs.getString("idTipoUsuario");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al reportar usuarios");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public boolean eliminarUsuario(int dni) {

        sql = "DELETE FROM usuario WHERE dni='" + dni + "' ";
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(sql);
            st.close();
            cn.close();
            return true;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al eliminar usuario");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public DefaultTableModel buscarUsuario(int dni) {
        DefaultTableModel modelo;
        String[] titulos = {"ID", "DNI", "NOMBRES", "CORREO", "TIPO"};
        String[] registros = new String[5];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idUsuario,dni,nombres,correo,descripcion FROM usuario AS u JOIN tipoUsuario AS tu ON u.idTipoUsuario = tu.idTipoUsuario WHERE dni='" + dni + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                registros[0] = rs.getString("idUsuario");
                registros[1] = rs.getString("dni");
                registros[2] = rs.getString("nombres");
                registros[3] = rs.getString("correo");
                registros[4] = rs.getString("descripcion");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al buscar usuario");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public List<Usuario> login(String dni, String contraseña) {

        List<Usuario> lista = new ArrayList<>();
        sql = "SELECT idUsuario,dni,contraseña,idTipoUsuario,nombres FROM usuario WHERE dni='" + dni + "' AND contraseña='" + contraseña + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                Usuario u = new Usuario();
                u.setIdUsuario(rs.getInt(1));
                u.setDni(rs.getString(2));
                u.setContraseña(rs.getString(3));
                u.setIdtipoUsuario(rs.getInt(4));
                u.setNombres(rs.getString(5));

                lista.add(u);
            }
            rs.close();
            st.close();
            cn.close();
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al loggear");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        return lista;
    }
    
    public String obtenerIdUsuario(String dni) {

        String id = null;
        sql = "SELECT idUsuario FROM usuario WHERE dni='" + dni + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                id = rs.getString("idUsuario");
            }
            return id;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al buscar cliente");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public String obtenerIdUsuarioNombres(String nombre) {

        String id = null;
        sql = "SELECT idUsuario FROM usuario WHERE nombres='" + nombre + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                id = rs.getString("idUsuario");
            }
            return id;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al buscar cliente");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
