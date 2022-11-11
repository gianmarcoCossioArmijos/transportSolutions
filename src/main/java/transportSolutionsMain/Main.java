
package transportSolutionsMain;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import transportSolutionsPresentacion.transportSolutionsLogin;

public class Main {

    public static void main(String[] args) {
        
        transportSolutionsLogin l = new transportSolutionsLogin();
        l.setVisible(true);
        
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(transportSolutionsLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(transportSolutionsLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(transportSolutionsLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(transportSolutionsLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
}
