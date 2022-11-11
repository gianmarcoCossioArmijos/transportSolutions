
package transportSolutionsLogica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsConexion.Conexion;
import transportSolutionsModelo.Egreso;

public class EgresoBD {
    
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql = null;
    
    public boolean registrarEgreso(Egreso e) {

        sql = "INSERT INTO egreso(tipo,descripcion,monto,fecha,comprobante,reponsable) VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, e.getTipo());
            pst.setString(2, e.getDescripcion());
            pst.setDouble(3, e.getMonto());
            pst.setString(4, e.getFecha());
            pst.setString(5, e.getComprobante());
            pst.setString(6, e.getResponsable());
            
            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (SQLException ex) {
            JOptionPane op = new JOptionPane("Error al registrar egreso");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public boolean modificarEgreso(Egreso e, int id) {

        sql = "UPDATE egreso SET tipo=?,descripcion=?,monto=?,fecha=?,comprobante=?,reponsable=? WHERE idEgreso='" + id + "' ";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, e.getTipo());
            pst.setString(2, e.getDescripcion());
            pst.setDouble(3, e.getMonto());
            pst.setString(4, e.getFecha());
            pst.setString(5, e.getComprobante());
            pst.setString(6, e.getResponsable());
            
            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (SQLException ex) {
            JOptionPane op = new JOptionPane("Error al modificar egreso");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public DefaultTableModel reportarEgreso() {

        DefaultTableModel modelo;
        String[] titulos = {"ID", "TIPO", "DESCRIPCION", "MONTO", "FECHA","RESPONSABLE","COMPROBANTE"};
        String[] registros = new String[7];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idEgreso,tipo,descripcion,monto,fecha,reponsable,comprobante FROM egreso ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idEgreso");
                registros[1] = rs.getString("tipo");
                registros[2] = rs.getString("descripcion");
                registros[3] = rs.getString("monto");
                registros[4] = rs.getString("fecha");
                registros[5] = rs.getString("reponsable");
                registros[6] = rs.getString("comprobante");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception ex) {
            JOptionPane op = new JOptionPane("Error al reportar egreso");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public DefaultTableModel buscarEgreso(String descripcion) {

        DefaultTableModel modelo;
        String[] titulos = {"ID", "TIPO", "DESCRIPCION", "MONTO", "FECHA","RESPONSABLE","COMPROBANTE"};
        String[] registros = new String[7];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idEgreso,tipo,descripcion,monto,fecha,reponsable,comprobante FROM egreso WHERE descripcion LIKE '%" + descripcion + "%' ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idEgreso");
                registros[1] = rs.getString("tipo");
                registros[2] = rs.getString("descripcion");
                registros[3] = rs.getString("monto");
                registros[4] = rs.getString("fecha");
                registros[5] = rs.getString("reponsable");
                registros[6] = rs.getString("comprobante");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception ex) {
            JOptionPane op = new JOptionPane("Error al buscar egreso");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public DefaultTableModel buscarEgresoID(int id) {

        DefaultTableModel modelo;
        String[] titulos = {"ID","TIPO","DESCRIPCION","MONTO","FECHA","RESPONSABLE","COMPROBANTE"};
        String[] registros = new String[7];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idEgreso,tipo,descripcion,monto,fecha,reponsable,comprobante FROM egreso WHERE idEgreso='" + id + "' ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idEgreso");
                registros[1] = rs.getString("tipo");
                registros[2] = rs.getString("descripcion");
                registros[3] = rs.getString("monto");
                registros[4] = rs.getString("fecha");
                registros[5] = rs.getString("reponsable");
                registros[6] = rs.getString("comprobante");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception ex) {
            JOptionPane op = new JOptionPane("Error al buscar egreso");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public DefaultTableModel buscarEgresoFecha(String fecha) {

        DefaultTableModel modelo;
        String[] titulos = {"ID","TIPO","DESCRIPCION","MONTO","FECHA","RESPONSABLE","COMPROBANTE"};
        String[] registros = new String[7];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idEgreso,tipo,descripcion,monto,fecha,reponsable,comprobante FROM egreso WHERE fecha='" + fecha + "' ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idEgreso");
                registros[1] = rs.getString("tipo");
                registros[2] = rs.getString("descripcion");
                registros[3] = rs.getString("monto");
                registros[4] = rs.getString("fecha");
                registros[5] = rs.getString("reponsable");
                registros[6] = rs.getString("comprobante");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception ex) {
            JOptionPane op = new JOptionPane("Error al buscar egreso");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public boolean eliminarEgreso(int id) {

        sql = "DELETE FROM egreso WHERE idEgreso='" + id + "' ";
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(sql);
            st.close();
            cn.close();
            return true;
        } catch (Exception ex) {
            JOptionPane op = new JOptionPane("Error al eliminar empleado");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
