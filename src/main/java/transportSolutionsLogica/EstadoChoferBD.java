package transportSolutionsLogica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsConexion.Conexion;
import transportSolutionsModelo.EstadoChofer;

public class EstadoChoferBD {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql = null;

    public boolean registrarEstadoChofer(EstadoChofer e) {

        sql = "INSERT INTO estadoChofer(estado,idChofer) VALUES(?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, e.getEstado());
            pst.setInt(2, e.getIdChofer());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (SQLException ex) {
            JOptionPane op = new JOptionPane("Error al registrar estado chofer");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean modificarEstadoChofer(EstadoChofer e, int id) {

        sql = "UPDATE estadoChofer SET estado=?,idChofer=? WHERE idEstadoChofer='" + id + "'";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, e.getEstado());
            pst.setInt(2, e.getIdChofer());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (SQLException ex) {
            JOptionPane op = new JOptionPane("Error al modificar estado chofer");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public DefaultTableModel reportarEstadoChofer() {

        DefaultTableModel modelo;
        String[] titulos = {"ID", "ESTADO", "DNI CHOFER", "CHOFER", "TIPO LICENCIA"};
        String[] registros = new String[5];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idEstadoChofer,estado,c.dni,c.nombre,c.tipoLicencia FROM estadoChofer AS e JOIN chofer AS c ON e.idChofer = c.idChofer";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idEstadoChofer");
                registros[1] = rs.getString("estado");
                registros[2] = rs.getString("c.dni");
                registros[3] = rs.getString("c.nombre");
                registros[4] = rs.getString("c.tipoLicencia");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception ex) {
            JOptionPane op = new JOptionPane("Error al reportar estado chofer");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public DefaultTableModel reportarEstadoChoferPendiente() {

        DefaultTableModel modelo;
        String[] titulos = {"ID", "ESTADO", "DNI CHOFER", "CHOFER", "TIPO LICENCIA","LICENCIA"};
        String[] registros = new String[6];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT e.idEstadoChofer,e.estado,c.dni,c.nombres,c.tipoLicencia,c.licencia FROM estadoChofer AS e JOIN chofer AS c ON e.idChofer = c.idChofer WHERE e.estado='PENDIENTE' ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("e.idEstadoChofer");
                registros[1] = rs.getString("e.estado");
                registros[2] = rs.getString("c.dni");
                registros[3] = rs.getString("c.nombres");
                registros[4] = rs.getString("c.tipoLicencia");
                registros[5] = rs.getString("c.licencia");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception ex) {
            JOptionPane op = new JOptionPane("Error al reportar estado chofer");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public String buscareIdEstadoChofer(int id) {

        String registro = null;
        sql = "SELECT idEstadoChofer FROM estadoChofer WHERE idChofer='" + id + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registro = rs.getString("idEstadoChofer");
            }
            return registro;
        } catch (Exception ex) {
            JOptionPane op = new JOptionPane("Error al buscar id estado chofer");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
