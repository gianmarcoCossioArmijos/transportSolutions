
package transportSolutionsLogica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsConexion.Conexion;
import transportSolutionsModelo.DetalleFactura;

public class DetalleFacturaBD {
    
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql = null;
    
    public boolean registrarDetalleFactura(DetalleFactura df) {
        
        sql = "INSERT INTO detalleFactura(origen,destino,tipoCarga,descripcion,precio,idFactura) VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, df.getOrigen());
            pst.setString(2, df.getDestino());
            pst.setString(3, df.getTipoCarga());
            pst.setString(4, df.getDescripcion());
            pst.setDouble(5, df.getPrecio());
            pst.setInt(6, df.getIdFactura());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (SQLException e) {
            JOptionPane op = new JOptionPane("Problemas al registrar detalle de factura");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public boolean modificarDetalleFactura(DetalleFactura df, int id) {

        sql = "UPDATE detalleFactura SET origen=?,destino=?,tipoCarga=?,descripcion=?,precio=? WHERE idDetalleFactura='" + id + "'";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, df.getOrigen());
            pst.setString(2, df.getDestino());
            pst.setString(3, df.getTipoCarga());
            pst.setString(4, df.getDescripcion());
            pst.setDouble(5, df.getPrecio());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (SQLException e) {
            JOptionPane op = new JOptionPane("Problemas al modificar detalle de factura");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public DefaultTableModel reportarDetalleFactura() {

        DefaultTableModel modelo;
        String[] titulos = {"ID","ORIGEN","DESTINO","TIPO","DESCRIPCION","PRECIO"};
        String[] registros = new String[6];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idDetalleFactura,origen,destino,tipoCarga,descripcion,precio FROM detalleFactura";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idDetalleFactura");
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
            JOptionPane op = new JOptionPane("Problemas al reportar detalle de factura");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public boolean eliminarDetalleFactura(int id){
        
        sql = "DELETE FROM detalleFactura WHERE idFactura='" + id + "'";
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(sql);
            st.close();
            cn.close();
            return true;
        } catch (Exception e){
           JOptionPane op = new JOptionPane("Problemas al eliminar cliente");
           op.setMessageType(JOptionPane.ERROR_MESSAGE);
           return false;
        }
    }
    
    public DefaultTableModel buscarDetalleFactura(int id) {

        DefaultTableModel modelo;
        String[] titulos = {"ID","ORIGEN","DESTINO","TIPO","DESCRIPCION","PRECIO"};
        String[] registros = new String[6];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idDetalleFactura,origen,destino,tipoCarga,descripcion,precio FROM detalleFactura WHERE idFactura='" + id + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idDetalleFactura");
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
            JOptionPane op = new JOptionPane("Problemas al reportar detalle de factura");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
