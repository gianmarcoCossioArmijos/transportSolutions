package transportSolutionsLogica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsConexion.Conexion;
import transportSolutionsModelo.Caja;

public class CajaBD {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql = null;

    public boolean registrarCaja(Caja c) {

        sql = "INSERT INTO caja(descripcion) VALUES(?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, c.getDescripcion());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al registrar caja");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean modificarCaja(Caja c, int id) {

        sql = "UPDATE caja SET descripcion=? WHERE idCaja='" + id + "' ";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, c.getDescripcion());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al modificar caja");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public DefaultTableModel reportarCaja() {

        DefaultTableModel modelo;
        String[] titulos = {"ID", "DESCRIPCION"};
        String[] registros = new String[2];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idCaja,descripcion FROM caja";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idCaja");
                registros[1] = rs.getString("descripcion");

                modelo.addRow(registros);
            }
            st.close();
            rs.close();
            cn.close();
            return modelo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al reportar caja");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public DefaultTableModel buscarCaja(int id) {

        DefaultTableModel modelo;
        String[] titulos = {"ID", "DESCRIPCION"};
        String[] registros = new String[2];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idCaja,descripcion FROM caja WHERE idCaja='" + id + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idCaja");
                registros[1] = rs.getString("descripcion");

                modelo.addRow(registros);
            }
            st.close();
            rs.close();
            cn.close();
            return modelo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al reportar caja");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public String buscarIdCaja(String descripcion) {

        String registro = null;
        sql = "SELECT idCaja FROM caja WHERE descripcion='" + descripcion + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                registro = rs.getString("idCaja");
            }
            return registro;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al buscar caja");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public String buscarNombreCaja(int id) {

        String registro = null;
        sql = "SELECT descripcion FROM caja WHERE idCaja='" + id + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                registro = rs.getString("descripcion");
            }
            return registro;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al buscar caja");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public boolean eliminarCaja(int id) {

        sql = "DELETE FROM caja WHERE idCaja='" + id + "' ";
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(sql);
            st.close();
            cn.close();
            return true;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al eliminar caja");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
