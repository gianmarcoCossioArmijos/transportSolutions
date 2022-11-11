
package transportSolutionsLogica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsConexion.Conexion;
import transportSolutionsModelo.EstadoVehiculo;

public class EstadoVehiculoBD {
    
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql = null;
    
    public boolean registrarEstadoVehiculo(EstadoVehiculo e) {

        sql = "INSERT INTO estadoVehiculo(estado,idVehiculo) VALUES(?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, e.getEstado());
            pst.setInt(2, e.getIdVehiculo());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (SQLException ex) {
            JOptionPane op = new JOptionPane("Error al registrar estado vehiculo");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public boolean modificarEstadoVehiculo(EstadoVehiculo e, int id) {

        sql = "UPDATE estadoVehiculo SET estado=?,idVehiculo=? WHERE idEstadoVehiculo='" + id + "'";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, e.getEstado());
            pst.setInt(2, e.getIdVehiculo());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (SQLException ex) {
            JOptionPane op = new JOptionPane("Error al modificar estado vehiculo");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public DefaultTableModel reportarEstadoVehiculo() {

        DefaultTableModel modelo;
        String[] titulos = {"ID","ESTADO","PLACA VEHICULO","MARCA","MODELO"};
        String[] registros = new String[5];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idEstadoVehiculo,estado,v.placa,v.marca,v.modelo FROM estadoVehiculo AS e JOIN vehiculo AS v ON e.idVehiculo = v.idVehiculo";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idEstadoVehiculo");
                registros[1] = rs.getString("estado");
                registros[2] = rs.getString("v.placa");
                registros[3] = rs.getString("v.marca");
                registros[4] = rs.getString("v.modelo");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception ex) {
            JOptionPane op = new JOptionPane("Error al reportar estado vehiculo");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public DefaultTableModel reportarEstadoVehiculoPendiente() {

        DefaultTableModel modelo;
        String[] titulos = {"ID","ESTADO","PLACA VEHICULO","MARCA","MODELO"};
        String[] registros = new String[5];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idEstadoVehiculo,estado,v.placa,v.marca,v.modelo FROM estadoVehiculo AS e JOIN vehiculo AS v ON e.idVehiculo = v.idVehiculo WHERE estado='PENDIENTE' ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idEstadoVehiculo");
                registros[1] = rs.getString("estado");
                registros[2] = rs.getString("v.placa");
                registros[3] = rs.getString("v.marca");
                registros[4] = rs.getString("v.modelo");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception ex) {
            JOptionPane op = new JOptionPane("Error al reportar estado vehiculo");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public String buscareIdEstadoVehiculo(int id) {

        String registro = null;
        sql = "SELECT idEstadoVehiculo FROM estadoVehiculo WHERE idVehiculo='" + id + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registro = rs.getString("idEstadoVehiculo");
            }
            return registro;
        } catch (Exception ex) {
            JOptionPane op = new JOptionPane("Error al buscar id estado vehiculo");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}