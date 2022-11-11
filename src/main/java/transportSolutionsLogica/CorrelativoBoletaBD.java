
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
import transportSolutionsModelo.CorrelativoBoleta;

public class CorrelativoBoletaBD {
    
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql = null;
    
    public boolean registrarCorrelativoB(CorrelativoBoleta b) {
        
        sql = "INSERT INTO boletaCorrelativo(serie,codigo) VALUES(?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, b.getSerie());
            pst.setString(2, b.getCodigo());

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
    
    public boolean modificarCorrelativoB(CorrelativoBoleta b, int id) {

        sql = "UPDATE boletaCorrelativo SET serie=?,codigo=? WHERE idBoletaCorrelativo='" + id + "'";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, b.getSerie());
            pst.setString(2, b.getCodigo());

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
    
    public DefaultTableModel reportarCorrelativoB() {

        DefaultTableModel modelo;
        String[] titulos = {"ID","SERIE","CODIGO"};
        String[] registros = new String[3];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idBoletaCorrelativo,serie,codigo FROM boletaCorrelativo";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idBoletaCorrelativo");
                registros[1] = rs.getString("serie");
                registros[2] = rs.getString("codigo");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al reportar correlativo");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public boolean eliminarCorrelativoB(int id) {

        sql = "DELETE FROM boletaCorrelativo WHERE idBoletaCorrelativo='" + id + "' ";
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
    
    public DefaultTableModel buscarCorrelativoB(int id) {
        DefaultTableModel modelo;
        String[] titulos = {"ID","SERIE","CODIGO"};
        String[] registros = new String[3];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idBoletaCorrelativo,serie,codigo FROM boletaCorrelativo WHERE idBoletaCorrelativo='" + id + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                registros[0] = rs.getString("idBoletaCorrelativo");
                registros[1] = rs.getString("serie");
                registros[2] = rs.getString("codigo");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al buscar correlativo");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public boolean actualizarCorrelativo (CorrelativoBoleta b) {
        
        sql = "UPDATE boletaCorrelativo SET codigo=? WHERE serie=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, b.getCodigo());
            pst.setString(2, b.getSerie());
            
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
    
    public List<CorrelativoBoleta> obtenerNumero () {
        List<CorrelativoBoleta> lista = new ArrayList<>();
        sql = "SELECT idBoletaCorrelativo,serie,codigo FROM boletaCorrelativo";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()){
                CorrelativoBoleta cb = new CorrelativoBoleta();
                cb.setSerie(rs.getString(2));
                cb.setCodigo(rs.getString(3));
                
                lista.add(cb);
            }
            rs.close();
            st.close();
            cn.close();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al sacar correlativo");
            e.printStackTrace();
        }
        return lista;
    }
}
