package transportSolutionsPresentacion;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class transportSolutionsTransporteView extends javax.swing.JFrame {

    public transportSolutionsTransporteView() {
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

        btnFleteCarga = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        ImageIcon icon = new ImageIcon(getClass().getResource("/fondo5.jpg"));
        Image image = icon.getImage();
        principalView = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        }
        ;
        btnGestionVehiculos = new javax.swing.JButton();
        btnGestionChoferes = new javax.swing.JButton();
        btnControlAsignaciones = new javax.swing.JButton();
        btnFleteEncomienda = new javax.swing.JButton();
        btnAsignarFlete = new javax.swing.JButton();
        btnControlAsignaciones1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        btnFleteCarga.setBackground(new java.awt.Color(204, 204, 255));
        btnFleteCarga.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnFleteCarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asignar_flete_carga.png"))); // NOI18N
        btnFleteCarga.setText("Flete Carga");
        btnFleteCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFleteCargaActionPerformed(evt);
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
            .addGap(0, 1186, Short.MAX_VALUE)
        );
        principalViewLayout.setVerticalGroup(
            principalViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnGestionVehiculos.setBackground(new java.awt.Color(204, 204, 255));
        btnGestionVehiculos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGestionVehiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_vehiculos.png"))); // NOI18N
        btnGestionVehiculos.setText("Gestion Vehiculos");
        btnGestionVehiculos.setToolTipText("");
        btnGestionVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionVehiculosActionPerformed(evt);
            }
        });

        btnGestionChoferes.setBackground(new java.awt.Color(204, 204, 255));
        btnGestionChoferes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGestionChoferes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_chofer.png"))); // NOI18N
        btnGestionChoferes.setText("Gestion Choferes");
        btnGestionChoferes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionChoferesActionPerformed(evt);
            }
        });

        btnControlAsignaciones.setBackground(new java.awt.Color(204, 204, 255));
        btnControlAsignaciones.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnControlAsignaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_transporte.png"))); // NOI18N
        btnControlAsignaciones.setText("Historial Fletes");
        btnControlAsignaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnControlAsignacionesActionPerformed(evt);
            }
        });

        btnFleteEncomienda.setBackground(new java.awt.Color(204, 204, 255));
        btnFleteEncomienda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnFleteEncomienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asignar_flete_encomienda.png"))); // NOI18N
        btnFleteEncomienda.setText("Flete Enconmienda");
        btnFleteEncomienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFleteEncomiendaActionPerformed(evt);
            }
        });

        btnAsignarFlete.setBackground(new java.awt.Color(204, 204, 255));
        btnAsignarFlete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAsignarFlete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asignar_flete.png"))); // NOI18N
        btnAsignarFlete.setText("Flete");
        btnAsignarFlete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarFleteActionPerformed(evt);
            }
        });

        btnControlAsignaciones1.setBackground(new java.awt.Color(204, 204, 255));
        btnControlAsignaciones1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnControlAsignaciones1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recepcion_encomiendas.png"))); // NOI18N
        btnControlAsignaciones1.setText("Historial Carga Encomida");
        btnControlAsignaciones1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnControlAsignaciones1ActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGestionVehiculos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGestionChoferes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnControlAsignaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAsignarFlete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFleteEncomienda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFleteCarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnControlAsignaciones1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(principalView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(btnFleteCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(btnFleteEncomienda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(btnAsignarFlete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnControlAsignaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnControlAsignaciones1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGestionVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGestionChoferes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addComponent(btnCerrar)
                .addGap(24, 24, 24))
            .addComponent(principalView)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed

        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnFleteCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFleteCargaActionPerformed

        transportSolutionFleteCargaView fc = new transportSolutionFleteCargaView();
        principalView.add(fc);
        Dimension desktopSize = principalView.getSize();
        Dimension FrameSize = fc.getSize();
        fc.setLocation((desktopSize.width - FrameSize.width) / 36, (desktopSize.height - FrameSize.height) / 4);
        fc.setVisible(true);
    }//GEN-LAST:event_btnFleteCargaActionPerformed

    private void btnGestionVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionVehiculosActionPerformed
        
        transportSolutionsGestionVehiculosView gv = new transportSolutionsGestionVehiculosView();
        principalView.add(gv);
        Dimension desktopSize = principalView.getSize();
        Dimension FrameSize = gv.getSize();
        gv.setLocation((desktopSize.width - FrameSize.width) / 36, (desktopSize.height - FrameSize.height) / 4);
        gv.setVisible(true);
    }//GEN-LAST:event_btnGestionVehiculosActionPerformed

    private void btnGestionChoferesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionChoferesActionPerformed
        
        transportSolutionsGestionChoferView gc = new transportSolutionsGestionChoferView();
        principalView.add(gc);
        Dimension desktopSize = principalView.getSize();
        Dimension FrameSize = gc.getSize();
        gc.setLocation((desktopSize.width - FrameSize.width) / 36, (desktopSize.height - FrameSize.height) / 4);
        gc.setVisible(true);
    }//GEN-LAST:event_btnGestionChoferesActionPerformed

    private void btnControlAsignacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnControlAsignacionesActionPerformed
        
        transportSolutionsHistorialFeleteView hf = new transportSolutionsHistorialFeleteView();
        principalView.add(hf);
        Dimension desktopSize = principalView.getSize();
        Dimension FrameSize = hf.getSize();
        hf.setLocation((desktopSize.width - FrameSize.width) / 20, (desktopSize.height - FrameSize.height) / 2);
        hf.setVisible(true);
    }//GEN-LAST:event_btnControlAsignacionesActionPerformed

    private void btnFleteEncomiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFleteEncomiendaActionPerformed
        
        transportSolutionFleteEncomiendaView fe = new transportSolutionFleteEncomiendaView();
        principalView.add(fe);
        Dimension desktopSize = principalView.getSize();
        Dimension FrameSize = fe.getSize();
        fe.setLocation((desktopSize.width - FrameSize.width) / 20, (desktopSize.height - FrameSize.height) / 2);
        fe.setVisible(true);
    }//GEN-LAST:event_btnFleteEncomiendaActionPerformed

    private void btnAsignarFleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarFleteActionPerformed

        transportSolutionsFleteView af = new transportSolutionsFleteView();
        principalView.add(af);
        Dimension desktopSize = principalView.getSize();
        Dimension FrameSize = af.getSize();
        af.setLocation((desktopSize.width - FrameSize.width) / 20, (desktopSize.height - FrameSize.height) / 2);
        af.setVisible(true);
    }//GEN-LAST:event_btnAsignarFleteActionPerformed

    private void btnControlAsignaciones1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnControlAsignaciones1ActionPerformed
        
        transportSolutionsHistorialCargaEncomiendaView hce = new transportSolutionsHistorialCargaEncomiendaView();
        principalView.add(hce);
        Dimension desktopSize = principalView.getSize();
        Dimension FrameSize = hce.getSize();
        hce.setLocation((desktopSize.width - FrameSize.width) / 20, (desktopSize.height - FrameSize.height) / 2);
        hce.setVisible(true);
    }//GEN-LAST:event_btnControlAsignaciones1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignarFlete;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnControlAsignaciones;
    private javax.swing.JButton btnControlAsignaciones1;
    private javax.swing.JButton btnFleteCarga;
    private javax.swing.JButton btnFleteEncomienda;
    private javax.swing.JButton btnGestionChoferes;
    private javax.swing.JButton btnGestionVehiculos;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane principalView;
    // End of variables declaration//GEN-END:variables
}
