package transportSolutionsLogica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsConexion.Conexion;
import transportSolutionsModelo.EstadoCaja;

public class EstadoCajaBD {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql = null;

    public int registrarAperturaCaja(EstadoCaja e) {

        int idventa = 0;
        sql = "INSERT INTO estadoCaja(estado,montoCajaChica,idCaja,idTurno,idUsuario) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, e.getEstado());
            pst.setDouble(2, e.getMontoCajaChica());
            pst.setInt(3, e.getIdCaja());
            pst.setInt(4, e.getIdTurno());
            pst.setInt(5, e.getIdUsuario());

            pst.executeUpdate();
            ResultSet resultado = (ResultSet) pst.getGeneratedKeys();
            if (resultado.next()) {
                idventa = resultado.getInt(1);
            }
            return idventa;
        } catch (SQLException ex) {
            JOptionPane op = new JOptionPane("Error al registrar apertura de caja");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }

    public boolean registrarCierreCaja(EstadoCaja e) {

        sql = "INSERT INTO estadoCaja(estado,montoCajaChica,idCaja,idTurno,idUsuario) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, e.getEstado());
            pst.setDouble(2, e.getMontoCajaChica());
            pst.setInt(3, e.getIdCaja());
            pst.setInt(4, e.getIdTurno());
            pst.setInt(5, e.getIdUsuario());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (SQLException ex) {
            JOptionPane op = new JOptionPane("Error al registrar cierre de caja");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public DefaultTableModel reportarCierreCaja(String fecha, double montoApertura, double montoCierre, int id) {

        DefaultTableModel modelo;
        String[] titulos = {"FECHA","TOTAL","CAJA CHICA APERTURA","CAJA CHICA CIERRE","CAJA","TURNO","USUARIO"};
        String[] registros = new String[7];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT SUM(V.total) AS total,c.descripcion AS caja,t.descripcion AS turno,u.nombres AS usuario FROM ( SELECT SUM(total) AS total,idCaja AS caja FROM boleta WHERE idCaja='" + id + "' UNION ALL SELECT SUM(total) AS total,idCaja AS caja FROM factura WHERE idCaja='" + id + "') V JOIN caja as c ON V.caja = c.idCaja JOIN estadoCaja AS ec ON c.idCaja = ec.idCaja JOIN turno AS t ON ec.idTurno = t.idTurno JOIN usuario AS u ON ec.idUsuario = u.idUsuario";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = fecha;
                registros[1] = "S/." + rs.getString("total");
                registros[2] = "S/." + montoApertura;
                registros[3] = "S/." + montoCierre;
                registros[4] = rs.getString("caja");
                registros[5] = rs.getString("turno");
                registros[6] = rs.getString("usuario");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al reportar cierre de caja");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public DefaultTableModel reportarAperturaCaja(String fecha, int id) {

        DefaultTableModel modelo;
        String[] titulos = {"FECHA", "ID", "ESTADO", "CAJA CHICA", "ID CAJA", "CAJA", "TURNO", "USUARIO"};
        String[] registros = new String[8];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT ec.idEstadoCaja,ec.estado,ec.montoCajaChica,ec.idCaja,c.descripcion,t.descripcion,u.nombres FROM estadoCaja AS ec JOIN caja AS c ON ec.idCaja = c.idCaja JOIN turno AS t ON ec.idTurno = t.idTurno JOIN usuario AS u ON ec.idUsuario = u.idUsuario where idEstadoCaja='" + id + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = fecha;
                registros[1] = rs.getString("ec.idEstadoCaja");
                registros[2] = rs.getString("ec.estado");
                registros[3] = "S/." + rs.getString("ec.montoCajaChica");
                registros[4] = rs.getString("ec.idCaja");
                registros[5] = rs.getString("c.descripcion");
                registros[6] = rs.getString("t.descripcion");
                registros[7] = rs.getString("u.nombres");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al reportar cierre de caja");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public DefaultTableModel reportarSesionCaja() {

        DefaultTableModel modelo;
        String[] titulos = {"ID","ESTADO","CAJA CHICA","ID CAJA","CAJA","TURNO","USUARIO"};
        String[] registros = new String[7];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT ec.idEstadoCaja,ec.estado,ec.montoCajaChica,ec.idCaja,c.descripcion,t.descripcion,u.nombres FROM estadoCaja AS ec JOIN caja AS c ON ec.idCaja = c.idCaja JOIN turno AS t ON ec.idTurno = t.idTurno JOIN usuario AS u ON ec.idUsuario = u.idUsuario ORDER BY ec.idEstadoCaja DESC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("ec.idEstadoCaja");
                registros[1] = rs.getString("ec.estado");
                registros[2] = rs.getString("ec.montoCajaChica");
                registros[3] = rs.getString("ec.idCaja");
                registros[4] = rs.getString("c.descripcion");
                registros[5] = rs.getString("t.descripcion");
                registros[6] = rs.getString("u.nombres");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al reportar sesion de caja");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public DefaultTableModel reportarCajaEstado(String estado) {

        DefaultTableModel modelo;
        String[] titulos = {"ID","ESTADO","CAJA CHICA","ID CAJA","CAJA","TURNO","USUARIO"};
        String[] registros = new String[7];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT ec.idEstadoCaja,ec.estado,ec.montoCajaChica,ec.idCaja,c.descripcion,t.descripcion,u.nombres FROM estadoCaja AS ec JOIN caja AS c ON ec.idCaja = c.idCaja JOIN turno AS t ON ec.idTurno = t.idTurno JOIN usuario AS u ON ec.idUsuario = u.idUsuario WHERE ec.estado='" + estado + "' ORDER BY ec.idEstadoCaja DESC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("ec.idEstadoCaja");
                registros[1] = rs.getString("ec.estado");
                registros[2] = rs.getString("ec.montoCajaChica");
                registros[3] = rs.getString("ec.idCaja");
                registros[4] = rs.getString("c.descripcion");
                registros[5] = rs.getString("t.descripcion");
                registros[6] = rs.getString("u.nombres");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al reportar sesion de caja");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }  
}