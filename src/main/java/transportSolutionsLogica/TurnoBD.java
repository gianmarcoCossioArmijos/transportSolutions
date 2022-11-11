package transportSolutionsLogica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsConexion.Conexion;
import transportSolutionsModelo.Turno;

public class TurnoBD {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql = null;

    public boolean registrarTurno(Turno t) {

        sql = "INSERT INTO turno(descripcion) values(?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, t.getDescripcion());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al registrar turno");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean modificarTurno(Turno t, int id) {

        sql = "UPDATE turno SET descripcion=? WHERE idTurno='" + id + "' ";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, t.getDescripcion());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al modificar turno");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public DefaultTableModel reportarTurno() {

        DefaultTableModel modelo;
        String[] titulos = {"ID", "DESCRIPCION"};
        String[] registros = new String[2];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idTurno,descripcion FROM turno";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idTurno");
                registros[1] = rs.getString("descripcion");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al reportar turno");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public String buscarIdTurno(String descripcion) {

        sql = "SELECT idTurno FROM turno WHERE descripcion='" + descripcion + "'";
        String tipo = null;
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                tipo = rs.getString("idTurno");
            }
            return tipo;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al buscar turno");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public boolean eliminarTurno(int id) {

        sql = "DELETE FROM turno WHERE idTurno='" + id + "' ";
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(sql);
            st.close();
            cn.close();
            return true;
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al eliminar turno");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
