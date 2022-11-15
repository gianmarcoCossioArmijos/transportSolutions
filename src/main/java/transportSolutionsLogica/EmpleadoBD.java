
package transportSolutionsLogica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsConexion.Conexion;
import transportSolutionsModelo.Empleado;

public class EmpleadoBD {
    
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql = null;
    
    public boolean registrarEmpleado(Empleado e) {

        sql = "INSERT INTO empleado(dni,nombres,correo,telefono,sistemaPensiones,entidadBancaria,cuentaBancaria,sueldo,idAereaTrabajo,idPuestoTrabajo) VALUES(?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, e.getDni());
            pst.setString(2, e.getNombres());
            pst.setString(3, e.getCorreo());
            pst.setString(4, e.getTelefono());
            pst.setString(5, e.getSistemaPensiones());
            pst.setString(6, e.getEntidadBancaria());
            pst.setString(7, e.getCuentaBancaria());
            pst.setDouble(8, e.getSueldo());
            pst.setInt(9, e.getIdAreaTrabajo());
            pst.setInt(10, e.getIdPuestoTrabajo());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (SQLException ex) {
            JOptionPane op = new JOptionPane("Error al registrar empleado");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public boolean modificarEmpleado(Empleado e, int id) {

        sql = "UPDATE empleado SET nombres=?,correo=?,telefono=?,sistemaPensiones=?,entidadBancaria=?,cuentaBancaria=?,idAereaTrabajo=?,idPuestoTrabajo=?,dni=?,sueldo=? WHERE idEmpleado='" + id + "'";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, e.getNombres());
            pst.setString(2, e.getCorreo());
            pst.setString(3, e.getTelefono());
            pst.setString(4, e.getSistemaPensiones());
            pst.setString(5, e.getEntidadBancaria());
            pst.setString(6, e.getCuentaBancaria());
            pst.setInt(7, e.getIdAreaTrabajo());
            pst.setInt(8, e.getIdPuestoTrabajo());
            pst.setString(9, e.getDni());
            pst.setDouble(10, e.getSueldo());

            pst.executeUpdate();
            pst.close();
            cn.close();
            return true;
        } catch (Exception ex) {
            JOptionPane op = new JOptionPane("Error al modificar empleado");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public DefaultTableModel reportarEmpleado() {

        DefaultTableModel modelo;
        String[] titulos = {"ID", "DNI", "NOMBRES", "CORREO", "TELEFONO","PUESTO","AREA","SUELDO","SP","BANCO","CUENTA"};
        String[] registros = new String[11];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idEmpleado,dni,nombres,correo,telefono,pt.descripcion,at.descripcion,sueldo,sistemaPensiones,entidadBancaria,cuentaBancaria FROM empleado AS e JOIN areaTrabajo AS at ON e.idAereaTrabajo = at.idAereaTrabajo JOIN puestoTrabajo AS pt ON e.idPuestoTrabajo = pt.idPuestoTrabajo ORDER BY nombres DESC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idEmpleado");
                registros[1] = rs.getString("dni");
                registros[2] = rs.getString("nombres");
                registros[3] = rs.getString("correo");
                registros[4] = rs.getString("telefono");
                registros[5] = rs.getString("pt.descripcion");
                registros[6] = rs.getString("at.descripcion");
                registros[7] = rs.getString("sueldo");
                registros[8] = rs.getString("sistemaPensiones");
                registros[9] = rs.getString("entidadBancaria");
                registros[10] = rs.getString("cuentaBancaria");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception ex) {
            JOptionPane op = new JOptionPane("Error al reportar empleado");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public boolean eliminarEmpleado(int dni) {

        sql = "DELETE FROM empleado WHERE dni='" + dni + "' ";
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(sql);
            st.close();
            cn.close();
            return true;
        } catch (Exception ex) {
            JOptionPane op = new JOptionPane("Error al eliminar empleado");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public DefaultTableModel buscarEmpleado(int dni) {
        
        DefaultTableModel modelo;
        String[] titulos = {"ID", "DNI", "NOMBRES", "CORREO", "TELEFONO","PUESTO","AREA","SUELDO","SP","BANCO","CUENTA"};
        String[] registros = new String[11];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idEmpleado,dni,nombres,correo,telefono,pt.descripcion,at.descripcion,sueldo,sistemaPensiones,entidadBancaria,cuentaBancaria FROM empleado AS e JOIN areaTrabajo AS at ON e.idAereaTrabajo = at.idAereaTrabajo JOIN puestoTrabajo AS pt ON e.idPuestoTrabajo = pt.idPuestoTrabajo WHERE dni='" + dni + "' ORDER BY nombres DESC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idEmpleado");
                registros[1] = rs.getString("dni");
                registros[2] = rs.getString("nombres");
                registros[3] = rs.getString("correo");
                registros[4] = rs.getString("telefono");
                registros[5] = rs.getString("pt.descripcion");
                registros[6] = rs.getString("at.descripcion");
                registros[7] = rs.getString("sueldo");
                registros[8] = rs.getString("sistemaPensiones");
                registros[9] = rs.getString("entidadBancaria");
                registros[10] = rs.getString("cuentaBancaria");

                modelo.addRow(registros);
            }
            rs.close();
            st.close();
            cn.close();
            return modelo;
        } catch (Exception ex) {
            JOptionPane op = new JOptionPane("Error al buscar empleado");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public String buscarIdEmpleado(String dni) {
        
        String registro = null;
        sql = "SELECT idEmpleado FROM empleado WHERE dni='" + dni + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registro = rs.getString("idEmpleado");
            }
            return registro;
        } catch (Exception ex) {
            JOptionPane op = new JOptionPane("Error al buscar ID de empleado");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
