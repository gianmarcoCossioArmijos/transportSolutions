
package transportSolutionsLogica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsConexion.Conexion;
import transportSolutionsModelo.Carga;

public class CargaBD {
    
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql = null;
    
    public boolean registrarCarga(Carga c) {

        sql = "INSERT INTO carga(fechaVenta,origen,destino,dniDestinatario,destinatario,descripcion,estado,correlativo) VALUES(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, c.getFechaVenta());
            pst.setString(2, c.getOrigen());
            pst.setString(3, c.getDestino());
            pst.setString(4, c.getDniDestinatario());
            pst.setString(5, c.getDestinatario());
            pst.setString(6, c.getDescripcion());
            pst.setString(7, c.getEstado());
            pst.setString(8, c.getCorrelativo());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (SQLException ex) {
            JOptionPane op = new JOptionPane("Error al registrar carga");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public boolean modificarCarga(Carga c, int id) {

        sql = "UPDATE carga SET fechaVenta=?,origen=?,destino=?,dniDestinatario=?,destinatario=?,descripcion=?,estado=?,correlativo=? WHERE idCarga='" + id + "' ";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, c.getFechaVenta());
            pst.setString(2, c.getOrigen());
            pst.setString(3, c.getDestino());
            pst.setString(4, c.getDniDestinatario());
            pst.setString(5, c.getDestinatario());
            pst.setString(6, c.getDescripcion());
            pst.setString(7, c.getEstado());
            pst.setString(8, c.getCorrelativo());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (SQLException ex) {
            JOptionPane op = new JOptionPane("Error al modificar carga");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public DefaultTableModel reportarCarga() {

        DefaultTableModel modelo;
        String[] titulos = {"ID","FECHA VENTA","ORIGEN","DESTINO","DNI","DESTINATARIO","DESCRIPCION","ESTADO","CORRELATIVO"};
        String[] registros = new String[9];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idCarga,fechaVenta,origen,destino,dniDestinatario,destinatario,descripcion,estado,correlativo FROM carga ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idCarga");
                registros[1] = rs.getString("fechaVenta");
                registros[2] = rs.getString("origen");
                registros[3] = rs.getString("destino");
                registros[4] = rs.getString("dniDestinatario");
                registros[5] = rs.getString("destinatario");
                registros[6] = rs.getString("descripcion");
                registros[7] = rs.getString("estado");
                registros[8] = rs.getString("correlativo");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception ex) {
            JOptionPane op = new JOptionPane("Error al reportar carga");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public DefaultTableModel reportarCargaFecha(String fecha) {

        DefaultTableModel modelo;
        String[] titulos = {"ID","FECHA VENTA","ORIGEN","DESTINO","DNI","DESTINATARIO","DESCRIPCION","ESTADO","CORRELATIVO"};
        String[] registros = new String[9];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idCarga,fechaVenta,origen,destino,dniDestinatario,destinatario,descripcion,estado,correlativo FROM carga WHERE estado='PENDIENTE' AND fechaVenta='" + fecha + "' ORDER BY idCarga DESC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idCarga");
                registros[1] = rs.getString("fechaVenta");
                registros[2] = rs.getString("origen");
                registros[3] = rs.getString("destino");
                registros[4] = rs.getString("dniDestinatario");
                registros[5] = rs.getString("destinatario");
                registros[6] = rs.getString("descripcion");
                registros[7] = rs.getString("estado");
                registros[8] = rs.getString("correlativo");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception ex) {
            JOptionPane op = new JOptionPane("Error al reportar carga");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public DefaultTableModel reportarCargaFechaEstado(String fecha, String estado) {

        DefaultTableModel modelo;
        String[] titulos = {"ID","FECHA VENTA","ORIGEN","DESTINO","DNI","DESTINATARIO","DESCRIPCION","ESTADO","CORRELATIVO"};
        String[] registros = new String[9];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idCarga,fechaVenta,origen,destino,dniDestinatario,destinatario,descripcion,estado,correlativo FROM carga WHERE fechaVenta='" + fecha + "' OR estado='" + estado + "' ORDER BY idCarga DESC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idCarga");
                registros[1] = rs.getString("fechaVenta");
                registros[2] = rs.getString("origen");
                registros[3] = rs.getString("destino");
                registros[4] = rs.getString("dniDestinatario");
                registros[5] = rs.getString("destinatario");
                registros[6] = rs.getString("descripcion");
                registros[7] = rs.getString("estado");
                registros[8] = rs.getString("correlativo");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception ex) {
            JOptionPane op = new JOptionPane("Error al reportar carga");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public DefaultTableModel reportarCargaPendiente() {

        DefaultTableModel modelo;
        String[] titulos = {"ID","FECHA VENTA","ORIGEN","DESTINO","DNI","DESTINATARIO","DESCRIPCION","ESTADO","CORRELATIVO"};
        String[] registros = new String[9];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idCarga,fechaVenta,origen,destino,dniDestinatario,destinatario,descripcion,estado,correlativo FROM carga WHERE estado='PENDIENTE'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idCarga");
                registros[1] = rs.getString("fechaVenta");
                registros[2] = rs.getString("origen");
                registros[3] = rs.getString("destino");
                registros[4] = rs.getString("dniDestinatario");
                registros[5] = rs.getString("destinatario");
                registros[6] = rs.getString("descripcion");
                registros[7] = rs.getString("estado");
                registros[8] = rs.getString("correlativo");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception ex) {
            JOptionPane op = new JOptionPane("Error al reportar carga");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public String BuscarIdCarga(int id) {

        String registro = null;
        sql = "SELECT estado FROM carga WHERE idCarga='" + id + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                registro = rs.getString("estado");
            }
            return registro;
        } catch (Exception ex) {
            JOptionPane op = new JOptionPane("Error al buscar id carga");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public boolean eliminarCarga(int id) {

        sql = "DELETE FROM carga WHERE idCarga='" + id + "' ";
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(sql);
            st.close();
            cn.close();
        } catch (Exception ex) {
            JOptionPane op = new JOptionPane("Error al eliminar carga");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}
