package transportSolutionsLogica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsConexion.Conexion;
import transportSolutionsModelo.ClienteRuc;

public class ClienteRucBD {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql = null;

    public boolean registrarClienteRuc(ClienteRuc cr) {

        sql = "INSERT INTO clienteRuc(razonSocial,ruc,direccion,correo,telefono) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, cr.getRazonSocial());
            pst.setString(2, cr.getRuc());
            pst.setString(3, cr.getDireccion());
            pst.setString(4, cr.getCorreo());
            pst.setString(5, cr.getTelefono());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (SQLException e) {
            JOptionPane op = new JOptionPane("Problemas al registrar cliente");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean modificarClienteRuc(ClienteRuc cr) {

        sql = "UPDATE clienteRuc SET razonSocial=?,direccion=?,correo=?,telefono=? WHERE ruc=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, cr.getRazonSocial());
            pst.setString(2, cr.getDireccion());
            pst.setString(3, cr.getCorreo());
            pst.setString(4, cr.getTelefono());
            pst.setString(5, cr.getRuc());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al modificar cliente");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public DefaultTableModel reportarClienteRuc() {

        DefaultTableModel modelo;
        String[] titulos = {"ID", "RAZON SOCIAL", "RUC", "DIRECCION", "CORREO", "TELEFONO"};
        String[] registros = new String[6];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idClienteRuc,razonSocial,ruc,direccion,correo,telefono FROM clienteRuc";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idClienteRuc");
                registros[1] = rs.getString("razonSocial");
                registros[2] = rs.getString("ruc");
                registros[3] = rs.getString("direccion");
                registros[4] = rs.getString("correo");
                registros[5] = rs.getString("telefono");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al reportar cliente");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public boolean eliminarClienteRuc(String ruc) {

        sql = "DELETE FROM clienteRuc WHERE ruc='" + ruc + "'";
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(sql);
            st.close();
            cn.close();
            return true;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al eliminar cliente");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public DefaultTableModel buscarClienteRuc(String ruc) {

        DefaultTableModel modelo;
        String[] titulos = {"ID", "RAZON SOCIAL", "RUC", "DIRECCION", "CORREO", "TELEFONO"};
        String[] registros = new String[6];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idClienteRuc,razonSocial,ruc,direccion,correo,telefono FROM clienteRuc WHERE ruc='" + ruc + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                registros[0] = rs.getString("idClienteRuc");
                registros[1] = rs.getString("razonSocial");
                registros[2] = rs.getString("ruc");
                registros[3] = rs.getString("direccion");
                registros[4] = rs.getString("correo");
                registros[5] = rs.getString("telefono");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al buscar cliente");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public String reportarClienteRuc(String ruc) {

        String registro = null;
        sql = "SELECT idClienteRuc FROM clienteRuc WHERE ruc='" + ruc + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                registro = rs.getString("idClienteRuc");
            }
            return registro;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al buscar cliente");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public String obtenerIdClienteRucRazonSocial(String razonSocial) {

        String id = null;
        sql = "SELECT idClienteRuc FROM clienteRuc WHERE razonSocial='" + razonSocial + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                id = rs.getString("idClienteRuc");
            }
            return id;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al buscar cliente");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public String obtenerIdClienteRuc(String ruc) {

        String id = null;
        sql = "SELECT idClienteRuc FROM clienteRuc WHERE ruc='" + ruc + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                id = rs.getString("idClienteRuc");
            }
            return id;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al buscar cliente");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
