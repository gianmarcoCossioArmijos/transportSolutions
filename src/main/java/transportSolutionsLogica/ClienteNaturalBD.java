package transportSolutionsLogica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsConexion.Conexion;
import transportSolutionsModelo.ClienteNatural;

public class ClienteNaturalBD {

    private Conexion mysql = new Conexion();
    private Connection con = mysql.conectar();
    private String sql = null;

    public boolean registrarClienteNatural(ClienteNatural cn) {

        sql = "INSERT INTO clienteNatural(nombres,dni,fechaNacimiento,correo,telefono) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cn.getNombres());
            pst.setInt(2, cn.getDni());
            pst.setString(3, cn.getFechaNacimiento());
            pst.setString(4, cn.getCorreo());
            pst.setString(5, cn.getTelefono());

            pst.executeUpdate();
            pst.close();
            con.close();
            return true;
        } catch (SQLException e) {
            JOptionPane op = new JOptionPane("Problemas al registrar cliente");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean modificarCliente(ClienteNatural cn) {

        sql = "UPDATE clienteNatural SET nombres=?,fechaNacimiento=?,correo=?,telefono=? WHERE dni=?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cn.getNombres());
            pst.setString(2, cn.getFechaNacimiento());
            pst.setString(3, cn.getCorreo());
            pst.setString(4, cn.getTelefono());
            pst.setInt(5, cn.getDni());

            pst.executeUpdate();
            pst.close();
            con.close();
            return true;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al modificar cliente");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public DefaultTableModel reportarClienteNatural() {

        DefaultTableModel modelo;
        String[] titulos = {"ID", "NOMBRES", "DNI", "CORREO", "FECHA NAC", "TELEFONO"};
        String[] registros = new String[6];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idClienteNatural,nombres,dni,correo,fechaNacimiento,telefono FROM clienteNatural";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idClienteNatural");
                registros[1] = rs.getString("nombres");
                registros[2] = rs.getString("dni");
                registros[3] = rs.getString("correo");
                registros[4] = rs.getString("fechaNacimiento");
                registros[5] = rs.getString("telefono");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            con.close();
            return modelo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al reportar cliente");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public boolean eliminarClienteNatural(String dni) {

        sql = "DELETE FROM clienteNatural WHERE dni='" + dni + "'";
        try {
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            con.close();
            return true;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al eliminar cliente");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public DefaultTableModel buscarClienteNatural(String dni) {

        DefaultTableModel modelo;
        String[] titulos = {"ID","NOMBRES","DNI","CORREO","F. NACIMIENTO","TELEFONO"};
        String[] registros = new String[6];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idClienteNatural,nombres,dni,correo,fechaNacimiento,telefono FROM clienteNatural WHERE dni='" + dni + "'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                registros[0] = rs.getString("idClienteNatural");
                registros[1] = rs.getString("nombres");
                registros[2] = rs.getString("dni");
                registros[3] = rs.getString("correo");
                registros[4] = rs.getString("fechaNacimiento");
                registros[5] = rs.getString("telefono");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            con.close();
            return modelo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al buscar cliente");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public String buscarClienteNaturalDNI(String dni) {

        String registro = null;
        sql = "SELECT idClienteNatural FROM clienteNatural WHERE dni='" + dni + "'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                registro = rs.getString("idClienteNatural");
            }
            return registro;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al buscar cliente");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public String obtenerIdClienteNatural(String dni) {

        String id = null;
        sql = "SELECT idClienteNatural FROM clienteNatural WHERE dni='" + dni + "'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                id = rs.getString("idClienteNatural");
            }
            return id;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al buscar cliente");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public String obtenerIdClienteNaturalNombre(String nombre) {

        String id = null;
        sql = "SELECT idClienteNatural FROM clienteNatural WHERE nombres='" + nombre + "'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                id = rs.getString("idClienteNatural");
            }
            return id;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al buscar cliente");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
