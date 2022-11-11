package transportSolutionsPresentacion;

import java.awt.event.KeyEvent;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import transportSolutionsLogica.TipoUsuarioBD;
import transportSolutionsLogica.UsuarioBD;
import transportSolutionsModelo.Usuario;

public class transportSolutionsLogin extends javax.swing.JFrame {

    public static String dni_publico;
    public static String nombre_publico;
    public static int id_publico;

    public transportSolutionsLogin() {

        initComponents();
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
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();
        lblFondoLogin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtContraseña = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Usuario");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Contraseña");

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 0, 0));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cross_2.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnEntrar.setBackground(new java.awt.Color(153, 255, 0));
        btnEntrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.png"))); // NOI18N
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        lblFondoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_Login.png"))); // NOI18N

        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyTyped(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo3.png"))); // NOI18N
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtContraseña, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(33, 33, 33)))
                .addComponent(jLabel3)
                .addGap(20, 20, 20)
                .addComponent(lblFondoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(34, 34, 34)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblFondoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed

        if (txtUsuario.getText().length() > 0) {
            if (txtContraseña.getText().length() > 0) {

                String usuario = txtUsuario.getText().toString();
                String contraseña = txtContraseña.getText().toString();

                UsuarioBD ubd = new UsuarioBD();
                TipoUsuarioBD tubd = new TipoUsuarioBD();
                List<Usuario> lista_usuarios = ubd.login(usuario, contraseña);

                if (lista_usuarios.size() > 0) {

                    int idusuario_us = lista_usuarios.get(0).getIdUsuario();
                    String usuario_us = lista_usuarios.get(0).getDni();
                    String contraseña_us = lista_usuarios.get(0).getContraseña();
                    int tipo_us = lista_usuarios.get(0).getIdtipoUsuario();
                    String nombres_us = lista_usuarios.get(0).getNombres();

                    String tipo = tubd.buscarTipoUsuarioNombre(tipo_us);

                    transportSolutionsPrincipalView menu = new transportSolutionsPrincipalView();
                    dni_publico = usuario_us;
                    nombre_publico = nombres_us;
                    id_publico = idusuario_us;

                    if (tipo.equals("ADMINISTRATIVO")) {

                        menu.setVisible(true);
                        menu.setTitle("Sesion: " + nombre_publico + " | " + dni_publico);
                        this.setVisible(false);

                        JOptionPane op = new JOptionPane("Bienvenido" + nombre_publico);
                        op.setMessageType(JOptionPane.INFORMATION_MESSAGE);
                    } else if (tipo.equals("VENTAS")) {

                        menu.setVisible(true);
                        menu.setTitle("Sesion: " + nombre_publico + " | " + dni_publico);
                        menu.btnMantenimiento.setEnabled(false);
                        menu.btnReportes.setEnabled(false);
                        menu.btnEconomia.setEnabled(false);
                        this.setVisible(false);

                        JOptionPane op = new JOptionPane("Bienvenido" + nombre_publico);
                        op.setMessageType(JOptionPane.INFORMATION_MESSAGE);
                    } else if (tipo.equals("OPERACIONES")) {

                        menu.setVisible(true);
                        menu.setTitle("Sesion: " + nombre_publico + " | " + dni_publico);
                        menu.btnMantenimiento.setEnabled(false);
                        menu.btnGestionVentas.setEnabled(false);
                        menu.btnReportes.setEnabled(false);
                        menu.btnEconomia.setEnabled(false);
                        this.setVisible(false);

                        JOptionPane op = new JOptionPane("Bienvenido" + nombre_publico);
                        op.setMessageType(JOptionPane.INFORMATION_MESSAGE);
                    } else if (tipo.equals("SUPERVISION")) {

                        menu.setVisible(true);
                        menu.setTitle("Sesion: " + nombre_publico + " | " + dni_publico);
                        menu.btnMantenimiento.setEnabled(false);
                        this.setVisible(false);

                        JOptionPane op = new JOptionPane("Bienvenido" + nombre_publico);
                        op.setMessageType(JOptionPane.INFORMATION_MESSAGE);
                    } else if (tipo.length() > 0) {

                        menu.setVisible(true);
                        menu.setTitle("Sesion: " + nombre_publico + " | " + dni_publico);
                        menu.btnMantenimiento.setEnabled(false);
                        this.setVisible(false);

                        JOptionPane op = new JOptionPane("Bienvenido" + nombre_publico);
                        op.setMessageType(JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane op = new JOptionPane("Bienvenido" + nombre_publico);
                        op.setMessageType(JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane op = new JOptionPane("Debe ingresar contraseña");
                    op.setMessageType(JOptionPane.WARNING_MESSAGE);
                    txtContraseña.requestFocus();
                }
            } else {
                JOptionPane op = new JOptionPane("Debe ingresar usuario");
                op.setMessageType(JOptionPane.WARNING_MESSAGE);
                txtUsuario.requestFocus();
            }
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:

        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            txtContraseña.requestFocus();
        }

    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void txtContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyTyped

    }//GEN-LAST:event_txtContraseñaKeyTyped

    private void txtContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyPressed

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            btnEntrar.requestFocus();
            btnEntrar.doClick();
        }
    }//GEN-LAST:event_txtContraseñaKeyPressed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblFondoLogin;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
