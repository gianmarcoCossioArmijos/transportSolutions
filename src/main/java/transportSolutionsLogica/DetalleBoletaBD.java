
package transportSolutionsLogica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsConexion.Conexion;
import transportSolutionsModelo.DetalleBoleta;

public class DetalleBoletaBD {
    
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql = null;
    
    public boolean registrarDetalleBoleta(DetalleBoleta db) {
        
        sql = "INSERT INTO detalleBoleta(origen,destino,tipoCarga,descripcion,precio,idBoleta) VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, db.getOrigen());
            pst.setString(2, db.getDestino());
            pst.setString(3, db.getTipoCarga());
            pst.setString(4, db.getDescripcion());
            pst.setDouble(5, db.getPrecio());
            pst.setInt(6, db.getIdBoleta());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (SQLException e) {
            JOptionPane op = new JOptionPane("Problemas al registrar detalle de venta");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public boolean modificarDetalleBoleta(DetalleBoleta b, int id) {

        sql = "UPDATE detalleBoleta SET origen=?,destino=?,tipoCarga=?,descripcion=?,precio=? WHERE idDetalleBoleta='" + id + "'";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, b.getOrigen());
            pst.setString(2, b.getDestino());
            pst.setString(3, b.getTipoCarga());
            pst.setString(4, b.getDescripcion());
            pst.setDouble(5, b.getPrecio());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (SQLException e) {
            JOptionPane op = new JOptionPane("Problemas al modificar detalle de boleta");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public DefaultTableModel reportarDetalleBoleta() {

        DefaultTableModel modelo;
        String[] titulos = {"ID","ORIGEN","DESTINO","TIPO","DESCRIPCION","PRECIO"};
        String[] registros = new String[6];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idDetalleBoleta,origen,destino,tipoCarga,descripcion,precio FROM detalleBoleta";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idDetalleBoleta");
                registros[1] = rs.getString("origen");
                registros[2] = rs.getString("destino");
                registros[3] = rs.getString("tipoCarga");
                registros[4] = rs.getString("descripcion");
                registros[5] = rs.getString("precio");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al reportar detalle de boleta");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public DefaultTableModel buscarDetalleBoleta(int id) {

        DefaultTableModel modelo;
        String[] titulos = {"ID","ORIGEN","DESTINO","TIPO","DESCRIPCION","PRECIO"};
        String[] registros = new String[6];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idDetalleBoleta,origen,destino,tipoCarga,descripcion,precio FROM detalleBoleta WHERE idBoleta='" + id + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idDetalleBoleta");
                registros[1] = rs.getString("origen");
                registros[2] = rs.getString("destino");
                registros[3] = rs.getString("tipoCarga");
                registros[4] = rs.getString("descripcion");
                registros[5] = rs.getString("precio");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al reportar detalle de boleta");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public boolean eliminarDetalleBoleta(int id){
        
        sql = "DELETE FROM detalleBoleta WHERE idDetalleBoleta='" + id + "'";
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(sql);
            st.close();
            cn.close();
        } catch (Exception e){
           JOptionPane op = new JOptionPane("Problemas al eliminar cliente");
           op.setMessageType(JOptionPane.ERROR_MESSAGE);
           return false;
        }
        return true;
    }
}
