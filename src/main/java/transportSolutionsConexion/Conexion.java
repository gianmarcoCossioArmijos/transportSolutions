package transportSolutionsConexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private static String clase = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/transportSolutions?serverTimezone=UTC";
    private static String usuario = "root";
    private static String clave = "123456";
    Connection Conector = null;

    public Connection conectar() {

        try {

            Class.forName(clase);
            Conector = DriverManager.getConnection(url, usuario, clave);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return Conector;
    }

    public void cierrarConexion() {
        try {
            Conector.close();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Error al cerrar conexion", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
