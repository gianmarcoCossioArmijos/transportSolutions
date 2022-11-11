package transportSolutionsLogica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsConexion.Conexion;
import transportSolutionsModelo.Recepcion;

public class RecepcionBD {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql = null;

    public boolean registrarRecepcion(Recepcion r) {

        sql = "INSERT INTO recepcion(fechaVenta,origen,destino,descripcion,estado,dniDestinatario,destinatario,correlativo) VALUES(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, r.getFechaVenta());
            pst.setString(2, r.getOrigen());
            pst.setString(3, r.getDestino());
            pst.setString(4, r.getDescripcion());
            pst.setString(5, r.getEstado());
            pst.setString(6, r.getDniDestinatario());
            pst.setString(7, r.getDestinatario());
            pst.setString(8, r.getCorrelativo());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (SQLException ex) {
            JOptionPane op = new JOptionPane("Error al registrar recepcion");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public boolean modificarRecepcion(Recepcion r, int id) {

        sql = "UPDATE recepcion SET fechaVenta=?,origen=?,destino=?,descripcion=?,estado=?,dniDestinatario=?,destinatario=?,correlativo=? WHERE idRecepcion='" + id + "' ";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, r.getFechaVenta());
            pst.setString(2, r.getOrigen());
            pst.setString(3, r.getDestino());
            pst.setString(4, r.getDescripcion());
            pst.setString(5, r.getEstado());
            pst.setString(6, r.getDniDestinatario());
            pst.setString(7, r.getDestinatario());
            pst.setString(8, r.getCorrelativo());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (SQLException ex) {
            JOptionPane op = new JOptionPane("Error al modificar recepcion");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public DefaultTableModel reportarRecepcion() {

        DefaultTableModel modelo;
        String[] titulos = {"ID","FECHA VENTA","ORIGEN","DESTINO","DESCRIPCION","ESTADO","DNI DESTINATARIO","DESTINATARIO","CORRELATIVO"};
        String[] registros = new String[9];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idRecepcion,fechaVenta,origen,destino,descripcion,estado,dniDestinatario,destinatario,correlativo FROM recepcion ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idRecepcion");
                registros[1] = rs.getString("fechaVenta");
                registros[2] = rs.getString("origen");
                registros[3] = rs.getString("destino");
                registros[4] = rs.getString("descripcion");
                registros[5] = rs.getString("estado");
                registros[6] = rs.getString("dniDestinatario");
                registros[7] = rs.getString("destinatario");
                registros[8] = rs.getString("correlativo");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception ex) {
            JOptionPane op = new JOptionPane("Error al reportar recepcion");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public DefaultTableModel reportarRecepcionFecha(String fecha) {

        DefaultTableModel modelo;
        String[] titulos = {"ID","FECHA VENTA","ORIGEN","DESTINO","DESCRIPCION","ESTADO","DNI DESTINATARIO","DESTINATARIO","CORRELATIVO"};
        String[] registros = new String[9];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idRecepcion,fechaVenta,origen,destino,descripcion,estado,dniDestinatario,destinatario,correlativo FROM recepcion WHERE estado='PENDIENTE' AND fechaVenta='" + fecha + "' ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idRecepcion");
                registros[1] = rs.getString("fechaVenta");
                registros[2] = rs.getString("origen");
                registros[3] = rs.getString("destino");
                registros[4] = rs.getString("descripcion");
                registros[5] = rs.getString("estado");
                registros[6] = rs.getString("dniDestinatario");
                registros[7] = rs.getString("destinatario");
                registros[8] = rs.getString("correlativo");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception ex) {
            JOptionPane op = new JOptionPane("Error al reportar recepcion");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public DefaultTableModel reportarRecepcionFechaEstado(String fecha, String estado) {

        DefaultTableModel modelo;
        String[] titulos = {"ID","FECHA VENTA","ORIGEN","DESTINO","DESCRIPCION","ESTADO","DNI DESTINATARIO","DESTINATARIO","CORRELATIVO"};
        String[] registros = new String[9];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idRecepcion,fechaVenta,origen,destino,descripcion,estado,dniDestinatario,destinatario,correlativo FROM recepcion WHERE fechaVenta='" + fecha + "' OR estado='" + estado + "' ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idRecepcion");
                registros[1] = rs.getString("fechaVenta");
                registros[2] = rs.getString("origen");
                registros[3] = rs.getString("destino");
                registros[4] = rs.getString("descripcion");
                registros[5] = rs.getString("estado");
                registros[6] = rs.getString("dniDestinatario");
                registros[7] = rs.getString("destinatario");
                registros[8] = rs.getString("correlativo");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception ex) {
            JOptionPane op = new JOptionPane("Error al reportar recepcion");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public boolean eliminarRecepcion(int id) {

        sql = "DELETE FROM recepcion WHERE idRecepcion='" + id + "' ";
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(sql);
            st.close();
            cn.close();
        } catch (Exception ex) {
            JOptionPane op = new JOptionPane("Error al eliminar recepcion");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}
