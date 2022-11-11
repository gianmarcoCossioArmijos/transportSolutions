
package transportSolutionsLogica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsConexion.Conexion;
import transportSolutionsModelo.FleteEncomienda;

public class FleteEncomiendaBD {
    
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql = null;
    
    public boolean registrarFleteEncomienda(FleteEncomienda f) {

        sql = "INSERT INTO fleteEncomienda(origen,destino,fechaSalida,estado,idVehiculo,idChofer) VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, f.getOrigen());
            pst.setString(2, f.getDestino());
            pst.setString(3, f.getFechaSalida());
            pst.setString(4, f.getEstado());
            pst.setInt(5, f.getIdVehiculo());
            pst.setInt(6, f.getIdChofer());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (SQLException e) {
            JOptionPane op = new JOptionPane("Error al registrar flete de encomienda");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public boolean modificarFleteEncomienda(FleteEncomienda f, int id) {

        sql = "UPDATE fleteEncomienda SET origen=?,destino=?,fechaSalida=?,estado=?,idVehiculo=?,idChofer=? WHERE idFleteEncomienda='" + id + "'";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, f.getOrigen());
            pst.setString(2, f.getDestino());
            pst.setString(3, f.getFechaSalida());
            pst.setString(4, f.getEstado());
            pst.setInt(5, f.getIdVehiculo());
            pst.setInt(6, f.getIdChofer());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (SQLException e) {
            JOptionPane op = new JOptionPane("Error al modificar flete de encomienda");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public boolean liberarFleteEncomienda(FleteEncomienda f, int id) {

        sql = "UPDATE fleteEncomienda SET origen=?,destino=?,fechaSalida=?,fechaArribo=?,estado=?,idVehiculo=?,idChofer=? WHERE idFleteEncomienda='" + id + "'";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, f.getOrigen());
            pst.setString(2, f.getDestino());
            pst.setString(3, f.getFechaSalida());
            pst.setString(4, f.getFechaArribo());
            pst.setString(5, f.getEstado());
            pst.setInt(6, f.getIdVehiculo());
            pst.setInt(7, f.getIdChofer());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (SQLException e) {
            JOptionPane op = new JOptionPane("Error al modificar flete de encomienda");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public DefaultTableModel reportarFleteEncomiendaAsignado() {

        DefaultTableModel modelo;
        String[] titulos = {"ID","ORIGEN","DESTINO","FECHA SALIDA","ESTADO","PLACA VEHICULO","DNI CHOFER","CHOFER"};
        String[] registros = new String[8];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idFleteEncomienda,origen,destino,fechaSalida,estado,v.placa,ch.dni,ch.nombres FROM fleteEncomienda AS fe JOIN vehiculo AS v ON fe.idVehiculo = v.idVehiculo JOIN chofer AS ch ON fe.idChofer = ch.idChofer WHERE estado='ASIGNADO'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idFleteEncomienda");
                registros[1] = rs.getString("origen");
                registros[2] = rs.getString("destino");
                registros[3] = rs.getString("fechaSalida");
                registros[4] = rs.getString("estado");
                registros[5] = rs.getString("v.placa");
                registros[6] = rs.getString("ch.dni");
                registros[7] = rs.getString("ch.nombres");

                modelo.addRow(registros);
            }
            st.close();
            rs.close();
            cn.close();
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al reportar flete de encomienda");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return modelo;
    }
    
    public DefaultTableModel reportarFleteEncomiendaLiberado() {

        DefaultTableModel modelo;
        String[] titulos = {"ID","ORIGEN","DESTINO","FECHA SALIDA","FECHA ARRIBO","ESTADO","PLACA VEHICULO","DNI CHOFER","CHOFER"};
        String[] registros = new String[9];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idFleteEncomienda,origen,destino,fechaSalida,fechaArribo,estado,v.placa,ch.dni,ch.nombres FROM fleteEncomienda AS fe JOIN vehiculo AS v ON fe.idVehiculo = v.idVehiculo JOIN chofer AS ch ON fe.idChofer = ch.idChofer WHERE estado='LIBERADO'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idFleteEncomienda");
                registros[1] = rs.getString("origen");
                registros[2] = rs.getString("destino");
                registros[3] = rs.getString("fechaSalida");
                registros[4] = rs.getString("fechaArribo");
                registros[5] = rs.getString("estado");
                registros[6] = rs.getString("v.placa");
                registros[7] = rs.getString("ch.dni");
                registros[8] = rs.getString("ch.nombres");

                modelo.addRow(registros);
            }
            st.close();
            rs.close();
            cn.close();
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al reportar flete de encomienda");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return modelo;
    }
    
    public DefaultTableModel reportarFleteEncomiendaEstadoFecha(String estado, String fechaArribo) {

        DefaultTableModel modelo;
        String[] titulos = {"ID","ORIGEN","DESTINO","FECHA SALIDA","FECHA ARRIBO","ESTADO","PLACA VEHICULO","DNI CHOFER","CHOFER"};
        String[] registros = new String[9];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT fe.idFleteEncomienda,fe.origen,fe.destino,fe.fechaSalida,fe.fechaArribo,fe.estado,v.placa,ch.dni,ch.nombres FROM fleteEncomienda AS fe JOIN vehiculo AS v ON fe.idVehiculo = v.idVehiculo JOIN chofer AS ch ON fe.idChofer = ch.idChofer WHERE fe.estado='" + estado + "' OR fe.fechaArribo='" + fechaArribo + "' ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("fe.idFleteEncomienda");
                registros[1] = rs.getString("fe.origen");
                registros[2] = rs.getString("fe.destino");
                registros[3] = rs.getString("fe.fechaSalida");
                registros[4] = rs.getString("fe.fechaArribo");
                registros[5] = rs.getString("fe.estado");
                registros[6] = rs.getString("v.placa");
                registros[7] = rs.getString("ch.dni");
                registros[8] = rs.getString("ch.nombres");

                modelo.addRow(registros);
            }
            st.close();
            rs.close();
            cn.close();
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al reportar flete de encomienda");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return modelo;
    }
    
    public boolean eliminarFleteEncomienda(int id) {

        sql = "DELETE FROM fleteEncomienda WHERE idFleteEncomienda='" + id + "' ";
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(sql);
            st.close();
            cn.close();
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al eliminar flete de encomienda");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}
