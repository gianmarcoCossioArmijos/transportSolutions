
package transportSolutionsLogica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsConexion.Conexion;
import transportSolutionsModelo.Flete;

public class FleteBD {
    
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql = null;
    
    public boolean registrarFlete(Flete f) {

        sql = "INSERT INTO flete(fechaVenta,origen,destino,documentoCliente,cliente,descripcion,estado,correlativo) VALUES(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, f.getFechaVenta());
            pst.setString(2, f.getOrigen());
            pst.setString(3, f.getDestino());
            pst.setString(4, f.getDocumentoCliente());
            pst.setString(5, f.getCliente());
            pst.setString(6, f.getDescripcion());
            pst.setString(7, f.getEstado());
            pst.setString(8, f.getCorrelativo());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (SQLException ex) {
            JOptionPane op = new JOptionPane("Error al registrar flete");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public boolean modificarFlete(Flete f, int id) {

        sql = "UPDATE flete SET fechaVenta=?,origen=?,destino=?,documentoCliente=?,cliente=?,descripcion=?,estado=?,correlativo=?,idVehiculo=?,idChofer=? WHERE idFlete='" + id + "' ";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, f.getFechaVenta());
            pst.setString(2, f.getOrigen());
            pst.setString(3, f.getDestino());
            pst.setString(4, f.getDocumentoCliente());
            pst.setString(5, f.getCliente());
            pst.setString(6, f.getDescripcion());
            pst.setString(7, f.getEstado());
            pst.setString(8, f.getCorrelativo());
            pst.setInt(9, f.getIdVehiculo());
            pst.setInt(10, f.getIdChofer());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (SQLException ex) {
            JOptionPane op = new JOptionPane("Error al modificar flete");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public DefaultTableModel reportarFlete() {

        DefaultTableModel modelo;
        String[] titulos = {"ID","FECHA VENTA","ORIGEN","DESTINO","DOCUMENTO","CLIENTE","DESCRIPCION","ESTADO","CORRELATIVO"};
        String[] registros = new String[9];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idFlete,fechaVenta,origen,destino,documentoCliente,cliente,descripcion,estado,correlativo FROM flete";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idFlete");
                registros[1] = rs.getString("fechaVenta");
                registros[2] = rs.getString("origen");
                registros[3] = rs.getString("destino");
                registros[4] = rs.getString("documentoCliente");
                registros[5] = rs.getString("cliente");
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
            JOptionPane op = new JOptionPane("Error al reportar flete");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public DefaultTableModel reportarFletePendiente() {

        DefaultTableModel modelo;
        String[] titulos = {"ID","FECHA VENTA","ORIGEN","DESTINO","DOCUMENTO","CLIENTE","DESCRIPCION","ESTADO","CORRELATIVO"};
        String[] registros = new String[9];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idFlete,fechaVenta,origen,destino,documentoCliente,cliente,descripcion,estado,correlativo FROM flete WHERE estado='PENDIENTE'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idFlete");
                registros[1] = rs.getString("fechaVenta");
                registros[2] = rs.getString("origen");
                registros[3] = rs.getString("destino");
                registros[4] = rs.getString("documentoCliente");
                registros[5] = rs.getString("cliente");
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
            JOptionPane op = new JOptionPane("Error al reportar flete");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public DefaultTableModel reportarFleteAsignado() {

        DefaultTableModel modelo;
        String[] titulos = {"ID","FECHA VENTA","ORIGEN","DESTINO","DOCUMENTO","CLIENTE","DESCRIPCION","ESTADO","CORRELATIVO","PLACA","DNI"};
        String[] registros = new String[11];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idFlete,fechaVenta,origen,destino,documentoCliente,cliente,descripcion,estado,correlativo,v.placa,c.dni FROM flete AS f JOIN vehiculo AS v ON f.idVehiculo = v.idVehiculo JOIN chofer AS c ON f.idChofer = c.idChofer WHERE f.estado='ASIGNADO'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idFlete");
                registros[1] = rs.getString("fechaVenta");
                registros[2] = rs.getString("origen");
                registros[3] = rs.getString("destino");
                registros[4] = rs.getString("documentoCliente");
                registros[5] = rs.getString("cliente");
                registros[6] = rs.getString("descripcion");
                registros[7] = rs.getString("estado");
                registros[8] = rs.getString("correlativo");
                registros[9] = rs.getString("v.placa");
                registros[10] = rs.getString("c.dni");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception ex) {
            JOptionPane op = new JOptionPane("Error al reportar flete");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public DefaultTableModel reportarFleteLiberado() {

        DefaultTableModel modelo;
        String[] titulos = {"ID","FECHA VENTA","ORIGEN","DESTINO","DOCUMENTO","CLIENTE","DESCRIPCION","ESTADO","CORRELATIVO","PLACA","DNI"};
        String[] registros = new String[11];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idFlete,fechaVenta,origen,destino,documentoCliente,cliente,descripcion,estado,correlativo,v.placa,c.dni FROM flete AS f JOIN vehiculo AS v ON f.idVehiculo = v.idVehiculo JOIN chofer AS c ON f.idChofer = c.idChofer WHERE f.estado='LIBERADO'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idFlete");
                registros[1] = rs.getString("fechaVenta");
                registros[2] = rs.getString("origen");
                registros[3] = rs.getString("destino");
                registros[4] = rs.getString("documentoCliente");
                registros[5] = rs.getString("cliente");
                registros[6] = rs.getString("descripcion");
                registros[7] = rs.getString("estado");
                registros[8] = rs.getString("correlativo");
                registros[9] = rs.getString("v.placa");
                registros[10] = rs.getString("c.dni");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception ex) {
            JOptionPane op = new JOptionPane("Error al reportar flete");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public DefaultTableModel reportarFleteEstadoFecha(String estado, String fecha) {

        DefaultTableModel modelo;
        String[] titulos = {"ID","FECHA VENTA","ORIGEN","DESTINO","DOCUMENTO","CLIENTE","DESCRIPCION","ESTADO","CORRELATIVO"};
        String[] registros = new String[9];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idFlete,fechaVenta,origen,destino,documentoCliente,cliente,descripcion,estado,correlativo FROM flete WHERE estado='" + estado + "' OR fechaVenta='" + fecha + "' ORDER BY idFlete DESC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idFlete");
                registros[1] = rs.getString("fechaVenta");
                registros[2] = rs.getString("origen");
                registros[3] = rs.getString("destino");
                registros[4] = rs.getString("documentoCliente");
                registros[5] = rs.getString("cliente");
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
            JOptionPane op = new JOptionPane("Error al reportar flete");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public boolean eliminarFlete(int id) {

        sql = "DELETE FROM flete WHERE idFlete='" + id + "' ";
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(sql);
            st.close();
            cn.close();
        } catch (Exception ex) {
            JOptionPane op = new JOptionPane("Error al eliminar flete");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}
