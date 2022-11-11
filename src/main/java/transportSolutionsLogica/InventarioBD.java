package transportSolutionsLogica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsConexion.Conexion;
import transportSolutionsModelo.Inventario;

public class InventarioBD {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql = null;

    public boolean registrarInventario(Inventario i) {

        sql = "INSERT INTO inventario(codigoBarras,descripcion,marca,categoria,precio,fechaCompra,idProveedor,comprobante) values(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, i.getCodigoBarras());
            pst.setString(2, i.getDescripcion());
            pst.setString(3, i.getMarca());
            pst.setString(4, i.getCategoria());
            pst.setDouble(5, i.getPrecio());
            pst.setString(6, i.getFechaCompra());
            pst.setInt(7, i.getIdProveedor());
            pst.setString(8, i.getComprobante());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al registrar en inventario");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean modificarInventario(Inventario i, int id) {

        sql = "UPDATE inventario SET codigoBarras=?,descripcion=?,marca=?,categoria=?,precio=?,fechaCompra=?,idProveedor=?,comprobante=? WHERE idInventario='" + id + "' ";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, i.getCodigoBarras());
            pst.setString(2, i.getDescripcion());
            pst.setString(3, i.getMarca());
            pst.setString(4, i.getCategoria());
            pst.setDouble(5, i.getPrecio());
            pst.setString(6, i.getFechaCompra());
            pst.setInt(7, i.getIdProveedor());
            pst.setString(8, i.getComprobante());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al modificar inventario");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public DefaultTableModel reportarInventario() {

        DefaultTableModel modelo;
        String[] titulos = {"ID", "CODIGO BARRAS", "DESCRIPCION", "MARCA", "CATEGORIA", "PRECIO", "FECHA COMPRA", "PROVEEDOR","RUC","COMPROBANTE"};
        String[] registros = new String[10];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT i.idInventario,i.codigoBarras,i.descripcion,i.marca,i.categoria,i.precio,i.fechaCompra,p.razonSocial,p.ruc,i.comprobante FROM inventario AS i JOIN proveedor AS p ON i.idProveedor = p.idProveedor";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("i.idInventario");
                registros[1] = rs.getString("i.codigoBarras");
                registros[2] = rs.getString("i.descripcion");
                registros[3] = rs.getString("i.marca");
                registros[4] = rs.getString("i.categoria");
                registros[5] = rs.getString("i.precio");
                registros[6] = rs.getString("i.fechaCompra");
                registros[7] = rs.getString("p.razonSocial");
                registros[8] = rs.getString("p.ruc");
                registros[9] = rs.getString("i.comprobante");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al reportar inventario");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public DefaultTableModel buscarInventario(String codigo) {

        DefaultTableModel modelo;
        String[] titulos = {"ID", "CODIGO BARRAS", "DESCRIPCION", "MARCA", "CATEGORIA", "PRECIO", "FECHA COMPRA", "PROVEEDOR", "RUC", "COMPROBANTE"};
        String[] registros = new String[10];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT i.idInventario,i.codigoBarras,i.descripcion,i.marca,i.categoria,i.precio,i.fechaCompra,p.razonSocial,p.ruc,i.comprobante FROM inventario AS i JOIN proveedor AS p ON i.idProveedor = p.idProveedor WHERE i.codigoBarras='" + codigo + "' ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("i.idInventario");
                registros[1] = rs.getString("i.codigoBarras");
                registros[2] = rs.getString("i.descripcion");
                registros[3] = rs.getString("i.marca");
                registros[4] = rs.getString("i.categoria");
                registros[5] = rs.getString("i.precio");
                registros[6] = rs.getString("i.fechaCompra");
                registros[7] = rs.getString("p.razonSocial");
                registros[8] = rs.getString("p.ruc");
                registros[9] = rs.getString("i.comprobante");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al buscar inventario");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public DefaultTableModel buscarInventarioDescripcion(String descripcion) {

        DefaultTableModel modelo;
        String[] titulos = {"ID", "CODIGO BARRAS", "DESCRIPCION", "MARCA", "CATEGORIA", "PRECIO", "FECHA COMPRA", "PROVEEDOR", "RUC", "COMPROBANTE"};
        String[] registros = new String[10];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT i.idInventario,i.codigoBarras,i.descripcion,i.marca,i.categoria,i.precio,i.fechaCompra,p.razonSocial,p.ruc,i.comprobante FROM inventario AS i JOIN proveedor AS p ON i.idProveedor = p.idProveedor WHERE i.descripcion LIKE '%" + descripcion + "%' OR i.marca LIKE '%" + descripcion + "%' ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("i.idInventario");
                registros[1] = rs.getString("i.codigoBarras");
                registros[2] = rs.getString("i.descripcion");
                registros[3] = rs.getString("i.marca");
                registros[4] = rs.getString("i.categoria");
                registros[5] = rs.getString("i.precio");
                registros[6] = rs.getString("i.fechaCompra");
                registros[7] = rs.getString("p.razonSocial");
                registros[8] = rs.getString("p.ruc");
                registros[9] = rs.getString("i.comprobante");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al buscar inventario");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public String buscarIdInventario(String codigo) {

        String id = null;
        sql = "SELECT idInventario FROM inventario WHERE codigoBarras='" + codigo + "' ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                id = rs.getString("idInventario");
            }
            return id;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al buscar id en inventario");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public boolean eliminarInventario(int id) {

        sql = "DELETE FROM inventario WHERE idInventario='" + id + "' ";
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(sql);
            st.close();
            cn.close();
            return true;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al eliminar inventario");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
