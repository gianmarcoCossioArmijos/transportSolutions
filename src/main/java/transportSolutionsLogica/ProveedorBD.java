package transportSolutionsLogica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsConexion.Conexion;
import transportSolutionsModelo.Proveedor;

public class ProveedorBD {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql = null;

    public boolean registrarProveedor(Proveedor p) {

        sql = "INSERT INTO proveedor(razonSocial,ruc,direccion,telefono,correo) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, p.getRazonSocial());
            pst.setString(2, p.getRuc());
            pst.setString(3, p.getDireccion());
            pst.setString(4, p.getTelefono());
            pst.setString(5, p.getCorreo());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (SQLException ex) {
            JOptionPane op = new JOptionPane("Error al registrar proveedor");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean modificarProveedor(Proveedor p, int id) {

        sql = "UPDATE proveedor SET razonSocial=?,ruc=?,direccion=?,telefono=?,correo=? WHERE idProveedor='" + id + "' ";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, p.getRazonSocial());
            pst.setString(2, p.getRuc());
            pst.setString(3, p.getDireccion());
            pst.setString(4, p.getTelefono());
            pst.setString(5, p.getCorreo());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (SQLException ex) {
            JOptionPane op = new JOptionPane("Error al modificar proveedor");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public DefaultTableModel reportarProveedor() {

        DefaultTableModel modelo;
        String[] titulos = {"ID", "RAZON SOCIAL", "RUC", "DIRECCION", "TELEFONO", "CORREO"};
        String[] registros = new String[6];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idProveedor,razonSocial,ruc,direccion,telefono,correo FROM proveedor ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idProveedor");
                registros[1] = rs.getString("razonSocial");
                registros[2] = rs.getString("ruc");
                registros[3] = rs.getString("direccion");
                registros[4] = rs.getString("telefono");
                registros[5] = rs.getString("correo");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception ex) {
            JOptionPane op = new JOptionPane("Error al reportar proveedor");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public DefaultTableModel buscarProveedor(String ruc) {

        DefaultTableModel modelo;
        String[] titulos = {"ID", "RAZON SOCIAL", "RUC", "DIRECCION", "TELEFONO", "CORREO"};
        String[] registros = new String[6];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idProveedor,razonSocial,ruc,direccion,telefono,correo FROM proveedor WHERE ruc='" + ruc + "' ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idProveedor");
                registros[1] = rs.getString("razonSocial");
                registros[2] = rs.getString("ruc");
                registros[3] = rs.getString("direccion");
                registros[4] = rs.getString("telefono");
                registros[5] = rs.getString("correo");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception ex) {
            JOptionPane op = new JOptionPane("Error al buscar proveedor");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public String buscarIdProveedor(String ruc) {

        String registro = null;
        sql = "SELECT idProveedor FROM proveedor WHERE ruc='" + ruc + "' ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registro = rs.getString("idProveedor");
            }
            return registro;
        } catch (Exception ex) {
            JOptionPane op = new JOptionPane("Error al buscar id proveedor");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public String buscarIdProveedorDescripcion(String razonSocial) {

        String registro = null;
        sql = "SELECT idProveedor FROM proveedor WHERE razonSocial='" + razonSocial + "' ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registro = rs.getString("idProveedor");
            }
            return registro;
        } catch (Exception ex) {
            JOptionPane op = new JOptionPane("Error al buscar id proveedor");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public boolean eliminarProveedor(int id) {

        sql = "DELETE FROM proveedor WHERE idProveedor='" + id + "' ";
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(sql);
            st.close();
            cn.close();
        } catch (Exception ex) {
            JOptionPane op = new JOptionPane("Error al eliminar proveedor");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}
