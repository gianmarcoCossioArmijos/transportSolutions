package transportSolutionsLogica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsConexion.Conexion;
import transportSolutionsModelo.Factura;

public class FacturaBD {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql = null;

    public int registrarFactura(Factura f) {
        
        int idventa = 0;
        sql = "INSERT INTO factura(total,fecha,correlativo,idClienteRuc,idUsuario,estado,tipo,idCaja) VALUES(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pst.setDouble(1, f.getTotal());
            pst.setString(2, f.getFecha());
            pst.setString(3, f.getCorrelativo());
            pst.setInt(4, f.getIdClienteRuc());
            pst.setInt(5, f.getIdUsuario());
            pst.setString(6, f.getEstado());
            pst.setString(7, f.getTipo());
            pst.setInt(8, f.getIdCaja());
            
            pst.executeUpdate();
            ResultSet resultado = (ResultSet) pst.getGeneratedKeys();
            if (resultado.next()) {
                idventa = resultado.getInt(1);
            }
            return idventa;
        } catch (SQLException e) {
            JOptionPane op = new JOptionPane("Problemas al registrar venta");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }

    public boolean modificarFactura(Factura f) {

        sql = "UPDATE factura SET total=?,fecha=?,idClienteRuc=?,idUsuario=?,estado=?,tipo=?,idCaja=? WHERE correlativo=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setDouble(1, f.getTotal());
            pst.setString(2, f.getFecha());
            pst.setString(3, f.getCorrelativo());
            pst.setInt(4, f.getIdClienteRuc());
            pst.setInt(5, f.getIdUsuario());
            pst.setString(6, f.getEstado());
            pst.setString(7, f.getTipo());
            pst.setInt(8, f.getIdCaja());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (SQLException e) {
            JOptionPane op = new JOptionPane("Problemas al modificar factura");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public DefaultTableModel reportarFactura() {

        DefaultTableModel modelo;
        String[] titulos = {"ID","TOTAL","FECHA","CORRELATIVO","ESTADO","TIPO","CLIENTE","VENDEDOR","CAJA"};
        String[] registros = new String[9];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idFactura,total,fecha,correlativo,estado,tipo,cr.razonSocial,u.nombres,c.descripcion FROM factura AS f JOIN clienteRuc AS cr ON f.idClienteRuc = cr.idClienteRuc JOIN usuario AS u ON f.idUsuario = u.idUsuario JOIN caja as c ON f.idCaja=c.idCaja";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idFactura");
                registros[1] = rs.getString("total");
                registros[2] = rs.getString("fecha");
                registros[3] = rs.getString("correlativo");
                registros[4] = rs.getString("estado");
                registros[5] = rs.getString("tipo");
                registros[6] = rs.getString("cr.razonSocial");
                registros[7] = rs.getString("u.nombres");
                registros[8] = rs.getString("c.descripcion");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al reportar factura");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public DefaultTableModel reportarFacturaVendedor(int id) {

        DefaultTableModel modelo;
        String[] titulos = {"ID","TOTAL","FECHA","CORRELATIVO","ESTADO","TIPO","CLIENTE","VENDEDOR","CAJA"};
        String[] registros = new String[9];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idFactura,total,fecha,correlativo,estado,tipo,cr.razonSocial,u.nombres,c.descripcion FROM factura AS f JOIN clienteRuc AS cr ON f.idClienteRuc = cr.idClienteRuc JOIN usuario AS u ON f.idUsuario = u.idUsuario JOIN caja as c ON f.idCaja=c.idCaja WHERE f.idUsuario='" + id + "' ORDER BY idFactura DESC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idFactura");
                registros[1] = rs.getString("total");
                registros[2] = rs.getString("fecha");
                registros[3] = rs.getString("correlativo");
                registros[4] = rs.getString("estado");
                registros[5] = rs.getString("tipo");
                registros[6] = rs.getString("cr.razonSocial");
                registros[7] = rs.getString("u.nombres");
                registros[8] = rs.getString("c.descripcion");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al reportar factura");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public DefaultTableModel buscarFacturaCliente(int id) {

        DefaultTableModel modelo;
        String[] titulos = {"ID","TOTAL","FECHA","CORRELATIVO","ESTADO","TIPO","CLIENTE","VENDEDOR","CAJA"};
        String[] registros = new String[9];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idFactura,total,fecha,correlativo,estado,tipo,cr.razonSocial,u.nombres,c.descripcion FROM factura AS f JOIN clienteRuc AS cr ON f.idClienteRuc = cr.idClienteRuc JOIN usuario AS u ON f.idUsuario = u.idUsuario JOIN caja as c ON f.idCaja=c.idCaja WHERE f.idClienteRuc='" + id +"' ORDER BY idFactura DESC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idFactura");
                registros[1] = rs.getString("total");
                registros[2] = rs.getString("fecha");
                registros[3] = rs.getString("correlativo");
                registros[4] = rs.getString("estado");
                registros[5] = rs.getString("tipo");
                registros[6] = rs.getString("cr.razonSocial");
                registros[7] = rs.getString("u.nombres");
                registros[8] = rs.getString("c.descripcion");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al reportar factura");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public DefaultTableModel buscarFactura(String correlativo, String estado) {

        DefaultTableModel modelo;
        String[] titulos = {"ID","TOTAL","FECHA","CORRELATIVO","ESTADO","TIPO","CLIENTE","VENDEDOR","CAJA"};
        String[] registros = new String[9];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idFactura,total,fecha,correlativo,estado,tipo,cr.razonSocial,u.nombres,c.descripcion FROM factura AS f JOIN clienteRuc AS cr ON f.idClienteRuc = cr.idClienteRuc JOIN usuario AS u ON f.idUsuario = u.idUsuario JOIN caja as c ON f.idCaja=c.idCaja WHERE correlativo='" + correlativo + "' + AND estado='" + estado + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idFactura");
                registros[1] = rs.getString("total");
                registros[2] = rs.getString("fecha");
                registros[3] = rs.getString("correlativo");
                registros[4] = rs.getString("estado");
                registros[5] = rs.getString("tipo");
                registros[6] = rs.getString("cr.razonSocial");
                registros[7] = rs.getString("u.nombres");
                registros[8] = rs.getString("c.descripcion");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al reportar factura");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public DefaultTableModel mostrarFactura(String estado) {

        DefaultTableModel modelo;
        String[] titulos = {"ID","TOTAL","FECHA","CORRELATIVO","ESTADO","TIPO","CLIENTE","VENDEDOR","CAJA"};
        String[] registros = new String[9];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idFactura,total,fecha,correlativo,estado,tipo,cr.razonSocial,u.nombres,c.descripcion FROM factura AS f JOIN clienteRuc AS cr ON f.idClienteRuc = cr.idClienteRuc JOIN usuario AS u ON f.idUsuario = u.idUsuario JOIN caja as c ON f.idCaja=c.idCaja WHERE estado='" + estado + "' ORDER BY idFactura DESC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idFactura");
                registros[1] = rs.getString("total");
                registros[2] = rs.getString("fecha");
                registros[3] = rs.getString("correlativo");
                registros[4] = rs.getString("estado");
                registros[5] = rs.getString("tipo");
                registros[6] = rs.getString("cr.razonSocial");
                registros[7] = rs.getString("u.nombres");
                registros[8] = rs.getString("c.descripcion");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al reportar factura");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public DefaultTableModel reportarFacturaDia(String fecha) {

        DefaultTableModel modelo;
        String[] titulos = {"ID","TOTAL","FECHA","CORRELATIVO","ESTADO","TIPO","CLIENTE","VENDEDOR","CAJA"};
        String[] registros = new String[9];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idFactura,total,fecha,correlativo,estado,f.tipo,cr.razonSocial,u.nombres,c.descripcion FROM factura AS f JOIN clienteRuc AS cr ON f.idClienteRuc = cr.idClienteRuc JOIN usuario AS u ON f.idUsuario = u.idUsuario JOIN caja as c ON f.idCaja=c.idCaja WHERE fecha='" + fecha + "' ORDER BY idFactura DESC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idFactura");
                registros[1] = rs.getString("total");
                registros[2] = rs.getString("fecha");
                registros[3] = rs.getString("correlativo");
                registros[4] = rs.getString("estado");
                registros[5] = rs.getString("f.tipo");
                registros[6] = rs.getString("cr.razonSocial");
                registros[7] = rs.getString("u.nombres");
                registros[8] = rs.getString("c.descripcion");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al reportar factura");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public DefaultTableModel reportarFacturaFecha(String fechaInicio,String fechaFin) {

        DefaultTableModel modelo;
        String[] titulos = {"ID","TOTAL","FECHA","CORRELATIVO","ESTADO","TIPO","CLIENTE","VENDEDOR","CAJA"};
        String[] registros = new String[9];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idFactura,total,fecha,correlativo,estado,f.tipo,cr.razonSocial,u.nombres,c.descripcion FROM factura AS f JOIN clienteRuc AS cr ON f.idClienteRuc = cr.idClienteRuc JOIN usuario AS u ON f.idUsuario = u.idUsuario JOIN caja as c ON f.idCaja=c.idCaja WHERE fecha BETWEEN '" + fechaInicio + "' AND '" + fechaFin + "' ORDER BY idFactura DESC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idFactura");
                registros[1] = rs.getString("total");
                registros[2] = rs.getString("fecha");
                registros[3] = rs.getString("correlativo");
                registros[4] = rs.getString("estado");
                registros[5] = rs.getString("f.tipo");
                registros[6] = rs.getString("cr.razonSocial");
                registros[7] = rs.getString("u.nombres");
                registros[8] = rs.getString("c.descripcion");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al reportar factura");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public boolean anularFactura(int id) {

        sql = "UPDATE factura SET estado='ANULADO' WHERE idFactura='" + id + "' ";
        try {

            PreparedStatement pst = cn.prepareStatement(sql);

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al anular factura");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return false;
        }
    }
    
    public DefaultTableModel topClienteRuc() {

        DefaultTableModel modelo;
        String[] titulos = {"VENTAS","RAZON SOCIAL","RUC","CORREO","TELEFONO"};
        String[] registros = new String[5];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT COUNT(*) AS ventas,cr.razonSocial,cr.ruc,cr.correo,cr.telefono FROM factura AS f JOIN clienteRuc AS cr ON f.idClienteRuc = cr.idClienteRuc GROUP BY f.idClienteRuc ORDER BY count(*) DESC LIMIT 50";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("ventas");
                registros[1] = rs.getString("cr.razonSocial");
                registros[2] = rs.getString("cr.ruc");
                registros[3] = rs.getString("cr.correo");
                registros[4] = rs.getString("cr.telefono");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al reportar top de clientes RUC");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public String buscarIdFactura(int id) {

        String registro = null;
        sql = "SELECT correlativo FROM factura WHERE idFactura='" + id + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registro = rs.getString("correlativo");
            }
            return registro;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al encontrar id de factura");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
