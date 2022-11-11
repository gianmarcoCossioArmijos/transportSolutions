
package transportSolutionsLogica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsConexion.Conexion;
import transportSolutionsModelo.Vehiculo;

public class VehiculoBD {
    
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql = null;
    
    public int registrarVehiculo (Vehiculo v) {

        int id = 0;
        sql = "INSERT INTO vehiculo(marca,modelo,tipo,serieMotor,placa,año,estadoPropiedad,propietario) values(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, v.getMarca());
            pst.setString(2, v.getModelo());
            pst.setString(3, v.getTipo());
            pst.setString(4, v.getSerieMotor());
            pst.setString(5, v.getPlaca());
            pst.setString(6, v.getAño());
            pst.setString(7, v.getEstadoPropiedad());
            pst.setString(8, v.getPropietario());

            pst.executeUpdate();
            ResultSet resultado = (ResultSet) pst.getGeneratedKeys();
            if (resultado.next()) {
                id = resultado.getInt(1);
            }
            return id;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al registrar vehiculo");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }
    
    public boolean modificarVehiculo (Vehiculo v, String placa) {

        sql = "UPDATE vehiculo SET marca=?,modelo=?,tipo=?,serieMotor=?,placa=?,año=?,estadoPropiedad=?,propietario=? WHERE placa='" + placa + "'";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, v.getMarca());
            pst.setString(2, v.getModelo());
            pst.setString(3, v.getTipo());
            pst.setString(4, v.getSerieMotor());
            pst.setString(5, v.getPlaca());
            pst.setString(6, v.getAño());
            pst.setString(7, v.getEstadoPropiedad());
            pst.setString(8, v.getPropietario());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al modificar vehiculo");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public DefaultTableModel reportarVehiculo() {

        DefaultTableModel modelo;
        String[] titulos = {"ID", "MARCA","MODELO","TIPO","SERIE MOTOR","PLACA","AÑO","ESTADO PROPIEDAD","PROPIETARIO"};
        String[] registros = new String[9];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idVehiculo,marca,modelo,tipo,serieMotor,placa,año,estadoPropiedad,propietario FROM vehiculo";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idVehiculo");
                registros[1] = rs.getString("marca");
                registros[2] = rs.getString("modelo");
                registros[3] = rs.getString("tipo");
                registros[4] = rs.getString("serieMotor");
                registros[5] = rs.getString("placa");
                registros[6] = rs.getString("año");
                registros[7] = rs.getString("estadoPropiedad");
                registros[8] = rs.getString("propietario");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al reportar vehiculo");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public boolean eliminarVehiculo(int id) {

        sql = "DELETE FROM vehiculo WHERE idVehiculo='" + id + "' ";
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(sql);
            st.close();
            cn.close();
            return true;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al eliminar vehiculo");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public DefaultTableModel buscarVehiculo(String placa) {

        DefaultTableModel modelo;
        String[] titulos = {"ID", "MARCA","MODELO","TIPO","SERIE MOTOR","PLACA","AÑO","ESTADO PROPIEDAD","PROPIETARIO"};
        String[] registros = new String[9];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idVehiculo,marca,modelo,tipo,serieMotor,placa,año,estadoPropiedad,propietario FROM vehiculo WHERE placa='" + placa + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idVehiculo");
                registros[1] = rs.getString("marca");
                registros[2] = rs.getString("modelo");
                registros[3] = rs.getString("tipo");
                registros[4] = rs.getString("serieMotor");
                registros[5] = rs.getString("placa");
                registros[6] = rs.getString("año");
                registros[7] = rs.getString("estadoPropiedad");
                registros[8] = rs.getString("propietario");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al buscar vehiculo");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public String buscarIdVehiculo(String placa) {

        String id = null;
        sql = "SELECT idVehiculo FROM vehiculo WHERE placa='" + placa + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                id = rs.getString("idVehiculo");
            }
            return id;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al id buscar vehiculo");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
