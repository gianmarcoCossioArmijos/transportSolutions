package transportSolutionsLogica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsConexion.Conexion;
import transportSolutionsModelo.PuestoLaboral;

public class PuestoLaboralBD {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql = null;

    public boolean registrarPuestoTrabajo(PuestoLaboral p) {

        sql = "INSERT INTO puestoTrabajo(descripcion,idAereaTrabajo) VALUES(?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, p.getDescripcion());
            pst.setInt(2, p.getIdAereaTrabajo());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al registrar puesto de trabajo");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean modificarPuestoTrabajo(PuestoLaboral p, int id) {

        sql = "update puestoTrabajo set descripcion=?,idAereaTrabajo=? where idPuestoTrabajo='" + id + "' ";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, p.getDescripcion());
            pst.setInt(2, p.getIdAereaTrabajo());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al modificar puesto de trabajo");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public DefaultTableModel reportarPuestoTrabajo() {

        DefaultTableModel modelo;
        String[] titulos = {"ID", "DESCRIPCION", "AREA"};
        String[] registros = new String[3];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idPuestoTrabajo,pt.descripcion,at.descripcion FROM puestoTrabajo AS pt JOIN areaTrabajo AS at ON pt.idAereaTrabajo = at.idAereaTrabajo";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idPuestoTrabajo");
                registros[1] = rs.getString("pt.descripcion");
                registros[2] = rs.getString("at.descripcion");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al reportar puesto de trabajo");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public DefaultTableModel buscarPuestoTrabajoDescripcion(String descripcion) {

        DefaultTableModel modelo;
        String[] titulos = {"ID", "DESCRIPCION", "AREA"};
        String[] registros = new String[3];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idPuestoTrabajo,pt.descripcion,at.descripcion FROM puestoTrabajo AS pt JOIN areaTrabajo AS at ON pt.idAereaTrabajo = at.idAereaTrabajo WHERE pt.descripcion='" + descripcion + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idPuestoTrabajo");
                registros[1] = rs.getString("pt.descripcion");
                registros[2] = rs.getString("at.descripcion");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al reportar puesto de trabajo");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public String buscarPuestoTrabajo(String descripcion) {

        String registro = null;
        sql = "SELECT idPuestoTrabajo FROM puestoTrabajo WHERE descripcion='" + descripcion + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registro = rs.getString("idPuestoTrabajo");
            }
            rs.close();
            st.close();
            cn.close();
            return registro;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al buscar puesto de trabajo");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public boolean eliminarPuestoTrabajo(int id) {

        sql = "DELETE FROM puestoTrabajo WHERE idPuestoTrabajo='" + id + "' ";
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(sql);
            st.close();
            cn.close();
            return true;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al eliminar puesto de trabajo");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
