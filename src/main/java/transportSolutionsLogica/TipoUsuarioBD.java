package transportSolutionsLogica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsConexion.Conexion;
import transportSolutionsModelo.TipoUsuario;

public class TipoUsuarioBD {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql = null;

    public boolean registrarTipoUsuario(TipoUsuario t) {

        sql = "INSERT INTO tipoUsuario(descripcion) VALUES(?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, t.getDescripcion());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al registrar tipo de usuario");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean modificarTipoUsuario(TipoUsuario t, int id) {

        sql = "UPDATE tipoUsuario SET descripcion=? WHERE idTipoUsuario='" + id + "' ";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, t.getDescripcion());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al modificar tipo de usuario");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public DefaultTableModel reportarTipoUsuario() {

        DefaultTableModel modelo;
        String[] titulos = {"ID", "DESCRIPCION"};
        String[] registros = new String[2];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idTipoUsuario,descripcion FROM tipoUsuario";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idTipoUsuario");
                registros[1] = rs.getString("descripcion");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al reportar tipo de usuario");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public String buscarTipoUsuarioNombre(int id) {

        sql = "SELECT descripcion FROM tipoUsuario WHERE idTipoUsuario='" + id + "'";
        String tipo = null;
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                tipo = rs.getString("descripcion");
            }
            
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al buscar tipo de usuario");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return tipo;
    }

    public String buscarTipoUsuario(String descripcion) {

        String registro = null;
        sql = "SELECT idTipoUsuario FROM tipoUsuario WHERE descripcion='" + descripcion + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registro = rs.getString("idTipoUsuario");
            }
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al buscar tipo de usuario");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return registro;
    }

    public boolean eliminarTipoUsuario(int id) {

        sql = "DELETE FROM tipoUsuario WHERE idTipoUsuario='" + id + "' ";
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(sql);
            st.close();
            cn.close();
            return true;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al eliminar tipo de usuario");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
