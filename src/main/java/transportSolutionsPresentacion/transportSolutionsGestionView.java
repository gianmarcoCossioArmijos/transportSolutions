package transportSolutionsPresentacion;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class transportSolutionsGestionView extends javax.swing.JFrame {

    public transportSolutionsGestionView() {
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
        btnGestionAreaTrabajo = new javax.swing.JButton();
        btnGestionUsuario = new javax.swing.JButton();
        btnGestionEmpleados = new javax.swing.JButton();
        btnGestionClientes = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        ImageIcon icon = new ImageIcon(getClass().getResource("/fondo2.jpg"));
        Image image = icon.getImage();
        principalView = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        }
        ;
        btnGestionCorrelativos = new javax.swing.JButton();
        btnGestionCajas = new javax.swing.JButton();
        btnGestionPuestoTrabajo = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GESTION");
        setBackground(new java.awt.Color(255, 255, 255));

        btnGestionTipoUsuario.setBackground(new java.awt.Color(204, 204, 255));
        btnGestionTipoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGestionTipoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_tipo_usuario.png"))); // NOI18N
        btnGestionTipoUsuario.setText("Gestion Tipo Usuario");
        btnGestionTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionTipoUsuarioActionPerformed(evt);
            }
        });

        btnGestionAreaTrabajo.setBackground(new java.awt.Color(204, 204, 255));
        btnGestionAreaTrabajo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGestionAreaTrabajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_area_trabajo.png"))); // NOI18N
        btnGestionAreaTrabajo.setText("Gestion Area Laboral");
        btnGestionAreaTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionAreaTrabajoActionPerformed(evt);
            }
        });

        btnGestionUsuario.setBackground(new java.awt.Color(204, 204, 255));
        btnGestionUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGestionUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_usuario.png"))); // NOI18N
        btnGestionUsuario.setText("Gestion Usuario");
        btnGestionUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionUsuarioActionPerformed(evt);
            }
        });

        btnGestionEmpleados.setBackground(new java.awt.Color(204, 204, 255));
        btnGestionEmpleados.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGestionEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_empleados.png"))); // NOI18N
        btnGestionEmpleados.setText("Gestion Colaboradores");
        btnGestionEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionEmpleadosActionPerformed(evt);
            }
        });

        btnGestionClientes.setBackground(new java.awt.Color(204, 204, 255));
        btnGestionClientes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGestionClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_clientes.png"))); // NOI18N
        btnGestionClientes.setText("Gestion Clientes");
        btnGestionClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionClientesActionPerformed(evt);
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

        btnGestionCorrelativos.setBackground(new java.awt.Color(204, 204, 255));
        btnGestionCorrelativos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGestionCorrelativos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/corretativo.png"))); // NOI18N
        btnGestionCorrelativos.setText("Gestion Correlativos");
        btnGestionCorrelativos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionCorrelativosActionPerformed(evt);
            }
        });

        btnGestionCajas.setBackground(new java.awt.Color(204, 204, 255));
        btnGestionCajas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGestionCajas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cierre_caja.png"))); // NOI18N
        btnGestionCajas.setText("Gestion Caja");
        btnGestionCajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionCajasActionPerformed(evt);
            }
        });

        btnGestionPuestoTrabajo.setBackground(new java.awt.Color(204, 204, 255));
        btnGestionPuestoTrabajo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGestionPuestoTrabajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_puesto_trabajo.png"))); // NOI18N
        btnGestionPuestoTrabajo.setText("Gestion Puesto Laboral");
        btnGestionPuestoTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionPuestoTrabajoActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(13, Short.MAX_VALUE)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnGestionTipoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(btnGestionAreaTrabajo, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(btnGestionEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(btnGestionClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(btnGestionUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGestionCorrelativos, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(btnGestionPuestoTrabajo, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(btnGestionCajas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)))
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
                .addComponent(btnGestionAreaTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGestionPuestoTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGestionEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGestionClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGestionCorrelativos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGestionCajas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130)
                .addComponent(btnCerrar)
                .addContainerGap(16, Short.MAX_VALUE))
            .addComponent(principalView)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestionTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionTipoUsuarioActionPerformed
        // TODO add your handling code here:

        transportSolutionsGestionTipoUsuarioView gtu = new transportSolutionsGestionTipoUsuarioView();
        principalView.add(gtu);
        Dimension desktopSize = principalView.getSize();
        Dimension FrameSize = gtu.getSize();
        gtu.setLocation((desktopSize.width - FrameSize.width) / 5, (desktopSize.height - FrameSize.height) / 2);
        gtu.setVisible(true);
    }//GEN-LAST:event_btnGestionTipoUsuarioActionPerformed

    private void btnGestionAreaTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionAreaTrabajoActionPerformed

        transportSolutionsGestionAreaTrabajoView gat = new transportSolutionsGestionAreaTrabajoView();
        principalView.add(gat);
        Dimension desktopSize = principalView.getSize();
        Dimension FrameSize = gat.getSize();
        gat.setLocation((desktopSize.width - FrameSize.width) / 18, (desktopSize.height - FrameSize.height) / 4);
        gat.setVisible(true);
    }//GEN-LAST:event_btnGestionAreaTrabajoActionPerformed

    private void btnGestionEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionEmpleadosActionPerformed

        transportSolutionsGestionColaboradoresView ge = new transportSolutionsGestionColaboradoresView();
        principalView.add(ge);
        Dimension desktopSize = principalView.getSize();
        Dimension FrameSize = ge.getSize();
        ge.setLocation((desktopSize.width - FrameSize.width) / 30, (desktopSize.height - FrameSize.height) / 4);
        ge.setVisible(true);
    }//GEN-LAST:event_btnGestionEmpleadosActionPerformed

    private void btnGestionClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionClientesActionPerformed
        
        transportSolutionsGestionClientesView gc = new transportSolutionsGestionClientesView();
        principalView.add(gc);
        Dimension desktopSize = principalView.getSize();
        Dimension FrameSize = gc.getSize();
        gc.setLocation((desktopSize.width - FrameSize.width) / 26, (desktopSize.height - FrameSize.height) / 4);
        gc.show();
    }//GEN-LAST:event_btnGestionClientesActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed

        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnGestionUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionUsuarioActionPerformed

        transportSolutionsGestionUsuarioView u = new transportSolutionsGestionUsuarioView();
        principalView.add(u);
        Dimension desktopSize = principalView.getSize();
        Dimension FrameSize = u.getSize();
        u.setLocation((desktopSize.width - FrameSize.width) / 5, (desktopSize.height - FrameSize.height) / 2);
        u.setVisible(true);
    }//GEN-LAST:event_btnGestionUsuarioActionPerformed

    private void btnGestionCorrelativosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionCorrelativosActionPerformed
        
        transportSolutionsGestionCorrelativosView gc = new transportSolutionsGestionCorrelativosView();
        principalView.add(gc);
        Dimension desktopSize = principalView.getSize();
        Dimension FrameSize = gc.getSize();
        gc.setLocation((desktopSize.width - FrameSize.width) / 36, (desktopSize.height - FrameSize.height) / 4);
        gc.setVisible(true);
    }//GEN-LAST:event_btnGestionCorrelativosActionPerformed

    private void btnGestionCajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionCajasActionPerformed
        
        transportSolutionsGestionCajaView gc = new transportSolutionsGestionCajaView();
        principalView.add(gc);
        Dimension desktopSize = principalView.getSize();
        Dimension FrameSize = gc.getSize();
        gc.setLocation((desktopSize.width - FrameSize.width) / 36, (desktopSize.height - FrameSize.height) / 4);
        gc.setVisible(true);      
    }//GEN-LAST:event_btnGestionCajasActionPerformed

    private void btnGestionPuestoTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionPuestoTrabajoActionPerformed
        
        transportSolutionsGestionPuestoLaboralView gpl = new transportSolutionsGestionPuestoLaboralView();
        principalView.add(gpl);
        Dimension desktopSize = principalView.getSize();
        Dimension FrameSize = gpl.getSize();
        gpl.setLocation((desktopSize.width - FrameSize.width) / 18, (desktopSize.height - FrameSize.height) / 4);
        gpl.setVisible(true);
    }//GEN-LAST:event_btnGestionPuestoTrabajoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    public javax.swing.JButton btnGestionAreaTrabajo;
    public javax.swing.JButton btnGestionCajas;
    public javax.swing.JButton btnGestionClientes;
    public javax.swing.JButton btnGestionCorrelativos;
    public javax.swing.JButton btnGestionEmpleados;
    public javax.swing.JButton btnGestionPuestoTrabajo;
    private javax.swing.JButton btnGestionTipoUsuario;
    private javax.swing.JButton btnGestionUsuario;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane principalView;
    // End of variables declaration//GEN-END:variables
}
