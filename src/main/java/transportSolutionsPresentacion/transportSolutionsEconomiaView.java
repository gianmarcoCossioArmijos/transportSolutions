package transportSolutionsPresentacion;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class transportSolutionsEconomiaView extends javax.swing.JFrame {

    public transportSolutionsEconomiaView() {
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

        btnGestionTipoUsuario = new javax.swing.JButton();
        btnGestionUsuario = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        ImageIcon icon = new ImageIcon(getClass().getResource("/fondo3.jpg"));
        Image image = icon.getImage();
        principalView = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        }
        ;
        btnGestionProveedores = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        btnGestionTipoUsuario.setBackground(new java.awt.Color(204, 204, 255));
        btnGestionTipoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGestionTipoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/egresos.png"))); // NOI18N
        btnGestionTipoUsuario.setText("Egresos");
        btnGestionTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionTipoUsuarioActionPerformed(evt);
            }
        });

        btnGestionUsuario.setBackground(new java.awt.Color(204, 204, 255));
        btnGestionUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGestionUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reportes.png"))); // NOI18N
        btnGestionUsuario.setText("Inventario");
        btnGestionUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionUsuarioActionPerformed(evt);
            }
        });

        btnCerrar.setBackground(new java.awt.Color(255, 0, 0));
        btnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cross_2.png"))); // NOI18N
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        principalView.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout principalViewLayout = new javax.swing.GroupLayout(principalView);
        principalView.setLayout(principalViewLayout);
        principalViewLayout.setHorizontalGroup(
            principalViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
        );
        principalViewLayout.setVerticalGroup(
            principalViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnGestionProveedores.setBackground(new java.awt.Color(204, 204, 255));
        btnGestionProveedores.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGestionProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_proveedores.png"))); // NOI18N
        btnGestionProveedores.setText("Gestion Proveedores");
        btnGestionProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionProveedoresActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnGestionTipoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGestionUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGestionProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(principalView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(btnGestionUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGestionTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGestionProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 402, Short.MAX_VALUE)
                .addComponent(btnCerrar)
                .addGap(24, 24, 24))
            .addComponent(principalView)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestionTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionTipoUsuarioActionPerformed
        // TODO add your handling code here:

        transportSolutionsGestionEgresoView e = new transportSolutionsGestionEgresoView();
        principalView.add(e);
        Dimension desktopSize = principalView.getSize();
        Dimension FrameSize = e.getSize();
        e.setLocation((desktopSize.width - FrameSize.width) / 10, (desktopSize.height - FrameSize.height) / 2);
        e.setVisible(true);
    }//GEN-LAST:event_btnGestionTipoUsuarioActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed

        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnGestionUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionUsuarioActionPerformed

        transportSolutionsGestionInventarioView i = new transportSolutionsGestionInventarioView();
        principalView.add(i);
        Dimension desktopSize = principalView.getSize();
        Dimension FrameSize = i.getSize();
        i.setLocation((desktopSize.width - FrameSize.width) / 10, (desktopSize.height - FrameSize.height) / 2);
        i.setVisible(true);
    }//GEN-LAST:event_btnGestionUsuarioActionPerformed

    private void btnGestionProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionProveedoresActionPerformed
        
        transportSolutionsGestionProveedorView p = new transportSolutionsGestionProveedorView();
        principalView.add(p);
        Dimension desktopSize = principalView.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width) / 10, (desktopSize.height - FrameSize.height) / 2);
        p.setVisible(true);
    }//GEN-LAST:event_btnGestionProveedoresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGestionProveedores;
    private javax.swing.JButton btnGestionTipoUsuario;
    private javax.swing.JButton btnGestionUsuario;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane principalView;
    // End of variables declaration//GEN-END:variables
}
