
package transportSolutionsLogica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsConexion.Conexion;
import transportSolutionsModelo.CorrelativoFactura;

public class CorrelativoFacturaBD {
    
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql = null;
    
    public boolean registrarCorrelativoF(CorrelativoFactura f) {

        sql = "INSERT INTO facturaCorrelativo(serie,codigo) VALUES(?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, f.getSerie());
            pst.setString(2, f.getCodigo());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (SQLException e) {
            JOptionPane op = new JOptionPane("Problemas al registrar correlativo");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public boolean modificarCorrelativoF(CorrelativoFactura f, int id) {

        sql = "UPDATE facturaCorrelativo SET serie=?,codigo=? WHERE idFacturaCorrelativo='" + id + "'";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, f.getSerie());
            pst.setString(2, f.getCodigo());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al modificar correlativo");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public DefaultTableModel reportarCorrelativoF() {

        DefaultTableModel modelo;
        String[] titulos = {"ID","SERIE","CODIGO"};
        String[] registros = new String[3];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idFacturaCorrelativo,serie,codigo FROM facturaCorrelativo";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idFacturaCorrelativo");
                registros[1] = rs.getString("serie");
                registros[2] = rs.getString("codigo");

                modelo.addRow(registros);
            }
            st.close();
            rs.close();
            cn.close();
            return modelo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al reportar correlativo");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public boolean eliminarCorrelativoF(int id) {

        sql = "DELETE FROM facturaCorrelativo WHERE idFacturaCorrelativo='" + id + "' ";
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(sql);
            st.close();
            cn.close();
            return true;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al eliminar correlativo");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public DefaultTableModel buscarCorrelativoF(int id) {
        DefaultTableModel modelo;
        String[] titulos = {"ID","SERIE","CODIGO"};
        String[] registros = new String[3];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idFacturaCorrelativo,serie,codigo FROM facturaCorrelativo WHERE idFacturaCorrelativo='" + id + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                registros[0] = rs.getString("idFacturaCorrelativo");
                registros[1] = rs.getString("serie");
                registros[2] = rs.getString("codigo");

                modelo.addRow(registros);
            }
            st.close();
            rs.close();
            cn.close();
            return modelo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al buscar correlativo");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public boolean actualizarCorrelativo (CorrelativoFactura f) {
        
        sql = "UPDATE facturaCorrelativo SET codigo=? WHERE serie=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, f.getCodigo());
            pst.setString(2, f.getSerie());
            
            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
            return false;
        }
    }
    
    public List<CorrelativoFactura> obetenerNumero() {
        List<CorrelativoFactura> lista = new ArrayList<>();
        sql = "SELECT idFacturaCorrelativo,serie,codigo FROM facturaCorrelativo ORDER BY serie DESC LIMIT 1";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()){
                CorrelativoFactura cf = new CorrelativoFactura();
                cf.setSerie(rs.getString(2));
                cf.setCodigo(rs.getString(3));
                
                lista.add(cf);
            }
            st.close();
            rs.close();
            cn.close();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error a sacar correlativo");
            e.printStackTrace();
        }
        return lista;
    }
}
