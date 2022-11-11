package transportSolutionsLogica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsConexion.Conexion;
import transportSolutionsModelo.AreaTrabajo;

public class AreaTrabajoBD {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql = null;

    public boolean registrarAreaTrabajo(AreaTrabajo a) {

        sql = "insert into areaTrabajo(descripcion) values(?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, a.getDescripcion());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al registrar area de trabajo");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean modificarAreaTrabajo(AreaTrabajo a, int id) {

        sql = "update areaTrabajo set descripcion=? where idAereaTrabajo='" + id + "' ";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, a.getDescripcion());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al modificar area de trabajo");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public DefaultTableModel reportarAreaTrabajo() {

        DefaultTableModel modelo;
        String[] titulos = {"ID", "DESCRIPCION"};
        String[] registros = new String[2];
        modelo = new DefaultTableModel(null, titulos);
        sql = "select idAereaTrabajo,descripcion from areaTrabajo";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idAereaTrabajo");
                registros[1] = rs.getString("descripcion");

                modelo.addRow(registros);
            }
            st.close();
            rs.close();
            cn.close();
            return modelo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al reportar area de trabajo");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public String buscarAreaTrabajo(String descripcion) {

        String registro = null;
        sql = "select idAereaTrabajo from areaTrabajo where descripcion='" + descripcion + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registro = rs.getString("idAereaTrabajo");
            }
            return registro;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al buscar area de trabajo");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public boolean eliminarAreaTrabajo(int id) {

        sql = "delete from areaTrabajo where idAereaTrabajo='" + id + "' ";
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(sql);
            st.close();
            cn.close();
            return true;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al eliminar area de trabajo");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
