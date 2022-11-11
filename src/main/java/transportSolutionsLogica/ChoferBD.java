package transportSolutionsLogica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsConexion.Conexion;
import transportSolutionsModelo.Chofer;

public class ChoferBD {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql = null;

    public int registrarChofer(Chofer f) {

        int id = 0;
        sql = "INSERT INTO chofer(dni,nombres,telefono,correo,tipoLicencia,licencia) VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, f.getDni());
            pst.setString(2, f.getNombres());
            pst.setString(3, f.getTelefono());
            pst.setString(4, f.getCorreo());
            pst.setString(5, f.getTipoLicencia());
            pst.setString(6, f.getLicencia());

            pst.executeUpdate();
            ResultSet resultado = (ResultSet) pst.getGeneratedKeys();
            if (resultado.next()) {
                id = resultado.getInt(1);
            }
            return id;
        } catch (SQLException e) {
            JOptionPane op = new JOptionPane("Error al registrar chofer");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }

    public boolean modificarChofer(Chofer f, int id) {

        sql = "UPDATE chofer SET dni=?,nombres=?,telefono=?,correo=?,tipoLicencia=?,licencia=? WHERE idChofer='" + id + "' ";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, f.getDni());
            pst.setString(2, f.getNombres());
            pst.setString(3, f.getTelefono());
            pst.setString(4, f.getCorreo());
            pst.setString(5, f.getTipoLicencia());
            pst.setString(6, f.getLicencia());

            pst.executeUpdate();
            pst.close();
            cn.close();
        } catch (SQLException e) {
            JOptionPane op = new JOptionPane("Error al modificar chofer");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public DefaultTableModel reportarChofer() {

        DefaultTableModel modelo;
        String[] titulos = {"ID", "DNI", "NOMBRES", "TELEFONO", "CORREO", "TIPO LICENCIA", "LICENCIA"};
        String[] registros = new String[7];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idChofer,dni,nombres,telefono,correo,tipoLicencia,licencia FROM chofer";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idChofer");
                registros[1] = rs.getString("dni");
                registros[2] = rs.getString("nombres");
                registros[3] = rs.getString("telefono");
                registros[4] = rs.getString("correo");
                registros[5] = rs.getString("tipoLicencia");
                registros[6] = rs.getString("licencia");

                modelo.addRow(registros);
            }
            st.close();
            rs.close();
            cn.close();
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al reportar chofer");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return modelo;
    }
    
    public DefaultTableModel reportarChoferPendiente() {

        DefaultTableModel modelo;
        String[] titulos = {"ID", "DNI", "NOMBRES", "TELEFONO", "CORREO", "TIPO LICENCIA", "LICENCIA"};
        String[] registros = new String[7];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idChofer,dni,nombres,telefono,correo,tipoLicencia,licencia FROM chofer";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idChofer");
                registros[1] = rs.getString("dni");
                registros[2] = rs.getString("nombres");
                registros[3] = rs.getString("telefono");
                registros[4] = rs.getString("correo");
                registros[5] = rs.getString("tipoLicencia");
                registros[6] = rs.getString("licencia");

                modelo.addRow(registros);
            }
            st.close();
            rs.close();
            cn.close();
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al reportar chofer");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return modelo;
    }

    public DefaultTableModel buscarChofer(String dni) {

        DefaultTableModel modelo;
        String[] titulos = {"ID", "DNI", "NOMBRES", "TELEFONO", "CORREO", "TIPO LICENCIA", "LICENCIA"};
        String[] registros = new String[9];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idChofer,dni,nombres,telefono,correo,tipoLicencia,licencia FROM chofer WHERE dni='" + dni + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idChofer");
                registros[1] = rs.getString("dni");
                registros[2] = rs.getString("nombres");
                registros[3] = rs.getString("telefono");
                registros[4] = rs.getString("correo");
                registros[5] = rs.getString("tipoLicencia");
                registros[6] = rs.getString("licencia");

                modelo.addRow(registros);
            }
            st.close();
            rs.close();
            cn.close();
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al reportar chofer");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return modelo;
    }

    public String buscarIdChofer(String dni) {

        String registro = null;
        sql = "SELECT idChofer FROM chofer WHERE dni='" + dni + "' ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registro = rs.getString("idChofer");
            }
            return registro;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al buscar chofer");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public boolean eliminarChofer(int id) {

        sql = "DELETE FROM chofer WHERE idChofer='" + id + "' ";
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(sql);
            st.close();
            cn.close();
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al eliminar chofer");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}
