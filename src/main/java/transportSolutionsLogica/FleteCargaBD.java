
package transportSolutionsLogica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsConexion.Conexion;
import transportSolutionsModelo.FleteCarga;

public class FleteCargaBD {
    
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql = null;
    
    public boolean registrarFleteCarga(FleteCarga f) {

        sql = "INSERT INTO fleteCarga(origen,destino,fechaSalida,estado,idVehiculo,idChofer) VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, f.getDestino());
            pst.setString(2, f.getOrigen());
            pst.setString(3, f.getFechaSalida());
            pst.setString(4, f.getEstado());
            pst.setInt(5, f.getIdVehiculo());
            pst.setInt(6, f.getIdChofer());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (SQLException e) {
            JOptionPane op = new JOptionPane("Error al registrar flete de carga");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public boolean modificarFleteCarga(FleteCarga f, int id) {

        sql = "UPDATE fleteCarga SET origen=?,destino=?,fechaSalida=?,estado=?,idVehiculo=?,idChofer=? WHERE idFleteCarga='" + id + "'";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, f.getDestino());
            pst.setString(2, f.getOrigen());
            pst.setString(3, f.getFechaSalida());
            pst.setString(4, f.getEstado());
            pst.setInt(5, f.getIdVehiculo());
            pst.setInt(6, f.getIdChofer());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (SQLException e) {
            JOptionPane op = new JOptionPane("Error al liberar flete de carga");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public boolean liberarFleteCarga(FleteCarga f, int id) {

        sql = "UPDATE fleteCarga SET origen=?,destino=?,fechaSalida=?,fechaArribo=?,estado=?,idVehiculo=?,idChofer=? WHERE idFleteCarga='" + id + "'";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, f.getDestino());
            pst.setString(2, f.getOrigen());
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
            JOptionPane op = new JOptionPane("Error al liberar flete de carga");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public DefaultTableModel reportarFleteCargaLiberado() {

        DefaultTableModel modelo;
        String[] titulos = {"ID","ORIGEN","DESTINO","FECHA SALIDA","FECHA ARRIBO","ESTADO","PLACA","DNI CHOFER","CHOFER"};
        String[] registros = new String[9];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idFleteCarga,origen,destino,fechaSalida,fechaArribo,estado,v.placa,ch.dni,ch.nombres FROM fleteCarga AS fc JOIN vehiculo AS v ON fc.idVehiculo = v.idVehiculo JOIN chofer AS ch ON fc.idChofer = ch.idChofer WHERE fc.estado='LIBERADO'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idFleteCarga");
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
            JOptionPane op = new JOptionPane("Error al reportar flete de carga");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return modelo;
    }
    
    public DefaultTableModel reportarFleteCargaAsignado() {

        DefaultTableModel modelo;
        String[] titulos = {"ID","ORIGEN","DESTINO","FECHA SALIDA","ESTADO","PLACA","DNI CHOFER","CHOFER"};
        String[] registros = new String[8];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idFleteCarga,origen,destino,fechaSalida,estado,v.placa,ch.dni,ch.nombres FROM fleteCarga AS fc JOIN vehiculo AS v ON fc.idVehiculo = v.idVehiculo JOIN chofer AS ch ON fc.idChofer = ch.idChofer WHERE fc.estado='ASIGNADO'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idFleteCarga");
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
            JOptionPane op = new JOptionPane("Error al reportar flete de carga");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return modelo;
    }
    
    public DefaultTableModel reportarFleteCargaEstadoFecha(String estado, String fechaArribo) {

        DefaultTableModel modelo;
        String[] titulos = {"ID","ORIGEN","DESTINO","FECHA SALIDA","FECHA ARRIBO","ESTADO","PLACA","DNI CHOFER","CHOFER"};
        String[] registros = new String[9];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idFleteCarga,origen,destino,fechaSalida,fechaArribo,estado,v.placa,ch.dni,ch.nombres FROM fleteCarga AS fc JOIN vehiculo AS v ON fc.idVehiculo = v.idVehiculo JOIN chofer AS ch ON fc.idChofer = ch.idChofer WHERE fc.estado='" + estado + "' OR fc.fechaArribo='" + fechaArribo + "' ORDER BY idFleteCarga DESC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idFleteCarga");
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
            JOptionPane op = new JOptionPane("Error al reportar flete de carga");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return modelo;
    }
    
    public boolean eliminarFleteCarga(int id) {

        sql = "DELETE FROM fleteCarga WHERE idFleteCarga='" + id + "' ";
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(sql);
            st.close();
            cn.close();
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al eliminar felete de carga");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}
