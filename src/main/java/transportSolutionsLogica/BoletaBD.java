package transportSolutionsLogica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsConexion.Conexion;
import transportSolutionsModelo.Boleta;

public class BoletaBD {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql = null;

    public int registrarBoleta(Boleta b) {
        
        int idventa = 0;
        sql = "INSERT INTO boleta(correlativo,fecha,total,idClienteNatural,idUsuario,estado,idCaja,tipo,idEstadoCaja) VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, b.getCorrelativo());
            pst.setString(2, b.getFecha());
            pst.setDouble(3, b.getTotal());
            pst.setInt(4, b.getIdClienteNatural());
            pst.setInt(5, b.getIdUsuario());
            pst.setString(6, b.getEstado());
            pst.setInt(7, b.getIdCaja());
            pst.setString(8, b.getTipo());
            pst.setInt(9, b.getIdEstadoCaja());
            
            pst.executeUpdate();
            ResultSet resultado = (ResultSet) pst.getGeneratedKeys();
            if (resultado.next()) {
                idventa = resultado.getInt(1);
            }
            return idventa;
        } catch (SQLException e) {
            JOptionPane op = new JOptionPane("Error al registrar venta");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }

    public boolean modificarBoleta(Boleta b) {

        sql = "UPDATE boleta SET total=?,fecha=?,idClienteNatural=?,idUsuario=?,estado=?,idCaja=?,tipo=?,idEstadoCaja=? WHERE correlativo=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setDouble(1, b.getTotal());
            pst.setString(2, b.getFecha());
            pst.setInt(3, b.getIdClienteNatural());
            pst.setInt(4, b.getIdUsuario());
            pst.setString(5, b.getEstado());
            pst.setString(6, b.getCorrelativo());
            pst.setInt(7, b.getIdCaja());
            pst.setString(8, b.getTipo());
            pst.setInt(9, b.getIdEstadoCaja());

            pst.executeUpdate();
            pst.close();
            cn.close();
        } catch (SQLException e) {
            JOptionPane op = new JOptionPane("Error al modificar boleta");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public DefaultTableModel reportarBoleta() {

        DefaultTableModel modelo;
        String[] titulos = {"ID","TOTAL","FECHA","CORRELATIVO","ESTADO","TIPO","CLIENTE","VENDEDOR","CAJA"};
        String[] registros = new String[9];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idBoleta,total,fecha,correlativo,estado,b.tipo,cn.nombres,u.nombres,c.descripcion FROM boleta AS b JOIN clienteNatural AS cn ON b.idClienteNatural = cn.idClienteNatural JOIN usuario AS u ON b.idUsuario = u.idUsuario JOIN caja as c ON b.idCaja=c.idCaja";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idBoleta");
                registros[1] = rs.getString("total");
                registros[2] = rs.getString("fecha");
                registros[3] = rs.getString("correlativo");
                registros[4] = rs.getString("estado");
                registros[5] = rs.getString("b.tipo");
                registros[6] = rs.getString("cn.nombres");
                registros[7] = rs.getString("u.nombres");
                registros[8] = rs.getString("c.descripcion");

                modelo.addRow(registros);
            }
            st.close();
            rs.close();
            cn.close();
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al reportar boleta");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return modelo;
    }
    
    public DefaultTableModel reportarBoletaCliente(int id) {

        DefaultTableModel modelo;
        String[] titulos = {"ID","TOTAL","FECHA","CORRELATIVO","ESTADO","TIPO","CLIENTE","VENDEDOR","CAJA"};
        String[] registros = new String[9];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idBoleta,total,fecha,correlativo,estado,b.tipo,cn.nombres,u.nombres,c.descripcion FROM boleta AS b JOIN clienteNatural AS cn ON b.idClienteNatural = cn.idClienteNatural JOIN usuario AS u ON b.idUsuario = u.idUsuario JOIN caja as c ON b.idCaja=c.idCaja WHERE b.idClienteNatural='" + id + "' ORDER BY idBoleta DESC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idBoleta");
                registros[1] = rs.getString("total");
                registros[2] = rs.getString("fecha");
                registros[3] = rs.getString("correlativo");
                registros[4] = rs.getString("estado");
                registros[5] = rs.getString("b.tipo");
                registros[6] = rs.getString("cn.nombres");
                registros[7] = rs.getString("u.nombres");
                registros[8] = rs.getString("c.descripcion");

                modelo.addRow(registros);
            }
            st.close();
            rs.close();
            cn.close();
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al reportar boleta");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return modelo;
    }
    
    public DefaultTableModel reportarBoletaDia(String dia) {

        DefaultTableModel modelo;
        String[] titulos = {"ID","TOTAL","FECHA","CORRELATIVO","ESTADO","TIPO","CLIENTE","VENDEDOR","CAJA"};
        String[] registros = new String[9];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idBoleta,total,fecha,correlativo,estado,b.tipo,cn.nombres,u.nombres,c.descripcion FROM boleta AS b JOIN clienteNatural AS cn ON b.idClienteNatural = cn.idClienteNatural JOIN usuario AS u ON b.idUsuario = u.idUsuario JOIN caja as c ON b.idCaja=c.idCaja WHERE b.fecha='" + dia +"' ORDER BY idBoleta DESC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idBoleta");
                registros[1] = rs.getString("total");
                registros[2] = rs.getString("fecha");
                registros[3] = rs.getString("correlativo");
                registros[4] = rs.getString("estado");
                registros[5] = rs.getString("b.tipo");
                registros[6] = rs.getString("cn.nombres");
                registros[7] = rs.getString("u.nombres");
                registros[8] = rs.getString("c.descripcion");

                modelo.addRow(registros);
            }
            st.close();
            rs.close();
            cn.close();
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al reportar boleta");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return modelo;
    }
    
    public DefaultTableModel reportarBoletaFecha(String fechaInicio, String fechaFin) {

        DefaultTableModel modelo;
        String[] titulos = {"ID","TOTAL","FECHA","CORRELATIVO","ESTADO","TIPO","CLIENTE","VENDEDOR","CAJA"};
        String[] registros = new String[9];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idBoleta,total,fecha,correlativo,estado,b.tipo,cn.nombres,u.nombres,c.descripcion FROM boleta AS b JOIN clienteNatural AS cn ON b.idClienteNatural = cn.idClienteNatural JOIN usuario AS u ON b.idUsuario = u.idUsuario JOIN caja as c ON b.idCaja=c.idCaja WHERE b.fecha BETWEEN '" + fechaInicio + "' AND '" + fechaFin + "' ORDER BY idBoleta DESC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idBoleta");
                registros[1] = rs.getString("total");
                registros[2] = rs.getString("fecha");
                registros[3] = rs.getString("correlativo");
                registros[4] = rs.getString("estado");
                registros[5] = rs.getString("b.tipo");
                registros[6] = rs.getString("cn.nombres");
                registros[7] = rs.getString("u.nombres");
                registros[8] = rs.getString("c.descripcion");

                modelo.addRow(registros);
            }
            st.close();
            rs.close();
            cn.close();
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al reportar boleta");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return modelo;
    }
    
    public DefaultTableModel reportarBoletaVendedor(int id) {

        DefaultTableModel modelo;
        String[] titulos = {"ID","TOTAL","FECHA","CORRELATIVO","ESTADO","TIPO","CLIENTE","VENDEDOR","CAJA"};
        String[] registros = new String[9];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idBoleta,total,fecha,correlativo,estado,tipo,cn.nombres,u.nombres,c.descripcion FROM boleta AS b JOIN clienteNatural AS cn ON b.idClienteNatural = cn.idClienteNatural JOIN usuario AS u ON b.idUsuario = u.idUsuario JOIN caja as c ON b.idCaja=c.idCaja WHERE b.idUsuario='" + id +"' ORDER BY idBoleta DESC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idBoleta");
                registros[1] = rs.getString("total");
                registros[2] = rs.getString("fecha");
                registros[3] = rs.getString("correlativo");
                registros[4] = rs.getString("estado");
                registros[5] = rs.getString("tipo");
                registros[6] = rs.getString("cn.nombres");
                registros[7] = rs.getString("u.nombres");
                registros[8] = rs.getString("c.descripcion");

                modelo.addRow(registros);
            }
            st.close();
            rs.close();
            cn.close();
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al reportar boleta");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return modelo;
    }
    
    public String buscarBoleta(int id) {

        String registro = null;
        sql = "SELECT correlativo FROM boleta WHERE idBoleta='" + id + "' ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registro= rs.getString("correlativo");
            }
        return registro;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al buscar boleta");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public DefaultTableModel buscarBoleta(String correlativo, String estado) {

        DefaultTableModel modelo;
        String[] titulos = {"ID","TOTAL","FECHA","CORRELATIVO","ESTADO","TIPO","CLIENTE","VENDEDOR","CAJA"};
        String[] registros = new String[9];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idBoleta,total,fecha,correlativo,estado,tipo,cn.nombres,u.nombres,c.descripcion FROM boleta AS b JOIN clienteNatural AS cn ON b.idClienteNatural = cn.idClienteNatural JOIN usuario AS u ON b.idUsuario = u.idUsuario JOIN caja as c ON b.idCaja=c.idCaja WHERE correlativo='" + correlativo + "' AND estado='" + estado + "' ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idBoleta");
                registros[1] = rs.getString("total");
                registros[2] = rs.getString("fecha");
                registros[3] = rs.getString("correlativo");
                registros[4] = rs.getString("estado");
                registros[5] = rs.getString("tipo");
                registros[6] = rs.getString("cn.nombres");
                registros[7] = rs.getString("u.nombres");
                registros[8] = rs.getString("c.descripcion");

                modelo.addRow(registros);
            }
            st.close();
            rs.close();
            cn.close();
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al reportar boleta");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return modelo;
    }
    
    public DefaultTableModel mostrarBoleta(String estado) {

        DefaultTableModel modelo;
        String[] titulos = {"ID","TOTAL","FECHA","CORRELATIVO","ESTADO","TIPO","CLIENTE","VENDEDOR","CAJA"};
        String[] registros = new String[9];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idBoleta,total,fecha,correlativo,estado,tipo,cn.nombres,u.nombres,c.descripcion FROM boleta AS b JOIN clienteNatural AS cn ON b.idClienteNatural = cn.idClienteNatural JOIN usuario AS u ON b.idUsuario = u.idUsuario JOIN caja as c ON b.idCaja=c.idCaja WHERE estado='" + estado + "' ORDER BY idBoleta DESC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idBoleta");
                registros[1] = rs.getString("total");
                registros[2] = rs.getString("fecha");
                registros[3] = rs.getString("correlativo");
                registros[4] = rs.getString("estado");
                registros[5] = rs.getString("tipo");
                registros[6] = rs.getString("cn.nombres");
                registros[7] = rs.getString("u.nombres");
                registros[8] = rs.getString("c.descripcion");

                modelo.addRow(registros);
            }
            st.close();
            rs.close();
            cn.close();
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al reportar boleta");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return modelo;
    }

    public boolean anularBoleta(int id) {

        sql = "UPDATE boleta SET estado='ANULADO' WHERE idBoleta='" + id + "'";
        try {

            PreparedStatement pst = cn.prepareStatement(sql);

            pst.executeUpdate();
            pst.close();
            cn.close();
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al anular boleta");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public DefaultTableModel topClienteNatural() {

        DefaultTableModel modelo;
        String[] titulos = {"VENTAS","NOMBRES","DNI","CORREO","TELEFONO"};
        String[] registros = new String[5];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT COUNT(*) AS ventas,cn.nombres,cn.dni,cn.correo,cn.telefono FROM boleta AS b JOIN clienteNatural AS cn ON b.idClienteNatural = cn.idClienteNatural GROUP BY b.idClienteNatural ORDER BY count(*) DESC LIMIT 50";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("ventas");
                registros[1] = rs.getString("cn.nombres");
                registros[2] = rs.getString("cn.dni");
                registros[3] = rs.getString("cn.correo");
                registros[4] = rs.getString("cn.telefono");

                modelo.addRow(registros);
            }
            st.close();
            rs.close();
            cn.close();
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al reportar top de clientes naturales");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return modelo;
    }
    
    public DefaultTableModel topVendedor(String fechaInicio, String fechaFin) {

        DefaultTableModel modelo;
        String[] titulos = {"VENTAS","NOMBRES","DNI","CORREO","ID"};
        String[] registros = new String[5];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT SUM(V.ventas) AS VENTAS,V.nombre,V.dni,V.correo,V.id FROM( SELECT COUNT(*) AS ventas,u.nombres AS nombre,u.dni AS dni,u.correo AS correo,u.idUsuario AS id,b.fecha AS fecha FROM boleta AS b JOIN usuario As u ON b.idUsuario=u.idUsuario WHERE b.fecha BETWEEN '" + fechaInicio + "' AND '" + fechaFin + "' GROUP BY b.idUsuario UNION ALL SELECT COUNT(*) AS ventas,u.nombres AS nombre,u.dni AS dni,u.correo AS correo,u.idUsuario AS id,f.fecha AS fecha FROM factura AS f JOIN usuario AS u ON f.idUsuario=u.idUsuario WHERE f.fecha BETWEEN '" + fechaInicio + "' AND '" + fechaFin + "' GROUP BY f.idUsuario) V GROUP BY V.id ORDER BY V.ventas DESC LIMIT 50";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("ventas");
                registros[1] = rs.getString("V.nombre");
                registros[2] = rs.getString("V.dni");
                registros[3] = rs.getString("V.correo");
                registros[4] = rs.getString("V.id");

                modelo.addRow(registros);
            }
            st.close();
            rs.close();
            cn.close();
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al reportar top vendedores");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return modelo;
    }
    
    public String buscarIdBoleta(int id) {

        String registro = null;
        sql = "SELECT correlativo FROM boleta WHERE idBoleta='" + id + "' ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registro= rs.getString("correlativo");
            }
        return registro;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al buscar boleta");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
